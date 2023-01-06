package com.example.login;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;

public class Employee_personal_data {

    public static Scene User_Personal_data;

    public static Scene User_Personal_data() {


        BorderPane root = new BorderPane();
        Scene User_Personal_data = new Scene(root, 1600,900);





        Button Profile_button = new Button("Profile");
        Button Edit_Profile_button = new Button("Edit");
        Button Change_Password_button = new Button("Change");
        Button Back_button = new Button("Back");
        Inventory_class.Back_to_Previous_Page(Back_button);

        Profile_button.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");
        Edit_Profile_button.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");
        Change_Password_button.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");
        Back_button.setStyle(" -fx-background-radius: 9px; -fx-background-color: WHITE; ");

        VBox left = new VBox(Profile_button,Edit_Profile_button,Change_Password_button,Back_button);
        left.setSpacing(5);
        left.setMinWidth(50);

/*
        Image coverPhoto = new Image("bg_ps_3.jpg");
        ImageView coverPhotoView = new ImageView(coverPhoto);
        coverPhotoView.setFitWidth(600);
        coverPhotoView.setPreserveRatio(true);*/

        Circle profilePicture = new Circle(50, 50, 50);
        profilePicture.setFill(new ImagePattern(new Image("bg_ps_5.jpg")));

        Label First_name_Label = new Label("First Name");
        Label Last_name_Label = new Label("Last Name");
        Label Password_change_Label = new Label("Password");
        Label Email_Label = new Label("Email");
        Label Phone_number_Label = new Label("Phone Number");
        Label Cnic_Label = new Label("Cnic");
        Label Address_Label = new Label("Address");
        Label City_Label = new Label("City");
        Label Gender_Label = new Label("Gender");
        Label Language_Label = new Label("Language");
        Label Dob_Label = new Label("Date of Birth");
        Label LinkedIn_Label = new Label("Linked In");
        Label Google_Label = new Label("Google");

        TextField First_name_textField = new TextField();
        TextField Last_name_textField = new TextField();
        PasswordField Password_change_textField = new PasswordField();
        TextField Email_textField = new TextField();
        TextField Phone_number_textField = new TextField();
        TextField Cnic_textField = new TextField();
        TextField Address_textField = new TextField();
        ChoiceBox Loction_city_box = new ChoiceBox();
        ChoiceBox Language_box = new ChoiceBox();
        ChoiceBox Gender_box = new ChoiceBox();
        Gender_box.getItems().addAll("male","female","rather not say");
        root.setRight(Gender_box);


        ToggleGroup Gender_group = new ToggleGroup();

        RadioButton male = new RadioButton("Male");
        male.setToggleGroup(Gender_group);
        RadioButton female = new RadioButton("Female");
        female.setToggleGroup(Gender_group);
        RadioButton other = new RadioButton("Other");
        other.setToggleGroup(Gender_group);

        HBox radio = new HBox(male,female,other);

        TextField Language_textField = new TextField();
        TextField Dob_textField = new TextField();
        DatePicker datePicker = new DatePicker();
        TextField LinkedIn_textField= new TextField();
        TextField Google_Label_textField = new TextField();



        VBox Image_box = new VBox(profilePicture);
        GridPane gridPane = new GridPane();
        VBox grid_box = new VBox(gridPane);

        gridPane.add(First_name_Label,0,0);
        gridPane.add(First_name_textField,0,1);

        gridPane.add(Last_name_Label,1,0);
        gridPane.add(Last_name_textField,1,1);

        gridPane.add(Password_change_Label,0,2);
        gridPane.add(Password_change_textField,0,3,2,1);

        gridPane.add(Email_Label,0,4);
        gridPane.add(Email_textField,0,5,2,1);

        gridPane.add(Phone_number_Label,0,6);
        gridPane.add(Phone_number_textField,0,7,2,1);

        gridPane.add(Cnic_Label, 0,8 );
        gridPane.add(Cnic_textField, 0,9,2,1 );

        gridPane.add(Address_Label,0,10);
        gridPane.add(Address_textField,0,11,2,1);

        gridPane.add(City_Label,0,12);
        gridPane.add(Loction_city_box,0,13,2,1);

        gridPane.add(Gender_Label,0,14);
        gridPane.add(radio,0,15,2,1);

        gridPane.add(Language_Label,0,16);
        gridPane.add(Language_box,0,17,2,1);

        gridPane.add(Dob_Label,0,18);
        gridPane.add(datePicker,0,19,2,1);

        gridPane.add(LinkedIn_Label,0,20);
        gridPane.add(LinkedIn_textField,0,21,2,1);

        gridPane.add(Google_Label,0,22);
        gridPane.add(Google_Label_textField,0,23,2,1);


        VBox joint = new VBox(Image_box,grid_box);

        left.setSpacing(20);
        root.setLeft(left);
        root.setCenter(joint);






                TextField dob_text = new TextField();





                Label interests = new Label("Your Interests: ");
                CheckBox checkBox0 = new CheckBox("Java");
                checkBox0.setIndeterminate(false);
                CheckBox checkBox1 = new CheckBox("Python");
                checkBox1.setIndeterminate(false);
                Label educated = new Label("Your Education");



                ListView listView = new ListView<>();
                ObservableList data = FXCollections.observableArrayList();
                data.addAll("Intemediate", "Bachelors", "Masters", "PHD");
                listView.setItems(data);
                listView.setPrefSize(100, 10);


        Language_box.getItems().addAll("chinese");

                Language_box.getItems().addAll("Akan", "Amharic", "Arabic", "Assamese", "Awadhi", "Azerbaijani", "Balochi",
                        "Bengali", "Bhojpuri", "Burmese", "Cantonese", "Cebuano", "Chhattisgarhi", "Chittagonian", "Czech", "Deccan",
                        "Dhundhari", "Dutch", "English", "French", "Fula", "Gan Chinese", "German", "Greek", "Gujarati", "Haitian Creole",
                        "Hakka", "Hausa", "Hindi", "Hmong", "Hungarian", "Igbo", "Ilocano", "Italian", "Japanese", "Javanese", "Jin", "Kannada",
                        "Kazakh", "Khmer", "Kinyarwanda", "Kirundi", "Korean", "Kurdish", "Madurese", "Magahi", "Maithili", "Malagasy", "Malay",
                        "Malayalam", "Mandarin", "Marathi", "Marwari", "Min Bei", "Min Dong", "Min Nan", "Mossi", "Nepali", "Oriya", "Oromo",
                        "Pashto", "Persian", "Polish", "Portuguese", "Punjabi", "Quechua", "Romanian", "Russian",
                        "Saraiki", "Serbo-Croatian", "Shona", "Sindhi", "Sinhala", "Somali", "Spanish", "Sundanese", "Swahili", "Swedish", "Sylheti"
                );

                Loction_city_box.getItems().addAll("Karachi", "Lahore", "Faisalabad", "Rawalpindi", "Multan", "Hyderabad",
                        "Gujranwala", "Peshawar", "Islamabad", "Quetta", "Bahawalpur", "Sargodha", "Sialkot", "Sukkur", "Larkana",
                        "Sheikhupura", "Gujrat", "Mardan", "Kasur", "Rahim Yar Khan", "Sahiwal", "Okara", "Wah Cantonment",
                        "Dera Ghazi Khan", "Mingora", "Nawabshah", "Mirpur Khas", "Jhang", "Chiniot", "Khanewal", "Dera Ismail Khan",
                        "Turbat", "Muzaffargarh", "Burewala", "Mandi Bahauddin", "Shikarpur", "Kohat", "Abbottabad", "Toba Tek Singh",
                        "Muzaffarabad", "Charsadda", "Jacobabad", "Khanpur", "Khairpur", "Sadiqabad", "Sukkur", "Jhelum", "Vehari",
                        "Hafizabad", "Nowshera", "Attock", "Gujranwala Cantonment", "Kotri", "Kamoke", "Hub", "Daska", "Gojra",
                        "Muridke", "Jauharabad", "Layyah", "Okara Cantonment", "Dera Allah Yar", "Ferozwala", "Tando Adam",
                        "Mansehra", "Sadiqabad", "Tando Allahyar", "Tando Muhammad Khan", "Badin", "Shikarpur", "Thatta",
                        "Haveli Lakha", "Narowal", "Kot Abdul Malik", "Mandi Burewala", "Chaman", "Shahdadkot", "Swabi", "Mianwali",
                        "Pano Aqil", "Tando Muhammad Khan", "Umerkot", "Jatoi", "Bhawalnagar", "Sambrial", "Wah", "Dera Murad Jamali",
                        "Jatoi Shimali", "Naushero Feroze", "Dera Bugti", "Tando Allayar", "Loralai", "Manghopir", "Gwadar", "Turbat",
                        "Usta Muhammad", "Mian Channu", "Tharparkar", "Ghotki", "Tando Allahyar", "Dera Murad Jamali", "Mehar",
                        "Shikarpur", "Dera Allah Yar", "Kambar", "Tando Adam Khan", "Badin", "Padidan", "Jacobabad", "Kunri",
                        "Sanghar", "Naudero", "Usta Muhammad", "Nowshera Virkan", "Kandhkot", "Ghauspur", "Alipur", "Chichawatni",
                        "Kot Addu", "Ahmedpur East", "Charsadda", "Mianwali Bangla", "Tando Jan Muhammad", "Chaman", "Mansehra",
                        "Mianwali", "Chhor", "Kot Samaba", "Mirpur Sakro", "Kotli Loharan", "Bannu","Mian Channu", "Kotri",
                        "Sehwan Sharif", "Gharo", "Shahdadpur", "Nowshera Virkan", "Dokri", "Kot Mumin", "Mehar", "Thatta",
                        "Kandhkot", "Sanghar", "Shikarpur", "Matiari", "Kambar", "Kot Addu", "Mirpur Mathelo", "Thari Mirwah",
                        "Tando Ghulam Ali", "Tando Muhammad Khan", "Kot Samaba", "Kunri", "Mirpur Khas", "Dera Bugti",
                        "Tando Jan Muhammad", "Dera Murad Jamali", "Mehar", "Shikarpur", "Dera Allah Yar", "Kambar", "Tando Adam Khan",
                        "Badin", "Padidan", "Jacobabad", "Kunri", "Sanghar", "Naudero", "Usta Muhammad", "Nowshera");


        /*root.add(dob, 0, 2);
                //root.add(dob_text,1,2);
                root.add(datePicker, 1, 2);
                root.add(gender, 0, 4);
                root.add(male, 1, 4);
                root.add(female, 2, 4);
                root.add(interests, 0, 5);
                root.add(checkBox0, 1, 5);
                root.add(checkBox1, 2, 5);
                root.add(educated, 0, 7);
                root.add(listView, 1, 7);
                root.add(location, 0, 9);
                root.add(Loction_city_box, 1, 9);
        //  root.add(Gender_group,1,3);

               Tooltip tooltip = new Tooltip("Some text");
                Button upload_btn = new Button("Upload"); //can also be hyperlinked
        upload_btn.setTooltip(tooltip);
                root.add(upload_btn,
                        3,
                        3);



        root.add(button,0,10);*/
        return User_Personal_data;
    }
}

/*

        VBox root = new VBox();
        root.setAlignment(Pos.TOP_CENTER);
        root.setSpacing(20);
        root.setPadding(new Insets(20, 20, 20, 20));

        // Create the cover photo
        Image coverPhoto = new Image("bg_ps_3.jpg");
        ImageView coverPhotoView = new ImageView(coverPhoto);
        coverPhotoView.setFitWidth(600);
        coverPhotoView.setPreserveRatio(true);

        // Create the profile picture
        Circle profilePicture = new Circle(50, 50, 50);
        profilePicture.setFill(new ImagePattern(new Image("bg_ps_5.jpg")));

        // Create the user's name and location
        Label nameLabel = new Label("John Doe");
        nameLabel.setTextFill(Color.WHITE);
        nameLabel.setStyle("-fx-font-size: 24px;");
        Label locationLabel = new Label("San Francisco, CA");
        locationLabel.setTextFill(Color.WHITE);
        locationLabel.setStyle("-fx-font-size: 18px;");

        // Create the user's bio
        Label bioLabel = new Label("I'm a software developer and avid traveler. Follow my adventures around the world!");
        bioLabel.setTextFill(Color.WHITE);
        bioLabel.setWrapText(true);
        bioLabel.setStyle("-fx-font-size: 18px;");

        // Create the user's stats
        Label followersLabel = new Label("2.3k Followers");
        followersLabel.setTextFill(Color.WHITE);
        followersLabel.setStyle("-fx-font-size: 18px;");
        Label followingLabel = new Label("1.1k Following");
        followingLabel.setTextFill(Color.WHITE);
        followingLabel.setStyle("-fx-font-size: 18px;");
        Label postsLabel = new Label("35 Posts");
        postsLabel.setTextFill(Color.WHITE);
        postsLabel.setStyle("-fx-font-size: 18px;");

        // Create the follow and message buttons
        Button followButton = new Button("Follow");
        followButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000; -fx-font-size: 18px;");
        Button messageButton = new Button("Message");
        messageButton.setStyle("-fx-background-color: #ffffff; -fx-text-fill: #000000; -fx-font-size: 18px;");

        // Create the recent posts list
        ListView<String> recentPostsList = new ListView<>();
        recentPostsList.getItems().addAll("Post 1", "Post 2", "Post 3", "Post 4", "Post 5");

        // Add all the UI elements to the root container
        root.getChildren().addAll(coverPhotoView, profilePicture, nameLabel, locationLabel, bioLabel, followersLabel, followingLabel, postsLabel, followButton, messageButton, recentPostsList);
*/

// Show the user profile scene


