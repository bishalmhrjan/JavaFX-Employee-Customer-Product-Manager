package com.example.diyashop.view;

import javafx.scene.layout.Pane;

public class AdminViewFactory extends CommonViewFactory{
    private  Pane   customerManagementPane;
    private  Pane   employeeManagementPane;
    private  Pane   productManagementPane;

    private final String PRODUCT_MANAGEMENT = "/fxml/otherfxml/ProductManagement.fxml";
    private final String CUSTOMER_MANAGEMENT = "/fxml/otherfxml/AdminCustomerManagement.fxml";
    private final String EMPLOYEEMANAGEMENT = "/fxml/otherfxml/AdminEmployeeManagemen.fxml";


    public Pane getProductManagementPane() {

        return  returnRequiredAnchorpane(productManagementPane, PRODUCT_MANAGEMENT);
    }
    public Pane getCustomerManagementPane() {

        return returnRequiredAnchorpane(customerManagementPane,CUSTOMER_MANAGEMENT);

    }
    public Pane getEmployeeManagementPane() {

        return returnRequiredAnchorpane(employeeManagementPane,EMPLOYEEMANAGEMENT);

    }


    public String getPRODUCT_MANAGEMENT() {
        return PRODUCT_MANAGEMENT;
    }

    public String getCUSTOMER_MANAGEMENT() {
        return CUSTOMER_MANAGEMENT;
    }

    public String getEMPLOYEEMANAGEMENT() {
        return EMPLOYEEMANAGEMENT;
    }
}
