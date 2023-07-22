package com.example.diyashop.controller.admin;

import com.example.diyashop.model.Model;
import com.example.diyashop.model.productstype.Product;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class ProductController implements Initializable {
    @FXML
    private TextField buyingPrice;
    @FXML
    private TextField noOfStocks;
    @FXML
    private TextField targetPrice;
    @FXML
    private Button addProduct;


    @FXML
    private ChoiceBox<Product> productName;
    @FXML
    private ChoiceBox<Product.ProductType> productType;


    public TextField getBuyingPrice() {
        return buyingPrice;
    }

    public TextField getNoOfStocks() {
        return noOfStocks;
    }

    public TextField getTargetPrice() {
        return targetPrice;
    }

    public Button getAddProduct() {
        return addProduct;
    }


    public ChoiceBox<Product> getProductName() {
        return productName;
    }

    public ChoiceBox<Product.ProductType> getProductType() {
        return productType;

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.getProductName().setItems(FXCollections.observableArrayList(Product.JACKET, Product.T_SHIRT, Product.SWEATER,
                Product.BAG, Product.PURSE, Product.CERAMICS, Product.SHOES, Product.SLIPPERS, Product.TOYS, Product.PAPER_ITEMS,
                Product.SCHWALS, Product.SOAP, Product.TEE, Product.METAL, Product.POTTERY, Product.EAR_RINGS, Product.NECKLACE));
        this.getProductName().setValue(Model.getInstance().getViewFactory().getProductName());
        this.getProductName().valueProperty().addListener(e -> setProduct());
    }

    private void setProduct() {
        Model.getInstance().getViewFactory().setProduct(productName.getValue());
    }

    private void setProductType(Product productType) {
        switch (productType) {
            case JACKET ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.WOLL_SHEEP, Product.ProductType.WOLL_SHEEP, Product.ProductType.WOLL_YAK, Product.ProductType.SILK));

            case SWEATER ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.CASHMERE, Product.ProductType.COTTON, Product.ProductType.SILK, Product.ProductType.WOLL_SHEEP));

            case T_SHIRT ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.GOD, Product.ProductType.NORMAL, Product.ProductType.SYMBOL));
            case BAG ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.COTTON, Product.ProductType.SILK, Product.ProductType.LEATHER, Product.ProductType.FELT));

            case PURSE ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.COTTON, Product.ProductType.SILK, Product.ProductType.LEATHER, Product.ProductType.FELT));

            case CERAMICS ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.TEA_POTS, Product.ProductType.SAUCER_SETS, Product.ProductType.CUPS));

            case SHOES ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.PLASTIC, Product.ProductType.SANTA_COLOR, Product.ProductType.FELT));

            case SLIPPERS ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.PLASTIC, Product.ProductType.SANTA_COLOR, Product.ProductType.FELT));

            case TOYS ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.CHRISTMAS_TREE, Product.ProductType.CHRISTMAS_ITEM));

            case PAPER_ITEMS ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.GREETING_CARD_SET, Product.ProductType.NOTEBOOK, Product.ProductType.PAPER_PHOTO_FRAME));

            case SCHWALS ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.CASHMERE, Product.ProductType.PASHMINA));

            case SOAP ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.HONEY, Product.ProductType.SALT, Product.ProductType.SHAMPOO_BAR));

            case TEE ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.GREEN_TEA, Product.ProductType.BLACK_TEA));

            case METAL ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.SINGING_BOWL));

            case POTTERY ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.POT, Product.ProductType.VASE));

            case EAR_RINGS ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.COLOR_RED, Product.ProductType.COLOR_BLUE, Product.ProductType.COLOR_BLACK));

            default ->
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.COLOR_RED, Product.ProductType.COLOR_BLUE, Product.ProductType.COLOR_BLACK));

        }
        //Model.getInstance().getViewFactory().setProductType(this.productType.getValue());
    }


    //update, delete,create garxa
}
