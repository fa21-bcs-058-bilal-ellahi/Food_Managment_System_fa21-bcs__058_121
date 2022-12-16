package com.example.login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class InsideScene {
    public static Scene Loggedin;

    public static Scene Loggedin(String username) {




        Text welcomeText = new Text("Welcome, " +username+ "!");//+ CommonData.username
        welcomeText.setFont(new Font(40));
        welcomeText.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        welcomeText.setFill(Color.WHITE);




        Button POS_Btn = new Button("Order");
        POS_Btn.setMinWidth(175);
        POS_Btn.setMinHeight(175);
        POSEventHandler(POS_Btn);
        Main.stage.setTitle("Hello User");
        POS_Btn.setStyle("-fx-background-color: rgb(255,182,193);");


        Button Management_button = new Button("Management");
        Management_button.setMinWidth(175);
        Management_button.setMinHeight(175);
        Management_EventHandler(Management_button);
        Management_button.setStyle("-fx-background-color: gold;");

        Button Employee_btn = new Button("Employees");
        Employee_btn.setMinWidth(175);
        Employee_btn.setMinHeight(175);
        Employee_EventHandler(Employee_btn);
        Employee_btn.setStyle("-fx-background-color: silver;");



        Button menu_btn = new Button("Menu");
        menu_btn.setMinWidth(175);
        menu_btn.setMinHeight(175);
        Menu_EventHandler(menu_btn);
        menu_btn.setStyle("-fx-background-color: lightblue;");

        Button report_btn =new Button("Report");
        report_btn.setMinWidth(175);
        report_btn.setMinHeight(175);
        Report_EventHandler(report_btn);
        report_btn.setStyle("-fx-background-color: lightyellow;");

        Button administration_btn= new Button("Administration");
        administration_btn.setMinWidth(175);
        administration_btn.setMinHeight(175);
        Administration_EventHandler(administration_btn);
        administration_btn.setStyle("-fx-background-color: gold;");


        HBox container1 = new HBox(POS_Btn,Management_button,Employee_btn);
        HBox container2 = new HBox(menu_btn,report_btn,administration_btn);
       // VBox container = new VBox(POS_Btn,Management_button,Employee_btn,menu_btn,report_btn,administration_btn);
        container1.setAlignment(Pos.CENTER);
        container1.setMinWidth(200);
        container1.setMinHeight(200);


        container2.setAlignment(Pos.CENTER);
        container2.setMinWidth(200);
        container2.setMinHeight(200);


        Button log_Out = new Button("Log-Out");
        log_Out.setOnAction(actionEvent -> {
            Main.stage.setScene(Main.Main_scene);
        });
        log_Out.setStyle("-fx-background-color: gold;");



        GridPane root = new GridPane();
        root.setPadding(new Insets(50,50,50,50));
        root.add(welcomeText, 2, 0,3,1);
        root.add(log_Out, 5, 0);
        root.add(container1,7,4);
        root.add(container2,7,5);
        container1.setSpacing(20);
        container2.setSpacing(20);

        root.setHgap(20);
        root.setVgap(20);
        root.setStyle("-fx-background-image: url(img_2.png); -fx-background-repeat: no-repeat; -fx-background-size: 1900 1000 ;   -fx-background-position: center center;");

        Main.stage.setX(1);
        Main.stage.setY(1);

        return new Scene(root,1800,1000);
    }


    public static void Management_EventHandler (Button Management){

        Management.setOnAction(pos ->{
            Main.stage.setScene(Management_class.getManagement_scene());
        });
    }

    public static void POSEventHandler (Button POSBtn){

        POSBtn.setOnAction(pos ->{
            Main.stage.setScene(com.example.login.POS.getPOSScene());
        });
    }

    public static void Employee_EventHandler (Button  Employeebtn){

        Employeebtn.setOnAction(pos ->{
            Main.stage.setScene(Employeefx.getEmployee_scene());
        });
    }

    public static void Menu_EventHandler (Button  menu_btn){

        menu_btn.setOnAction(pos ->{
            Main.stage.setScene(Menu.getMenu_Scene());
        });
    }
    public static void Administration_EventHandler (Button  administration_btn){

        administration_btn.setOnAction(pos ->{
            Main.stage.setScene(Administration.getAdministration_Scene());
        });
    }
    public static void Report_EventHandler (Button  report_btn){

        report_btn.setOnAction(pos ->{
            Main.stage.setScene(Report.getReport_Scene());
        });
    }



    public void start(Stage stage) throws Exception {
        POS.POS = POS.getPOSScene();
        Main.stage = stage;
        stage.setScene(POS.getPOSScene());
        stage.show();

    }
}
