package com.example.diyashop.view;

import javafx.scene.layout.AnchorPane;

public class AdminViewFactory extends CommonViewFactory{
    private  AnchorPane   stateOfProductsAnchorPane;

    private final String STATE_OF_PRODUCTS_ANCHORPANE= "/fxml/otherfxml/StateOfProducts.fxml";
    public AnchorPane getStateOfProductsAnchorPane() {

        return  returnRequiredAnchorpane(stateOfProductsAnchorPane, STATE_OF_PRODUCTS_ANCHORPANE);
    }

}
