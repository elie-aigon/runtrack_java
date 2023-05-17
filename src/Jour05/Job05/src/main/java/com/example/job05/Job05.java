package com.example.job05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Job05 extends  javafx.application.Application{
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
        SendButton.setOnAction(actionEvent -> {
            System.out.println(inputName.getCharacters());
        });

        root.getChildren().addAll(name, inputName, SendButton);

        stage.setX(50);
        stage.setY(50);
        stage.setScene(scene);
        stage.setTitle("Job 2");
        stage.show();
    }
}
