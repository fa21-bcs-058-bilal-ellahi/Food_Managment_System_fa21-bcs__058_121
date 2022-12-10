package com.example.login;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

public class POS {

    public static Scene POS;

    public static Scene getPOSScene(){
        GridPane root = new GridPane();
        Scene POS = new Scene(root);
        /*Registration registration = new Registration();
        */




        return POS;
    }

    public static void main(String[] args) {
        getPOSScene();
    }
}

