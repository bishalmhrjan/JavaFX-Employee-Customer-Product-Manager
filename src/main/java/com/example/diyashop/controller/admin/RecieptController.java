package com.example.diyashop.controller.admin;

import com.example.diyashop.model.productstype.ProductEnum;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ResourceBundle;

public class RecieptController implements Initializable {
    @FXML public ChoiceBox<ProductEnum> productName;
    @FXML public ChoiceBox<ProductEnum.ProductType> productType;
    @FXML public TextField sellUnitPrice;
    @FXML public TextField noOfStocks;
    @FXML public TextField total;
    @FXML public Button addProduct;
    @FXML public TableView<InvoiceItem> tableView;


    @FXML public TableColumn<InvoiceItem,String> productNameColumn;
    @FXML public TableColumn<InvoiceItem,String> productTypeColumn;
    @FXML public TableColumn<InvoiceItem,Double> price;
    @FXML public TableColumn<InvoiceItem,Integer> noOfItems;
    @FXML public TableColumn<InvoiceItem,Double> totalPriceOfSingleProduct;



    public ChoiceBox<ProductEnum> getProductName() {
        return productName;
    }

    public ChoiceBox<ProductEnum.ProductType> getProductType() {
        return productType;

    }

    public TextField getSellUnitPrice() {
        return sellUnitPrice;
    }

    public TextField getNoOfStocks() {
        return noOfStocks;
    }

    public TextField getTotal() {
        return total;
    }

    public Button getAddProduct() {
        return addProduct;
    }

    public TableView getListOfItems() {
        return tableView;
    }

    public TableColumn getProductNameColumn() {
        return productNameColumn;
    }

    public TableColumn getProductTypeColumn() {
        return productTypeColumn;
    }

    public TableColumn getPrice() {
        return price;
    }

    public TableColumn getNoOfItems() {
        return noOfItems;
    }

    public TableColumn getTotalPriceOfSingleProduct() {
        return totalPriceOfSingleProduct;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.getProductName().setItems(FXCollections.observableArrayList(ProductEnum.JACKET, ProductEnum.T_SHIRT, ProductEnum.SWEATER,
                ProductEnum.BAG, ProductEnum.PURSE, ProductEnum.CERAMICS, ProductEnum.SHOES, ProductEnum.SLIPPERS, ProductEnum.TOYS, ProductEnum.PAPER_ITEMS,
                ProductEnum.SCHWALS, ProductEnum.SOAP, ProductEnum.TEE, ProductEnum.METAL, ProductEnum.POTTERY, ProductEnum.EAR_RINGS, ProductEnum.NECKLACE));
        this.getProductName().valueProperty().addListener(e -> setProductType(getProductName().getValue()));
        this.getProductName().setValue(ProductEnum.T_SHIRT);
        this.getProductType().setValue(ProductEnum.ProductType.GOD);


    productNameColumn.setCellValueFactory(new PropertyValueFactory<>("productEnum"));
    productTypeColumn.setCellValueFactory(new PropertyValueFactory<>("productType"));
    price.setCellValueFactory(new PropertyValueFactory<>("price"));
    noOfItems.setCellValueFactory(new PropertyValueFactory<>("numberOfStocks"));
    totalPriceOfSingleProduct.setCellValueFactory(new PropertyValueFactory<>("total"));
     }

     private void setProductType(ProductEnum productEnumType) {
        switch (productEnumType) {
            case JACKET -> setJacketType();

            case SWEATER -> setSweaterType();

            case T_SHIRT -> setTShirtType();
            case BAG -> setBagType();

            case PURSE -> setPurseType();

            case CERAMICS -> setCeramics();

            case SHOES -> setShoes();

            case SLIPPERS -> setSlippers();

            case TOYS -> setToys();

            case PAPER_ITEMS -> setPaperItems();

            case SCHWALS -> setSchwals();

            case SOAP -> setSoap();

            case TEE -> setTea();

            case METAL -> setMetal();

            case POTTERY -> setPottery();

            case EAR_RINGS ->setEarRings();
            case NECKLACE ->setNecklace();

            default ->
                    this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.COLOR_RED, ProductEnum.ProductType.COLOR_BLUE, ProductEnum.ProductType.COLOR_BLACK));

        }
        //Model.getInstance().getViewFactory().setProductType(this.productType.getValue());
    }

    private void setJacketType() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.WOLL_SHEEP, ProductEnum.ProductType.WOLL_SHEEP, ProductEnum.ProductType.WOLL_YAK, ProductEnum.ProductType.SILK));
        this.getProductType().setValue(ProductEnum.ProductType.WOLL_SHEEP);
    }

    private void setSweaterType() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.CASHMERE, ProductEnum.ProductType.COTTON, ProductEnum.ProductType.SILK, ProductEnum.ProductType.WOLL_SHEEP));
        this.getProductType().setValue(ProductEnum.ProductType.CASHMERE);

    }

    private void setTShirtType() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.GOD, ProductEnum.ProductType.NORMAL, ProductEnum.ProductType.SYMBOL));
        this.getProductType().setValue(ProductEnum.ProductType.GOD);
    }

    private void setBagType() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.COTTON, ProductEnum.ProductType.SILK, ProductEnum.ProductType.LEATHER, ProductEnum.ProductType.FELT));

        this.getProductType().setValue(ProductEnum.ProductType.COTTON);
    }

    private void setPurseType() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.COTTON, ProductEnum.ProductType.SILK, ProductEnum.ProductType.LEATHER, ProductEnum.ProductType.FELT));

        this.getProductType().setValue(ProductEnum.ProductType.COTTON);

    }

    private void setCeramics() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.TEA_POTS, ProductEnum.ProductType.SAUCER_SETS, ProductEnum.ProductType.CUPS));

        this.getProductType().setValue(ProductEnum.ProductType.TEA_POTS);

    }

    private void setShoes() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.PLASTIC, ProductEnum.ProductType.SANTA_COLOR, ProductEnum.ProductType.FELT));

        this.getProductType().setValue(ProductEnum.ProductType.FELT);

    }

    private void setSlippers() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.PLASTIC, ProductEnum.ProductType.SANTA_COLOR, ProductEnum.ProductType.FELT));

        this.getProductType().setValue(ProductEnum.ProductType.FELT);

    }

    private void setToys() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.CHRISTMAS_TREE, ProductEnum.ProductType.CHRISTMAS_ITEM));

        this.getProductType().setValue(ProductEnum.ProductType.CHRISTMAS_ITEM);

    }

    private void setPaperItems() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.GREETING_CARD_SET, ProductEnum.ProductType.NOTEBOOK, ProductEnum.ProductType.PAPER_PHOTO_FRAME));

        this.getProductType().setValue(ProductEnum.ProductType.NOTEBOOK);

    }

    private void setSchwals() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.CASHMERE, ProductEnum.ProductType.PASHMINA));

        this.getProductType().setValue(ProductEnum.ProductType.CASHMERE);

    }

    private void setSoap() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.HONEY, ProductEnum.ProductType.SALT, ProductEnum.ProductType.SHAMPOO_BAR));

        this.getProductType().setValue(ProductEnum.ProductType.HONEY);

    }

    private void setTea() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.GREEN_TEA, ProductEnum.ProductType.BLACK_TEA));

        this.getProductType().setValue(ProductEnum.ProductType.BLACK_TEA);

    }

    private void setMetal() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.SINGING_BOWL));

        this.getProductType().setValue(ProductEnum.ProductType.SINGING_BOWL);

    }

    private void setPottery() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.POT, ProductEnum.ProductType.VASE));

        this.getProductType().setValue(ProductEnum.ProductType.VASE);

    }

    private void setEarRings() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.COLOR_RED, ProductEnum.ProductType.COLOR_BLACK, ProductEnum.ProductType.COLOR_BLUE));

        this.getProductType().setValue(ProductEnum.ProductType.COLOR_BLUE);

    }

    private void setNecklace() {
        this.getProductType().setItems(FXCollections.observableArrayList(ProductEnum.ProductType.COLOR_RED, ProductEnum.ProductType.COLOR_BLACK, ProductEnum.ProductType.COLOR_BLUE));

        this.getProductType().setValue(ProductEnum.ProductType.COLOR_BLUE);

    }


    private void copyInTableView() throws SQLException, NumberFormatException,  ParseException {
        getNoOfStocks().setText("");
        getSellUnitPrice().setText("");
        getNoOfStocks().setText("");
        getTotal().setText("");
    }


    public TableView getTableView() {
        return tableView;
    }


    //4 Textfield compare, valid int or double and non negative,
    //target price must be greater than buying price and non empty
    //
    //update, delete,create garxa



    @FXML
    public void addInTable(ActionEvent actionEvent) {



        ProductEnum productEnum = getProductName().getValue();
        ProductEnum.ProductType productType = getProductType().getValue();
        double price =Double.parseDouble(getSellUnitPrice().getText().toString());
        int stocks = Integer.parseInt(getNoOfStocks().getText().toString());
        double total = price * stocks;

        getTableView().getItems().add(new InvoiceItem(productEnum,productType,price,stocks,total));

        getNoOfStocks().setText("");
        getSellUnitPrice().setText("");
        getTotal().setText("");
    }
}
