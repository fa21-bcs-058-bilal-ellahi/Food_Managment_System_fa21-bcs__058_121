package com.example.login;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import static com.example.login.POS_2.*;

/*
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;*/

public class Print_Receipt {
    public static Scene Receipt;

    public static void getPrint_Receipt(){
        Stage stage = new Stage();
        Group root = new Group();
        Scene Receipt = new Scene(root,300,600);
        stage.setResizable(false);


        System.out.println(list);

        TextArea textArea = new TextArea();
        //textArea.setMaxSize(300,600);
        textArea.setMinWidth(300);
        textArea.setMinHeight(700);


        textArea.setText("                       Food block Restaurant\n");
        textArea.setText(textArea.getText()+"                       549/ King Road,\n");
        textArea.setText(textArea.getText()+"                        Seol, Korea\n");
        textArea.setText(textArea.getText()+"                       +92 434398578\n");
        textArea.setText(textArea.getText()+"------------------------------------------\n");
        textArea.setText(textArea.getText()+table.getColumns().get(0).getText()+"\n");
        textArea.setText(textArea.getText()+"    \tName\t\t\t\tQty\t\tPrice\n\n");
        //table.getColumns().get(0).setText(String.valueOf(i));


        for (int i =0 ;i<list.size() ;i++){
            textArea.setText(textArea.getText()+list.get(i));
            }



        textArea.setText(textArea.getText()+"\n------------------------------------------\n");
        textArea.setText(textArea.getText()+" Sub Total: \t\t\t\t "+total_field.getText()+"\n");
        textArea.setText(textArea.getText()+" Cash:      \t\t\t\t   "+Cash_field.getText()+"\n");
        textArea.setText(textArea.getText()+" Balance:   \t\t\t\t "+Balance_field.getText()+"\n");
        textArea.setText(textArea.getText()+"------------------------------------------\n");
        textArea.setText(textArea.getText()+"Thanks for Shopping with us\n");
        textArea.setText(textArea.getText()+"------------------------------------------\n");

        textArea.setText(textArea.getText()+"Software by fa21-bcs-058 and 121\n");
        root.getChildren().add(0,textArea);

/*        String text = textArea.getText();

        PDFont font =  PDType1Font.HELVETICA_BOLD ;
        PDDocument doc    = new PDDocument();
        PDPage page = new PDPage();
        PDPageContentStream content;
        try {
            content = new PDPageContentStream(doc, page);
            content.beginText();
            content.moveTextPositionByAmount(300, 400);
            content.setFont(font, 40);
            content.drawString(textarea.getText());

            content.endText();
            content.close();
            doc.addPage(page);
            doc.save("example.pdf");
        } catch (IOException ex) {
            System.Logger.getLogger(JavaFXApplication5.class.getName()).log(System.Logger.Level.SEVERE, null, ex);
        }*/


        stage.setScene(Receipt);
        stage.show();

    }
}
