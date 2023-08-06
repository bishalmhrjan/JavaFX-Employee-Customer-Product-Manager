package com.example.diyashop.controller.admin;

import com.example.diyashop.DiyaShopException;
import com.example.diyashop.model.DatabaseDriver;
import com.example.diyashop.model.finance.PeriodTime;
import com.example.diyashop.model.productstype.Product;
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
    public TextField getMaxDiscountPercent() {
        return maxDiscountPercent;
    }
    public ChoiceBox<PeriodTime> getTimePeriod() {
        return timePeriod;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.getProductName().setItems(FXCollections.observableArrayList(Product.JACKET, Product.T_SHIRT, Product.SWEATER,
                Product.BAG, Product.PURSE, Product.CERAMICS, Product.SHOES, Product.SLIPPERS, Product.TOYS, Product.PAPER_ITEMS,
                Product.SCHWALS, Product.SOAP, Product.TEE, Product.METAL, Product.POTTERY, Product.EAR_RINGS, Product.NECKLACE));
        this.getProductName().valueProperty().addListener(e -> setProductType(getProductName().getValue()));
        this.getProductName().setValue(Product.T_SHIRT);
        this.getProductType().setValue(Product.ProductType.GOD);
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



    private void setProductType(Product productType) {
        switch (productType) {
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
                    this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.COLOR_RED, Product.ProductType.COLOR_BLUE, Product.ProductType.COLOR_BLACK));

        }
        //Model.getInstance().getViewFactory().setProductType(this.productType.getValue());
    }


    private void setJacketType() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.WOLL_SHEEP, Product.ProductType.WOLL_SHEEP, Product.ProductType.WOLL_YAK, Product.ProductType.SILK));
        this.getProductType().setValue(Product.ProductType.WOLL_SHEEP);
    }

    private void setSweaterType() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.CASHMERE, Product.ProductType.COTTON, Product.ProductType.SILK, Product.ProductType.WOLL_SHEEP));
        this.getProductType().setValue(Product.ProductType.CASHMERE);

    }

    private void setTShirtType() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.GOD, Product.ProductType.NORMAL, Product.ProductType.SYMBOL));
        this.getProductType().setValue(Product.ProductType.GOD);
    }

    private void setBagType() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.COTTON, Product.ProductType.SILK, Product.ProductType.LEATHER, Product.ProductType.FELT));

        this.getProductType().setValue(Product.ProductType.COTTON);
    }

    private void setPurseType() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.COTTON, Product.ProductType.SILK, Product.ProductType.LEATHER, Product.ProductType.FELT));

        this.getProductType().setValue(Product.ProductType.COTTON);

    }

    private void setCeramics() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.TEA_POTS, Product.ProductType.SAUCER_SETS, Product.ProductType.CUPS));

        this.getProductType().setValue(Product.ProductType.TEA_POTS);

    }

    private void setShoes() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.PLASTIC, Product.ProductType.SANTA_COLOR, Product.ProductType.FELT));

        this.getProductType().setValue(Product.ProductType.FELT);

    }

    private void setSlippers() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.PLASTIC, Product.ProductType.SANTA_COLOR, Product.ProductType.FELT));

        this.getProductType().setValue(Product.ProductType.FELT);

    }

    private void setToys() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.CHRISTMAS_TREE, Product.ProductType.CHRISTMAS_ITEM));

        this.getProductType().setValue(Product.ProductType.CHRISTMAS_ITEM);

    }

    private void setPaperItems() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.GREETING_CARD_SET, Product.ProductType.NOTEBOOK, Product.ProductType.PAPER_PHOTO_FRAME));

        this.getProductType().setValue(Product.ProductType.NOTEBOOK);

    }

    private void setSchwals() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.CASHMERE, Product.ProductType.PASHMINA));

        this.getProductType().setValue(Product.ProductType.CASHMERE);

    }

    private void setSoap() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.HONEY, Product.ProductType.SALT, Product.ProductType.SHAMPOO_BAR));

        this.getProductType().setValue(Product.ProductType.HONEY);

    }

    private void setTea() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.GREEN_TEA, Product.ProductType.BLACK_TEA));

        this.getProductType().setValue(Product.ProductType.BLACK_TEA);

    }

    private void setMetal() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.SINGING_BOWL));

        this.getProductType().setValue(Product.ProductType.SINGING_BOWL);

    }

    private void setPottery() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.POT, Product.ProductType.VASE));

        this.getProductType().setValue(Product.ProductType.VASE);

    }

    private void setEarRings() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.COLOR_RED, Product.ProductType.COLOR_BLACK, Product.ProductType.COLOR_BLUE));

        this.getProductType().setValue(Product.ProductType.COLOR_BLUE);

    }

    private void setNecklace() {
        this.getProductType().setItems(FXCollections.observableArrayList(Product.ProductType.COLOR_RED, Product.ProductType.COLOR_BLACK, Product.ProductType.COLOR_BLUE));

        this.getProductType().setValue(Product.ProductType.COLOR_BLUE);

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
