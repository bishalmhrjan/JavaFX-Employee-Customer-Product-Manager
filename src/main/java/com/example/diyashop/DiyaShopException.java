package com.example.diyashop;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class DiyaShopException extends  Exception{

    public DiyaShopException(){


    }

    public DiyaShopException(String msg){
        super(msg);
        Stage stage = new Stage();
        Label label = new Label(msg);
        stage.setTitle("Error!");

        HBox hBox = new HBox(200);
        hBox.getChildren().add(label);

        Scene scene = new Scene(hBox);
         stage.setScene(scene);

    }

}
