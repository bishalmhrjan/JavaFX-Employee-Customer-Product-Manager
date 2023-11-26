package com.example.diyashop.controller.admin;

import com.example.diyashop.DiyaShopException;
import com.example.diyashop.model.DatabaseDriver;
import com.example.diyashop.model.finance.PeriodTime;
import com.example.diyashop.model.productstype.ProductEnum;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ProductController implements Initializable {


    @FXML
    public  ChoiceBox<PeriodTime> timePeriod;



    public TextField maxDiscountPercent;
    @FXML
    private TextField buyingPrice;
    @FXML
    private TextField noOfStocks;
    @FXML
    private TextField targetPrice;
    @FXML
    private Button addProduct;



    @FXML
    private ChoiceBox<ProductEnum> productName;
    @FXML
    private ChoiceBox<ProductEnum.ProductType> productType;




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


    public ChoiceBox<ProductEnum> getProductName() {
        return productName;
    }

    public ChoiceBox<ProductEnum.ProductType> getProductType() {
        return productType;

    }
    public TextField getMaxDiscountPercent() {
        return maxDiscountPercent;
    }
    public ChoiceBox<PeriodTime> getTimePeriod() {
        return timePeriod;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.getProductName().setItems(FXCollections.observableArrayList(ProductEnum.JACKET, ProductEnum.T_SHIRT, ProductEnum.SWEATER,
                ProductEnum.BAG, ProductEnum.PURSE, ProductEnum.CERAMICS, ProductEnum.SHOES, ProductEnum.SLIPPERS, ProductEnum.TOYS, ProductEnum.PAPER_ITEMS,
                ProductEnum.SCHWALS, ProductEnum.SOAP, ProductEnum.TEE, ProductEnum.METAL, ProductEnum.POTTERY, ProductEnum.EAR_RINGS, ProductEnum.NECKLACE));
        this.getProductName().valueProperty().addListener(e -> setProductType(getProductName().getValue()));
        this.getProductName().setValue(ProductEnum.T_SHIRT);
        this.getProductType().setValue(ProductEnum.ProductType.GOD);
        this.getTimePeriod().setItems(FXCollections.observableArrayList(PeriodTime.SIX_MONTH_AGO,PeriodTime.THREE_MONTH_AGO,PeriodTime.ONE_MONTH_AGO,
                PeriodTime.ONE_WEEK_AGO,PeriodTime.YESTERDAY,PeriodTime.TODAY));
        this.getTimePeriod().setValue(PeriodTime.TODAY);
        this.getAddProduct().setOnAction(e-> {
            try {
                saveInDataBase();
            } catch (SQLException | DiyaShopException ex) {
                throw new RuntimeException(ex);
            }
        });
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


    private void saveInDataBase() throws SQLException, NumberFormatException, DiyaShopException {

        if (isValid(getNoOfStocks().getText().toString()) && isValid(getBuyingPrice().getText().toString()) && isValid(getTargetPrice().getText().toString()) && isValid(getMaxDiscountPercent().getText().toString())) {
            new DatabaseDriver().addProduct(getProductName().getValue(), getProductType().getValue(), Integer.parseInt(getNoOfStocks().getText().toString()),
                    Double.parseDouble(getBuyingPrice().getText().toString()), Double.parseDouble(getTargetPrice().getText().toString()), Double.parseDouble(getMaxDiscountPercent().getText().toString()), getTimePeriod().getValue());
            getNoOfStocks().setText("");
            getBuyingPrice().setText("");
            getTargetPrice().setText("");
            getMaxDiscountPercent().setText("");
        } else {
            throw new DiyaShopException("Either number is  negative, non-number or empty textfield.");

        }



    }


    //4 Textfield compare, valid int or double and non negative,
    //target price must be greater than buying price and non empty
    //
    //update, delete,create garxa


    public boolean isValid(String string) {
        if (string.length() != 0 && !string.contains("") && string != null) {
            if ((Integer.parseInt(string) > 0) || (Double.parseDouble(string) > 0)) {
                return true;

            }
        }
        return false;
    }
}
