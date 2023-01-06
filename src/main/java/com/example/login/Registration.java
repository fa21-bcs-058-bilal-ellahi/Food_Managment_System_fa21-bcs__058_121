package com.example.login;

import com.example.login.Firebase.FirebaseInitialize;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.*;

public class Registration {

        public static Scene Registration;



        static RadioButton manager_radio = new RadioButton("Manager");
        static RadioButton cashier_radio = new RadioButton("Cashier");
        static String manager = manager_radio.getText();
        static String cashier = cashier_radio.getText();

        public static Scene Registration() {


                GridPane root = new GridPane();

                root.setAlignment(Pos.CENTER);
                root.setHgap(20);
                root.setVgap(20);
                root.setPadding(new Insets(20));


                Label name_label = new Label("Username");
                TextField name_text = new TextField();

                Label pass_label = new Label("Password");
                TextField pass_text = new TextField();

                Label admin_pass_label = new Label("Admin Access Password");
                PasswordField pass_text_admin = new PasswordField();

                Text check = new Text();

                Button backbtn = new Button("Back");
                Back_to_Main_Page(backbtn);
                backbtn.setStyle("-fx-background-color: orange;");

                Main.stage.setTitle("Sign Up!");


                Button register = new Button("Register");
                Text welcometext = new Text(1, 1, "Sign up your Account");
                welcometext.setFont(Font.font(22));
                welcometext.setFill(Color.WHITE);
                root.setStyle("-fx-background-image: url(login.jpg); -fx-background-repeat: no-repeat; -fx-background-size: 1500 800;   -fx-background-position: center center;");

                pass_label.setStyle("-fx-text-fill:white; -fx-font-size:12");
                name_label.setStyle("-fx-text-fill:white; -fx-font-size:12");
                admin_pass_label.setStyle("-fx-text-fill:white; -fx-font-size:12");
                register.setStyle("-fx-background-color: rgb(201,251,251);");


                Label Admin_or_Employee = new Label("Employee Type");
                ToggleGroup Admin_or_Employee_grp = new ToggleGroup();

                manager_radio.setToggleGroup(Admin_or_Employee_grp);
                cashier_radio.setToggleGroup(Admin_or_Employee_grp);

                Admin_or_Employee.setStyle("-fx-text-fill:white; -fx-font-size:12");
                manager_radio.setStyle("-fx-text-fill:white; -fx-font-size:12");
                cashier_radio.setStyle("-fx-text-fill:white; -fx-font-size:12");



                root.add(welcometext, 0, 0, 2, 1);
                root.add(name_label, 0, 1);
                root.add(name_text, 0, 2,2, 1);
                root.add(pass_label, 0, 3);
                root.add(pass_text, 0, 4,2, 1);
                root.add(Admin_or_Employee,0,5);
                root.add(manager_radio,0,6);
                root.add(cashier_radio,1,6);
                root.add(admin_pass_label, 0, 7);
                root.add(pass_text_admin,0,8,2, 1);
                root.add(check,0,9,2,1);
                root.add(backbtn,0,10);
                root.add(register, 1, 10);

                add_Register_EventHandler(register,manager_radio,cashier_radio,pass_text_admin,name_text,pass_text,check);

                return new Scene(root,900, 700);
        }





        public static void add_Register_EventHandler(Button register,RadioButton manager_radio, RadioButton cashier_radio,
                                                     TextField pass_text_admin ,TextField name_text,TextField pass_text, Text check) {
                register.setOnAction(actionEvent -> {
                        try {
                                manager = manager_radio.getText();
                                cashier = cashier_radio.getText();
                                check.setFill(Color.WHITE);

                                /*System.out.println(manager);
                                System.out.println(cashier);*/

                                String username = name_text.getText();
                                String password  = pass_text.getText();






                                String admin_pass = pass_text_admin.getText();

                                if (admin_pass.equals("1234")){

                                        try {
                                                BufferedReader reader = new BufferedReader(new FileReader("registered_users.txt"));
                                                {
                                                        String line;
                                                        while ((line = reader.readLine()) != null) {
                                                                // Split the line into fields
                                                                String[] fields = line.split("\t");
                                                                // Check if the first field matches the user-entered username
                                                                if (fields[0].equals(name_text.getText())) {
                                                                        check.setText("Username already exists");
                                                                        check.setFill(Color.WHITE);
                                                                        name_text.setStyle("-fx-text-inner-color: red;");
                                                                        System.out.println("Username already exists");
                                                                        System.out.println(fields[0]);

                                                                        reader.close();
                                                                }}}} catch (FileNotFoundException e) {
                                                throw new RuntimeException();
                                        }

                                }

                                 if (admin_pass.equals("1234") && cashier_radio.isSelected()) {
                                         if (pass_text.getText().length() > 6) {
                                                 FileWriter fileWriter = new FileWriter("registered_users.txt", true);
                                                 fileWriter.write(name_text.getText() + "\t" + pass_text.getText() +
                                                         "\t" + cashier_radio.getText() + "\n");
                                                 fileWriter.close();


                                                 System.out.println("fileWriter cashier works");
                                                 Dialog(cashier_radio.getText());
                                         }
                                 else {
                                                 System.out.println("m");
                                                 check.setText("Password must be > 6");
                                                 pass_text.setStyle("-fx-text-inner-color: red;");

                                         }
                                 }

                                 if (admin_pass.equals("1234") && manager_radio.isSelected()) {
                                        if (pass_text.getText().length() > 6) {
                                                FileWriter fileWriter = new FileWriter("registered_users.txt", true);
                                                fileWriter.write(name_text.getText() + "\t" + pass_text.getText()
                                                        + "\t" + manager_radio.getText() + "\n");
                                                fileWriter.close();


                                                System.out.println("fileWriter manager works");
                                                Dialog(manager_radio.getText());
                                        }
                                        else {
                                                System.out.println("m");
                                                check.setText("Password must be > 6");
                                                pass_text.setStyle("-fx-text-inner-color: red;");

                                        }
                                }

                                else {


                                        if (username == null || password == null || username.equals("") || password.equals("")) {
                                                check.setText("Username or Password is empty");
                                                return;
                                        }
                                        else {
                                                check.setText("Invalid Admin Password or Option is Empty");
                                                System.out.println("fileWriter\\if  works");
                                        }

                                }

                                FirebaseInitialize.makeUser(username,password,manager,cashier);

                        } catch (IOException e) {
                                throw new RuntimeException();

                        }



                });

        }

                public static void Back_to_Main_Page(Button backbtn){
                backbtn.setOnAction(actionEvent -> {
                        Main.stage.setScene(Main.LoginPage());
                });

        }


        static public void Dialog(String s){

                Stage Message_stage =new Stage();
                DialogPane dialogPane = new DialogPane();
                Scene Message_scene = new Scene(dialogPane,220,70);
                Message_stage.setResizable(false);
                dialogPane.setContentText(s +"  Registered Successfully");
                Message_stage.setTitle("Dialog");
                Message_stage.setScene(Message_scene);
                Message_stage.show();
                dialogPane.setMinWidth(220);
                dialogPane.setMinHeight(70);

                EventHandler<WindowEvent> windowEvent= windowEvent1 -> Main.stage.setScene(Main.Main_scene);
                Message_stage.addEventHandler(WindowEvent.WINDOW_CLOSE_REQUEST,windowEvent);
               /* EventHandler<WindowEvent> windowEvent=new EventHandler<WindowEvent>() {
                        @Override
                        public void handle(WindowEvent windowEvent) {
                                Main.stage.setScene(Main.Main_scene);
                        }
                };
                Message_stage.addEventHandler(WindowEvent.ANY,windowEvent);
*/
        }

     /*   public static void main(String[] args) {
        Registration();
        }*/

        public static void makeUser(String username,String password
         ,String manager,String cashier){


        }
}
