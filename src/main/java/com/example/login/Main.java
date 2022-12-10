package com.example.login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main extends Application {

    public static Stage stage;
    static  GridPane root = new GridPane();
    public static Scene Main_scene;

    @Override
    public void start(Stage stage) throws IOException {
      Scene scene = new Scene(root);
        stage.setTitle("Login Page");
        Main_scene = LoginPage();
        InsideScene.Loggedin = InsideScene.Loggedin();
        Main.stage = stage;
        stage.setScene(Main_scene);
        stage.show();
    }

    public static Scene LoginPage() {
        GridPane root = new GridPane();
        Scene scene = new Scene(root, 600, 500);
        root.setAlignment(Pos.CENTER);
        root.setHgap(20);
        root.setVgap(20);
        root.setPadding(new Insets(20));
        Text welcometext = new Text(1, 1, "Login to your Account");
        welcometext.setFont(Font.font(22));
        root.add(welcometext, 0, 0, 2, 1);
        Label label_user = new Label("User Name: ");
        root.add(label_user, 0, 1);
        TextField login_text = new TextField();
        login_text.setPromptText("username: ");
        root.add(login_text, 1, 1);
        Label pass_label = new Label("Password");
        root.add(pass_label, 0, 2);
        PasswordField pass_text = new PasswordField();
        pass_text.setPromptText("Password: ");
        root.add(pass_text, 1, 2);
        Button log_btn = new Button("Login");
        root.add(log_btn, 1, 3);
        Button signup_btn = new Button("Sign up");
        root.add(signup_btn, 0, 3);
        Text check = new Text();
        root.add(check,1,4);
        addEventHandler(log_btn,login_text,pass_text,check);
        addEventHandler(signup_btn);
        return scene;
    }

    public static void addEventHandler(Button log_btn,TextField login_text, PasswordField pass_text  ,Text check) {

        log_btn.setOnAction(actionEvent ->{

                boolean matched = false;
                String lineReader;
                String username = login_text.getText().toString();
                String password = pass_text.getText().toString();






                if (username == null || password == null || username.equals("") || password.equals("")) {
                    check.setText("Username or Password is empty");
                    return;
                }
            //oooooooString [] file={};
            try {

                FileReader fileReader = new FileReader("registered_users.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while ((lineReader = bufferedReader.readLine()) != null) {

                    //file = lineReader.split("\r");
                    //lineReader.equals(username+"\t"+ password+"\n")
                    //file[0].equals(username) && file[1].equals(password)

                    if ( lineReader.equals(username+"\t"+ password+"\n")) ;
                    {

                        System.out.println("inside reader");
                        matched = true;
                        break;

                    }

                }

            fileReader.close();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }

            if (matched) {
                stage.setScene(InsideScene.Loggedin);
                System.out.println("match");
            }

        });

    }
    public static void addEventHandler(Button signup_btn) {

        signup_btn.setOnAction(actionEvent ->{

                stage.setScene(Registration.Registration());
        });

    }

    public static void main(String[] args) {
        launch();
    }
}