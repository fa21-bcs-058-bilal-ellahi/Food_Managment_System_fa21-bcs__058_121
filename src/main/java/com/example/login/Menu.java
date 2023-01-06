package com.example.login;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class Menu {
    public static Scene Menu_scene;

    public static Scene getMenu_Scene(){
        GridPane root = new GridPane();
        Scene Menu_scene = new Scene(root,1900,1000);
        Button backbtn = new Button("Back");
        Inventory_class.Back_to_Previous_Page(backbtn);
        root.add(backbtn,1,1);

        return Menu_scene;
    }
}

