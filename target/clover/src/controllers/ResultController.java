/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import models.Database;
import models.Result;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lombok.extern.slf4j.Slf4j;

import javafx.event.ActionEvent;

import javafx.scene.control.Button;
import org.tinylog.Logger;

import java.io.IOException;

@Slf4j
public class ResultController {public static class __CLR4_4_14040kosrutbu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0062\u0061\u0072\u006e\u0061\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u0065\u006c\u0073\u007a\u0074\u0065\u0073\u002f\u0048\u0069\u0073\u0074\u006f\u0072\u0079\u0051\u0075\u0069\u007a\u0043\u0075\u0072\u0072\u0065\u006e\u0074\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1621265897958L,8589935092L,172,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String username1;
    private String username2;

    @FXML
    public Label player1NameBox;

    @FXML
    public Label player2NameBox;

    @FXML
    public Label winnerDisplay;

    @FXML
    public Button dataButton;

    /**
     * This function simply makes a one-time setting in of the labels it's going to show,
     * displaying the final results.
     * It receives all of the parameters from the {@code showResults()} function in the
     * {@link controllers.GameController}.
     *
     * @param name1
     * @param name2
     * @param score1
     * @param score2
     */

    public void initdata(String name1, String name2, int score1, int score2){try{__CLR4_4_14040kosrutbu.R.inc(144);
        __CLR4_4_14040kosrutbu.R.inc(145);username1 = name1;
        __CLR4_4_14040kosrutbu.R.inc(146);username2 = name2;

        __CLR4_4_14040kosrutbu.R.inc(147);player1NameBox.setText(username1 + ": " + score1);
        __CLR4_4_14040kosrutbu.R.inc(148);player2NameBox.setText(username2 + ": " + score2);
        __CLR4_4_14040kosrutbu.R.inc(149);String winner = "Noone yet";

        __CLR4_4_14040kosrutbu.R.inc(150);if((((score1 == score2)&&(__CLR4_4_14040kosrutbu.R.iget(151)!=0|true))||(__CLR4_4_14040kosrutbu.R.iget(152)==0&false))){{
            __CLR4_4_14040kosrutbu.R.inc(153);winner = "It's draw!";
        }
        }else {__CLR4_4_14040kosrutbu.R.inc(154);if((((score1 > score2)&&(__CLR4_4_14040kosrutbu.R.iget(155)!=0|true))||(__CLR4_4_14040kosrutbu.R.iget(156)==0&false))){{
            __CLR4_4_14040kosrutbu.R.inc(157);winner = ("The winner is: " + name1);
        } }else
            {__CLR4_4_14040kosrutbu.R.inc(158);winner = ("The winner is: " + name2);

        }}__CLR4_4_14040kosrutbu.R.inc(159);winnerDisplay.setText(winner);
        __CLR4_4_14040kosrutbu.R.inc(160);int valami = 1;
        __CLR4_4_14040kosrutbu.R.inc(161);Result result = new Result(valami, username1, username2, score1, score2, winner);
        __CLR4_4_14040kosrutbu.R.inc(162);Database.addResults(result);

        __CLR4_4_14040kosrutbu.R.inc(163);Logger.info("Displaying results.");
    }finally{__CLR4_4_14040kosrutbu.R.flushNeeded();}}

    public void prevDataRequested(ActionEvent actionEvent) throws IOException {try{__CLR4_4_14040kosrutbu.R.inc(164);
        __CLR4_4_14040kosrutbu.R.inc(165);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/prevgames.fxml"));
        __CLR4_4_14040kosrutbu.R.inc(166);Parent root = fxmlLoader.load();
        //fxmlLoader.<PreviusGamesController>getController().initdata(username1, username2, score1, score2);
        __CLR4_4_14040kosrutbu.R.inc(167);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        __CLR4_4_14040kosrutbu.R.inc(168);stage.getIcons().add(new Image(this.getClass().getResourceAsStream("/images/logo.png")));
        __CLR4_4_14040kosrutbu.R.inc(169);stage.setScene(new Scene(root));
        __CLR4_4_14040kosrutbu.R.inc(170);stage.show();
        __CLR4_4_14040kosrutbu.R.inc(171);Logger.info("Loading previous game results.");
    }finally{__CLR4_4_14040kosrutbu.R.flushNeeded();}}
}
