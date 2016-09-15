package com.isil.samples;

/**
 * Created by Profesor on 01/09/2016.
 */
public class FizzBuzz {

    public static String getResult(int number) {
        if (number % 15 == 0) return "fizzbuzz";
        else if (number % 3 == 0) return "fizz";
        else if (number % 5 == 0) return "buzz";
        return Integer.toString(number);
    }

}
