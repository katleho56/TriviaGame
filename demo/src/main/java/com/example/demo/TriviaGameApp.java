package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class TriviaGameApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("game.fxml")));

            Scene scene = new Scene(root, 800, 600);

            primaryStage.setTitle("Lesotho Trivia Game App");
            primaryStage.setScene(scene);
            primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}

