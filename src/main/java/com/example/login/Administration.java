package com.example.login;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Administration {
    public static Scene Administration_scene;

    public static Scene getAdministration_Scene(){
        BorderPane root = new BorderPane();
        Scene Administration_scene = new Scene(root,1900,1000);

        Button admin_access_code_btn = new Button("Enter Admin Access code");
        TextField textField = new TextField();
        TextArea textArea = new TextArea();
        admin_access_code_btn_table(textField,admin_access_code_btn,textArea);






        Button backbtn = new Button("Back");
        Inventory_class.Back_to_Previous_Page(backbtn);
        VBox leftv= new VBox(backbtn,admin_access_code_btn,textField,textArea);
        root.setLeft(leftv);

        return Administration_scene;
    }


    public static void admin_access_code_btn_table(TextField textField,Button admin_access_code_btn_table ,TextArea textArea) {

        admin_access_code_btn_table.setOnAction(e -> {

            String access = textField.getText();
            System.out.println(access);


            if (access.equals("1234")) {
                System.out.println("im in");

                try {
                    FileReader fileReader = new FileReader("registered_users.txt");
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String lineReader;
                    while ((lineReader = bufferedReader.readLine()) != null) {
                        System.out.println(lineReader);
                        textArea.setText(lineReader);

                        //Main.stage.setScene(Bruh.Bruh_try());
                    }
                    fileReader.close();
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
    }

}


