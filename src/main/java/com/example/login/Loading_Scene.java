package com.example.login;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class Loading_Scene {
    public static Scene Load_scene;

    public static Scene getLoad_scene_scene(){
        Pane root = new Pane();
     //   Scene Loading_scene = new Scene(root,600,500);

        root.setStyle("-fx-background-image: url(LoadScreen.gif); -fx-background-repeat: no-repeat; -fx-background-size: 600 500;   -fx-background-position: center center;");

     //   root.setBackground(Background.fill(Color.RED));

      /*  BorderPane borderPane = new BorderPane();
        borderPane.setCenter(new TextArea());*/

        Button startbtn = new Button("Start Software");
        root.getChildren().add(startbtn);
        startbtn.setLayoutX(250);
        startbtn.setLayoutY(330);
        addEventHandler(startbtn);

        System.out.println("load works");
        return new Scene(root, 600, 500);
    }

    public static void addEventHandler(Button signup_btn) {

        signup_btn.setOnAction(actionEvent ->{

            // Main.stage.setScene(Main.LoginPage());
        });

    }

/*    public static void main(String[] args) {

        Main.Main_scene = Load_scene;
        getLoad_scene_scene();
    }*/
}


