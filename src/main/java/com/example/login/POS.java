package com.example.login;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;

public class POS {



    public static Scene POS;

    public static Scene getPOSScene(){
        GridPane root = new GridPane();
        Scene POS = new Scene(root);
        /*Registration registration = new Registration();
        */




        return POS;
    }

    public static void main(String[] args) {
        getPOSScene();
    }
}
    // public static Scene POSt;

 /*   public static Parent psVi() {
        GridPane root = new GridPane();
        root.add(new Label("abc"),0,0);
        Scene POS = new Scene(root, 450, 600);


        return root;

    }
}*/