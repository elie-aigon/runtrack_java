package com.example.job02;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Job02 extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 400);
        Button QUIT = new Button("QUIT");
        QUIT.setOnAction(actionEvent -> {
            stage.close();
        });

        BorderPane.setMargin(QUIT, new Insets(10));
        root.setBottom(QUIT);
        BorderPane.setAlignment(QUIT, Pos.BOTTOM_RIGHT);

        stage.setX(50);
        stage.setY(50);
        stage.setScene(scene);
        stage.setTitle("Job 1");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}