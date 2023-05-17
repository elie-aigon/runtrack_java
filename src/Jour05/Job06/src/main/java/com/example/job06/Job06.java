package com.example.job06;

import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Job06 extends javafx.application.Application{
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) {
        ComboBox<Integer> combo1 = new ComboBox<>();
        ComboBox<String> combo2 = new ComboBox<>();
        Button selectButton = new Button("Select");
        selectButton.setOnAction(actionEvent -> {
            System.out.println("Je vais vous prendre " + combo1.getValue() + " " +  combo2.getValue());
        });

        combo1.setItems(FXCollections.observableArrayList(1,2, 3, 4, 5));
        combo2.setItems(FXCollections.observableArrayList("pomme", "poire", "fraise"));

        VBox vbox = new VBox(combo1, combo2, selectButton);
        Scene scene = new Scene(vbox, 300, 400);

        stage.setScene(scene);
        stage.setTitle("Job 6");
        stage.show();
    }
}
