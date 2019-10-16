/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentals;

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


public class Rentals extends Application {
   
    @Override
    public void start(Stage stage) {
       Text texts=new Text("Customer");
        Text textt = new Text("Genre");
        Text textu = new Text("Movies");
        Text textv = new Text("Borrowed");
        Text textw = new Text("Returned");
       
        ComboBox ComboBoxs = new ComboBox();
        ComboBox ComboBoxt = new ComboBox();
        ComboBox ComboBoxu = new ComboBox();
        ComboBox ComboBoxv = new ComboBox();
        ComboBox ComboBoxw = new ComboBox();
       
       
        Button buttons= new Button("Save Rental");
        Button buttont = new Button("Return Movie");
       
        GridPane gridPanes = new GridPane();
       
        gridPanes.setMinSize(600,400);
       
        gridPanes.setPadding(new Insets(15,15,15,15));
       
        gridPanes.setVgap(10);
        gridPanes.setHgap(10);
       
        gridPanes.setAlignment(Pos.CENTER);
       
        gridPanes.add(texts,0,0);
      gridPanes.add(ComboBoxs,1,0);
       
        gridPanes.add(textt,0,2);
       gridPanes.add(ComboBoxt,1,2);
       
        gridPanes.add(textu,0,4);
        gridPanes.add(ComboBoxu,1,4);
        gridPanes.add(buttons,1,5);
       
         gridPanes.add(textv,0,6);
         gridPanes.add(ComboBoxv,1,6);
         gridPanes.add(buttont,1,7);
         
         gridPanes.add(textw,0,8);
       gridPanes.add(ComboBoxw,1,8);
       

       buttons.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 12 30 12 30; -fx-text-fill: white; -fx-font-size: 12px;");
        buttons.setStyle("-fx-background-color: #000000, linear-gradient(#7ebcea, #2f4b8f), linear-gradient(#426ab7, #263e75), linear-gradient(#395cab, #223768); -fx-background-insets: 0,1,2,3; -fx-background-radius: 3,2,2,2; -fx-padding: 12 30 12 30; -fx-text-fill: white; -fx-font-size: 12px;");
       
        texts.setStyle(" -fx-font: normal bold 20px 'serif'");
        textt.setStyle(" -fx-font: normal bold 20px 'serif'");
        textu.setStyle(" -fx-font: normal bold 20px 'serif'");
        textv.setStyle(" -fx-font: normal bold 20px 'serif'");
        textw.setStyle(" -fx-font: normal bold 20px 'serif'");
      gridPanes.setStyle("-fx-border-color: #000000;\n" +
                "    -fx-border-width: 2px;\n" +
                "    -fx-border-radius: 5px;\n" +
                "    -fx-border-insets: 5px;\n" +
                "    -fx-padding: 10px;\n" +
                "    -fx-spacing: 5px;\n" +
                "    -fx-background-image: url(image3.jpg);\n" +
                "    -fx-background-insets: 5px;");
        Scene scenes = new Scene(gridPanes);
       
        stage.setTitle("Rentals");
       
        stage.setScene(scenes);
       
        stage.show();
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
   
}
