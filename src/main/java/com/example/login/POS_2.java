package com.example.login;

import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class POS_2 {

    public static     TableView<TableData_class> table = new TableView<TableData_class>();


    public static double d2;

    public static double d1;

    public static Scene getPOSScene2() {

        BorderPane root = new BorderPane();
        Scene POS_a = new Scene(root, 1400, 900);
        Button backbtn = new Button("Back");
        com.example.login.Management_class.Back_to_Previous_Page(backbtn);

        BorderPane borderPane_center = new BorderPane();
        BorderPane borderPane_center_right = new BorderPane();

        GridPane pane = new GridPane();



        Button Menu_btn_in_pos = new Button("Menu");
        Button Orders_btn_in_pos = new Button("Orders");
        Button Tables_btn_in_pos = new Button("Tables");
        Button More_btn_in_pos = new Button("More");
        VBox left = new VBox(Menu_btn_in_pos,Orders_btn_in_pos,Tables_btn_in_pos,More_btn_in_pos);
        left.setSpacing(40);
     /*   left.setMinHeight(40);
        left.setMinWidth(40);*/



        Button Breakfast_btn_in_pos = new Button("Breakfast");
        Button Salad_btn_in_pos = new Button("Salads");
        Button Cakes_btn_in_pos = new Button("Cakes");
        Button Appetizer_btn_in_pos = new Button("Appetizers");
        Button Healthy_Menu_btn_in_pos = new Button("Healthy Menu");
        Button Pasta_btn_in_pos = new Button("Pasta");
        Button MainDish_btn_in_pos = new Button("Main Dish");
        Button Pizza_btn_in_pos = new Button("Pizza");
        Button Soup_btn_in_pos = new Button("Soups");
        Button ChildrenMenu_btn_in_pos = new Button("Children Menu");
        Button Drinks_btn_in_pos = new Button("Drinks");

        VBox center_left_in = new VBox(Breakfast_btn_in_pos,Salad_btn_in_pos,Cakes_btn_in_pos,Appetizer_btn_in_pos,Healthy_Menu_btn_in_pos,Pasta_btn_in_pos,
                MainDish_btn_in_pos,Pizza_btn_in_pos,Soup_btn_in_pos,ChildrenMenu_btn_in_pos,Drinks_btn_in_pos);
        center_left_in.setSpacing(40);
        center_left_in.setMinHeight(20);
        center_left_in.setMinWidth(40);

        Text Order_text = new Text("Order");
        Button Takeaway_type_btn_in_pos = new Button("Take Away");
        Button Discount_btn_in_pos = new Button("Disc");
        Button Pay = new Button("Pay Now");
        Button Print = new Button("Print");
        Button Delete = new Button("Delete");


        TableColumn id = new TableColumn<TableData_class,Integer>("ID");
        id.setCellValueFactory(new PropertyValueFactory<TableData_class,Integer>("id"));

        TableColumn item = new TableColumn<TableData_class,String>("Item");
        item.setCellValueFactory(new PropertyValueFactory<TableData_class,String>("name"));

        TableColumn quantity = new TableColumn<TableData_class,Integer>("Quantity");
        quantity.setCellValueFactory(new PropertyValueFactory<TableData_class,Integer>("quantity"));

        TableColumn price = new TableColumn<TableData_class,Integer>("Price");
        price.setCellValueFactory(new PropertyValueFactory<TableData_class,Integer>("price"));

        table.getColumns().addAll(id,item,quantity,price);

        //id.cellFactoryProperty();
        VBox within_center_right_in = new VBox(table);

        VBox center_right_in = new VBox(Order_text,Takeaway_type_btn_in_pos,Discount_btn_in_pos,Pay,Print,Delete,within_center_right_in);
            center_right_in.setSpacing(20);
///Labels
        Label total = new Label("Total");
        Label Cash = new Label("Cash");
        Label Balance = new Label("Balance");

///text fields
        TextField total_field1 = new TextField("0");
        TextField total_field2 = new TextField("0");


        TextField total_field = new TextField("0");
        TextField Cash_field = new TextField("0");
        TextField Balance_field = new TextField("0");

        total_field.setText("0");
        Cash_field.setText("0");
        Balance_field.setText("0");

//gridpane
        pane.add(total,0,0);
        pane.add(total_field,1,0);
        pane.add(Cash,0,1);
        pane.add(Cash_field,1,1);
        pane.add(Balance,0,2);
        pane.add(Balance_field,1,2);


////Menu
        Button Eggs_btn_in_pos = new Button("Eggs");
        Button French_toast_btn_in_pos = new Button("French toast");
        Button waffles_btn_in_pos = new Button("Waffles");
        Button pancakes_btn_in_pos = new Button("Pancakes");
        Button oatmeal_btn_in_pos = new Button("Oatmeal");
        Button Cereal_btn_in_pos = new Button("Cereal");

        Text Eggs_btn_in_pos_text = new Text("0");
        Text French_toast_btn_in_pos_text = new Text("0");


        VBox center_center_in = new VBox(Eggs_btn_in_pos,Eggs_btn_in_pos_text,French_toast_btn_in_pos,French_toast_btn_in_pos_text,waffles_btn_in_pos,
                pancakes_btn_in_pos,oatmeal_btn_in_pos,Cereal_btn_in_pos);


        Breakfast_btn_in_pos.setOnAction(e->{
            borderPane_center.setCenter(center_center_in);
            center_center_in.setSpacing(30);
            center_center_in.setMinHeight(20);
            center_center_in.setMinWidth(40);
        });
        //////////////////////////////////////

        ArrayList arrayList = new ArrayList<>();

        double mn = 0;
        Eggs_btn_in_pos.setOnAction(e->{
            int i = Integer.valueOf(Eggs_btn_in_pos_text.getText());
            ++i;
            Eggs_btn_in_pos_text.setText(String.valueOf(i));
            TableData_class tableData=new TableData_class(1,"Egg Omelette",i,6.99*i);
            table.getItems().add(0,tableData);
           // tableData = (TableData_class) table.getSelectionModel().getSelectedItem();


            double tot = tableData.getPrice();
            total_field1.setText(String.valueOf(tot));
            int x=0;
            table.getItems().remove(++x);

            table.refresh();

            d1 = Double.valueOf(total_field1.getText());
            arrayList.add(0,tableData);
            System.out.println(d1);

        });



        French_toast_btn_in_pos.setOnAction(e->{
            int i = Integer.valueOf(French_toast_btn_in_pos_text.getText());
            ++i;
            French_toast_btn_in_pos_text.setText(String.valueOf(i));
            TableData_class tableData=new TableData_class(2,"French Toast",i,4.99*i);
            table.getItems().add(1,tableData);
            // tableData = (TableData_class) table.getSelectionModel().getSelectedItem();
            double tot = tableData.getPrice();
            total_field2.setText(String.valueOf(tot));

            /*table.getItems().get(2.;*/
            int x=0;
            table.getItems().remove(x+2);


            table.refresh();
            d2 = Double.valueOf(total_field2.getText());


            arrayList.add(1,tableData);
        });


        Pay.setOnAction(ep->{
            double total_price = d1+d2;
            total_field.setText(String.valueOf(d1+d2));


            System.out.println( d1+d2+"l");
        });

        Cash_field.setOnAction(cf->{
            double total_price = d1+d2;
            double cash_back = Double.parseDouble(Cash_field.getText());
            double balance = cash_back-total_price;
            Balance_field.setText(String.valueOf(balance));
        });




//total_field.setText(String.valueOf(d1+d));


/*
        for (int i = 0; i < table.getColumns().size(); i++) {
            System.out.println(  table.getColumns().get(i).toString());

        }*/




////Receipt
        TextArea textArea = new TextArea();
        textArea.setMaxSize(300,700);
        textArea.setMinHeight(600);
        textArea.setMaxHeight(900);


       // root.setRight(textArea);
        Print.setOnAction(e->{
            System.out.println(arrayList);



            textArea.setText("                       Food block Restaurant\n");
    textArea.setText(textArea.getText()+"                       549/ King Road,\n");
    textArea.setText(textArea.getText()+"                        Seol, Korea\n");
    textArea.setText(textArea.getText()+"                       +92 434398578\n");
    textArea.setText(textArea.getText()+"------------------------------------------\n");
    textArea.setText(textArea.getText()+"    \tName\t\t\t\tQty\t\tPrice\n\n");


    for (int i =0 ;i<arrayList.size() ;i++){
        textArea.setText(textArea.getText()+arrayList.get(i));}


    textArea.setText(textArea.getText()+"\n------------------------------------------\n");
    textArea.setText(textArea.getText()+" Sub Total:  "+total_field.getText()+"\n");
    textArea.setText(textArea.getText()+" Cash:       "+Cash_field.getText()+"\n");
    textArea.setText(textArea.getText()+" Balance:    "+Balance_field.getText()+"\n");
    textArea.setText(textArea.getText()+"------------------------------------------\n");
    textArea.setText(textArea.getText()+"Thanks for Shopping with us\n");
    textArea.setText(textArea.getText()+"------------------------------------------\n");

    textArea.setText(textArea.getText()+"Software by fa21-bcs-058 and 121\n");
});


        Delete.setOnAction(e->{
             String.valueOf(table.getItems().removeAll(table.getSelectionModel().getSelectedItems()));
          /*  switch (r){
                case 1:
                    Eggs_btn_in_pos_text.setText("0");
                    break;;

                case 2:
                    French_toast_btn_in_pos_text.setText("0");
                    break;;
            }*/
        });


        Menu_btn_in_pos.setOnAction(e->{
            Main.stage.setScene(Menu.getMenu_Scene());

        });

        borderPane_center.setLeft(center_left_in);
        borderPane_center_right.setCenter(center_right_in);

        VBox pane_and_receipt = new VBox(textArea,pane);
        root.setRight(pane_and_receipt);
        pane_and_receipt.setSpacing(70);
        root.setLeft(left);
        root.setCenter(borderPane_center);
        borderPane_center.setRight(borderPane_center_right);

        return POS_a;


    }


}

