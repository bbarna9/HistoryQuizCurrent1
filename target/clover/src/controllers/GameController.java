/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controllers;

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
public class GameController {public static class __CLR4_4_100kosrut8n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0062\u0061\u0072\u006e\u0061\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u0065\u006c\u0073\u007a\u0074\u0065\u0073\u002f\u0048\u0069\u0073\u0074\u006f\u0072\u0079\u0051\u0075\u0069\u007a\u0043\u0075\u0072\u0072\u0065\u006e\u0074\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1621265897958L,8589935092L,119,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    public void newQuestion(){try{__CLR4_4_100kosrut8n.R.inc(0);
        __CLR4_4_100kosrut8n.R.inc(1);Question question = loadNewQuestion();
        __CLR4_4_100kosrut8n.R.inc(2);Logger.info("The question is set to: '{}.", question.getQuestion() + "'");
        __CLR4_4_100kosrut8n.R.inc(3);questionDisplay.setText(question.getQuestion());
        __CLR4_4_100kosrut8n.R.inc(4);answerBlock.setText(question.getAnswer());
    }finally{__CLR4_4_100kosrut8n.R.flushNeeded();}}

    /**
     * The {@code update()} function, coming from it's name is responsible for updating the main screen every round.
     * This means loading a new question, raising the number of questions counter and resetting the timer.
     * Besides the screen updates, here I implement the {@code onlyDigits()} function, which I will later describe.
     */
    public void update(){try{__CLR4_4_100kosrut8n.R.inc(5);
        __CLR4_4_100kosrut8n.R.inc(6);newQuestion();

        __CLR4_4_100kosrut8n.R.inc(7);useranswer1.setText("");
        __CLR4_4_100kosrut8n.R.inc(8);useranswer2.setText("");

        __CLR4_4_100kosrut8n.R.inc(9);onlyDigits(useranswer1);
        __CLR4_4_100kosrut8n.R.inc(10);onlyDigits(useranswer2);

        __CLR4_4_100kosrut8n.R.inc(11);int temp = Integer.parseInt(questionNumberDisplay.getText()) + 1;
        __CLR4_4_100kosrut8n.R.inc(12);questionNumberDisplay.setText(Integer.toString(temp));

        __CLR4_4_100kosrut8n.R.inc(13);timer();
    }finally{__CLR4_4_100kosrut8n.R.flushNeeded();}}

    /**
     * Since this is a number-guessing game, we don't really want any letters or any other types of characters as an answer.
     * This function makes sure that the users can only type in digits, by scanning every single character, and unless they
     * are digits it replaces them with an empty field ("").
     *
     * @param typed are the characters the users type in.
     */
    public void onlyDigits(TextField typed){try{__CLR4_4_100kosrut8n.R.inc(14);
        __CLR4_4_100kosrut8n.R.inc(15);typed.textProperty().addListener((observable, oldValue, newValue) -> {
            __CLR4_4_100kosrut8n.R.inc(16);if((((!newValue.matches("\\d*"))&&(__CLR4_4_100kosrut8n.R.iget(17)!=0|true))||(__CLR4_4_100kosrut8n.R.iget(18)==0&false))){{
                __CLR4_4_100kosrut8n.R.inc(19);typed.setText(newValue.replaceAll("[^\\d]",""));
                __CLR4_4_100kosrut8n.R.inc(20);Logger.warn("The answer can only contain digits.");
            }
        }});
    }finally{__CLR4_4_100kosrut8n.R.flushNeeded();}}

    /**
     * In the {@code setScores()} function, again, as one can guess from it's name, we are setting in the correct
     * player scores. This is achieved by checking who guessed closer to the correct answer. Every win is +1 point.
     * In case of a draw, noone gets a point.
     */
    public void setScores(){try{__CLR4_4_100kosrut8n.R.inc(21);
        __CLR4_4_100kosrut8n.R.inc(22);int answer = Integer.parseInt(answerBlock.getText());
        __CLR4_4_100kosrut8n.R.inc(23);int answer1 = 0;
        __CLR4_4_100kosrut8n.R.inc(24);int answer2 = 0;

        __CLR4_4_100kosrut8n.R.inc(25);try {
            __CLR4_4_100kosrut8n.R.inc(26);if ((((useranswer1.getText().equals(""))&&(__CLR4_4_100kosrut8n.R.iget(27)!=0|true))||(__CLR4_4_100kosrut8n.R.iget(28)==0&false))){{
                __CLR4_4_100kosrut8n.R.inc(29);answer1 = 1000000;
                __CLR4_4_100kosrut8n.R.inc(30);Logger.error("Player 1 didn't write an answer, therefore Player 2 won the round.");
            } }else {{
                __CLR4_4_100kosrut8n.R.inc(31);answer1 = Integer.parseInt(useranswer1.getText());
            }
        }} catch (NumberFormatException e){
            __CLR4_4_100kosrut8n.R.inc(32);e.getMessage();
        }

        __CLR4_4_100kosrut8n.R.inc(33);try {
            __CLR4_4_100kosrut8n.R.inc(34);if ((((useranswer2.getText().equals(""))&&(__CLR4_4_100kosrut8n.R.iget(35)!=0|true))||(__CLR4_4_100kosrut8n.R.iget(36)==0&false))){{
                __CLR4_4_100kosrut8n.R.inc(37);answer2 = 1000000;
                __CLR4_4_100kosrut8n.R.inc(38);Logger.error("Player 2 didn't write an answer, therefore Player 1 won the round.");
            } }else {{
                __CLR4_4_100kosrut8n.R.inc(39);answer2 = Integer.parseInt(useranswer2.getText());
            }
        }} catch (NumberFormatException e){
            __CLR4_4_100kosrut8n.R.inc(40);e.getMessage();
        }

        __CLR4_4_100kosrut8n.R.inc(41);int temp1 = answer-answer1;
        __CLR4_4_100kosrut8n.R.inc(42);int temp2 = answer-answer2;

        __CLR4_4_100kosrut8n.R.inc(43);if ((((temp1 < 0)&&(__CLR4_4_100kosrut8n.R.iget(44)!=0|true))||(__CLR4_4_100kosrut8n.R.iget(45)==0&false))) {{
            __CLR4_4_100kosrut8n.R.inc(46);temp1 = temp1 * -1;
        }

        }__CLR4_4_100kosrut8n.R.inc(47);if ((((temp2 < 0)&&(__CLR4_4_100kosrut8n.R.iget(48)!=0|true))||(__CLR4_4_100kosrut8n.R.iget(49)==0&false))) {{
            __CLR4_4_100kosrut8n.R.inc(50);temp2 = temp2 * -1;
        }
/*
        if(answer1 == 0){
            temp1 = 1000000;
        }

        if(answer2 == 0){
            temp2 = 1000000;
        }
  */
        }__CLR4_4_100kosrut8n.R.inc(51);if ((((temp1 < temp2)&&(__CLR4_4_100kosrut8n.R.iget(52)!=0|true))||(__CLR4_4_100kosrut8n.R.iget(53)==0&false))) {{
            __CLR4_4_100kosrut8n.R.inc(54);player1Score.setText(Integer.toString(Integer.parseInt(player1Score.getText()) + 1));
        }
        }else {__CLR4_4_100kosrut8n.R.inc(55);if ((((temp2 < temp1)&&(__CLR4_4_100kosrut8n.R.iget(56)!=0|true))||(__CLR4_4_100kosrut8n.R.iget(57)==0&false))) {{
            __CLR4_4_100kosrut8n.R.inc(58);player2Score.setText(Integer.toString(Integer.parseInt(player2Score.getText()) + 1));
        } }else {{
            //Do nothing
        }

        }}__CLR4_4_100kosrut8n.R.inc(59);score1 = Integer.parseInt(player1Score.getText());
        __CLR4_4_100kosrut8n.R.inc(60);score2 = Integer.parseInt(player2Score.getText());
        __CLR4_4_100kosrut8n.R.inc(61);Logger.info("The scores are set to {} and {}.", score1, score2);
    }finally{__CLR4_4_100kosrut8n.R.flushNeeded();}}

    /**
     * Here we declare what happens when someone clicks on the {@code nextQuestionButton}.
     * We simply call the {@code update()} function and reset the time.
     */
    public void nextQuestionAsked(){try{__CLR4_4_100kosrut8n.R.inc(62);
        __CLR4_4_100kosrut8n.R.inc(63);update();
        __CLR4_4_100kosrut8n.R.inc(64);seconds = startingTime;
        //useranswer1.setText("0");
        //useranswer2.setText("0");
    }finally{__CLR4_4_100kosrut8n.R.flushNeeded();}}

    /**
     * I think we can say that this is the most complicated function in the entire project.
     * We start up by setting the graphical parts, such as hiding the answer, so that it can only be seen
     * once the time is up. We create a new KeyFrame, which is responsible for changing the {@code timeDisplay} label.
     * When the time is up, We make the answer and the {@code nextQuestionButton} visible, and the users' textfields
     * uneditable. We call the {@code setScores()} function, to see who got closer. If the question was the last one,
     * we "switch" the {@code nextQuestionButton} up with the {@code getResultsButton}.
     */
    public void timer(){try{__CLR4_4_100kosrut8n.R.inc(65);
        __CLR4_4_100kosrut8n.R.inc(66);answerBlock.setVisible(false);
        __CLR4_4_100kosrut8n.R.inc(67);useranswer1.setEditable(true);
        __CLR4_4_100kosrut8n.R.inc(68);useranswer2.setEditable(true);
        __CLR4_4_100kosrut8n.R.inc(69);nextQuestionButton.setVisible(false);

        __CLR4_4_100kosrut8n.R.inc(70);Timeline time = new Timeline();
        __CLR4_4_100kosrut8n.R.inc(71);time.setCycleCount(Timeline.INDEFINITE);
            __CLR4_4_100kosrut8n.R.inc(72);if((((time!=null)&&(__CLR4_4_100kosrut8n.R.iget(73)!=0|true))||(__CLR4_4_100kosrut8n.R.iget(74)==0&false)))
                {__CLR4_4_100kosrut8n.R.inc(75);time.stop();
        }__CLR4_4_100kosrut8n.R.inc(76);KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {try{__CLR4_4_100kosrut8n.R.inc(77);
                __CLR4_4_100kosrut8n.R.inc(78);timeDisplay.setText(String.valueOf(seconds));
                    __CLR4_4_100kosrut8n.R.inc(79);if ((((seconds<=0)&&(__CLR4_4_100kosrut8n.R.iget(80)!=0|true))||(__CLR4_4_100kosrut8n.R.iget(81)==0&false)))
                        {__CLR4_4_100kosrut8n.R.inc(82);time.stop();
                }__CLR4_4_100kosrut8n.R.inc(83);seconds--;
                __CLR4_4_100kosrut8n.R.inc(84);if((((seconds==-1)&&(__CLR4_4_100kosrut8n.R.iget(85)!=0|true))||(__CLR4_4_100kosrut8n.R.iget(86)==0&false))) {{
                    __CLR4_4_100kosrut8n.R.inc(87);answerBlock.setVisible(true);
                    __CLR4_4_100kosrut8n.R.inc(88);useranswer1.setEditable(false);
                    __CLR4_4_100kosrut8n.R.inc(89);useranswer2.setEditable(false);
                    __CLR4_4_100kosrut8n.R.inc(90);nextQuestionButton.setVisible(true);
                    __CLR4_4_100kosrut8n.R.inc(91);Logger.info("Resetting timer.");
                    __CLR4_4_100kosrut8n.R.inc(92);setScores();
                    __CLR4_4_100kosrut8n.R.inc(93);if((((Integer.parseInt(questionNumberDisplay.getText()) == maxQuestion)&&(__CLR4_4_100kosrut8n.R.iget(94)!=0|true))||(__CLR4_4_100kosrut8n.R.iget(95)==0&false))){{
                        __CLR4_4_100kosrut8n.R.inc(96);nextQuestionButton.setVisible(false);
                        __CLR4_4_100kosrut8n.R.inc(97);getResultsButton.setVisible(true);

                    }
                }}
            }}finally{__CLR4_4_100kosrut8n.R.flushNeeded();}}
        });
        __CLR4_4_100kosrut8n.R.inc(98);time.getKeyFrames().add(frame);
        __CLR4_4_100kosrut8n.R.inc(99);time.playFromStart();

        __CLR4_4_100kosrut8n.R.inc(100);seconds = startingTime;
    }finally{__CLR4_4_100kosrut8n.R.flushNeeded();}}

    /**
     * By pressing the {@code getResultsButton}, we call the {@code showResults()} function. This simply loads up
     * the results.fxml, where we can check who won the game.
     *
     * @param actionEvent since it requires a button being clicked
     * @throws IOException in case it can't load in the desired FXML file.
     */
    public void showResults(ActionEvent actionEvent) throws IOException {try{__CLR4_4_100kosrut8n.R.inc(101);
        __CLR4_4_100kosrut8n.R.inc(102);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/results.fxml"));
        __CLR4_4_100kosrut8n.R.inc(103);Parent root = fxmlLoader.load();
        __CLR4_4_100kosrut8n.R.inc(104);fxmlLoader.<ResultController>getController().initdata(username1, username2, score1, score2);
        __CLR4_4_100kosrut8n.R.inc(105);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_100kosrut8n.R.inc(106);stage.getIcons().add(new Image(this.getClass().getResourceAsStream("/images/logo.png")));
        __CLR4_4_100kosrut8n.R.inc(107);stage.setScene(new Scene(root));
        __CLR4_4_100kosrut8n.R.inc(108);stage.show();
        __CLR4_4_100kosrut8n.R.inc(109);Logger.info("Loading results.");
    }finally{__CLR4_4_100kosrut8n.R.flushNeeded();}}

    /**
     * This function simply sets in the username display with data it receive from the launch.fxml
     *
     * @param userName1
     * @param userName2
     */
    public void initdata(String userName1, String userName2) {try{__CLR4_4_100kosrut8n.R.inc(110);
        __CLR4_4_100kosrut8n.R.inc(111);username1 = userName1;
        __CLR4_4_100kosrut8n.R.inc(112);username2 = userName2;
        __CLR4_4_100kosrut8n.R.inc(113);usernameLabel.setText("Current users: " + username1 + " and " + username2);
        __CLR4_4_100kosrut8n.R.inc(114);getResultsButton.setVisible(false);
        __CLR4_4_100kosrut8n.R.inc(115);Logger.info("Initializing data.");
    }finally{__CLR4_4_100kosrut8n.R.flushNeeded();}}

    /**
     * With this function we start up the entire FXML.
     */
    @FXML
    public void initialize() {try{__CLR4_4_100kosrut8n.R.inc(116);
        __CLR4_4_100kosrut8n.R.inc(117);update();

        __CLR4_4_100kosrut8n.R.inc(118);beginGame = Instant.now();
    }finally{__CLR4_4_100kosrut8n.R.flushNeeded();}}
}
