package controllers;

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

public class PreviusGamesController {

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
    public void initialize () {
        List<Result> resultList = Database.getResults();
        /*for (int i = 0; i < resultList.size(); i++) {

            //player1.setText(resultList.get(i).getPlayer1());
        }*/
        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        player1.setCellValueFactory(new PropertyValueFactory<>("player1"));
        score1.setCellValueFactory(new PropertyValueFactory<>("score1"));
        player2.setCellValueFactory(new PropertyValueFactory<>("player2"));
        score2.setCellValueFactory(new PropertyValueFactory<>("score2"));
        winner.setCellValueFactory(new PropertyValueFactory<>("winner"));

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

        ObservableList<Result> observableResult = FXCollections.observableArrayList();
        observableResult.addAll(resultList);

        prevGamesTable.setItems(observableResult);
    }


    //ObservableList<GameResult> observableResult = FXCollections.observableArrayList();
      //  observableResult.addAll(toptenList);

        //toptenTable.setItems(observableResult);




}
