module com.example.diyashop {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires java.desktop;
    requires kotlin.stdlib;
    requires org.kordamp.bootstrapfx.core;
    requires org.hibernate.orm.core;
    requires java.naming;
    requires java.persistence;

    // Opening packages to Hibernate for entity access
    opens com.example.diyashop.model.backend to org.hibernate.orm.core;

    // Opening packages to both Hibernate and JavaFX
    opens com.example.diyashop.controller.admin to javafx.fxml, org.hibernate.orm.core;

    // Opening packages to JavaFX for FXML access
    opens com.example.diyashop to javafx.fxml;
    opens com.example.diyashop.controller to javafx.fxml;
    opens com.example.diyashop.controller.worker to javafx.fxml;

    // Exporting packages for public access
    exports com.example.diyashop;
    exports com.example.diyashop.controller;
    exports com.example.diyashop.controller.admin;
    exports com.example.diyashop.controller.worker;
    exports com.example.diyashop.model.productstype;
    exports com.example.diyashop.model;
    exports com.example.diyashop.view;
}
