package com.example.login.Firebase;

import com.example.login.InsideScene;
import com.example.login.Main;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.*;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.api.core.ApiFutures;
import com.google.cloud.Service;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

//@Service

public class FirebaseInitialize {
    FirebaseOptions options;
    FileInputStream serviceAccount;
    static DocumentReference documentReference;
    static ApiFuture<WriteResult> resultApiFuture;
    static  Map<String,Object> data = new HashMap<>();
    static Firestore db;
    @PostConstruct
    public void Initialize()  {



        try {
            serviceAccount = new FileInputStream("/Users/muhammad/Desktop/Final_Project/Login/serviceAccount.json");


        options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://final-project-5c1a5-default-rtdb.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);

         db = FirestoreClient.getFirestore();



            documentReference = db.collection("logincredentials").document("users");

            /*data.put("first","Alan");
            data.put("last","123");*/


             resultApiFuture =documentReference.set(data);
            System.out.println("UpdateTime : "+ resultApiFuture.get().getUpdateTime());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public static void makeUser(String username,String password,
            String manager,String cashier){
        //Map<String,Object> data = new HashMap<>();
        data.put("userName",username);
        data.put("password",password);
        data.put("manager",manager);
        data.put("cashier",cashier);

        ApiFuture<WriteResult> resultApiFuture =documentReference.set(data);
        try {
            System.out.println("UpdateTime : "+ resultApiFuture.get().getUpdateTime());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }


        System.out.println(data);

    }

    public static void accessUSer(String username,String password) throws ExecutionException, InterruptedException {
        // asynchronously retrieve all users
        ApiFuture<QuerySnapshot> query = db.collection("logincredentials").whereEqualTo("userName", username).get();
        ApiFuture<QuerySnapshot> query2pass = db.collection("logincredentials").whereEqualTo("password", password).get();
// ...
// query.get() blocks on response
     /*   QuerySnapshot querySnapshot = null;
        try {
            querySnapshot = query.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
        for (QueryDocumentSnapshot document : documents) {


            if (document.contains("userName")&&document.contains("password")) {
                System.out.println("username" + document.getString("userName"));
                System.out.println("password: " + document.getString("password"));
            }


        }*/
        if (query.get().size() == 1) {
            if (query2pass.get().size() == 1) {
                //Main.login = true;
                InsideScene.Loggedin(username,password);
            }
        }
        /*data.get(username);
        data.get(password);*/


    }
    public void  Firebase(){

    }
}
