/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * This class loads up the launch screen.
 */
public class MyApplication extends Application {public static class __CLR4_4_1aiyaiykorgiczu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0062\u0061\u0072\u006e\u0061\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u0065\u006c\u0073\u007a\u0074\u0065\u0073\u002f\u0048\u0069\u0073\u0074\u006f\u0072\u0079\u0051\u0075\u0069\u007a\u0043\u0075\u0072\u0072\u0065\u006e\u0074\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1621186375048L,8589935092L,13649,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public void start(Stage primaryStage) throws Exception{try{__CLR4_4_1aiyaiykorgiczu.R.inc(13642);
        __CLR4_4_1aiyaiykorgiczu.R.inc(13643);Parent root = FXMLLoader.load(getClass().getResource("/fxml/launch.fxml"));
        __CLR4_4_1aiyaiykorgiczu.R.inc(13644);primaryStage.setTitle("History Quiz");
        __CLR4_4_1aiyaiykorgiczu.R.inc(13645);primaryStage.setResizable(false);
        __CLR4_4_1aiyaiykorgiczu.R.inc(13646);primaryStage.getIcons().add(new Image(this.getClass().getResourceAsStream("/images/logo.png")));
        __CLR4_4_1aiyaiykorgiczu.R.inc(13647);primaryStage.setScene(new Scene(root));
        __CLR4_4_1aiyaiykorgiczu.R.inc(13648);primaryStage.show();
    }finally{__CLR4_4_1aiyaiykorgiczu.R.flushNeeded();}}

}
