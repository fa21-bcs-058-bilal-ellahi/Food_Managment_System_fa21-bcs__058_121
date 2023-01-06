package com.example.login;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Sales_report {
    public static Scene Report_scene;

    public static Scene getSales_Report_Scene(){
        GridPane root = new GridPane();
        Scene Report_scene = new Scene(root,1900,1000);
        Button backbtn = new Button("Back");
        Inventory_class.Back_to_Previous_Page(backbtn);
        root.add(backbtn,1,1);

        return Report_scene;
    }

}


