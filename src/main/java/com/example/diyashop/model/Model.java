package com.example.diyashop.model;

import com.example.diyashop.view.ViewFactory;

public class Model {

    private  static  Model model;
    private final ViewFactory viewFactory;

    private final DatabaseDriver database;



    private Model(){

        this.viewFactory = new ViewFactory();
        this.database = new DatabaseDriver();
    }



    public static synchronized Model getInstance(){

        if(model==null){
            model = new Model();
        }
        return  model;
    }


    public ViewFactory getViewFactory() {
        return viewFactory;
    }

    public DatabaseDriver getDatabase() {
        return database;
    }
}
