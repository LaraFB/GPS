package com.example.gps_g11;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try{
        Parent root = FXMLLoader.load(getClass().getResource("SideBar.fxml"));
        Scene scene = new Scene(root, 1200, 700);
        stage.setTitle("Gestor de Despesas");
        stage.setScene(scene);
        stage.show();
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}