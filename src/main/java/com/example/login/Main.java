package com.example.login;

import com.example.login.Firebase.FirebaseInitialize;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class Main extends Application {

    public static Stage stage;
    public static Scene Main_scene;



    @Override
    public void start(Stage stage) throws IOException {
        FirebaseInitialize fr =new FirebaseInitialize();
        fr.Initialize();

        Main.stage = stage;
        stage.setTitle("Login Page");
        Main_scene = LoginPage();
        stage.setScene(LoginPage());
        stage.show();
    }

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
        pass_text.setText("qweqweqwe");
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
        check.setStyle("-fx-text-fill:white; -fx-font-size: 14px;");


        /*stage.setX(550);
        stage.setY(250);*/

        addEventHandler(log_btn,login_text,pass_text,check);
        addEventHandler(signup_btn);
        return scene;
    }
     static String username;
    static String password;
    static String x;
    public static  boolean login = false;
    ;
    public static void addEventHandler(Button log_btn,TextField login_text, PasswordField pass_text  ,Text check) {

        try {
            run();
        } catch (Exception e) {

        }

        log_btn.setOnAction(actionEvent ->{

                boolean matched_for_Manager = false;

                boolean matched_for_Cashier = false;
                String lineReader;
                 username = login_text.getText();
                 password = pass_text.getText();


            //FirebaseInitialize.accessUSer(username,password);
           /* try {
                FirebaseInitialize.accessUSer(username,password);
                //InsideScene.Loggedin(username,password);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
*/
/*
                 if (login==true){

                InsideScene.Loggedin(username, password);

            }
*/


                if (username == null || password == null || username.equals("") || password.equals("")) {
                    check.setText("Username or Password is empty");

                    return;
                }

            try {

                FileReader fileReader = new FileReader("/Users/muhammad/Desktop/Final_Project/Login/registered_users.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while ((lineReader = bufferedReader.readLine()) != null) {

                    if ( lineReader.equals(username+"\t"+ password+"\t"+"Manager")){

                        System.out.println("inside reader Manager");
                        matched_for_Manager = true;
                        break;
                    }
                    else if ( lineReader.equals(username+"\t"+ password+"\t"+"Cashier")){

                        System.out.println("inside reader Cashier");
                        matched_for_Cashier = true;
                        break;
                    }
                }
            fileReader.close();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (matched_for_Manager) {

                InsideScene.Loggedin = InsideScene.Loggedin(username,Registration.manager);
                stage.setScene(InsideScene.Loggedin);
                System.out.println("match_manager");
                 x = Registration.manager;

            }
           else if (matched_for_Cashier) {
                InsideScene.Loggedin = InsideScene.Loggedin(username,Registration.cashier);
                stage.setScene(InsideScene.Loggedin);
                System.out.println("match_cashier");
                x = Registration.cashier;

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

    public static void run() throws Exception{
       /* FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.getApplicationDefault())
                .setDatabaseUrl("https://console.firebase.google.com/project/final-project-5c1a5/firestore/data/~2F?view=panel-view")
                .build();

       // firebase-adminsdk-j3jyt@final-project-5c1a5.iam.gserviceaccount.com
       // FirebaseOptions.builder().setDatabaseUrl("https://console.firebase.google.com/project/final-project-5c1a5/firestore/data/~2Flogincredentials~2F1LSMXzVmMj3aX2hP4DAL");
        FirebaseApp.initializeApp(options);

        FileInputStream serviceAccount =
                new FileInputStream("/Users/muhammad/Desktop/Final_Project/Login/final-project-5c1a5-firebase-adminsdk-j3jyt-4e38c0a353.json");

        FirebaseOptions Firebase_options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

        FirebaseApp.initializeApp(Firebase_options);*/
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