package controllers;

import models.Database;
import models.Result;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import lombok.extern.slf4j.Slf4j;

import javafx.scene.control.Button;

@Slf4j
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
     * {@link controllers.GameController}.
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
    }
}
