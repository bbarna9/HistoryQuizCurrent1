/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.Result;
import models.Database;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class PreviusGamesController {public static class __CLR4_4_13p3pkosrutbe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0062\u0061\u0072\u006e\u0061\u002f\u0053\u007a\u006f\u0066\u0074\u0076\u0065\u0072\u0066\u0065\u006a\u0065\u006c\u0073\u007a\u0074\u0065\u0073\u002f\u0048\u0069\u0073\u0074\u006f\u0072\u0079\u0051\u0075\u0069\u007a\u0043\u0075\u0072\u0072\u0065\u006e\u0074\u0031\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1621265897958L,8589935092L,144,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @FXML
    private TableView<Result> prevGamesTable;

    @FXML
    private TableColumn<Result, Integer> id;

    @FXML
    private TableColumn<Result, String> player1;

    @FXML
    private TableColumn<Result, Integer> score1;

    @FXML
    private TableColumn<Result, String> player2;

    @FXML
    private TableColumn<Result, Integer> score2;

    @FXML
    private TableColumn<Result, String> winner;

    @FXML
    public void initialize () {try{__CLR4_4_13p3pkosrutbe.R.inc(133);
        __CLR4_4_13p3pkosrutbe.R.inc(134);List<Result> resultList = Database.getResults();
        /*for (int i = 0; i < resultList.size(); i++) {

            //player1.setText(resultList.get(i).getPlayer1());
        }*/
        __CLR4_4_13p3pkosrutbe.R.inc(135);id.setCellValueFactory(new PropertyValueFactory<>("id"));
        __CLR4_4_13p3pkosrutbe.R.inc(136);player1.setCellValueFactory(new PropertyValueFactory<>("player1"));
        __CLR4_4_13p3pkosrutbe.R.inc(137);score1.setCellValueFactory(new PropertyValueFactory<>("score1"));
        __CLR4_4_13p3pkosrutbe.R.inc(138);player2.setCellValueFactory(new PropertyValueFactory<>("player2"));
        __CLR4_4_13p3pkosrutbe.R.inc(139);score2.setCellValueFactory(new PropertyValueFactory<>("score2"));
        __CLR4_4_13p3pkosrutbe.R.inc(140);winner.setCellValueFactory(new PropertyValueFactory<>("winner"));

        /*player1.setCellFactory(column -> {
            TableCell<Result, String> cell = new TableCell<Result, String>() {
                @Override
                protected void updateItem(String playername, boolean empty) {
                    super.updateItem(playername, empty);
                    if(empty) {
                        setText(null);
                    }
                    else {
                        setText(playername);
                    }
                }
            };

            return cell;
        });*/

        __CLR4_4_13p3pkosrutbe.R.inc(141);ObservableList<Result> observableResult = FXCollections.observableArrayList();
        __CLR4_4_13p3pkosrutbe.R.inc(142);observableResult.addAll(resultList);

        __CLR4_4_13p3pkosrutbe.R.inc(143);prevGamesTable.setItems(observableResult);
    }finally{__CLR4_4_13p3pkosrutbe.R.flushNeeded();}}


    //ObservableList<GameResult> observableResult = FXCollections.observableArrayList();
      //  observableResult.addAll(toptenList);

        //toptenTable.setItems(observableResult);




}
