package com.example.login;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import static com.example.login.Management_class.Back_to_Previous_Page;

public class POS {

    public static Scene POS;

    public static Scene getPOSScene(){
        GridPane root = new GridPane();
        Scene POS = new Scene(root,600,500);
        /*Registration registration = new Registration();
        */

        Button backbtn = new Button("Back");
        com.example.login.Management_class.Back_to_Previous_Page(backbtn);
        root.add(backbtn,1,1);

        return POS;
    }

    public static void main(String[] args) {
        getPOSScene();
    }
}

