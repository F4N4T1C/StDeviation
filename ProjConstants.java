package com.company;

/**
 * Created by Robert Hubert on 21/02/2018.
 */
public final class ProjConstants {

    // ---------*---------*---------*---------*---------*
    // Integer Constants

    public static final int INVALID = -1;
    public static final int MAXDATA = 2000;


    // PRIVATE //

    // ---------*---------*---------*---------*---------*---------*---------*---------*
    // The caller references the constants using ProjConstants.MAXDATA,
    // and so on. So we prevent the caller should be prevented from constructing objects of
    // this class, by declaring this private constructor.
    //
    private ProjConstants(){
        //this prevents even the native class from calling this constructor as well
        throw new AssertionError();
    }


}
