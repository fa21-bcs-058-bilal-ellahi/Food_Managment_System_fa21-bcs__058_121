package com.example.login;

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
        System.out.println("DBSB3272");




        Button log_Out = new Button("Log-Out");
        log_Out.setOnAction(actionEvent -> {
            Main.stage.setScene(Main.Main_scene);
        });

        GridPane gridPane = new GridPane();
        gridPane.add(welcomeText, 0, 0);
        gridPane.add(log_Out, 0, 1);
        gridPane.add(POSBtn,0,2);

        return new Scene(gridPane, 750, 500);
    }

    public static void POSEventHandler (Button POSBtn){

        POSBtn.setOnAction(pos ->{
            System.out.println("DBSB3272ffff");
          Main.stage.setScene(com.example.login.POS.getPOSScene());
        });
    }

    public void start(Stage stage) throws Exception {
        POS.POS = POS.getPOSScene();
        Main.stage = stage;
        stage.setScene(POS.getPOSScene());
        stage.show();

        Loggedin();



    }
}
