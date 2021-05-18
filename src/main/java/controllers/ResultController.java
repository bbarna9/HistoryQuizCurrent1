package controllers;

import org.tinylog.Logger;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


import models.Database;
import models.Result;

/**
 * The {@code ResultController} is the controller of our last-but-one FXML, which sums up the result of this game.
 */
public class ResultController {

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
     * {@link controllers.GameController}. Finally we are passing all of the data to the
     * {@code addResults()} function of the {@link models.Database} model.
     *
     * @param name1
     * @param name2
     * @param score1
     * @param score2
     */
    public void initdata(String name1, String name2, int score1, int score2){
        username1 = name1;
        username2 = name2;

        player1NameBox.setText(username1 + ": " + score1);
        player2NameBox.setText(username2 + ": " + score2);
        String winner = "Noone yet";

        if(score1 == score2){
            winner = "It's draw!";
        }
        else if(score1 > score2){
            winner = ("The winner is: " + name1);
        } else
            winner = ("The winner is: " + name2);

        winnerDisplay.setText(winner);
        int valami = 1;
        Result result = new Result(valami, username1, username2, score1, score2, winner);

        Database.addResults(result);

        Logger.info("Displaying results.");
    }

    /**
     * This function is declaring what happens when somebody presses the {@code dataButton}. If this happens, our
     * application loads up another FXML file, which will show us all of the previous games with all of it's data.
     *
     * @param actionEvent since it requires a button to be pressed.
     * @throws IOException in case there is some problem with loading up the FXML.
     */
    public void prevDataRequested(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/prevgames.fxml"));
        Parent root = fxmlLoader.load();
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.getIcons().add(new Image(this.getClass().getResourceAsStream("/images/logo.png")));
        stage.setScene(new Scene(root));
        stage.show();
        Logger.info("Loading previous game results.");
    }
}
