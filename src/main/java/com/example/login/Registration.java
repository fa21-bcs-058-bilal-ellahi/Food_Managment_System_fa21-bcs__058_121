package com.example.login;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Registration {

        public static Scene Registration;

        public static Scene Registration() {


                GridPane root = new GridPane();
                //Group root = new Group();

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





                /*Label dob = new Label("Date of Birth");
                TextField dob_text = new TextField();
                DatePicker datePicker = new DatePicker();
                Label gender = new Label("Gender");
                ToggleGroup gender_grp = new ToggleGroup();
                RadioButton male = new RadioButton("male");
                male.setToggleGroup(gender_grp);
                RadioButton female = new RadioButton("female");
                female.setToggleGroup(gender_grp);
                Label interests = new Label("Your Interests: ");
                CheckBox checkBox0 = new CheckBox("Java");
                checkBox0.setIndeterminate(false);
                CheckBox checkBox1 = new CheckBox("Python");
                checkBox1.setIndeterminate(false);
                Label educated = new Label("Your Education");
                ListView listView = new ListView<>();
                ObservableList data = FXCollections.observableArrayList();
                data.addAll("Intemediate", "Bachelors", "Masters", "PHD");
                listView.setItems(data);
                listView.setPrefSize(100, 10);
                Label location = new Label("Location");
                ChoiceBox loction_box = new ChoiceBox();
                loction_box.getItems().addAll("Lahore", "Abbottabad", "Islamabad");*/


                Button register = new Button("Register");
                Text welcometext = new Text(1, 1, "Sign up your Account");
                welcometext.setFont(Font.font(22));
                welcometext.setFill(Color.WHITE);
                root.add(welcometext, 0, 0, 2, 1);
                root.add(name_label, 0, 1);
                root.add(name_text, 0, 2,2, 1);
                root.add(pass_label, 0, 3);
                root.add(pass_text, 0, 4,2, 1);
                root.add(admin_pass_label, 0, 5);
                root.add(pass_text_admin,0,6,2, 1);
                root.add(register, 1, 8);
                root.add(check,0,7,2,1);
                root.add(backbtn,0,8);
                root.setStyle("-fx-background-image: url(login.jpg); -fx-background-repeat: no-repeat; -fx-background-size: 1350 650;   -fx-background-position: center center;");

                pass_label.setStyle("-fx-text-fill:white; -fx-font-size:12");//
                name_label.setStyle("-fx-text-fill:white; -fx-font-size:12");//
                admin_pass_label.setStyle("-fx-text-fill:white; -fx-font-size:12");//
                register.setStyle("-fx-background-color: rgb(201,251,251);");


/*
                root.add(dob, 0, 2);
                //root.add(dob_text,1,2);
                root.add(datePicker, 1, 2);
                root.add(gender, 0, 4);
                root.add(male, 1, 4);
                root.add(female, 2, 4);
                root.add(interests, 0, 5);
                root.add(checkBox0, 1, 5);
                root.add(checkBox1, 2, 5);
                root.add(educated, 0, 7);
                root.add(listView, 1, 7);
                root.add(location, 0, 9);
                root.add(loction_box, 1, 9);*/
                //  root.add(gender_grp,1,3);
               /* RegStage.setScene(scene);
                RegStage.show();*/
              /*  Tooltip tooltip = new Tooltip("Some text");
                Button button = new Button("Upload"); //can also be hyperlinked
                button.setTooltip(tooltip);
                root.add(button,
                        3,
                        3);*/
                //Button Register = new Button("Register");

                register.setOnAction(actionEvent -> {
                        try {
                                String admin_pass = pass_text_admin.getText();
                                if (admin_pass.equals("1234")) {
                                        FileWriter fileWriter = new FileWriter("registered_users.txt", true);
                                        fileWriter.write(name_text.getText() + "\t" + pass_text.getText() + "\n");
                                        fileWriter.close();
                                        System.out.println("fileWriter works");
                                        Dialog();
                                }
                                else {
                                        String username = name_text.getText();
                                        String password = pass_text.getText();


                                        if (username == null || password == null || username.equals("") || password.equals("")) {
                                                check.setText("Username or Password is empty");
                                                return;
                                        } else {
                                                check.setText("Invalid Admin Password");
                                                System.out.println("fileWriter\\if  works");
                                        }
                                }
                        } catch (IOException e) {
                                throw new RuntimeException(e);
                        }
                });
                return new Scene(root,800, 600);
        }

        public static void Back_to_Main_Page(Button backbtn){
                backbtn.setOnAction(actionEvent -> {
                        Main.stage.setScene(Main.LoginPage());
                });

        }


        static public void Dialog(){

                Stage Message_stage =new Stage();
                DialogPane dialogPane = new DialogPane();
                Scene Message_scene = new Scene(dialogPane,200,50);
                Message_stage.setResizable(false);
                dialogPane.setContentText("Registered Successfully");
                Message_stage.setTitle("Dialog");
                Message_stage.setScene(Message_scene);
                Message_stage.show();

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
}
