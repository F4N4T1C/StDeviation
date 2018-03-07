package com.company;

// ---------*---------*---------*---------*
// The use of static imports is something that should be used carefully.
// I have only ever used this technique for the project wide constants.
//
import javax.swing.*;

import static com.company.ProjConstants.*;
import java.math.*;
/**
 * Created by Robert Hubert on 21/02/2018.
 */
public class StDeviation {


    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // As discussed in class we are using a class populated with Project Constants to
    // ensure help manage the project data. This ensures that each class can access the
    // constant values, but in the event that a change is needed/required that this will
    // only need to be made in one location, or file.
    //
    // Notice: If I had not done the "static import com.company.ProjConstants.*;" then
    //         the use of the constant would have been written as:
    //
    //         private int[] Data = new int[ProjConstants.MAXDATA];
    //
    private int[] Data = new int[MAXDATA];
    private double[] aVariance = new double[MAXDATA];
    private int itemCounter = 0;
    //Gumbo is purely to agitate Mr. Hubert



    private double StDeviation = 0;

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method will take a new data item and add it into the 1 Dimensional
    // Array of data values to be used later.
    //
    // You MUST write this method and I will use it during testing
    //
    public void addNewDataItem(int dataItem){
        // Takes info passed on and adds it to the array
        Data[itemCounter] = dataItem;
        itemCounter++;
        //System.out.println(dataItem);(for debugging)

    }

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method will return the total number of data items currently stored
    //
    // You MUST write this method and I will use it during testing
    //
    public int getNumberOfDataItems(){
        // The counter I made already does this so I just return it


        return itemCounter;
    }

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method returns a double precision value which is the average of all
    // of the data values
    //
    // You MUST write this method and I will use it during testing
    //
    public double calcAverage(){
        int gumbo;
        int average;
        gumbo = 0;
        for(int x=0;x<itemCounter;x++){
            gumbo += Data[x];
        }

        average = gumbo/itemCounter;

        //System.out.println("AVERAGE:"+ average);
        return average;
    }

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method returns a double precision value which is the Variance of all
    // of the data values
    //
    // You MUST write this method and I will use it during testing
    //
    public double calcVariance(){
        double variance = 0;
        variance = 0;
        for(int y=0;y<itemCounter;y++){
            aVariance[y] = (Data[y] - calcAverage())*(Data[y] - calcAverage());
        }
        for(int z=0;z<itemCounter;z++){
            variance += aVariance[z];
        }
            variance = variance/itemCounter;
        //System.out.println(variance);

        return variance;
    }
    public double calcVarianceF(){
        double variance = 0;
        for(int y=0;y<itemCounter;y++){
            aVariance[y] = (Data[y] - calcAverage())*(Data[y] - calcAverage());
        }
        for(int z=0;z<itemCounter;z++){
            variance += aVariance[z];
        }
        variance = variance/itemCounter;
        //System.out.println(variance);
        return variance;
    }


    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The following method returns a double precision value which is the Standard
    // Deviation of all of the data values
    //
    // You MUST write this method and I will use it during testing
    //
    public double calcStandardDeviation(){

        StDeviation = Math.sqrt(calcVariance());

        return StDeviation;
    }

}
