package com.isil.practice01;

/**
 * Created by eduardomedina on 15/09/16.
 */
public class Kata {

    public final String INVALID="INVALIDO";
    public final int NUMNBER_DIGITS=3;


    public String getResult(int number){
        if(number<=99)return INVALID;
        if(number>999)return INVALID;

        String digits= printNumbers(separator(number,NUMNBER_DIGITS));
        return digits;
    }
    private  String printNumbers(String[] values)
    {
        String message="";
        for(int i=(values.length-1);i>=0;i--){
            if(i==(values.length-1)) message+=values[i];
            else message+=" "+values[i];
            System.out.print(" message "+message);
        }
        //System.out.print(" message "+message);
        return message;
    }

    private   String[] separator(int n,int total){
        String[] values = new String[total];
        int count=0;

        while(n>0){
            System.out.println(" n "+n+" n%10 "+n%10);
            values[count]= String.valueOf(n%10);
            System.out.println(" values "+values[count]);
            n=n/10;
            count++;
        }
        return values;
    }
}
