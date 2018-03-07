package com.company;
import javax.swing.*;
import java.io.*;
import java.util.*;
// ---------*---------*---------*---------*---------*
// The use of static imports is something that should be used carefully.
// I have only ever used this technique for the project wide constants.
//
import java.io.FileNotFoundException;

import static com.company.ProjConstants.*;

public class Main {



    public static void main(String[] args) {

        // ---------*---------*---------*---------*---------*
        // Create a new object from the StDeviation Class
        //
        StDeviation calcSDev =  new StDeviation();
        String fileName;





        try{

            fileName = JOptionPane.showInputDialog("Enter the name of the file");// takes user input

            int accuracy = Integer.parseInt(JOptionPane.showInputDialog("Enter The accuracy"));//takes in the accuracy

            File f = new File(fileName+".txt");//Opens file

            Scanner s = new Scanner(f);

            for(int i = 0;i<MAXDATA;i++){ // This adds the numbers the user has in the file into the Data array in the StDeviation class
                if(s.hasNextInt()){
                    calcSDev.addNewDataItem(s.nextInt());


                }
            }
            s.close();
            calcSDev.calcVarianceF();
            // Print lines that display the Standard deviation the mean and variance as well as 99/95/68 data
            System.out.println("===================================================================");
            System.out.printf("Standard Deviation: %."+accuracy+"f\n", calcSDev.calcStandardDeviation());
            System.out.printf("Mean: %."+accuracy+"f\n", calcSDev.calcAverage());
            System.out.printf("Variance: %."+accuracy+"f\n", calcSDev.calcVariance());
            System.out.printf("68 Percent of the data falls in between: %."+accuracy+"f",(calcSDev.calcAverage()-calcSDev.calcStandardDeviation()));
            System.out.printf(" and %."+accuracy+"f\n",(calcSDev.calcAverage()+calcSDev.calcStandardDeviation()));
            System.out.printf("95 Percent of the data falls in between: %."+accuracy+"f",(calcSDev.calcAverage()-calcSDev.calcStandardDeviation()*2));
            System.out.printf(" and %."+accuracy+"f\n",(calcSDev.calcAverage()+calcSDev.calcStandardDeviation()*2));
            System.out.printf("99 Percent of the data falls in between:  %."+accuracy+"f",(calcSDev.calcAverage()-calcSDev.calcStandardDeviation()*3));
            System.out.printf(" and %."+accuracy+"f\n",(calcSDev.calcAverage()+calcSDev.calcStandardDeviation()*3));
            System.out.println("===================================================================");





        }catch(Exception e){
            System.out.println("What have you done D:");//Yells at people who make it explode
            e.printStackTrace();
        }




    }







}