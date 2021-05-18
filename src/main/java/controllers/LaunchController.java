package controllers;

import org.tinylog.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The LaunchController is the controller of the loading screen.
 */
public class LaunchController {

    @FXML
    private TextField usernameTextfield1;

    @FXML
    private TextField usernameTextfield2;

    @FXML
    private Label errorLabel;

    /**
     * Once the {@code startGame} button is clicked, we do a verification wether both of the usernames were filled.
     * If they were, the application loads up the game.fxml. If they weren't, we print an error message and the
     * game won't start, until the the fields are filled appropriately.
     *
     * @param actionEvent
     * @throws IOException in case there's a problem while trying to load the next FXML
     */
    public void startGame(ActionEvent actionEvent) throws IOException {
        if (usernameTextfield1.getText().isEmpty() || usernameTextfield2.getText().isEmpty()) {
            errorLabel.setText("Either one or both of the usernames are empty!");
            Logger.error("Empty username fields.");
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/game.fxml"));
            Parent root = fxmlLoader.load();
            fxmlLoader.<GameController>getController().initdata(usernameTextfield1.getText(), usernameTextfield2.getText());
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.getIcons().add(new Image(this.getClass().getResourceAsStream("/images/logo.png")));
            stage.show();
            Logger.info("Usernames are set to {} and {}, loading game scene.", usernameTextfield1.getText(), usernameTextfield2.getText());
        }

    }
}
