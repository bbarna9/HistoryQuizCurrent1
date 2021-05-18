package controllers;

import models.Quiz;
import org.tinylog.Logger;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

import models.Question;
import static models.Question.loadNewQuestion;

/**
 * The GameController is the code behind the game.fxml. This is where we define how we want
 * our FXML to be loaded and what events should happen when someone presses the buttons that are
 * implemented on our FXML.
 */
public class GameController {

    private String username1;
    private String username2;
    public int score1;
    public int score2;

    private final int maxQuestion = 5;
    private final int startingTime = 15;
    private int seconds = startingTime;

    @FXML
    public Label questionDisplay;

    @FXML
    public Label answerBlock;

    @FXML
    public Label player1Score;

    @FXML
    public Label player2Score;

    @FXML
    private Label usernameLabel;

    @FXML
    private Label questionNumberDisplay;

    @FXML
    private Label timeDisplay;

    @FXML
    private TextField useranswer1;

    @FXML
    private TextField useranswer2;

    @FXML
    private Button nextQuestionButton;

    @FXML
    private Button getResultsButton;

    /**
     * The first function is {@code newQuestion()}. Here we instantiate a {@link models.Question} object,
     * and we pass it's content to our {@code questionDisplay} and {@code answerBlock} labels.
     */
    public void newQuestion(){
        Question question = loadNewQuestion();
        Logger.info("The question is set to: '{}.", question.getQuestion() + "'");
        questionDisplay.setText(question.getQuestion());
        answerBlock.setText(question.getAnswer());
    }

    /**
     * The {@code update()} function, coming from it's name is responsible for updating the main screen every round.
     * This means loading a new question, raising the number of questions counter and resetting the timer.
     * Besides the screen updates, here I implement the {@code onlyDigits()} function, which I will later describe.
     */
    public void update(){
        newQuestion();

        useranswer1.setText("");
        useranswer2.setText("");

        onlyDigits(useranswer1);
        onlyDigits(useranswer2);

        int temp = Integer.parseInt(questionNumberDisplay.getText()) + 1;
        questionNumberDisplay.setText(Integer.toString(temp));

        timer();
    }

    /**
     * Since this is a number-guessing game, we don't really want any letters or any special characters as an answer.
     * This function makes sure that the users can only type in digits, by scanning every single character, and unless they
     * are digits it replaces them with an empty field ("").
     *
     * @param typed are the characters the users type in.
     */
    public void onlyDigits(TextField typed){
        typed.textProperty().addListener((observable, oldValue, newValue) -> {
            if(!newValue.matches("\\d*")){
                typed.setText(newValue.replaceAll("[^\\d]",""));
                Logger.warn("The answer can only contain digits.");
            }
        });
    }

    /**
     * In the {@code setScoreDisplay()} function, again, as one can guess from it's name, we are setting in the correct
     * player scores. First we are scanning in the correct answer and the guesses given by our players. The person that
     * doesn't give an answer immediately loses the round. We are calling the {@code calculateScores()} function from the Quiz
     * model, (which I describe there) and since it returns with a {@code String}, we check which player turned out to be the
     * winner. After our program decided, we set the appropriate numbers on the FXML. In case of a draw, (either they both guessed
     * the same value, or none of them guessed) no one gets a point.
     */
    public void setScoreDisplays(){
        int correctAnswer = Integer.parseInt(answerBlock.getText());

        int answer1 = 0;
        int answer2 = 0;

        if(useranswer1.getText().equals("")) {
            answer1 = 0;
        } else {
            answer1 = Integer.parseInt(useranswer1.getText());
        }

        if(useranswer2.getText().equals("")) {
            answer2 = 0;
        } else {
            answer2 = Integer.parseInt(useranswer2.getText());
        }

        String winner = Quiz.calculateScores(correctAnswer, answer1, answer2);

        if (winner.equals("Player1")) {
            player1Score.setText(Integer.toString(Integer.parseInt(player1Score.getText()) + 1));
        }
        else if (winner.equals("Player2")) {
            player2Score.setText(Integer.toString(Integer.parseInt(player2Score.getText()) + 1));
        } else {
            //Do nothing
        }

        score1 = Integer.parseInt(player1Score.getText());
        score2 = Integer.parseInt(player2Score.getText());
        Logger.info("The scores are set to {} and {}.", score1, score2);
    }

    /**
     * Here we declare what happens when someone clicks on the {@code nextQuestionButton}.
     * We simply call the {@code update()} function and reset the time.
     */
    public void nextQuestionAsked(){
        update();
        seconds = startingTime;
    }

    /**
     * I think we can say that this is the most complicated function in the entire project.
     * We start up by setting the graphical parts, such as hiding the answer, so that it can only be seen
     * once the time is up. We create a new KeyFrame, which is responsible for changing the {@code timeDisplay} label.
     * When the time is up, We make the answer and the {@code nextQuestionButton} visible, and the Users' textfields
     * uneditable (the scores get calculated once the timer hits 0, so this is only for the looks).
     * We call the {@code setScores()} function, to see who got closer. If the question was the last one,
     * we "switch" the {@code nextQuestionButton} up with the {@code getResultsButton}.
     */
    public void timer(){
        answerBlock.setVisible(false);
        useranswer1.setEditable(true);
        useranswer2.setEditable(true);
        nextQuestionButton.setVisible(false);

        Timeline time = new Timeline();
        time.setCycleCount(Timeline.INDEFINITE);
            if(time!=null)
                time.stop();
        KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                timeDisplay.setText(String.valueOf(seconds));
                    if (seconds<=0)
                        time.stop();
                seconds--;
                if(seconds==-1) {
                    answerBlock.setVisible(true);
                    useranswer1.setEditable(false);
                    useranswer2.setEditable(false);
                    nextQuestionButton.setVisible(true);
                    Logger.info("Resetting timer.");
                    setScoreDisplays();
                    if(Integer.parseInt(questionNumberDisplay.getText()) == maxQuestion) {
                        nextQuestionButton.setVisible(false);
                        getResultsButton.setVisible(true);
                    }
                }
            }
        });

        time.getKeyFrames().add(frame);
        time.playFromStart();

        seconds = startingTime;
    }

    /**
     * By pressing the {@code getResultsButton}, we call the {@code showResults()} function. This simply loads up
     * the results.fxml, where we can check who won the game.
     *
     * @param actionEvent since it requires a button being clicked
     * @throws IOException in case it can't load in the desired FXML file.
     */
    public void showResults(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/results.fxml"));
        Parent root = fxmlLoader.load();
        fxmlLoader.<ResultController>getController().initdata(username1, username2, score1, score2);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResourceAsStream("/images/logo.png")));
        stage.setScene(new Scene(root));
        stage.show();
        Logger.info("Loading results.");
    }

    /**
     * This function simply sets in the username display with data it receive from the launch.fxml
     *
     * @param userName1
     * @param userName2
     */
    public void initdata(String userName1, String userName2) {
        username1 = userName1;
        username2 = userName2;
        usernameLabel.setText("Current users: " + username1 + " and " + username2);
        getResultsButton.setVisible(false);
        Logger.info("Initializing data.");
    }

    /**
     * With this function we start up the entire FXML.
     */
    @FXML
    public void initialize() {
        update();
    }
}
