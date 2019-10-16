/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Librarysystem extends Application {
   
    @Override
    public void start(Stage stage1) {
       Text texta=new Text("Name");
        Text textb = new Text("Registered");
        TextField textfielda = new TextField();
        TextField textfieldb = new TextField();
        ComboBox ComboBoxa = new ComboBox();
        TextField textFielda=new TextField();
        ComboBox comboBoxa=new ComboBox();
       

        Button buttona= new Button("Save");
        Button buttonb = new Button("Remove");
        Button buttonc = new Button("Next Page!");
        Button buttond = new Button("Customers-Home");
       
       
        GridPane gridPane2 = new GridPane();
       
        gridPane2.setMinSize(600,400);
       
        gridPane2.setPadding(new Insets(15,15,15,15));
       
        gridPane2.setVgap(10);
        gridPane2.setHgap(10);
       
        gridPane2.setAlignment(Pos.CENTER);
       
        gridPane2.add(texta,0,0);
        gridPane2.add(textFielda,1,0);
        gridPane2.add(buttona,1,1);
       
        gridPane2.add(textb,0,2);
        gridPane2.add(comboBoxa,1,2);
       
        gridPane2.add(buttonb,1,3);
       
        gridPane2.add(buttonc,2,0);
        gridPane2.add(buttond,2,3);
 
       
       buttona.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 7 15 7 15; -fx-text-fill: white; -fx-font-size: 12px;");
        buttonb.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 7 15 7 15; -fx-text-fill: white; -fx-font-size: 12px;");
        buttonc.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 7 15 7 15; -fx-text-fill: white; -fx-font-size: 12px;");
        buttond.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 7 15 7 15; -fx-text-fill: white; -fx-font-size: 12px;");
       
        texta.setStyle(" -fx-font: normal bold 20px 'serif'");
        textb.setStyle(" -fx-font: normal bold 20px 'serif'");
     gridPane2.setStyle("-fx-border-color: #000000;\n" +
                "    -fx-border-width: 3px;\n" +
                "    -fx-border-radius: 5px;\n" +
                "    -fx-border-insets: 5px;\n" +
                "    -fx-padding: 10px;\n" +
                "    -fx-spacing: 5px;\n" +
                "    -fx-background-image: url(image2.jpeg);\n" +
                "    -fx-background-insets: 5px;");
       
        Scene scene2 = new Scene(gridPane2);
       
        stage1.setTitle("Movie Library System");
       
        stage1.setScene(scene2);
       
        stage1.show();
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
   
}

