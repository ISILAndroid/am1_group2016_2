package com.isil.activities.utils;

/**
 * Created by emedinaa on 29/10/15.
 */
public class StringUtils {


    public StringUtils() {
    }

    public String first(String txt){
        if(txt ==null || txt.isEmpty())return "";
        if(txt.length()>=0) txt= txt.substring(0,1);
        return txt;
    }

    public  String firstCapitalize(String txt)
    {
        if(txt.isEmpty())return "";
        int length= txt.length();
        String first =txt.substring(0,1);
        first= first.toUpperCase();
        String capitalize= first+txt.substring(1,length);
        return capitalize;
    }
}
