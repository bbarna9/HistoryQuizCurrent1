package controllers;

import com.mysql.cj.log.Log;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import models.Question;
import models.PersonalXmlReader;
import models.Result;

import java.time.Instant;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import org.tinylog.Logger;

import static models.Question.loadNewQuestion;

/**
 * The GameController is the code behind the game.fxml. This is where we define how we want
 * our application to run.
 */
@Slf4j
public class GameController {

    private String username1;
    private String username2;
    private Instant beginGame;
    public int score1;
    public int score2;

    private final int maxQuestion = 1;
    private final int startingTime = 5;
    private int seconds = startingTime;

    public PersonalXmlReader personalxmlreader = new PersonalXmlReader();

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
     * Since this is a number-guessing game, we don't really want any letters or any other types of characters as an answer.
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
     * In the {@code setScores()} function, again, as one can guess from it's name, we are setting in the correct
     * player scores. This is achieved by checking who guessed closer to the correct answer. Every win is +1 point.
     * In case of a draw, noone gets a point.
     */
    public void setScores(){
        int answer = Integer.parseInt(answerBlock.getText());
        int answer1 = 0;
        int answer2 = 0;

        try {
            if (useranswer1.getText().equals("")){
                answer1 = 1000000;
                Logger.error("Player 1 didn't write an answer, therefore Player 2 won the round.");
            } else {
                answer1 = Integer.parseInt(useranswer1.getText());
            }
        } catch (NumberFormatException e){
            e.getMessage();
        }

        try {
            if (useranswer2.getText().equals("")){
                answer2 = 1000000;
                Logger.error("Player 2 didn't write an answer, therefore Player 1 won the round.");
            } else {
                answer2 = Integer.parseInt(useranswer2.getText());
            }
        } catch (NumberFormatException e){
            e.getMessage();
        }

        int temp1 = answer-answer1;
        int temp2 = answer-answer2;

        if (temp1 < 0) {
            temp1 = temp1 * -1;
        }

        if (temp2 < 0) {
            temp2 = temp2 * -1;
        }
/*
        if(answer1 == 0){
            temp1 = 1000000;
        }

        if(answer2 == 0){
            temp2 = 1000000;
        }
  */
        if (temp1 < temp2) {
            player1Score.setText(Integer.toString(Integer.parseInt(player1Score.getText()) + 1));
        }
        else if (temp2 < temp1) {
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
        //useranswer1.setText("0");
        //useranswer2.setText("0");
    }

    /**
     * I think we can say that this is the most complicated function in the entire project.
     * We start up by setting the graphical parts, such as hiding the answer, so that it can only be seen
     * once the time is up. We create a new KeyFrame, which is responsible for changing the {@code timeDisplay} label.
     * When the time is up, We make the answer and the {@code nextQuestionButton} visible, and the users' textfields
     * uneditable. We call the {@code setScores()} function, to see who got closer. If the question was the last one,
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
                    setScores();
                    if(Integer.parseInt(questionNumberDisplay.getText()) == maxQuestion){
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

        beginGame = Instant.now();
    }
}
