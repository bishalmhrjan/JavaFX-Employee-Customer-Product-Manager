package com.example.diyashop;


import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

import java.util.function.UnaryOperator;

public class Test extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField formattedTextField = new TextField();

        // Add a change listener to the text property of the TextField
        formattedTextField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                // Allow only numeric characters
                String numericValue = newValue.replaceAll("[^\\d]", "");

                // Remove leading zeros
             //   numericValue = numericValue.replaceAll("^0+", "");

                // Format as "####.##.##"
                StringBuilder formattedValue = new StringBuilder();
                int length = numericValue.length();


                for (int i = 0; i < length; i++) {
                    formattedValue.append(numericValue.charAt(i));
                    if ((i == 3 || i == 5) ) {
                        formattedValue.append("-");
                    }
                    if(i==7){
                        break;
                    }
                }



                formattedTextField.setText(formattedValue.toString());
            }
        });

        Scene scene = new Scene(formattedTextField, 300, 100);

        primaryStage.setTitle("Dynamic Formatting Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}