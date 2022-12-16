package com.example.login;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Report {
    public static Scene Report_scene;

    public static Scene getReport_Scene(){
        GridPane root = new GridPane();
        Scene Report_scene = new Scene(root,1900,1000);
        Button backbtn = new Button("Back");
        com.example.login.Management_class.Back_to_Previous_Page(backbtn);
        root.add(backbtn,1,1);

        return Report_scene;
    }

}


