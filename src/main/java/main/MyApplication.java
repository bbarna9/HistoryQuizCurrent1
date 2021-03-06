package main;

import org.tinylog.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class loads up the launch screen.
 */
public class MyApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/launch.fxml"));
        primaryStage.setTitle("History Quiz");
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image(this.getClass().getResourceAsStream("/images/logo.png")));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        Logger.info("Launching loading screen.");
    }

}
