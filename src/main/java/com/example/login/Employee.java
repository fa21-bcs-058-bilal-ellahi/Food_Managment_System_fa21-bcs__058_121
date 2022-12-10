package com.example.login;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;


public class Employee {
    public static Scene Employee_scene;
    public static Scene getEmployee_scene(){
        GridPane root = new GridPane();
        Scene Employee_Scene = new Scene(root,600,500);

        //commiting?
        Button backbtn = new Button("Back");
        com.example.login.Management_class.Back_to_Previous_Page(backbtn);
        root.add(backbtn,1,1);

        return Employee_Scene;

    }


    public static void main(String[] args) {


        Main.Main_scene= Employee_scene;
        getEmployee_scene();


    }
}




   /* String name, id;
    int cnic,phone_number;


    public int getCnic() {
        return cnic;
    }

    public void setCnic(int cnic) {
        this.cnic = cnic;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    //constructor
    public Employee(String name, String id,int cnic,int phone_number) {
        this.name = name;
        this.id = id;
        this.cnic = cnic;
        this.phone_number = phone_number;

    }

    public Employee(Employee copy) {
        this.name = copy.getName();
        this.id = copy.getId();
        this.phone_number =copy.getPhone_number();
        this.cnic = copy.getCnic();

    }

    //set
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }



    //get
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }



    //toString
    public String toString() {

        return
                "________________________" +
                "\nName: " + name +
                "\nId: " + id +
                "\nPhone: " + phone_number +    "\nCnic: "+ cnic +
                        "\n________________________ ";
    }


    }
*/
