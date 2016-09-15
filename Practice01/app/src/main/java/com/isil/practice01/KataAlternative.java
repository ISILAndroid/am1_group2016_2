package com.isil.practice01;

/**
 * Created by eduardomedina on 15/09/16.
 */
public class KataAlternative {

    public final String INVALID="INVALIDO";

    public  String getResult(int number){
        int  m;
        int  d;
        int  u;

        if(number>99 && number <10000){
            m= number/100;
            d= number/10-m*10;
            u=number -(m*100+d*10);
            return " "+m+" "+d+" "+u;
        }
        return INVALID;
    }
}
