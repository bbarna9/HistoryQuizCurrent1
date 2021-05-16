/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controllers;

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

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * The LaunchController is the controller of the loading screen
 */
@Slf4j
public class LaunchController {public static class __CLR4_4_19lm9lmkor6myr4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0062\u0061\u0072\u006e\u0061\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u0065\u006c\u0073\u007a\u0074\u0065\u0073\u002f\u0048\u0069\u0073\u0074\u006f\u0072\u0079\u0051\u0075\u0069\u007a\u0043\u0075\u0072\u0072\u0065\u006e\u0074\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1621169793704L,8589935092L,12454,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML
    private TextField usernameTextfield1;

    @FXML
    private TextField usernameTextfield2;

    @FXML
    private Label errorLabel;

    /**
     * Once the {@code startGame} button is clicked, we do a verification wether both of the usernames were filled.
     * If they were, the application loads up the {@link models/game.fxml}. If they weren't, we print an error message and the
     * game won't start, until the the fields are filled appropriately.
     *
     * @param actionEvent
     * @throws IOException in case there's a problem while trying to load the next FXML
     */
    public void startGame(ActionEvent actionEvent) throws IOException {try{__CLR4_4_19lm9lmkor6myr4.R.inc(12442);
        __CLR4_4_19lm9lmkor6myr4.R.inc(12443);if ((((usernameTextfield1.getText().isEmpty() || usernameTextfield2.getText().isEmpty())&&(__CLR4_4_19lm9lmkor6myr4.R.iget(12444)!=0|true))||(__CLR4_4_19lm9lmkor6myr4.R.iget(12445)==0&false))) {{
            __CLR4_4_19lm9lmkor6myr4.R.inc(12446);errorLabel.setText("Either one or both of the usernames are empty!");
        } }else {{
            __CLR4_4_19lm9lmkor6myr4.R.inc(12447);FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game.fxml"));
            __CLR4_4_19lm9lmkor6myr4.R.inc(12448);Parent root = fxmlLoader.load();
            __CLR4_4_19lm9lmkor6myr4.R.inc(12449);fxmlLoader.<GameController>getController().initdata(usernameTextfield1.getText(), usernameTextfield2.getText());
            __CLR4_4_19lm9lmkor6myr4.R.inc(12450);Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            __CLR4_4_19lm9lmkor6myr4.R.inc(12451);stage.setScene(new Scene(root));
            __CLR4_4_19lm9lmkor6myr4.R.inc(12452);stage.show();
            __CLR4_4_19lm9lmkor6myr4.R.inc(12453);log.info("Usernames are set to {} and {}, loading game scene.", usernameTextfield1.getText(), usernameTextfield2.getText());
        }

    }}finally{__CLR4_4_19lm9lmkor6myr4.R.flushNeeded();}}
}
