package com.example.diyashop.controller.admin;

import com.example.diyashop.DiyaShopException;
import com.example.diyashop.model.DatabaseDriver;
import com.example.diyashop.model.productstype.ProductEnum;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

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
    @FXML public TableView listOfItems;
    @FXML public TableColumn productNameColumn;
    @FXML public TableColumn productTypeColumn;
    @FXML public TableColumn price;
    @FXML public TableColumn noOfItems;
    @FXML public TableColumn totalPriceOfSingleProduct;



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
        return listOfItems;
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


    private void copyInTableView() throws SQLException, NumberFormatException, DiyaShopException, ParseException {




            getNoOfStocks().setText("");
            getSellUnitPrice().setText("");
            getNoOfStocks().setText("");
            getTotal().setText("");




    }





    private     boolean checkValidDate(String date) throws DiyaShopException {


        String year= ""+date.charAt(0)+date.charAt(1)+date.charAt(2)+date.charAt(3);
        String month =""+date.charAt(5)+date.charAt(6);
        String day=""+date.charAt(8)+date.charAt(9);

        int yearInt = Integer.parseInt(year);
        int monthInt = Integer.parseInt(month);
        int dayInt = Integer.parseInt(day);


        if(Integer.parseInt(year)>=2080&&Integer.parseInt(year)<2100&&
                Integer.parseInt(month)>=1&&Integer.parseInt(month)<=12
                &&Integer.parseInt(day)>=1&&Integer.parseInt(day)<=32){
            return true;
        }

        throw new DiyaShopException("invalid date");
    }

    //4 Textfield compare, valid int or double and non negative,
    //target price must be greater than buying price and non empty
    //
    //update, delete,create garxa


    public boolean isValid(String string) {
        if (string.length() != 0 && !string.contains(" ") && string != null) {
            if ((Integer.parseInt(string) > 0) || (Double.parseDouble(string) > 0)) {
                return true;

            }
        }
        return false;
    }

}
