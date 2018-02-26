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
            fileName = JOptionPane.showInputDialog("Enter the name of the file");
            System.out.println(fileName);
            File f = new File(fileName+".txt");
            Scanner s = new Scanner(f);
            for(int i = 0;i<MAXDATA;i++){
                if(s.hasNextInt()){
                    calcSDev.addNewDataItem(s.nextInt());


                }
            }
            s.close();
            calcSDev.calcStandardDeviation();





        }catch(Exception e){
            System.out.println("What have you done D:");
            e.printStackTrace();
        }




    }
}