package com.example.login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class InsideScene {
//    public static Stage INSIDEstage;




    public static Scene Loggedin;

    public static Scene Loggedin() {
        Text welcomeText = new Text("Welcome, "  + "!");//+ CommonData.username
        welcomeText.setFont(new Font(40));

        Button POSBtn = new Button("POS");
        POSEventHandler(POSBtn);

        Button Management_button = new Button("Management");
       Management_EventHandler(Management_button);

       Button Employeebtn = new Button("Employees");
       Employee_EventHandler(Employeebtn);


        Button log_Out = new Button("Log-Out");
        log_Out.setOnAction(actionEvent -> {
            Main.stage.setScene(Main.Main_scene);
        });

        //Group group_root = new Group();
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(50,50,50,50));
        gridPane.add(welcomeText, 2, 0,3,1);
        gridPane.add(log_Out, 5, 0);
        gridPane.add(POSBtn,1,3);
        gridPane.add(Management_button,2,3);
        gridPane.add(Employeebtn,1,4);


        return new Scene(gridPane,600,500);
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
            Main.stage.setScene(Employee.getEmployee_scene());
        });
    }



    public void start(Stage stage) throws Exception {
        POS.POS = POS.getPOSScene();
        //Employee.Employee_scene = Employee.getEmployee_scene();
        Main.stage = stage;
        stage.setScene(POS.getPOSScene());
        stage.show();

        Loggedin();
    }
}
