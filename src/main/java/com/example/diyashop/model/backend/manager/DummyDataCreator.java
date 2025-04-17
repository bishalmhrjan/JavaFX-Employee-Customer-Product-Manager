package com.example.diyashop.model.backend.manager;

import com.example.diyashop.controller.admin.Worker;
import com.example.diyashop.model.backend.FilialeShop;
import com.example.diyashop.model.backend.helperClasses.DummyName;
import org.hibernate.jdbc.Work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DummyDataCreator {
   static Map<String, String> ids= new HashMap<>();

    public static void main(String[] args) {
        WorkerManager workerManager = new WorkerManager();
        DummyDataCreator creator = new DummyDataCreator();
        /*int size = creator.createWorkers().length;
        Worker[] workers = creator.createWorkers();

        for(int i =0;i<size;i++){
            workerManager.save(workers[i]);

        Worker worker = new Worker("bishal","Maharjan",false,new FilialeShop(DummyName.GermanCity.KARLSRUHE.toString()));
        System.out.println("id of worker is "+worker.getWorkerId());
        //workerManager.save(worker); }*/
       FilialeShop [] filialeShops= creator.saveAllFilialeShop();
       /// System.out.println("filialeshops size is "+filialeShops.length);

            System.out.println(ids);


    }

    public FilialeShop[] saveAllFilialeShop(){
        FilialeShopManager filialeShopManager = new FilialeShopManager();
        FilialeShop [] filialeShops = new FilialeShop[DummyName.GermanCity.values().length];
         for( int i = 0;i<19;i++){
            filialeShops[i]= new FilialeShop(DummyName.GermanCity.values()[i].toString());
            ids.put(filialeShops[i].getFilialeID(),filialeShops[i].getCityName());
            System.out.println("Processing: " + DummyName.GermanCity.values()[i].toString());
             filialeShopManager.save(filialeShops[i]);
         }

        return filialeShops;
    }
/*
    public Worker[] createWorkers(){

        Worker [] workers = new Worker[1000];

        for(int i =0;i<1000;i++){
            int randomNumber = (int) (Math.random() *2);
          //  workers[i] = new Worker("","",false,createFilialeShop());

            workers[i].setFirstName(randomNumber%2==0?createFemalName().toString():createMaleName().toString());
            workers[i].setLastName(createLastName().toString());
            workers[i].setAdminRight(i%37==0?true:false);
           // workers[i].setFilialeShop(createFilialeShop());
        }

        return  workers;
    }

    public DummyName.FirstNameFemale createFemalName(){
        int maxNumber = DummyName.FirstNameFemale.values().length-1;
        int randomNumber = (int) (Math.random() *maxNumber) ;
        return   DummyName.FirstNameFemale.values()[randomNumber];
    }

    public DummyName.FirstNameMale createMaleName(){
        int maxNumber = DummyName.FirstNameMale.values().length-1;
        int randomNumber = (int) (Math.random() *maxNumber) ;
        return   DummyName.FirstNameMale.values()[randomNumber];
    }
    public DummyName.GermanCity createGermanCityName(){
        int maxNumber = DummyName.GermanCity.values().length-1;
        int randomNumber = (int) (Math.random() *maxNumber) ;
        return   DummyName.GermanCity.values()[randomNumber];
    }
    public DummyName.LastName createLastName(){
        int maxNumber = DummyName.LastName.values().length-1;
        int randomNumber = (int) (Math.random() *maxNumber) ;
        return   DummyName.LastName.values()[randomNumber];
    }

    //Filiale --> Customer --> Reciept --> Product--> Reciept Item*/

}
