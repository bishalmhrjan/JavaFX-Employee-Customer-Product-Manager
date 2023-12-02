package com.example.diyashop;

import com.example.diyashop.model.Reciept;

import java.io.*;

public class RecieptCSVCreater {
    public static  void main(String [] args){
        String pathToFile ="D:\\PrivateProjectExercises\\DiyaShop\\src\\main\\resources\\csvData\\customer\\customer.csv";
        File file= new File(pathToFile);
        String pathToWriteFile="D:\\PrivateProjectExercises\\DiyaShop\\src\\main\\resources\\csvData\\reciept\\Reciept.csv";
        File writeToFile = new File(pathToWriteFile);
        fillRecieptCSV(file,writeToFile);
    }

    public static void fillRecieptCSV(File file,File fileToWrite){

        String line="";
        String splitBy=",";
        int count = 0;
        try{

            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileToWrite));


            while((line =reader.readLine()) != null){
                String[]customer = line.split(splitBy);
                if(customer[0].equals("first_name")){
                    continue;
                }
                if(count !=43) {
                    count++;
                    writer.write("("+Integer.toString(count));
                    writer.write(",");
                    writer.write("2080/2/15");
                    writer.write(",");
                    writer.write("'"+customer[2]+"'),"); // Assuming customer[2] contains the necessary data
                    writer.newLine();

                }  else {
                    break;
                }
            }

            writer.flush();
            writer.close();
        } catch (FileNotFoundException ex){
            System.out.println(ex.getLocalizedMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
