/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customers;

import java.awt.Image;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Customers extends Application {
   
    @Override
    public void start(Stage stage) {
       
       Text text1=new Text("Name");
        Text text2 = new Text("Phone");
        Text text3 = new Text("Email");
        Text text4 = new Text("Registered");
       
     
        TextField textfield1 = new TextField();
        TextField textfield2 = new TextField();
        TextField textfield3 = new TextField();
       
        ComboBox ComboBox = new ComboBox();
       
        Button button1= new Button("Save Customer");
        Button button2 = new Button("Remove Customer");
        Button button3 = new Button("Next Page!");
        Button button4 = new Button("Customers-Home");
       
        GridPane gridPane1 = new GridPane();
       
        gridPane1.setMinSize(600,400);
       
        gridPane1.setPadding(new Insets(15,15,15,15));
       
        gridPane1.setVgap(10);
        gridPane1.setHgap(10);
       
        gridPane1.setAlignment(Pos.CENTER);
       
        gridPane1.add(text1,0,0);
        gridPane1.add(textfield1,1,0);
       
        gridPane1.add(text2,0,2);
        gridPane1.add(textfield2,1,2);
       
        gridPane1.add(text3,0,4);
        gridPane1.add(textfield3,1,4);
         gridPane1.add(button1,1,5);
         
        gridPane1.add(text4,0,6);
         gridPane1.add(ComboBox,1,6);
         gridPane1.add(button2,1,7);
         
         gridPane1.add(button3,2,0);
         gridPane1.add(button4,2,8);
 
        button1.setStyle("-fx-background-color: #6F4506, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 7 15 7 15; -fx-text-fill: white; -fx-font-size: 12px;");
        button2.setStyle("-fx-background-color: #6F4506, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 7 15 7 15; -fx-text-fill: white; -fx-font-size: 12px;");
        button3.setStyle("-fx-background-color: #6F4506, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 7 15 7 15; -fx-text-fill: white; -fx-font-size: 12px;");
        button4.setStyle("-fx-background-color: #6F4506, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 7 15 7 15; -fx-text-fill: white; -fx-font-size: 12px;");
       
        text1.setStyle(" -fx-font: normal bold 20px 'serif'");
        text2.setStyle(" -fx-font: normal bold 20px 'serif'");
        text3.setStyle(" -fx-font: normal bold 20px 'serif'");
        text4.setStyle(" -fx-font: normal bold 20px 'serif'");
       
       gridPane1.setStyle("-fx-border-color: #BCC0DC;\n" +
                "    -fx-border-width: 3px;\n" +
                "    -fx-border-radius: 5px;\n" +
                "    -fx-border-insets: 5px;\n" +
                "    -fx-padding: 10px;\n" +
                "    -fx-spacing: 5px;\n" +
                "    -fx-background-image: url(image.jpg);\n" +
                "    -fx-background-insets: 5px;");
       
        Scene scene1 = new Scene(gridPane1);
       
        stage.setTitle("Customers");
       
        stage.setScene(scene1);
       
        stage.show();
       
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
   
}