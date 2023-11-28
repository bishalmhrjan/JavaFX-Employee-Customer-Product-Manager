package com.example.diyashop.controller.admin;

import com.example.diyashop.DiyaShopException;
import com.example.diyashop.model.DatabaseDriver;
import com.example.diyashop.model.finance.PeriodTime;
import com.example.diyashop.model.productstype.ProductEnum;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.text.DateFormatter;
import java.net.URL;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class ProductController implements Initializable {

    @FXML
    public TextField maxDiscountPercent;
    public TextField timePeriod;
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

    public TextField getTimePeriod() {
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
        checkDatePattern();

        this.getAddProduct().setOnAction(e-> {
            try {
                saveInDataBase();
            } catch (SQLException | DiyaShopException ex) {
                throw new RuntimeException(ex);
            } catch (ParseException ex) {
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


    private void saveInDataBase() throws SQLException, NumberFormatException, DiyaShopException, ParseException {

        if (isValid(getNoOfStocks().getText().toString()) && isValid(getBuyingPrice().getText().toString()) && isValid(getTargetPrice().getText().toString()) &&   checkValidDate(getTimePeriod().getText().toString())&& isValid(getMaxDiscountPercent().getText().toString())) {
            new DatabaseDriver().addProduct(getProductName().getValue(), getProductType().getValue(), Integer.parseInt(getNoOfStocks().getText().toString()),
                    Double.parseDouble(getBuyingPrice().getText().toString()), Double.parseDouble(getTargetPrice().getText().toString()), Double.parseDouble(getMaxDiscountPercent().getText().toString()),getTimePeriod().getText().toString());




             getNoOfStocks().setText("");
            getBuyingPrice().setText("");
            getTargetPrice().setText("");
            getMaxDiscountPercent().setText("");
            getTimePeriod().setText("");
        } else {
            throw new DiyaShopException("Either number is  negative, non-number or empty textfield.");

        }



    }

     private String checkDatePattern() {

        // Add a change listener to the text property of the TextField
        timePeriod.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                // Allow only numeric characters
                String numericValue = newValue.replaceAll("[^\\d]", "");

                // Remove leading zeros
                //   numericValue = numericValue.replaceAll("^0+", "");

                // Format as "####.##.##"
                StringBuilder formattedValue = new StringBuilder();
                int length = numericValue.length();


                for (int i = 0; i < length; i++) {
                    formattedValue.append(numericValue.charAt(i));
                    if ((i == 3 || i == 5) ) {
                        formattedValue.append("-");
                    }
                    if(i==7){
                        break;
                    }
                }



                timePeriod.setText(formattedValue.toString());
            }
        });

        System.out.println("timeperiod is "+timePeriod.getText().toString());

        return timePeriod.getText().toString();
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
