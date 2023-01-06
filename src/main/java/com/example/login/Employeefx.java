package com.example.login;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;


public class Employeefx {
    public static Scene Employee_scene;
    public static Scene getEmployee_scene(){
        

        GridPane root= new GridPane();
        Scene Employee_Scene = new Scene(root,1900,1000);
        Button backbtn = new Button("Back");
        Inventory_class.Back_to_Previous_Page(backbtn);
        root.getChildren().add(backbtn);
        backbtn.setLayoutX(20);
        backbtn.setLayoutY(20);


      /*  TableView table = new TableView<Employee>();
        TableColumn Employee = new TableColumn<Employee,String>();


        TableColumn delieveryboy_column = new TableColumn<Employee,String>("Delievery Boy");

        delieveryboy_column.setCellValueFactory(new PropertyValueFactory<Delivery_Boy,String>("name"));
        delieveryboy_column.setCellValueFactory(new PropertyValueFactory<Delivery_Boy,String>("id"));
        delieveryboy_column.setCellValueFactory(new PropertyValueFactory<Delivery_Boy,String>("cnic"));
        delieveryboy_column.setCellValueFactory(new PropertyValueFactory<Delivery_Boy,String>("phone_number"));

        TableColumn Waiiter_column = new TableColumn<Employee,String>("Waiter");
        Waiiter_column.setCellValueFactory(new PropertyValueFactory<Waiter,String>("name"));

        table.getColumns().addAll(delieveryboy_column,Waiiter_column);

        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        table.getItems().addAll(new Delivery_Boy("boy","007",3502,12));
        table.getItems().addAll(new Waiter("gir","008",3501,11));
        root.setCenter(table);*/


        return Employee_Scene;

    }

}




