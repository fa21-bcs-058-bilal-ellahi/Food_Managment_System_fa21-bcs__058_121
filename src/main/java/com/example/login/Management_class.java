package com.example.login;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

public class Management_class {

    public static Scene Mscene;

    public static Scene getManagement_scene(){
        GridPane root = new GridPane();
        Scene Managment_scene = new Scene(root,600,500);

        Button backbtn = new Button("Back");
        Back_to_Previous_Page(backbtn);
        root.add(backbtn,1,1);



        return Managment_scene;
    }

    public static void Back_to_Previous_Page(Button backbtn){ //NW
        backbtn.setOnAction(actionEvent -> {
            Main.stage.setScene(InsideScene.Loggedin);
        });

    }

    public static void main(String[] args) {
        Main.Main_scene = Mscene;
        getManagement_scene();
       

    }
}
