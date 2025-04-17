package com.example.diyashop.view;

import com.example.diyashop.model.productstype.ProductEnum;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CommonViewFactory {
    private final String RECIEPT_ANCHORPANE= "/fxml/otherfxml/Reciept.fxml";
    private final String SEARCH_PRODUCT_ANCHORPANE= "/fxml/otherfxml/SearchProduct.fxml";
    private final String ANMELDUNG_DIALOG= "/fxml/otherfxml/Anmelde.fxml";
    private final String ADD_PRODUCT_ANCHORPANE= "/fxml/otherfxml/AddProduct.fxml";
    private final String STATE_OF_PRODUCTS_ANCHORPANE= "/fxml/otherfxml/StateOfProducts.fxml";
    private final String COMMON_ANCHORPANE= "/fxml/otherfxml/Employee.fxml";

    private final String CREATE_ACCOUNT= "/fxml/otherfxml/CreateAccount.fxml";

    private final String ADMIN_DIALOG= "/fxml/admin/Admin.fxml";
    private final String COMPANY_NAME="Diya Hastakala";
    //Admin views

    private  AnchorPane addProductAnchorPane;
    private  AnchorPane recieptAnchorPane;
    private  AnchorPane searchAnchorPane;
    private  AnchorPane stateOfProductsAnchorPane;
    private AccountType accountType;
    private final ObjectProperty<EmployeeOptionView> commonOptionViewObjectProperty;
    private final ObjectProperty<AdminOptionView> adminOptionViewObjectProperty;
    private ProductEnum productEnum;
    private ProductEnum productEnumType;





    public CommonViewFactory(){
        this.accountType= AccountType.EMPLOYEE;
         this.commonOptionViewObjectProperty = new SimpleObjectProperty<>();
        this.adminOptionViewObjectProperty = new SimpleObjectProperty<>();
    }

    public ObjectProperty<EmployeeOptionView> getWorkerOptionViewObjectProperty() {
        return commonOptionViewObjectProperty;
    }

    public AccountType getAccountType() {

        return accountType;
    }



    public ObjectProperty<AdminOptionView> getAdminSelectedMenuItem() {
        return adminOptionViewObjectProperty;
    }
    public AnchorPane getRecieptAnchorPane() {

        if(this.recieptAnchorPane==null){
            try{
                this.recieptAnchorPane = new FXMLLoader(getClass().getResource(RECIEPT_ANCHORPANE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return recieptAnchorPane;
    }

    public AnchorPane getSearchAnchorPane() {
        if(this.searchAnchorPane==null){
            try{
                this.searchAnchorPane = new FXMLLoader(getClass().getResource(SEARCH_PRODUCT_ANCHORPANE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return searchAnchorPane;
    }


    public void showLogInWindow() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(ANMELDUNG_DIALOG));
        createStage(loader);

    }

    public AnchorPane getAddProductAnchorPane() {
        if(this.addProductAnchorPane==null){
            try{
                this.addProductAnchorPane = new FXMLLoader(getClass().getResource(ADD_PRODUCT_ANCHORPANE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return addProductAnchorPane;
    }

    public AnchorPane getStateOfProductsAnchorPane() {
        if(this.stateOfProductsAnchorPane==null){
            try{
                this.stateOfProductsAnchorPane = new FXMLLoader(getClass().getResource(STATE_OF_PRODUCTS_ANCHORPANE)).load();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stateOfProductsAnchorPane;
    }

    private void createStage(FXMLLoader loader) {
        Scene scene = null;
        try{
              scene = new Scene(loader.load());
         } catch (Exception e){
            e.printStackTrace();
        }

        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle(COMPANY_NAME);
        stage.show();
    }

    public void showAdminWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource(ADMIN_DIALOG));


        createStage(loader);
    }

    public void showWorkerWindow(){
        FXMLLoader loader = new FXMLLoader(getClass().getResource(COMMON_ANCHORPANE));


        createStage(loader);
    }

    public void createAccount() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(CREATE_ACCOUNT));


        createStage(loader);
    }

    public void setLogInAccountType(AccountType value) {
        this.accountType = value;
    }
    public  void closeStage(Stage stage){
        stage.close();
    }

    public ProductEnum getProductName() {

        return productEnum;
    }

    public void setProduct(ProductEnum productEnum) {

            this.productEnum = productEnum;

    }

    public void setProductType(ProductEnum value) {
        this.productEnumType = productEnumType;
    }


}
