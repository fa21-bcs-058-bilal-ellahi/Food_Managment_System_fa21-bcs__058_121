package com.example.login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class InsideScene {
    public static Scene Loggedin;

    public static Scene Loggedin(String username, String emp_type) {

        Text welcomeText = new Text("Welcome, " +username+ "!" +"\n You are "+emp_type);//+ CommonData.username
        welcomeText.setFont(new Font(40));
        welcomeText.setStyle("-fx-background-color: black; -fx-text-fill: white;");
        welcomeText.setFill(Color.WHITE);


        Button POS_Btn = new Button("POS");
        POS_Btn.setMinWidth(175);
        POS_Btn.setMinHeight(175);
        POSEventHandler(POS_Btn);
        Main.stage.setTitle("Hello User");
        POS_Btn.setStyle("-fx-background-color: rgb(255,182,193);");

        Button Inventory_button = new Button("Inventory");
        Inventory_button.setMinWidth(175);
        Inventory_button.setMinHeight(175);
        Inventory_EventHandler(Inventory_button);
        Inventory_button.setStyle("-fx-background-color: gold;");

        Button Personal_Information_btn = new Button("Personal Information");
        Personal_Information_btn.setWrapText(true);
        Personal_Information_btn.setMinWidth(175);
        Personal_Information_btn.setMinHeight(175);
        Personal_Information_EventHandler(Personal_Information_btn);
        Personal_Information_btn.setStyle("-fx-background-color: silver;");



        Button menu_btn = new Button("Menu X");
        menu_btn.setMinWidth(175);
        menu_btn.setMinHeight(175);
        Menu_EventHandler(menu_btn);
        menu_btn.setStyle("-fx-background-color: lightblue;");

        Button Sales_report_btn =new Button("Sales Report");
        Sales_report_btn.setMinWidth(175);
        Sales_report_btn.setMinHeight(175);
        Sales_report_EventHandler(Sales_report_btn);
        Sales_report_btn.setStyle("-fx-background-color: lightyellow;");

        Button administration_btn= new Button("Administration");
        administration_btn.setMinWidth(175);
        administration_btn.setMinHeight(175);
        Administration_EventHandler(administration_btn);
        administration_btn.setStyle("-fx-background-color: gold;");


        HBox container1 = new HBox(POS_Btn,Inventory_button,Personal_Information_btn);
        HBox container2 = new HBox(menu_btn,Sales_report_btn,administration_btn);
       // VBox container = new VBox(POS_Btn,Inventory_button,Personal_Information_btn,menu_btn,Sales_report_btn,administration_btn);
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
        //root.setStyle("-fx-background-image: url(center_bg.jpeg);-fx-background-repeat: no-repeat;-fx-background-size: 1900 600;");
        root.setStyle("-fx-background-image: url(img_2.png); -fx-background-repeat: no-repeat; -fx-background-size: 1900 1000 ;   -fx-background-position: center center;");

        Main.stage.setX(20);
        Main.stage.setY(50);

        return new Scene(root,1600,900);
    }


    public static void Inventory_EventHandler(Button Inventory_button){

        Inventory_button.setOnAction(pos ->{
            Main.stage.setScene(Inventory_class.getInventory_scene());
        });
    }

    public static void POSEventHandler (Button POSBtn){

        POSBtn.setOnAction(pos ->{
            POS_2.table.refresh();
            Main.stage.setScene(com.example.login.POS_2.getPOSScene2());
        });
    }

    public static void Personal_Information_EventHandler(Button  Personal_Information_btn){

        Personal_Information_btn.setOnAction(pos ->{
            Main.stage.setScene(Employee_personal_data.User_Personal_data());
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
    public static void Sales_report_EventHandler(Button  Sales_report_btn){

        Sales_report_btn.setOnAction(pos ->{
            Main.stage.setScene(Sales_report.getSales_Report_Scene());
        });
    }



    public void start(Stage stage) throws Exception {
        POS.POS = POS.getPOSScene();
        Main.stage = stage;
        stage.setScene(POS.getPOSScene());
        stage.show();

    }
}
