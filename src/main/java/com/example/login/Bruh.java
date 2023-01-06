package com.example.login;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
public class Bruh {

    public static Scene scene;
    public static Scene Bruh_try() {
        //Group group = new Group();
        AnchorPane anchorPane = new AnchorPane();

        Scene scene = new Scene(anchorPane, 1200, 900);
        Button button = new Button("what");
        //anchorPane.getChildren().add(0,button);

        ListView list = new ListView<>();

        anchorPane.setTopAnchor(list,2.0);
        AnchorPane.setLeftAnchor(list, 10.0);
        AnchorPane.setRightAnchor(list, 65.0);
        // Button will float on right edge

        AnchorPane.setTopAnchor(button, 10.0);
        AnchorPane.setRightAnchor(button, 10.0);
        anchorPane.getChildren().addAll(list, button);
      /*  button.setLayoutX(50);
        button.setLayoutY(50);*/

        return scene;
    }
}
