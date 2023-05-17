package com.example.job04;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Job04 extends  javafx.application.Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws IOException {
        FlowPane root = new FlowPane();
        Scene scene = new Scene(root, 400, 400);
        Label name = new Label("Nom : ");
        TextField inputName = new TextField();
        Button SendButton = new Button("Envoyer");
        root.getChildren().addAll(name, inputName, SendButton);
        String css = getClass().getResource("/style.css").toExternalForm();
        scene.getStylesheets().add(css);
        SendButton.getStyleClass().add("button");
        SendButton.setOnAction(event -> {
            System.out.println(inputName.getCharacters());
        });
        stage.setX(50);
        stage.setY(50);
        stage.setScene(scene);
        stage.setTitle("Job 4");
        stage.show();
    }
}
