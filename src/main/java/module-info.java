module com.example.diyashop {



    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    opens com.example.diyashop to javafx.fxml;
    exports com.example.diyashop;
    exports com.example.diyashop.controller;
    opens com.example.diyashop.controller to javafx.fxml;
}