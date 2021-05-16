/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

import models.Question;
import models.personalXmlReader;

import java.util.Random;
import java.time.Instant;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

import static models.Question.loadNewQuestion;

/**
 * The GameController is the code behind the {@link models/game.fxml}. This is where we define how we want
 * our application to run.
 */
@Slf4j
public class GameController {public static class __CLR4_4_19iw9iwkor6mypd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0062\u0061\u0072\u006e\u0061\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u0065\u006c\u0073\u007a\u0074\u0065\u0073\u002f\u0048\u0069\u0073\u0074\u006f\u0072\u0079\u0051\u0075\u0069\u007a\u0043\u0075\u0072\u0072\u0065\u006e\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1621169793704L,8589935092L,12442,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String username1;
    private String username2;
    private Instant beginGame;
    public int score1;
    public int score2;

    private final int maxQuestion = 5;
    private final int startingTime = 5;
    private int seconds = startingTime;

    public personalXmlReader personalxmlreader = new personalXmlReader();

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
     * The first function is {@code newQuestion()}. Here we instantiate a {@link models/Question} object,
     * and we pass it's content to our {@code questionDisplay} and {@code answerBlock} labels.
     */
    public void newQuestion(){try{__CLR4_4_19iw9iwkor6mypd.R.inc(12344);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12345);Question question = loadNewQuestion();

        __CLR4_4_19iw9iwkor6mypd.R.inc(12346);questionDisplay.setText(question.getQuestion());
        __CLR4_4_19iw9iwkor6mypd.R.inc(12347);answerBlock.setText(question.getAnswer());
    }finally{__CLR4_4_19iw9iwkor6mypd.R.flushNeeded();}}

    /**
     * The {@code update()} function, coming from it's name is responsible for updating the main screen every round.
     * This means loading a new question, raising the number of questions counter and resetting the timer.
     * Besides the screen updates, here I implement the {@code onlyDigits()} function, which I will later describe.
     */
    public void update(){try{__CLR4_4_19iw9iwkor6mypd.R.inc(12348);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12349);newQuestion();

        __CLR4_4_19iw9iwkor6mypd.R.inc(12350);onlyDigits(useranswer1);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12351);onlyDigits(useranswer2);

        __CLR4_4_19iw9iwkor6mypd.R.inc(12352);int temp = Integer.parseInt(questionNumberDisplay.getText()) + 1;
        __CLR4_4_19iw9iwkor6mypd.R.inc(12353);questionNumberDisplay.setText(Integer.toString(temp));

        __CLR4_4_19iw9iwkor6mypd.R.inc(12354);timer();
    }finally{__CLR4_4_19iw9iwkor6mypd.R.flushNeeded();}}

    /**
     * Since this is a number-guessing game, we don't really want any letters or any other types of characters as an answer.
     * This function makes sure that the users can only type in digits, by scanning every single character, and unless they
     * are digits it replaces them with an empty field ("").
     *
     * @param typed are the characters the users type in.
     */
    public void onlyDigits(TextField typed){try{__CLR4_4_19iw9iwkor6mypd.R.inc(12355);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12356);typed.textProperty().addListener((observable, oldValue, newValue) -> {
            __CLR4_4_19iw9iwkor6mypd.R.inc(12357);if((((!newValue.matches("\\d*"))&&(__CLR4_4_19iw9iwkor6mypd.R.iget(12358)!=0|true))||(__CLR4_4_19iw9iwkor6mypd.R.iget(12359)==0&false))){{
                __CLR4_4_19iw9iwkor6mypd.R.inc(12360);typed.setText(newValue.replaceAll("[^\\d]",""));
            }
        }});
    }finally{__CLR4_4_19iw9iwkor6mypd.R.flushNeeded();}}

    /**
     * In the {@code setScores()} function, again, as one can guess from it's name, we are setting in the correct
     * player scores. This is achieved by checking who guessed closer to the correct answer. Every win is +1 point.
     * In case of a draw, noone gets a point.
     */
    public void setScores(){try{__CLR4_4_19iw9iwkor6mypd.R.inc(12361);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12362);int answer = Integer.parseInt(answerBlock.getText());
        __CLR4_4_19iw9iwkor6mypd.R.inc(12363);int answer1 = 0;
        __CLR4_4_19iw9iwkor6mypd.R.inc(12364);int answer2 = 0;

        __CLR4_4_19iw9iwkor6mypd.R.inc(12365);try {
            __CLR4_4_19iw9iwkor6mypd.R.inc(12366);answer1 = Integer.parseInt(useranswer1.getText());
            __CLR4_4_19iw9iwkor6mypd.R.inc(12367);answer2 = Integer.parseInt(useranswer2.getText());
        } catch (NumberFormatException e){
            __CLR4_4_19iw9iwkor6mypd.R.inc(12368);e.getMessage();
        }

        __CLR4_4_19iw9iwkor6mypd.R.inc(12369);int temp1 = answer-answer1;
        __CLR4_4_19iw9iwkor6mypd.R.inc(12370);int temp2 = answer-answer2;

        __CLR4_4_19iw9iwkor6mypd.R.inc(12371);if((((temp1 < 0)&&(__CLR4_4_19iw9iwkor6mypd.R.iget(12372)!=0|true))||(__CLR4_4_19iw9iwkor6mypd.R.iget(12373)==0&false))){{
            __CLR4_4_19iw9iwkor6mypd.R.inc(12374);temp1 = temp1 * -1;
        }

        }__CLR4_4_19iw9iwkor6mypd.R.inc(12375);if((((temp2 < 0)&&(__CLR4_4_19iw9iwkor6mypd.R.iget(12376)!=0|true))||(__CLR4_4_19iw9iwkor6mypd.R.iget(12377)==0&false))){{
            __CLR4_4_19iw9iwkor6mypd.R.inc(12378);temp2 = temp2 * -1;
        }

        }__CLR4_4_19iw9iwkor6mypd.R.inc(12379);if((((answer1 == answer2)&&(__CLR4_4_19iw9iwkor6mypd.R.iget(12380)!=0|true))||(__CLR4_4_19iw9iwkor6mypd.R.iget(12381)==0&false))){{

        }
        }else {__CLR4_4_19iw9iwkor6mypd.R.inc(12382);if ((((answer2 == 0 | temp1 < temp2)&&(__CLR4_4_19iw9iwkor6mypd.R.iget(12383)!=0|true))||(__CLR4_4_19iw9iwkor6mypd.R.iget(12384)==0&false))) {{
            __CLR4_4_19iw9iwkor6mypd.R.inc(12385);player1Score.setText(Integer.toString(Integer.parseInt(player1Score.getText()) + 1));
        } }else {{
            __CLR4_4_19iw9iwkor6mypd.R.inc(12386);player2Score.setText(Integer.toString(Integer.parseInt(player2Score.getText()) + 1));
        }

        }}__CLR4_4_19iw9iwkor6mypd.R.inc(12387);score1 = Integer.parseInt(player1Score.getText());
        __CLR4_4_19iw9iwkor6mypd.R.inc(12388);score2 = Integer.parseInt(player2Score.getText());

    }finally{__CLR4_4_19iw9iwkor6mypd.R.flushNeeded();}}

    /**
     * Here we declare what happens when someone clicks on the {@code nextQuestionButton}.
     * We simply call the {@code update()} function and reset the time.
     */
    public void nextQuestionAsked(){try{__CLR4_4_19iw9iwkor6mypd.R.inc(12389);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12390);update();
        __CLR4_4_19iw9iwkor6mypd.R.inc(12391);seconds = startingTime;
        //useranswer1.setText("0");
        //useranswer2.setText("0");
    }finally{__CLR4_4_19iw9iwkor6mypd.R.flushNeeded();}}

    /**
     * I think we can say that this is the most complicated function in the entire project.
     * We start up by setting the graphical parts, such as hiding the answer, so that it can only be seen
     * once the time is up. We create a new KeyFrame, which is responsible for changing the {@code timeDisplay} label.
     * When the time is up, We make the answer and the {@code nextQuestionButton} visible, and the users' textfields
     * uneditable. We call the {@code setScores()} function, to see who got closer. If the question was the last one,
     * we "switch" the {@code nextQuestionButton} up with the {@code getResultsButton}.
     */
    public void timer(){try{__CLR4_4_19iw9iwkor6mypd.R.inc(12392);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12393);answerBlock.setVisible(false);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12394);useranswer1.setEditable(true);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12395);useranswer2.setEditable(true);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12396);nextQuestionButton.setVisible(false);

        __CLR4_4_19iw9iwkor6mypd.R.inc(12397);Timeline time = new Timeline();
        __CLR4_4_19iw9iwkor6mypd.R.inc(12398);time.setCycleCount(Timeline.INDEFINITE);
            __CLR4_4_19iw9iwkor6mypd.R.inc(12399);if((((time!=null)&&(__CLR4_4_19iw9iwkor6mypd.R.iget(12400)!=0|true))||(__CLR4_4_19iw9iwkor6mypd.R.iget(12401)==0&false)))
                {__CLR4_4_19iw9iwkor6mypd.R.inc(12402);time.stop();
        }__CLR4_4_19iw9iwkor6mypd.R.inc(12403);KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {try{__CLR4_4_19iw9iwkor6mypd.R.inc(12404);
                __CLR4_4_19iw9iwkor6mypd.R.inc(12405);timeDisplay.setText(String.valueOf(seconds));
                    __CLR4_4_19iw9iwkor6mypd.R.inc(12406);if ((((seconds<=0)&&(__CLR4_4_19iw9iwkor6mypd.R.iget(12407)!=0|true))||(__CLR4_4_19iw9iwkor6mypd.R.iget(12408)==0&false)))
                        {__CLR4_4_19iw9iwkor6mypd.R.inc(12409);time.stop();
                }__CLR4_4_19iw9iwkor6mypd.R.inc(12410);seconds--;
                __CLR4_4_19iw9iwkor6mypd.R.inc(12411);if((((seconds==-1)&&(__CLR4_4_19iw9iwkor6mypd.R.iget(12412)!=0|true))||(__CLR4_4_19iw9iwkor6mypd.R.iget(12413)==0&false))) {{
                    __CLR4_4_19iw9iwkor6mypd.R.inc(12414);answerBlock.setVisible(true);
                    __CLR4_4_19iw9iwkor6mypd.R.inc(12415);useranswer1.setEditable(false);
                    __CLR4_4_19iw9iwkor6mypd.R.inc(12416);useranswer2.setEditable(false);
                    __CLR4_4_19iw9iwkor6mypd.R.inc(12417);nextQuestionButton.setVisible(true);
                    __CLR4_4_19iw9iwkor6mypd.R.inc(12418);setScores();
                    __CLR4_4_19iw9iwkor6mypd.R.inc(12419);if((((Integer.parseInt(questionNumberDisplay.getText()) == maxQuestion)&&(__CLR4_4_19iw9iwkor6mypd.R.iget(12420)!=0|true))||(__CLR4_4_19iw9iwkor6mypd.R.iget(12421)==0&false))){{
                        __CLR4_4_19iw9iwkor6mypd.R.inc(12422);nextQuestionButton.setVisible(false);
                        __CLR4_4_19iw9iwkor6mypd.R.inc(12423);getResultsButton.setVisible(true);

                    }
                }}
            }}finally{__CLR4_4_19iw9iwkor6mypd.R.flushNeeded();}}
        });
        __CLR4_4_19iw9iwkor6mypd.R.inc(12424);time.getKeyFrames().add(frame);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12425);time.playFromStart();

        __CLR4_4_19iw9iwkor6mypd.R.inc(12426);seconds = startingTime;
    }finally{__CLR4_4_19iw9iwkor6mypd.R.flushNeeded();}}

    /**
     * By pressing the {@code getResultsButton}, we call the {@showResults()} function. This simply loads up
     * another FXML, the {@link fxml/results.fxml}, where we can check who won the game.
     *
     * @param actionEvent since it requires a button being clicked
     * @throws IOException in case it can't load in the desired FXML file.
     */
    public void showResults(ActionEvent actionEvent) throws IOException {try{__CLR4_4_19iw9iwkor6mypd.R.inc(12427);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12428);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/results.fxml"));
        __CLR4_4_19iw9iwkor6mypd.R.inc(12429);Parent root = fxmlLoader.load();
        __CLR4_4_19iw9iwkor6mypd.R.inc(12430);fxmlLoader.<ResultController>getController().initdata(username1, username2, score1, score2);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12431);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        //stage.getIcons().add(icon);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12432);stage.setScene(new Scene(root));
        __CLR4_4_19iw9iwkor6mypd.R.inc(12433);stage.show();
    }finally{__CLR4_4_19iw9iwkor6mypd.R.flushNeeded();}}

    /**
     * This function simply sets in the username display with data it receive from the {@link fxml/lanch.fxml}
     *
     * @param userName1
     * @param userName2
     */
    public void initdata(String userName1, String userName2) {try{__CLR4_4_19iw9iwkor6mypd.R.inc(12434);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12435);username1 = userName1;
        __CLR4_4_19iw9iwkor6mypd.R.inc(12436);username2 = userName2;
        __CLR4_4_19iw9iwkor6mypd.R.inc(12437);usernameLabel.setText("Current users: " + username1 + " and " + username2);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12438);getResultsButton.setVisible(false);
    }finally{__CLR4_4_19iw9iwkor6mypd.R.flushNeeded();}}

    /**
     * With this function we start up the entire FXML.
     */
    @FXML
    public void initialize() {try{__CLR4_4_19iw9iwkor6mypd.R.inc(12439);
        __CLR4_4_19iw9iwkor6mypd.R.inc(12440);update();

        __CLR4_4_19iw9iwkor6mypd.R.inc(12441);beginGame = Instant.now();
    }finally{__CLR4_4_19iw9iwkor6mypd.R.flushNeeded();}}
}
