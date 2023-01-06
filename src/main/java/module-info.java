module com.example.login {
    requires javafx.controls;
    requires javafx.fxml;
    requires firebase.admin;
    requires com.google.auth.oauth2;
    requires com.google.auth;
    requires java.annotation;
    requires google.cloud.firestore;
    requires com.google.api.apicommon;
    requires google.cloud.core;
    //requires spring.context;


    opens com.example.login to javafx.fxml;
    exports com.example.login;
    exports com.example.login.Firebase;
    opens com.example.login.Firebase to javafx.fxml;
}