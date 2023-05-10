package com.example.diyashop;

import com.example.diyashop.model.Model;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.ArrayList;

public class App extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Model.getInstance().getViewFactory().showLogInWindow();
    }
}
