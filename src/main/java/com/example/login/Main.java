package com.example.login;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.*;

public class Main extends Application {

    public static Stage stage;
   // static  GridPane root = new GridPane();
    public static Scene Main_scene;

    @Override
    public void start(Stage stage) throws IOException {
        Main.stage = stage;
        stage.setTitle("Login Page");
        Main_scene = LoginPage();
        stage.setScene(LoginPage());
        stage.show();

        // stage.setResizable(false);
        // stage.setScene();
      //  InsideScene.Loggedin = InsideScene.Loggedin("");
    }

      /*  try {
            Stage test =new Stage();
            test.setScene(Loading_Scene.getLoad_scene_scene());
            test.addEventHandler(WindowEvent.WINDOW_SHOWN, windowEvent -> {
                // Thread.sleep(2000);
                test.close();
            });
            test.showAndWait();
            Thread.sleep(2000);
            System.out.println("dbsb3272");
            test.close();
            stage.setScene(Main_scene);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/



    public static Scene LoginPage() {

        GridPane root = new GridPane();
        Scene scene = new Scene(root, 800, 600); //(root,width,column)
        root.setAlignment(Pos.CENTER);
        root.setHgap(85);
        root.setVgap(25);
        //root.setPadding(new Insets(10));
        root.setStyle("-fx-background-image: url(login.jpg); -fx-background-repeat: no-repeat; -fx-background-size: 1200 600;   -fx-background-position: center center;");


        Text welcometext = new Text(1, 1, "Login to your Account");
        welcometext.setFont(Font.font(22));
        root.add(welcometext, 0, 0, 2, 1);
        welcometext.setStyle("-fx-text-fill: white; font-size: 46px");

        welcometext.setFill(Color.WHITE);

        VBox p = new VBox(welcometext);
        root.add(p,0, 0, 2, 1);

        Label label_user = new Label("User Name: ");
        root.add(label_user, 0, 1);
        label_user.setStyle("-fx-text-fill:white; -fx-font-size:12");//

        TextField login_text = new TextField("qwe");
        login_text.setPromptText("username ");
        root.add(login_text, 0, 2, 2, 1);

        Label pass_label = new Label("Password");
        root.add(pass_label, 0, 3);
        pass_label.setStyle("-fx-text-fill:white; -fx-font-size:12");//


        PasswordField pass_text = new PasswordField();
        pass_text.setText("qwe");
        pass_text.setPromptText("Password ");
        root.add(pass_text, 0, 4, 2, 1); //column , row


        Button log_btn = new Button("Login");
        root.add(log_btn, 1, 6);
        log_btn.setStyle("-fx-background-color: rgb(201,251,251);");


        Button signup_btn = new Button("Sign up");
        root.add(signup_btn, 0, 6);
        signup_btn.setStyle("-fx-background-color: orange;");


        // signup_btn.setStyle("-fx-background-color: gold;");
        Text check = new Text();
        root.add(check,0,5,2,1);

        /*stage.setX(550);
        stage.setY(250);*/



        // check.setStyle("-fx-background-color: rgba(192, 192, 192, 0.5);");

        addEventHandler(log_btn,login_text,pass_text,check);
        addEventHandler(signup_btn);
        return scene;
    }

    public static void addEventHandler(Button log_btn,TextField login_text, PasswordField pass_text  ,Text check) {

        log_btn.setOnAction(actionEvent ->{

                boolean matched = false;
                String lineReader;
                String username = login_text.getText();
                String password = pass_text.getText();


                if (username == null || password == null || username.equals("") || password.equals("")) {
                    check.setText("Username or Password is empty");

                    return;
                }

            try {

                FileReader fileReader = new FileReader("registered_users.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while ((lineReader = bufferedReader.readLine()) != null) {
                    if ( lineReader.equals(username+"\t"+ password)){

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
                InsideScene.Loggedin = InsideScene.Loggedin(username);

                stage.setScene(InsideScene.Loggedin);
                System.out.println("match");
            }
            else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Login Error");
                alert.setHeaderText("Login Error");
                alert.setContentText("Your username or password is incorrect");
                alert.showAndWait();

                check.setText("Username or Password is Incorrect");
                check.setStyle("-fx-text-fill:white; -fx-font-size: 14px;");
                login_text.setStyle("-fx-text-inner-color: red;");
                pass_text.setStyle("-fx-text-inner-color: red;");


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