package com.example.login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import java.util.ArrayList;

import static com.example.login.Management_class.Back_to_Previous_Page;
public class POS {

    public static Scene POS;

    public static  ArrayList foodList = new ArrayList<>();
    public static  ArrayList Hbox_List = new ArrayList<>();


    public static Scene getPOSScene(){
        GridPane root = new GridPane();
       // BorderPane root = new BorderPane();
        Scene POS = new Scene(root,1400,900,true);
        Button backbtn = new Button("Back");
        com.example.login.Management_class.Back_to_Previous_Page(backbtn);
        root.add(backbtn,1,10);
       // root.setStyle("-fx-background-image: url(bg_ps_5.jpg); -fx-background-repeat: no-repeat; -fx-background-size: 1300 1000 ;   -fx-background-position: center center;");
      root.setBackground(Background.fill(Color.gray(.3)));
        Main.stage.setTitle("POS");


        Button Menu_btn_in_pos = new Button("Menu");
        Button Orders_btn_in_pos = new Button("Orders");
        Button Tables_btn_in_pos = new Button("Tables");
        Button More_btn_in_pos = new Button("More");
        root.add(Menu_btn_in_pos,1,1);
        root.add(Orders_btn_in_pos,1,2);
        root.add(Tables_btn_in_pos,1,3);
        root.add(More_btn_in_pos,1,4);


        Button Change_color = new Button("change");

        root.add(Change_color,9,1);


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
        root.add(Breakfast_btn_in_pos,2,1);
        root.add(Salad_btn_in_pos,2,2);
        root.add(Cakes_btn_in_pos,2,3);
        root.add(Appetizer_btn_in_pos,2,4);
        root.add(Healthy_Menu_btn_in_pos,2,5);
        root.add(Pasta_btn_in_pos,2,6);
        root.add(MainDish_btn_in_pos,2,7);
        root.add(Pizza_btn_in_pos,2,8);
        root.add(Soup_btn_in_pos,2,9);
        root.add(ChildrenMenu_btn_in_pos,2,10);
        root.add(Drinks_btn_in_pos,2,11);

        Button Order_text = new Button("Order");
        Button Cashier_btn = new Button("Order");
        Button Takeaway_type_btn_in_pos = new Button("Take Away");
        Button Discount_btn_in_pos = new Button("Disc");

        root.add(Order_text,8,2,2,1);
        root.add(Cashier_btn,7,3);
        root.add(Takeaway_type_btn_in_pos,8,3);
        root.add(Discount_btn_in_pos,9,3);




        Button search_btn = new Button("Search");
      //  root.add(search_btn,5,1,4,1);

        Button Pay = new Button("Pay Now");
        root.add(Pay,8,10,3,1);


        root.setHgap(25);
        root.setVgap(25);




        Menu_btn_in_pos.setOnAction(e->{
            Main.stage.setScene(Menu.getMenu_Scene());

        });



        Breakfast_btn_in_pos.setOnAction(e->{
            Button Eggs_btn_in_pos = new Button("Eggs");
            Button French_toast_btn_in_pos = new Button("French toast");
            Button waffles_btn_in_pos = new Button("Waffles");
            Button pancakes_btn_in_pos = new Button("Pancakes");
            Button oatmeal_btn_in_pos = new Button("Oatmeal");
            Button Cereal_btn_in_pos = new Button("Cereal");
            root.add(Eggs_btn_in_pos,3,3);
            root.add(French_toast_btn_in_pos,4,3);
            root.add(waffles_btn_in_pos,5,3);
            root.add(pancakes_btn_in_pos,3,4);
            root.add(oatmeal_btn_in_pos,4,4);
            root.add(Cereal_btn_in_pos,5,4);
            Eggs_btn_in_pos.setMinWidth(200);
            Eggs_btn_in_pos.setMinHeight(120);
            French_toast_btn_in_pos.setMinWidth(200);
            French_toast_btn_in_pos.setMinHeight(120);
            waffles_btn_in_pos.setMinWidth(200);
            waffles_btn_in_pos.setMinHeight(120);
            pancakes_btn_in_pos.setMinWidth(200);
            pancakes_btn_in_pos.setMinHeight(120);
            oatmeal_btn_in_pos.setMinWidth(200);
            oatmeal_btn_in_pos.setMinHeight(120);
            Cereal_btn_in_pos.setMinWidth(200);
            Cereal_btn_in_pos.setMinHeight(120);

            Image Eggs_img = new Image("img_3.png");
            ImageView view = new ImageView(Eggs_img);
            Eggs_btn_in_pos.setGraphic(view);
            view.setFitHeight(150);
            view.setFitWidth(150);
            view.setPreserveRatio(true);
            Eggs_btn_in_pos.setPrefSize(80, 80);

            Image Toast_img = new Image("img_4.png");
            ImageView view2 = new ImageView(Toast_img);
            French_toast_btn_in_pos.setGraphic(view2);
            view2.setFitHeight(150);
            view2.setFitWidth(150);
            view2.setPreserveRatio(true);
            French_toast_btn_in_pos.setPrefSize(80, 80);

            Image Waffle_img = new Image("img_5.png");
            ImageView view3 = new ImageView(Waffle_img);
            waffles_btn_in_pos.setGraphic(view3);
            view3.setFitHeight(100);
            view3.setFitWidth(100);
            view3.setPreserveRatio(true);
            waffles_btn_in_pos.setPrefSize(80, 80);


            Image Pancakes_img = new Image("img_6.png");
            ImageView view4 = new ImageView(Pancakes_img);
            pancakes_btn_in_pos.setGraphic(view4);
            view4.setFitHeight(100);
            view4.setFitWidth(100);
            view4.setPreserveRatio(true);
            pancakes_btn_in_pos.setPrefSize(80, 80);


            Image Oatmeal_img = new Image("img_7.png");
            ImageView view5 = new ImageView(Oatmeal_img);
            oatmeal_btn_in_pos.setGraphic(view5);
            view5.setFitHeight(100);
            view5.setFitWidth(100);
            view5.setPreserveRatio(true);
            oatmeal_btn_in_pos.setPrefSize(80, 80);

            Image Cereal_img = new Image("img_5.png");
            ImageView view8 = new ImageView(Cereal_img);
            Cereal_btn_in_pos.setGraphic(view8);
            view8.setFitHeight(100);
            view8.setFitWidth(100);
            view8.setPreserveRatio(true);
            Cereal_btn_in_pos.setPrefSize(80, 80);

           // Cereal_btn_in_pos.setTextAlignment(TextAlignment.CENTER);
         /*   Cereal_btn_in_pos.setAlignment(Pos.TOP_CENTER);
            oatmeal_btn_in_pos.setAlignment(Pos.TOP_CENTER);
            pancakes_btn_in_pos.setAlignment(Pos.TOP_CENTER);
            waffles_btn_in_pos.setAlignment(Pos.TOP_CENTER);
            French_toast_btn_in_pos.setAlignment(Pos.TOP_CENTER);

*/
//////////////////////////////////////////////////////////

            VBox tablev = new VBox();
            root.add(tablev,7,4,7,7);



            Eggs_btn_in_pos.setOnAction(actionEvent -> {
                if(!foodList.contains("Eggs")) {
                    Text text2 = new Text("1");

                    text2.setFill(Color.WHITE);
                    HBox tableh = new HBox();
                    foodList.add("Eggs");
                    Text text = new Text("Eggs");
                    text.setFill(Color.WHITE);
                    //tableh.getChildren().add(text);
                    tablev.getChildren().add(tableh);

                    Button plus = new Button("+");

                    plus.setOnAction(pl -> {
                        String m = text2.getText();
                        //Integer.parseInt(m);
                        int x = Integer.parseInt(m);
                        x+=1;
                        text2.setText(String.valueOf(x));
                    });
                    Button minus = new Button("-");
                    minus.setOnAction(pl -> {
                        String m = text2.getText();
                        //Integer.parseInt(m);
                        int x = Integer.parseInt(m);
                        if(x>0){
                        x-=1;
                        text2.setText(String.valueOf(x));
                        }

                    });

                    tableh.getChildren().addAll(text, minus, text2, plus);

                    tableh.setSpacing(10);
                }


                //if(){}
            });

            French_toast_btn_in_pos.setOnAction(actionEvent -> {

                HBox tableh = new HBox();
                foodList.add("French toast");
                Text text = new Text("French toast");
                text.setFill(Color.WHITE);
                //tableh.getChildren().add(text);
                tablev.getChildren().add(tableh);




                Text text2 = new Text("1");

                Button plus = new Button("+");

                plus.setOnAction(pl -> {
                    String m = text2.getText();
                    //Integer.parseInt(m);
                    int x = Integer.parseInt(m);
                    x+=1;
                    text2.setText(String.valueOf(x));
                });
                Button minus = new Button("-");
                minus.setOnAction(pl -> {
                    String m = text2.getText();
                    //Integer.parseInt(m);
                    int x = Integer.parseInt(m);
                    if(x>0){
                        x-=1;
                        text2.setText(String.valueOf(x));
                    }

                });
                tableh.setSpacing(10);
                tableh.getChildren().addAll(text, minus, text2, plus);

                //if(){}
            });

            waffles_btn_in_pos.setOnAction(actionEvent -> {

                HBox tableh = new HBox();
                foodList.add("Waffles");
                Text text = new Text("Waffles");
                text.setFill(Color.WHITE);
                //tableh.getChildren().add(text);
                tablev.getChildren().add(tableh);


                Text text2 = new Text("1");

                Button plus = new Button("+");

                plus.setOnAction(pl -> {
                    String m = text2.getText();
                    //Integer.parseInt(m);
                    int x = Integer.parseInt(m);
                    x+=1;
                    text2.setText(String.valueOf(x));
                });
                Button minus = new Button("-");
                minus.setOnAction(pl -> {
                    String m = text2.getText();
                    //Integer.parseInt(m);
                    int x = Integer.parseInt(m);
                    if(x>0){
                        x-=1;
                        text2.setText(String.valueOf(x));
                    }

                });
                tableh.setSpacing(10);
                tableh.getChildren().addAll(text, minus, text2, plus);

            });

            pancakes_btn_in_pos.setOnAction(actionEvent -> {

                HBox tableh = new HBox();
                foodList.add("Pancakes");
                Text text = new Text("Pancakes");
                text.setFill(Color.WHITE);
                //tableh.getChildren().add(text);
                tablev.getChildren().add(tableh);

                Text text2 = new Text("1");

                Button plus = new Button("+");

                plus.setOnAction(pl -> {
                    String m = text2.getText();
                    //Integer.parseInt(m);
                    int x = Integer.parseInt(m);
                    x+=1;
                    text2.setText(String.valueOf(x));
                });
                Button minus = new Button("-");
                minus.setOnAction(pl -> {
                    String m = text2.getText();
                    //Integer.parseInt(m);
                    int x = Integer.parseInt(m);
                    if(x>0){
                        x-=1;
                        text2.setText(String.valueOf(x));
                    }

                });
                tableh.setSpacing(10);
                tableh.getChildren().addAll(text, minus, text2, plus);

                //if(){}
            });

            oatmeal_btn_in_pos.setOnAction(actionEvent -> {

                HBox tableh = new HBox();
                foodList.add("Oat Meal");
                Text text = new Text("Oat Meal");
                text.setFill(Color.WHITE);
                //tableh.getChildren().add(text);
                tablev.getChildren().add(tableh);


                Text text2 = new Text("1");

                Button plus = new Button("+");

                plus.setOnAction(pl -> {
                    String m = text2.getText();
                    //Integer.parseInt(m);
                    int x = Integer.parseInt(m);
                    x+=1;
                    text2.setText(String.valueOf(x));
                });
                Button minus = new Button("-");
                minus.setOnAction(pl -> {
                    String m = text2.getText();
                    //Integer.parseInt(m);
                    int x = Integer.parseInt(m);
                    if(x>0){
                        x-=1;
                        text2.setText(String.valueOf(x));
                    }

                });
                tableh.setSpacing(10);
                tableh.getChildren().addAll(text, minus, text2, plus);

                //if(){}
            });
            Cereal_btn_in_pos.setOnAction(actionEvent -> {

                HBox tableh = new HBox();
                foodList.add("Cereal");
                Text text = new Text("Cereal");
                text.setFill(Color.WHITE);
                //tableh.getChildren().add(text);
                tablev.getChildren().add(tableh);

                Text text2 = new Text("1");

                Button plus = new Button("+");

                plus.setOnAction(pl -> {
                    String m = text2.getText();
                    //Integer.parseInt(m);
                    int x = Integer.parseInt(m);
                    x+=1;
                    text2.setText(String.valueOf(x));
                });
                Button minus = new Button("-");
                minus.setOnAction(pl -> {
                    String m = text2.getText();
                    //Integer.parseInt(m);
                    int x = Integer.parseInt(m);
                    if(x>0){
                        x-=1;
                        text2.setText(String.valueOf(x));
                    }

                });
                tableh.setSpacing(10);
                tableh.getChildren().addAll(text, minus, text2, plus);
            });

        });


        Salad_btn_in_pos.setOnAction(e->{
            Button Eggs_btn_in_pos = new Button("Raita");
            Button French_toast_btn_in_pos = new Button("Sweet Yoghurt");
            Button waffles_btn_in_pos = new Button("Russian Salad");
            Button pancakes_btn_in_pos = new Button("Special Raita");
            Button oatmeal_btn_in_pos = new Button("Mix Raita");
            Button Cereal_btn_in_pos = new Button("Res special Raita");
            root.add(Eggs_btn_in_pos,3,3);
            root.add(French_toast_btn_in_pos,4,3);
            root.add(waffles_btn_in_pos,5,3);
            root.add(pancakes_btn_in_pos,3,4);
            root.add(oatmeal_btn_in_pos,4,4);
            root.add(Cereal_btn_in_pos,5,4);
            Eggs_btn_in_pos.setMinWidth(200);
            Eggs_btn_in_pos.setMinHeight(120);
            French_toast_btn_in_pos.setMinWidth(200);
            French_toast_btn_in_pos.setMinHeight(120);
            waffles_btn_in_pos.setMinWidth(200);
            waffles_btn_in_pos.setMinHeight(120);
            pancakes_btn_in_pos.setMinWidth(200);
            pancakes_btn_in_pos.setMinHeight(120);
            oatmeal_btn_in_pos.setMinWidth(200);
            oatmeal_btn_in_pos.setMinHeight(120);
            Cereal_btn_in_pos.setMinWidth(200);
            Cereal_btn_in_pos.setMinHeight(120);




        });

        Cakes_btn_in_pos.setOnAction(e->{
            Button Eggs_btn_in_pos = new Button("Chocolate");
            Button French_toast_btn_in_pos = new Button("Cream");
            Button waffles_btn_in_pos = new Button("Brownie");
            Button pancakes_btn_in_pos = new Button("Cheese cake");
            Button oatmeal_btn_in_pos = new Button("Oatmeal");
            Button Cereal_btn_in_pos = new Button("Cereal");
            root.add(Eggs_btn_in_pos,3,3);
            root.add(French_toast_btn_in_pos,4,3);
            root.add(waffles_btn_in_pos,5,3);
            root.add(pancakes_btn_in_pos,3,4);
            root.add(oatmeal_btn_in_pos,4,4);
            root.add(Cereal_btn_in_pos,5,4);

            Eggs_btn_in_pos.setMinWidth(200);
            Eggs_btn_in_pos.setMinHeight(120);

            French_toast_btn_in_pos.setMinWidth(200);
            French_toast_btn_in_pos.setMinHeight(120);

            waffles_btn_in_pos.setMinWidth(200);
            waffles_btn_in_pos.setMinHeight(120);

            pancakes_btn_in_pos.setMinWidth(200);
            pancakes_btn_in_pos.setMinHeight(120);

            oatmeal_btn_in_pos.setMinWidth(200);
            oatmeal_btn_in_pos.setMinHeight(120);

            Cereal_btn_in_pos.setMinWidth(200);
            Cereal_btn_in_pos.setMinHeight(120);




        });

        Appetizer_btn_in_pos.setOnAction(e->{
            Button Eggs_btn_in_pos = new Button("Eggs");
            Button French_toast_btn_in_pos = new Button("French toast");
            Button waffles_btn_in_pos = new Button("Waffles");
            Button pancakes_btn_in_pos = new Button("Pancakes");
            Button oatmeal_btn_in_pos = new Button("Oatmeal");
            Button Cereal_btn_in_pos = new Button("Cereal");
            root.add(Eggs_btn_in_pos,3,3);
            root.add(French_toast_btn_in_pos,4,3);
            root.add(waffles_btn_in_pos,5,3);
            root.add(pancakes_btn_in_pos,3,4);
            root.add(oatmeal_btn_in_pos,4,4);
            root.add(Cereal_btn_in_pos,5,4);

            Eggs_btn_in_pos.setMinWidth(200);
            Eggs_btn_in_pos.setMinHeight(120);

            French_toast_btn_in_pos.setMinWidth(200);
            French_toast_btn_in_pos.setMinHeight(120);

            waffles_btn_in_pos.setMinWidth(200);
            waffles_btn_in_pos.setMinHeight(120);

            pancakes_btn_in_pos.setMinWidth(200);
            pancakes_btn_in_pos.setMinHeight(120);

            oatmeal_btn_in_pos.setMinWidth(200);
            oatmeal_btn_in_pos.setMinHeight(120);

            Cereal_btn_in_pos.setMinWidth(200);
            Cereal_btn_in_pos.setMinHeight(120);




        });


        Healthy_Menu_btn_in_pos.setOnAction(e->{
            Button Eggs_btn_in_pos = new Button("Eggs");
            Button French_toast_btn_in_pos = new Button("French toast");
            Button waffles_btn_in_pos = new Button("Waffles");
            Button pancakes_btn_in_pos = new Button("Pancakes");
            Button oatmeal_btn_in_pos = new Button("Oatmeal");
            Button Cereal_btn_in_pos = new Button("Cereal");
            root.add(Eggs_btn_in_pos,3,3);
            root.add(French_toast_btn_in_pos,4,3);
            root.add(waffles_btn_in_pos,5,3);
            root.add(pancakes_btn_in_pos,3,4);
            root.add(oatmeal_btn_in_pos,4,4);
            root.add(Cereal_btn_in_pos,5,4);

            Eggs_btn_in_pos.setMinWidth(200);
            Eggs_btn_in_pos.setMinHeight(120);

            French_toast_btn_in_pos.setMinWidth(200);
            French_toast_btn_in_pos.setMinHeight(120);

            waffles_btn_in_pos.setMinWidth(200);
            waffles_btn_in_pos.setMinHeight(120);

            pancakes_btn_in_pos.setMinWidth(200);
            pancakes_btn_in_pos.setMinHeight(120);

            oatmeal_btn_in_pos.setMinWidth(200);
            oatmeal_btn_in_pos.setMinHeight(120);

            Cereal_btn_in_pos.setMinWidth(200);
            Cereal_btn_in_pos.setMinHeight(120);




        });
        Pasta_btn_in_pos.setOnAction(e->{
            Button Eggs_btn_in_pos = new Button("Eggs");
            Button French_toast_btn_in_pos = new Button("French toast");
            Button waffles_btn_in_pos = new Button("Waffles");
            Button pancakes_btn_in_pos = new Button("Pancakes");
            Button oatmeal_btn_in_pos = new Button("Oatmeal");
            Button Cereal_btn_in_pos = new Button("Cereal");
            root.add(Eggs_btn_in_pos,3,3);
            root.add(French_toast_btn_in_pos,4,3);
            root.add(waffles_btn_in_pos,5,3);
            root.add(pancakes_btn_in_pos,3,4);
            root.add(oatmeal_btn_in_pos,4,4);
            root.add(Cereal_btn_in_pos,5,4);
            Eggs_btn_in_pos.setMinWidth(200);
            Eggs_btn_in_pos.setMinHeight(120);
            French_toast_btn_in_pos.setMinWidth(200);
            French_toast_btn_in_pos.setMinHeight(120);
            waffles_btn_in_pos.setMinWidth(200);
            waffles_btn_in_pos.setMinHeight(120);
            pancakes_btn_in_pos.setMinWidth(200);
            pancakes_btn_in_pos.setMinHeight(120);
            oatmeal_btn_in_pos.setMinWidth(200);
            oatmeal_btn_in_pos.setMinHeight(120);
            Cereal_btn_in_pos.setMinWidth(200);
            Cereal_btn_in_pos.setMinHeight(120);
        });

        MainDish_btn_in_pos.setOnAction(e->{
            Button Eggs_btn_in_pos = new Button("Eggs");
            Button French_toast_btn_in_pos = new Button("French toast");
            Button waffles_btn_in_pos = new Button("Waffles");
            Button pancakes_btn_in_pos = new Button("Pancakes");
            Button oatmeal_btn_in_pos = new Button("Oatmeal");
            Button Cereal_btn_in_pos = new Button("Cereal");
            root.add(Eggs_btn_in_pos,3,3);
            root.add(French_toast_btn_in_pos,4,3);
            root.add(waffles_btn_in_pos,5,3);
            root.add(pancakes_btn_in_pos,3,4);
            root.add(oatmeal_btn_in_pos,4,4);
            root.add(Cereal_btn_in_pos,5,4);
            Eggs_btn_in_pos.setMinWidth(200);
            Eggs_btn_in_pos.setMinHeight(120);
            French_toast_btn_in_pos.setMinWidth(200);
            French_toast_btn_in_pos.setMinHeight(120);
            waffles_btn_in_pos.setMinWidth(200);
            waffles_btn_in_pos.setMinHeight(120);
            pancakes_btn_in_pos.setMinWidth(200);
            pancakes_btn_in_pos.setMinHeight(120);
            oatmeal_btn_in_pos.setMinWidth(200);
            oatmeal_btn_in_pos.setMinHeight(120);
            Cereal_btn_in_pos.setMinWidth(200);
            Cereal_btn_in_pos.setMinHeight(120);
        });

        Pizza_btn_in_pos.setOnAction(e->{
            Button Eggs_btn_in_pos = new Button("Eggs");
            Button French_toast_btn_in_pos = new Button("French toast");
            Button waffles_btn_in_pos = new Button("Waffles");
            Button pancakes_btn_in_pos = new Button("Pancakes");
            Button oatmeal_btn_in_pos = new Button("Oatmeal");
            Button Cereal_btn_in_pos = new Button("Cereal");
            root.add(Eggs_btn_in_pos,3,3);
            root.add(French_toast_btn_in_pos,4,3);
            root.add(waffles_btn_in_pos,5,3);
            root.add(pancakes_btn_in_pos,3,4);
            root.add(oatmeal_btn_in_pos,4,4);
            root.add(Cereal_btn_in_pos,5,4);
            Eggs_btn_in_pos.setMinWidth(200);
            Eggs_btn_in_pos.setMinHeight(120);
            French_toast_btn_in_pos.setMinWidth(200);
            French_toast_btn_in_pos.setMinHeight(120);
            waffles_btn_in_pos.setMinWidth(200);
            waffles_btn_in_pos.setMinHeight(120);
            pancakes_btn_in_pos.setMinWidth(200);
            pancakes_btn_in_pos.setMinHeight(120);
            oatmeal_btn_in_pos.setMinWidth(200);
            oatmeal_btn_in_pos.setMinHeight(120);
            Cereal_btn_in_pos.setMinWidth(200);
            Cereal_btn_in_pos.setMinHeight(120);
        });

        Soup_btn_in_pos.setOnAction(e->{
            Button Eggs_btn_in_pos = new Button("Eggs");
            Button French_toast_btn_in_pos = new Button("French toast");
            Button waffles_btn_in_pos = new Button("Waffles");
            Button pancakes_btn_in_pos = new Button("Pancakes");
            Button oatmeal_btn_in_pos = new Button("Oatmeal");
            Button Cereal_btn_in_pos = new Button("Cereal");
            root.add(Eggs_btn_in_pos,3,3);
            root.add(French_toast_btn_in_pos,4,3);
            root.add(waffles_btn_in_pos,5,3);
            root.add(pancakes_btn_in_pos,3,4);
            root.add(oatmeal_btn_in_pos,4,4);
            root.add(Cereal_btn_in_pos,5,4);
            Eggs_btn_in_pos.setMinWidth(200);
            Eggs_btn_in_pos.setMinHeight(120);
            French_toast_btn_in_pos.setMinWidth(200);
            French_toast_btn_in_pos.setMinHeight(120);
            waffles_btn_in_pos.setMinWidth(200);
            waffles_btn_in_pos.setMinHeight(120);
            pancakes_btn_in_pos.setMinWidth(200);
            pancakes_btn_in_pos.setMinHeight(120);
            oatmeal_btn_in_pos.setMinWidth(200);
            oatmeal_btn_in_pos.setMinHeight(120);
            Cereal_btn_in_pos.setMinWidth(200);
            Cereal_btn_in_pos.setMinHeight(120);
        });

        ChildrenMenu_btn_in_pos.setOnAction(e->{
            Button Eggs_btn_in_pos = new Button("Eggs");
            Button French_toast_btn_in_pos = new Button("French toast");
            Button waffles_btn_in_pos = new Button("Waffles");
            Button pancakes_btn_in_pos = new Button("Pancakes");
            Button oatmeal_btn_in_pos = new Button("Oatmeal");
            Button Cereal_btn_in_pos = new Button("Cereal");
            root.add(Eggs_btn_in_pos,3,3);
            root.add(French_toast_btn_in_pos,4,3);
            root.add(waffles_btn_in_pos,5,3);
            root.add(pancakes_btn_in_pos,3,4);
            root.add(oatmeal_btn_in_pos,4,4);
            root.add(Cereal_btn_in_pos,5,4);
            Eggs_btn_in_pos.setMinWidth(200);
            Eggs_btn_in_pos.setMinHeight(120);
            French_toast_btn_in_pos.setMinWidth(200);
            French_toast_btn_in_pos.setMinHeight(120);
            waffles_btn_in_pos.setMinWidth(200);
            waffles_btn_in_pos.setMinHeight(120);
            pancakes_btn_in_pos.setMinWidth(200);
            pancakes_btn_in_pos.setMinHeight(120);
            oatmeal_btn_in_pos.setMinWidth(200);
            oatmeal_btn_in_pos.setMinHeight(120);
            Cereal_btn_in_pos.setMinWidth(200);
            Cereal_btn_in_pos.setMinHeight(120);
        });

        Drinks_btn_in_pos.setOnAction(e->{
            Button Eggs_btn_in_pos = new Button("Eggs");
            Button French_toast_btn_in_pos = new Button("French toast");
            Button waffles_btn_in_pos = new Button("Waffles");
            Button pancakes_btn_in_pos = new Button("Pancakes");
            Button oatmeal_btn_in_pos = new Button("Oatmeal");
            Button Cereal_btn_in_pos = new Button("Cereal");
            root.add(Eggs_btn_in_pos,3,3);
            root.add(French_toast_btn_in_pos,4,3);
            root.add(waffles_btn_in_pos,5,3);
            root.add(pancakes_btn_in_pos,3,4);
            root.add(oatmeal_btn_in_pos,4,4);
            root.add(Cereal_btn_in_pos,5,4);
            Eggs_btn_in_pos.setMinWidth(200);
            Eggs_btn_in_pos.setMinHeight(120);
            French_toast_btn_in_pos.setMinWidth(200);
            French_toast_btn_in_pos.setMinHeight(120);
            waffles_btn_in_pos.setMinWidth(200);
            waffles_btn_in_pos.setMinHeight(120);
            pancakes_btn_in_pos.setMinWidth(200);
            pancakes_btn_in_pos.setMinHeight(120);
            oatmeal_btn_in_pos.setMinWidth(200);
            oatmeal_btn_in_pos.setMinHeight(120);
            Cereal_btn_in_pos.setMinWidth(200);
            Cereal_btn_in_pos.setMinHeight(120);
        });







        Menu_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: #828282;");

        Orders_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: #828282;");


        Tables_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: #828282;");


        More_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: #828282;");


        Breakfast_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: #828282;");

        Salad_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: #828282;");
        Cakes_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: #828282;");
        Appetizer_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: #828282;");
        Healthy_Menu_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: #828282;");
        Pasta_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: #828282;");
        MainDish_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: #828282;");
        Pizza_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: #828282;");
        Soup_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: #828282;");
        ChildrenMenu_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: #828282;");

        Drinks_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: #828282;");
        backbtn.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: gold;");


        Pay.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: gold;");
        Discount_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: gold;");
        Order_text.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: gold;");


        Cashier_btn.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: gold;");
        Takeaway_type_btn_in_pos.setStyle("-fx-border-color: transparent;\n" +
                "    -fx-border-width: 0;\n" +
                "    -fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;\n" +
                "    -fx-font-family:\"Segoe UI\", Helvetica, Arial, sans-serif;\n" +
                "    -fx-font-size: 1em; /* 12 */\n" +
                "    -fx-text-fill: gold;");
        return POS;
    }


    public static void Dishes(){

    }
}
   /* Text Order_text = new Text("Order");
    Text Cashier_btn = new Text("Order");
    Button Takeaway_type_btn_in_pos = new Button();
    Button Discount_btn_in_pos = new Button("Disc");
*/
