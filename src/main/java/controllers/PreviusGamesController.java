package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import models.Result;
import models.Database;

import java.util.List;

/**
 * This controller fills up the {@code prevGamesTable} table with data it gets from Our online
 * database.
 */
public class PreviusGamesController {

    @FXML
    private Label numberOfGamesPlayed;

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

    /**
     * In the {@code initialize()} function we call the {@code getResults()} function from the {@link models.Database} model,
     * then we use the data from this database to fill up our table cells with all of the data stored from the previous games,
     * e.g. match ID, player names, scores and most importantly, who won the round.
     * */
    @FXML
    public void initialize () {
        List<Result> resultList = Database.getResults();

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        player1.setCellValueFactory(new PropertyValueFactory<>("player1"));
        score1.setCellValueFactory(new PropertyValueFactory<>("score1"));
        player2.setCellValueFactory(new PropertyValueFactory<>("player2"));
        score2.setCellValueFactory(new PropertyValueFactory<>("score2"));
        winner.setCellValueFactory(new PropertyValueFactory<>("winner"));

        ObservableList<Result> observableResult = FXCollections.observableArrayList();
        observableResult.addAll(resultList);

        prevGamesTable.setItems(observableResult);

        numberOfGamesPlayed.setText("Number of games played so far: " + Long.toString(Database.getTotalMatchesPlayed()));
    }
}
