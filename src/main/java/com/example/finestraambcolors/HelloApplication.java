
package com.example.finestraambcolors;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public void stop() throws InterruptedException {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Duplicate");
        alert.setHeaderText("This folder already exists");
        alert.setContentText("Do you want to continue (this program will overwrite any files with duplicate names)");

        alert.show();
        TimeUnit.SECONDS.sleep(2);

    }
}