module com.example.diyashop {



    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.example.diyashop to javafx.fxml;
    exports com.example.diyashop;
    exports com.example.diyashop.controller;
    exports com.example.diyashop.controller.admin;
    exports com.example.diyashop.controller.worker;
    exports com.example.diyashop.model.productstype;
    exports com.example.diyashop.model;
    exports com.example.diyashop.view;
   opens com.example.diyashop.controller to javafx.fxml;
   opens com.example.diyashop.controller.admin to javafx.fxml;
   opens com.example.diyashop.controller.worker to javafx.fxml;
}