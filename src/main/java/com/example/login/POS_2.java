package com.example.login;

import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class POS_2 {

    public static     TableView<TableData_class> table = new TableView<TableData_class>();

    public static  TextField total_field = new TextField("0");
    public static  TextField Cash_field = new TextField("0");
    public static  TextField Balance_field = new TextField("0");

    public static HashMap<String,Integer> hashMap = new HashMap<>();
    public static List list = new ArrayList<>();

    public static ObservableList<TableData_class> observableList = FXCollections.observableList(list);






    public static Scene POSScene2;


    public static Scene getPOSScene2() {


        BorderPane root = new BorderPane();
        Scene POS_a = new Scene(root, 1600, 1000);



       // Main.stage.setOpacity(0.92);/** Opacity*/

        Button Home_btn_in_pos = new Button("Home");
        Button Menu_btn_in_pos = new Button("Menu");
        Button History_btn_in_pos = new Button("History");
        Button Promos_btn_in_pos = new Button("Promos");
        Button Settings_btn_in_pos = new Button("Settings");
        Button Log_out_btn_in_pos = new Button("Log out");


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


        Button search_btn = new Button("Search");
        Text category_text = new Text("Chose Category");
        Text category_text_ = new Text("Chose product");

        Button Takeaway_type_btn_in_pos = new Button("Take Away");
        Button Discount_btn_in_pos = new Button("Disc");
        Button Pay = new Button("Pay Now");
        Button Print = new Button("Print");
        Button Delete = new Button("Delete");


///Labels
        Label total = new Label("Total");
        Label Cash = new Label("Cash");
        Label Balance = new Label("Balance");


        total_field.setText("0");
        Cash_field.setText("0");
        Balance_field.setText("0");


        //table.getColumns().clear();

        TableColumn id = new TableColumn<TableData_class, Integer>("ID");
        id.setCellValueFactory(new PropertyValueFactory<TableData_class, Integer>("id"));

        TableColumn item = new TableColumn<TableData_class, String>("Item");
        item.setCellValueFactory(new PropertyValueFactory<TableData_class, String>("name"));

        TableColumn quantity = new TableColumn<TableData_class, Integer>("Quantity");
        quantity.setCellValueFactory(new PropertyValueFactory<TableData_class, Integer>("quantity"));

        TableColumn price = new TableColumn<TableData_class, Integer>("Price");
        price.setCellValueFactory(new PropertyValueFactory<TableData_class, Integer>("price"));


        TableColumn Invoice = new TableColumn<TableData_class, Integer>("Invoice"+ new TableData_class(1).getInvoice());
        Invoice.setCellValueFactory(new PropertyValueFactory<TableData_class, Integer>("invoice"));
       // Invoice.setV

        Invoice.getColumns().addAll(id, item, quantity, price);

        table.getColumns().addAll(Invoice);
        //table.setColumnResizePolicy();

        table.refresh();
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);


        //table.getColumns().remove(table.getColumns().size()-1);
        //id.cellFactoryProperty();


////Menu
        Button Eggs_btn_in_pos = new Button("Eggs");
        Button French_toast_btn_in_pos = new Button("French toast");
        Button waffles_btn_in_pos = new Button("Waffles");
        Button pancakes_btn_in_pos = new Button("Pancakes");
        Button oatmeal_btn_in_pos = new Button("Oatmeal");
        Button Cereal_btn_in_pos = new Button("Cereal");


        Button Caesar_salad_btn_in_pos = new Button("Caesar Salad Supreme");
        Button Spinach_Salad_btn_in_pos = new Button("Strawberry Spinach Salad");
        Button Arabic_salad_btn_in_pos = new Button("Arabic Fattoush");
        Button Niçoise_salad_btn_in_pos = new Button("Salad Niçoise");


        Button cheesecake_btn_in_pos = new Button("Cheesecake");
        Button Chocolate_coconut_cake_toast_btn_in_pos = new Button("Chocolate coconut cake");
        Button Awalnut_cake_btn_in_pos = new Button("walnut cake");
        Button Chocolate_mud_cupcakes_btn_in_pos = new Button("Chocolate mud cupcakes");

        Button Cheese_Pizza_btn_in_pos = new Button("Cheese Pizza");
        Button Pepperoni_Pizza_btn_in_pos = new Button("Pepperoni Pizza");
        Button BBQ_Chicken_Pizza_btn_in_pos = new Button("BBQ Chicken Pizza");
        Button Farmhouse_Pizza_btn_in_pos = new Button("Farmhouse Pizza");



        hashMap.put("eggs",101);
        hashMap.put("french toast",169);
        hashMap.put("waffle",420);
        hashMap.put("pancake",202);
        hashMap.put("oatmeal",5089);
        hashMap.put("cereal",6433);

        hashMap.put(Cheese_Pizza_btn_in_pos.getText(),1011);
        hashMap.put(Pepperoni_Pizza_btn_in_pos.getText(),1694);
        hashMap.put(BBQ_Chicken_Pizza_btn_in_pos.getText(),4320);
        hashMap.put(Farmhouse_Pizza_btn_in_pos.getText(),2202);
        hashMap.put(Caesar_salad_btn_in_pos.getText(),589);
        hashMap.put(Spinach_Salad_btn_in_pos.getText(),643);

        hashMap.put(Arabic_salad_btn_in_pos.getText(),1301);
        hashMap.put(Niçoise_salad_btn_in_pos.getText(),1069);



        table.setBackground(Background.fill(Color.WHITESMOKE));
        table.setItems(observableList);

        Eggs_btn_in_pos.setOnAction(e -> {


            if(observableList !=null)
            {


                update_data("Egg Omelette",6.66,hashMap.get("eggs"));
                /*
                TableData_class eggs = new TableData_class("Egg Omelette");


                if (observableList.contains(eggs))
                {
                    TableData_class food_object = observableList.get(observableList.indexOf(eggs));
                    food_object.setQuantity(i);
                    food_object.setPrice(6.99 * i);
                }
                else
                    observableList.add(new TableData_class(1, "Egg Omelette", i, 6.99 * i));*/
            }
            table.refresh();



        });
        French_toast_btn_in_pos.setOnAction(e -> {


            if(observableList !=null)
            {
                update_data("French Toast-",4.20,hashMap.get("french toast"));
            }
                /*TableData_class french_1 = new TableData_class("French Toast");

                if (observableList.contains(french_1))
                {
                    TableData_class egg = observableList.get(observableList.indexOf(french_1));
                    egg.setQuantity(i);
                    egg.setPrice(6.99 * i);
                }
                else
                    observableList.add(new TableData_class(1, "French Toast", i, 6.99 * i));

            }*/
            table.refresh();



        });
        waffles_btn_in_pos.setOnAction(e -> {
          /*  int i = Integer.valueOf(waffles_btn_in_pos_text.getText());
            ++i;
            waffles_btn_in_pos_text.setText(String.valueOf(i));*/



            if(observableList !=null)
            {

                update_data("Waffle            ",6.9,hashMap.get("waffle"));
            }
            table.refresh();
        });
        pancakes_btn_in_pos.setOnAction(e -> {

            if(observableList !=null)
            {

                update_data("Pancakes        ",6.9,hashMap.get("pancake"));
            }
            table.refresh();
        });
        oatmeal_btn_in_pos.setOnAction(e -> {

            if(observableList !=null)
            {

                update_data("Oat Meal           ",6.9,hashMap.get("oatmeal"));
            }
            table.refresh();
        });
        Cereal_btn_in_pos.setOnAction(e -> {

            if(observableList !=null)
            {

                update_data("Cereal              ",6.9,hashMap.get("cereal"));
            }
            table.refresh();
        });
/*           Cheese_Pizza_btn_in_pos,Pepperoni_Pizza_btn_in_pos,BBQ_Chicken_Pizza_btn_in_pos,Farmhouse_Pizza_btn_in_pos
        Caesar_salad_btn_in_pos,Spinach_Salad_btn_in_pos,Arabic_salad_btn_in_pos,Niçoise_salad_btn_in_pos

*/


        Caesar_salad_btn_in_pos.setOnAction(e -> {

            if(observableList !=null)
            {
                update_data(Caesar_salad_btn_in_pos.getText(),65.7,hashMap.get(Caesar_salad_btn_in_pos.getText()));
            }
            table.refresh();
        });
        Spinach_Salad_btn_in_pos.setOnAction(e -> {

            if(observableList !=null)
            {
                update_data(Spinach_Salad_btn_in_pos.getText(),67.3,hashMap.get(Spinach_Salad_btn_in_pos.getText()));
            }
            table.refresh();
        });
        Arabic_salad_btn_in_pos.setOnAction(e -> {

            if(observableList !=null)
            {

                update_data(Arabic_salad_btn_in_pos.getText(),6.9,hashMap.get(Arabic_salad_btn_in_pos.getText()));
            }
            table.refresh();
        });
        Niçoise_salad_btn_in_pos.setOnAction(e -> {

            if(observableList !=null)
            {

                update_data(Niçoise_salad_btn_in_pos.getText(),15.9,hashMap.get(Niçoise_salad_btn_in_pos.getText()));
            }
            table.refresh();
        });
        Cheese_Pizza_btn_in_pos.setOnAction(e -> {

            if(observableList !=null)
            {

                update_data(Cheese_Pizza_btn_in_pos.getText(),16.7,hashMap.get(Cheese_Pizza_btn_in_pos.getText()));
            }
            table.refresh();
        });
        Pepperoni_Pizza_btn_in_pos.setOnAction(e -> {

            if(observableList !=null)
            {

                update_data(Pepperoni_Pizza_btn_in_pos.getText(),15.7,hashMap.get(Pepperoni_Pizza_btn_in_pos.getText()));
            }
            table.refresh();
        });
        BBQ_Chicken_Pizza_btn_in_pos.setOnAction(e -> {

            if(observableList !=null)
            {

                update_data(BBQ_Chicken_Pizza_btn_in_pos.getText(),6.9,hashMap.get(BBQ_Chicken_Pizza_btn_in_pos.getText()));
            }
            table.refresh();
        });
        Farmhouse_Pizza_btn_in_pos.setOnAction(e -> {

            if(observableList !=null)
            {

                update_data(Farmhouse_Pizza_btn_in_pos.getText(),4.2,hashMap.get(Farmhouse_Pizza_btn_in_pos.getText()));
            }
            table.refresh();
        });






        total_field.setEditable(false);
        Balance_field.setEditable(false);

        Discount_btn_in_pos.setOnAction(e->{
            double discount = Double.parseDouble(total_field.getText());
            //String.format("%.2f",discount);
            double s = discount - (discount * 0.2);
            total_field.setText(String.format("%.2f",s));
        });
        Pay.setOnAction(ep -> {
            Total_amount();
            System.out.println("think");
        });
        Cash_field.setOnAction(cf -> {

            double total_f = Double.parseDouble(total_field.getText());
            double total_c = Double.parseDouble(Cash_field.getText());

            double total_amount = total_c - total_f;
            Balance_field.setText(String.format("%.2f",total_amount));
        });

        Print.setOnAction(e -> {


            if (Cash_field.getText().equals("0") && Balance_field.getText().equals("0")) {

                Cash_field.setStyle("-fx-text-fill: RED");
            }
            else{

                double x = Double.parseDouble(Cash_field.getText());
                double y= Double.parseDouble(total_field.getText());

                if(x >= y) {

                    if (x >= 0) {
                        Balance_field.setText(String.format("%.2f", x - y));
                        Cash_field.setStyle("-fx-text-fill: BLACK");
                        Print_Receipt.getPrint_Receipt();
                    }
                }
                else {
                    Balance_field.setStyle("-fx-text-fill: RED");
                }


            }

        });
        Delete.setOnAction(e -> {


            for (TableData_class t : table.getSelectionModel().getSelectedItems()) {
                observableList.remove(t);
                Total_amount();
                /*if (t.getName().toLowerCase().contains("egg"))
                    Eggs_btn_in_pos_text.setText(String.valueOf(0));
                if (t.getName().toLowerCase().contains("french"))
                    French_toast_btn_in_pos_text.setText(String.valueOf(0));*/
            }

        });
        Home_btn_in_pos.setOnAction(e -> {
            table.getColumns().remove(table.getColumns().size()-1);
            table.refresh();
            Main.stage.setScene(InsideScene.Loggedin);
        });
        Log_out_btn_in_pos.setOnAction(e -> {
            table.getColumns().remove(table.getColumns().size()-1);

            table.getItems().clear();
            Main.stage.setScene(Main.LoginPage());
        });


        Image image = null;
        try {
            image = new Image(new FileInputStream("/Users/muhammad/Desktop/Final_Project/Login/src/main/resources/logo.png"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(85);
        imageView.setFitWidth(85);
        imageView.setPreserveRatio(true);


        BorderPane borderPane_center = new BorderPane();
        BorderPane borderPane_center2 = new BorderPane();


        VBox left_up = new VBox(imageView,Home_btn_in_pos,Menu_btn_in_pos,History_btn_in_pos,  Promos_btn_in_pos,Settings_btn_in_pos);
        left_up.setSpacing(40);
      //  left_up.setBackground(Background.fill(Color.WHITE));
        left_up.setAlignment(Pos.CENTER);
        VBox left_down = new VBox(Log_out_btn_in_pos);

        left_down.setAlignment(Pos.BOTTOM_CENTER);
        left_down.setMinHeight(340);
        VBox join_left_up_down = new VBox(left_up,left_down);
        join_left_up_down.setBackground(Background.fill(Color.WHITE));


        Menu_btn_in_pos.setOnAction(e->{
            Menu_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: Brown; -fx-text-fill: White");
            HBox up_Box = new HBox(category_text,search_btn);
            up_Box.setSpacing(600);
            up_Box.setAlignment(Pos.CENTER);
            up_Box.setMinHeight(70);
            category_text.setFont(Font.font("Verdana",FontWeight.BOLD,15));

            HBox center_Box = new HBox(Breakfast_btn_in_pos,Salad_btn_in_pos,Cakes_btn_in_pos,Healthy_Menu_btn_in_pos,
                    Pizza_btn_in_pos,Pasta_btn_in_pos,MainDish_btn_in_pos,Soup_btn_in_pos,ChildrenMenu_btn_in_pos,Drinks_btn_in_pos);
            ///Appetizer_btn_in_pos
            center_Box.setSpacing(15);
            //center_Box.setAlignment(Pos.CENTER);
            center_Box.setMinHeight(50);
            center_Box.setAlignment(Pos.CENTER);
            borderPane_center.setTop(up_Box);
            borderPane_center2.setTop(center_Box);


        });
        History_btn_in_pos.setOnAction(e->{
            History_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: Brown; -fx-text-fill: White");
        });
        Promos_btn_in_pos.setOnAction(e->{
            Promos_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: Brown; -fx-text-fill: White");
        });
        Settings_btn_in_pos.setOnAction(e->{
            Settings_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: Brown; -fx-text-fill: White");
        });



        HBox bottom_box = new HBox(category_text_);
        bottom_box.setMinHeight(50);
        category_text_.setFont(Font.font("Verdana",FontWeight.BOLD,15));
        bottom_box.setAlignment(Pos.CENTER);

        Breakfast_btn_in_pos.setOnAction(e -> {

            Menu(Eggs_btn_in_pos, French_toast_btn_in_pos, waffles_btn_in_pos, pancakes_btn_in_pos,
                    oatmeal_btn_in_pos, Cereal_btn_in_pos,borderPane_center2,bottom_box);


        });
        Salad_btn_in_pos.setOnAction(e->{
            Menu(Caesar_salad_btn_in_pos,Spinach_Salad_btn_in_pos,Arabic_salad_btn_in_pos,Niçoise_salad_btn_in_pos
                    ,borderPane_center2,bottom_box);
        });
        Cakes_btn_in_pos.setOnAction(e->{
            Menu(cheesecake_btn_in_pos,Chocolate_coconut_cake_toast_btn_in_pos,Awalnut_cake_btn_in_pos,Chocolate_mud_cupcakes_btn_in_pos

                    ,borderPane_center2,bottom_box);
        });
        Healthy_Menu_btn_in_pos.setOnAction(e->{
            Menu(Caesar_salad_btn_in_pos,Spinach_Salad_btn_in_pos,Arabic_salad_btn_in_pos,Niçoise_salad_btn_in_pos
                    ,borderPane_center2,bottom_box);
        });
        Pizza_btn_in_pos.setOnAction(e->{
            Menu( Cheese_Pizza_btn_in_pos,Pepperoni_Pizza_btn_in_pos,BBQ_Chicken_Pizza_btn_in_pos,Farmhouse_Pizza_btn_in_pos

                    ,borderPane_center2,bottom_box);
        });
        Pasta_btn_in_pos.setOnAction(e->{
            Menu(Caesar_salad_btn_in_pos,Spinach_Salad_btn_in_pos,Arabic_salad_btn_in_pos,Niçoise_salad_btn_in_pos
                    ,borderPane_center2,bottom_box);
        });
        MainDish_btn_in_pos.setOnAction(e->{
            Menu(Caesar_salad_btn_in_pos,Spinach_Salad_btn_in_pos,Arabic_salad_btn_in_pos,Niçoise_salad_btn_in_pos
                    ,borderPane_center2,bottom_box);
        });
        Soup_btn_in_pos.setOnAction(e->{
            Menu(Caesar_salad_btn_in_pos,Spinach_Salad_btn_in_pos,Arabic_salad_btn_in_pos,Niçoise_salad_btn_in_pos
                    ,borderPane_center2,bottom_box);
        });
        ChildrenMenu_btn_in_pos.setOnAction(e->{
            Menu(Caesar_salad_btn_in_pos,Spinach_Salad_btn_in_pos,Arabic_salad_btn_in_pos,Niçoise_salad_btn_in_pos
                    ,borderPane_center2,bottom_box);
        });
        Drinks_btn_in_pos.setOnAction(e->{
            Menu(Caesar_salad_btn_in_pos,Spinach_Salad_btn_in_pos,Arabic_salad_btn_in_pos,Niçoise_salad_btn_in_pos
                    ,borderPane_center2,bottom_box);
        });


/*
        Text empty = new Text("Nothing to Show Here Right Now ");
        empty.setTextAlignment(TextAlignment.CENTER);
        empty.setFont(Font.font("Verdana",FontWeight.BOLD,15));
        borderPane_center.setCenter(empty);
        */
        borderPane_center.setCenter(borderPane_center2);

      /**
       borderPane_center2.setOnScroll(new EventHandler<ScrollEvent>() {
            @Override
            public void handle(ScrollEvent event) {

            }
        });*/
        borderPane_center.setBackground(Background.fill(Color.rgb(238, 237, 243)));
        borderPane_center.setMinWidth(920);
        //something i forgot


//mode_button.setBorder(Border.stroke(Color.GREY));


        //up_right.setMinHeight(80);
        //up_right.setSpacing(2);
/*
        HBox total_box = new HBox(total,total_field);
        total_box.setSpacing(180);
        total_box.setAlignment(Pos.CENTER);
        HBox Cash_box = new HBox(Cash,Cash_field);
        Cash_box.setSpacing(180);
        Cash_box.setAlignment(Pos.CENTER);
        HBox Balance_box = new HBox(Balance,Balance_field);
        Balance_box.setAlignment(Pos.CENTER);
        Balance_box.setSpacing(167);*/
/*
        VBox join_3 = new VBox(total_box,Cash_box,Balance_box,Delete);
        join_3.setSpacing(6);
        //join_3.setMinHeight(120);
        //join_3.setAlignment(Pos.BOTTOM_CENTER);
        Text payment = new Text("Payment");
        payment.setFont(Font.font("Verdana",FontWeight.BOLD,18 ));
        payment.setTextAlignment(TextAlignment.LEFT);
        HBox payment_box1 = new HBox(Pay,Discount_btn_in_pos);
        payment_box1.setAlignment(Pos.CENTER);
        VBox payment_box = new VBox(payment,payment_box1,Print);
        payment_box.setAlignment(Pos.BOTTOM_CENTER);*/
       // payment_box.setMinHeight(250);

///////////////////////////////////////////////////////Right...
        table.setMinWidth(420);
        Text name = new Text("Hello "+Main.username);
        name.setFont(Font.font("Verdana",FontWeight.BOLD,18));
        Text employee_type = new Text("I'm a " + Main.x );
        VBox user_poster = new VBox(name,employee_type);
        Button employee_info = new Button("",user_poster);
        employee_info.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");
        employee_info.setMinWidth(300);
        employee_info.setMinHeight(80);
        employee_info.setOnAction(e->{
            Main.stage.setScene(Employee_personal_data.User_Personal_data());
        });
        Button dark_mode_button = new Button("D");
        Button light_mode_button = new Button("Li");
        dark_mode_button.setMinWidth(5);
        light_mode_button.setMinWidth(5);
        dark_mode_button.setMinHeight(5);
        light_mode_button.setMinHeight(5);
        HBox hBox2 = new HBox(dark_mode_button);
        Button mode_button = new Button("",hBox2);
        mode_button.setMinWidth(60);
        mode_button.setMinHeight(10);
        HBox hBox = new HBox(employee_info,mode_button);
//        hBox.setSpacing(30);

        Text Bill = new Text("Billings");
        Bill.setFont(Font.font("Verdana",FontWeight.BOLD,18 ));

        VBox employee_bill_table_box = new VBox(hBox,Bill,table);
        employee_bill_table_box.setMinHeight(600);

        VBox cashing_label = new VBox(total,Cash,Balance);
        VBox cashing_field = new VBox(total_field,Cash_field,Balance_field);
        HBox cashing =new HBox(cashing_label,cashing_field);
        //cashing_label.setAlignment(Pos.CENTER);///
        cashing.setAlignment(Pos.BOTTOM_CENTER);
        cashing.setMinHeight(100);

        cashing_label.setSpacing(20);
        cashing_field.setSpacing(5);
        cashing.setSpacing(120);

        HBox payment_boxx = new HBox(Print);
        payment_boxx.setAlignment(Pos.CENTER);

        HBox delete_promos_box = new HBox(Delete,Discount_btn_in_pos);
        delete_promos_box.setSpacing(130);
        delete_promos_box.setAlignment(Pos.CENTER);

        VBox pay_box = new VBox(payment_boxx,delete_promos_box);
        pay_box.setSpacing(20);
        pay_box.setMinHeight(200);
        pay_box.setAlignment(Pos.BOTTOM_CENTER);



        VBox full =new VBox(employee_bill_table_box,cashing,pay_box);

        Print.setMinWidth(280);
        Print.setMinHeight(40);
        Print.setStyle(" -fx-background-radius: 9px; -fx-background-color: Brown; -fx-text-fill: WHITE ");

        Pay.setMinWidth(180);
        Pay.setStyle(" -fx-background-radius: 9px; -fx-background-color: Brown; -fx-text-fill: WHITE ");

        Discount_btn_in_pos.setMinWidth(70);
        Discount_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: Brown; -fx-text-fill: WHITE ");

        Delete.setMinWidth(70);
        Delete.setStyle(" -fx-background-radius: 9px; -fx-background-color: Brown; -fx-text-fill: WHITE ");







        root.setLeft(join_left_up_down);
        root.setCenter(borderPane_center);
        root.setRight(full);



        TranslateTransition transition = new TranslateTransition(Duration.seconds(1), hBox2);

        dark_mode_button.setStyle("-fx-background-radius: 100px; -fx-background-color: #f4f4f4; -fx-text-fill: Black ");
        light_mode_button.setStyle("-fx-background-radius: 100px; -fx-background-color: BLACK; -fx-text-fill:  #ffffff");
        mode_button.setStyle("-fx-background-radius: 100px; -fx-background-color: BLACK; -fx-text-fill:  #ffffff");


        dark_mode_button.setOnAction(e->{



            join_left_up_down.setBackground(Background.fill(Color.rgb(1, 11, 19)));
            borderPane_center.setBackground(Background.fill(Color.rgb(35,31,32)));
            full.setBackground(Background.fill(Color.rgb(25, 39, 52)));
            hBox2.getChildren().setAll(light_mode_button);
            mode_button.setStyle("-fx-background-radius: 100px; -fx-background-color: #f4f4f4; -fx-text-fill:  #ffffff");
            Bill.setFill(Color.WHITE);
            total.setTextFill(Color.WHITE);
            Cash.setTextFill(Color.WHITE);
            Balance.setTextFill(Color.WHITE);

            transition.setRate(+1);
            transition.setToX(20);
            transition.play();

        });
        light_mode_button.setOnAction(e->{

            join_left_up_down.setBackground(Background.fill(Color.WHITE));
            borderPane_center.setBackground(Background.fill(Color.rgb(238, 237, 243)));
            full.setBackground(Background.fill(Color.rgb(238, 237, 243)));


            mode_button.setStyle("-fx-background-radius: 100px; -fx-background-color: BLACK; -fx-text-fill:  #ffffff");
            hBox2.getChildren().setAll(dark_mode_button);

            Bill.setFill(Color.BLACK);
            total.setTextFill(Color.BLACK);
            Cash.setTextFill(Color.BLACK);
            Balance.setTextFill(Color.BLACK);


            // Start the transition in reverse
            int x = (int) transition.getToX();
                transition.setToX(x-20);
            transition.setRate(+1);
            transition.play();




        });










        //button.setWrapText(true);//*
        //
        // * ***/





        Home_btn_in_pos.setMinWidth(50);
        Home_btn_in_pos.setMinHeight(50);
        Menu_btn_in_pos.setMinWidth(50);
        Menu_btn_in_pos.setMinHeight(50);
        History_btn_in_pos.setMinWidth(50);
        History_btn_in_pos.setMinHeight(50);
        Promos_btn_in_pos.setMinWidth(50);
        Promos_btn_in_pos.setMinHeight(50);
        Settings_btn_in_pos.setMinWidth(50);
        Settings_btn_in_pos.setMinHeight(50);
        Log_out_btn_in_pos.setMinWidth(50);
        Log_out_btn_in_pos.setMinHeight(50);

        Breakfast_btn_in_pos.setMinHeight(80);
        Breakfast_btn_in_pos.setMinWidth(70);
        //Breakfast_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        Breakfast_btn_in_pos.setWrapText(true);
        Breakfast_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");

        Salad_btn_in_pos.setMinHeight(80);
        Salad_btn_in_pos.setMinWidth(70);
        //Salad_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        Salad_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");
        Salad_btn_in_pos.setWrapText(true);

        Cakes_btn_in_pos.setMinHeight(80);
        Cakes_btn_in_pos.setMinWidth(70);
       // Cakes_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        Cakes_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");
        Cakes_btn_in_pos.setWrapText(true);

        Appetizer_btn_in_pos.setMinHeight(80);
        Appetizer_btn_in_pos.setMinWidth(70);
        //Appetizer_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        Appetizer_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");
        Appetizer_btn_in_pos.setWrapText(true);

        Healthy_Menu_btn_in_pos.setMinHeight(80);
        Healthy_Menu_btn_in_pos.setMinWidth(70);
        //Healthy_Menu_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        Healthy_Menu_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");
        Healthy_Menu_btn_in_pos.setWrapText(true);

        Pizza_btn_in_pos.setMinHeight(80);
        Pizza_btn_in_pos.setMinWidth(70);
        //Pizza_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        Pizza_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");
        Pizza_btn_in_pos.setWrapText(true);

        Pasta_btn_in_pos.setMinHeight(80);
        Pasta_btn_in_pos.setMinWidth(70);
        //Pasta_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        Pasta_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");
        Pasta_btn_in_pos.setWrapText(true);

        MainDish_btn_in_pos.setMinHeight(80);
        MainDish_btn_in_pos.setMinWidth(70);
        //MainDish_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        MainDish_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");
        MainDish_btn_in_pos.setWrapText(true);

        Soup_btn_in_pos.setMinHeight(80);
        Soup_btn_in_pos.setMinWidth(70);
        //Soup_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        Soup_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");
        Soup_btn_in_pos.setWrapText(true);

        ChildrenMenu_btn_in_pos.setMinHeight(80);
        ChildrenMenu_btn_in_pos.setMinWidth(70);
        //ChildrenMenu_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        ChildrenMenu_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");
        ChildrenMenu_btn_in_pos.setWrapText(true);

        Drinks_btn_in_pos.setMinHeight(80);
        Drinks_btn_in_pos.setMinWidth(70);
        //Drinks_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        Drinks_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");
        Drinks_btn_in_pos.setWrapText(true);

        Image Home_img = new Image("home_icon_190886.png");
        ImageView Home_img_view2 = new ImageView(Home_img);
        Home_btn_in_pos.setGraphic(Home_img_view2);
        Home_img_view2.setFitWidth(20);
        Home_img_view2.setFitHeight(20);
        Home_img_view2.setPreserveRatio(true);
        Home_btn_in_pos.setContentDisplay(ContentDisplay.TOP);
        //Home_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        Home_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");

        Image Menu_img = new Image("dish.png");
        ImageView Menu_img_view2 = new ImageView(Menu_img);
        Menu_btn_in_pos.setGraphic(Menu_img_view2);
        Menu_img_view2.setFitWidth(20);
        Menu_img_view2.setFitHeight(20);
        Home_img_view2.setPreserveRatio(true);
        Menu_btn_in_pos.setContentDisplay(ContentDisplay.TOP);
        //Menu_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        Menu_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");

        Image History_img = new Image("clock.png");
        ImageView History_img_view2 = new ImageView(History_img);
        History_btn_in_pos.setGraphic(History_img_view2);
        History_img_view2.setFitWidth(20);
        History_img_view2.setFitHeight(20);
        History_img_view2.setPreserveRatio(true);
        History_btn_in_pos.setContentDisplay(ContentDisplay.TOP);
       // History_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        History_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");

        Image Promo_img = new Image("promo.png");
        ImageView Promo_img_view2 = new ImageView(Promo_img);
        Promos_btn_in_pos.setGraphic(Promo_img_view2);
        Promo_img_view2.setFitWidth(20);
        Promo_img_view2.setFitHeight(20);
        Promo_img_view2.setPreserveRatio(true);
        Promos_btn_in_pos.setContentDisplay(ContentDisplay.TOP);
      //  Promos_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        Promos_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");

        Image Setting_img = new Image("setting.png");
        ImageView Setting_img_view2 = new ImageView(Setting_img);
        Settings_btn_in_pos.setGraphic(Setting_img_view2);
        Setting_img_view2.setFitWidth(20);
        Setting_img_view2.setFitHeight(20);
        Setting_img_view2.setPreserveRatio(true);
        Settings_btn_in_pos.setContentDisplay(ContentDisplay.TOP);
        //Settings_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        Settings_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");

        Image Log_out_img = new Image("log_out.png");
        ImageView Log_out_img_view2 = new ImageView(Log_out_img);
        Log_out_btn_in_pos.setGraphic(Log_out_img_view2);
        Log_out_img_view2.setFitWidth(20);
        Log_out_img_view2.setFitHeight(20);
        Log_out_img_view2.setPreserveRatio(true);
        Log_out_btn_in_pos.setContentDisplay(ContentDisplay.TOP);
        //Log_out_btn_in_pos.setBackground(Background.fill(Color.WHITE));
        Log_out_btn_in_pos.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");
        //Log_out_btn_in_pos.setStyle("-fx-background-radius: 15px; -fx-text-fill: #ffffff");


        return POS_a;

    }

    public static  void update_data(String food_name,double price,int id ){

        TableData_class food_table = new TableData_class(food_name);


        if (observableList.contains(food_table))
        {
            TableData_class food_item = observableList.get(observableList.indexOf(food_table));
            food_item.setQuantity(food_item.getQuantity()+1);
            food_item.setPrice(price * food_item.getQuantity());

        }
        else
            observableList.add(new TableData_class(id, food_name, 1, price ));
//new SecureRandom().nextInt(Integer.MAX_VALUE%100)
        Total_amount();
    }

    public static void Total_amount(){
        AtomicReference<Double> total = new AtomicReference<>((double) 0);
        table.getItems().forEach(tableData_class -> {
            total.updateAndGet(v -> (double) (v + tableData_class.getPrice()));
        });
        total_field.setText(String.format("%.2f",total.get()));


    }

    public static void Menu(Button x,Button y,Button z,Button x1,Button y1, Button z1,BorderPane pane,HBox h){

        HBox food_hBox1 = new HBox(x,y,z);
        HBox food_hBox2 = new HBox(x1,y1,z1);
        VBox BreakFast_items12 = new VBox(food_hBox1,food_hBox2);
        BreakFast_items12.setBackground(Background.fill(Color.rgb(235, 242, 250)));

        BreakFast_items12.setSpacing(50);
        food_hBox1.setSpacing(20);
        food_hBox2.setSpacing(20);


        BreakFast_items12.setSpacing(30);
        BreakFast_items12.setMinHeight(40);
        BreakFast_items12.setMinWidth(900);

        x.setMinWidth(250);
        x.setMinHeight(300);

        x1.setMinWidth(250);
        x1.setMinHeight(300);

        y.setMinWidth(250);
        y.setMinHeight(300);

        y1.setMinWidth(250);
        y1.setMinHeight(300);

        z.setMinWidth(250);
        z.setMinHeight(300);

        z1.setMinWidth(250);
        z1.setMinHeight(300);

        VBox bottom_box2 = new VBox(BreakFast_items12);
        VBox join2 = new VBox(h,bottom_box2);

        VBox empty = new VBox();
        empty.setMinWidth(50);
        pane.setLeft(empty);
        pane.setCenter(join2);


    }
    public static void Menu(Button x,Button y,Button z,Button x1,BorderPane pane,HBox h){

        HBox food_hBox1 = new HBox(x,y,z);
        HBox food_hBox2 = new HBox(x1);
        VBox BreakFast_items1 = new VBox(food_hBox1,food_hBox2);
        BreakFast_items1.setBackground(Background.fill(Color.rgb(235, 242, 250)));

        BreakFast_items1.setSpacing(50);
        food_hBox1.setSpacing(20);
        food_hBox2.setSpacing(20);


        BreakFast_items1.setSpacing(30);
        BreakFast_items1.setMinHeight(40);
        BreakFast_items1.setMinWidth(40);



        x.setMinWidth(250);
        x.setMinHeight(300);

        x1.setMinWidth(250);
        x1.setMinHeight(300);

        y.setMinWidth(250);
        y.setMinHeight(300);

        z.setMinWidth(250);
        z.setMinHeight(300);


        VBox empty = new VBox();
        empty.setMinWidth(50);
        pane.setLeft(empty);

        VBox bottom_box2 = new VBox(BreakFast_items1);

        VBox join2 = new VBox(h,bottom_box2);
        pane.setCenter(join2);



    }

    public static void add_item(Button x, Text text, int i){

        Button button = new Button();
        button.setText(String.valueOf(text));

    }
    public static void invoice(){

    }
}

