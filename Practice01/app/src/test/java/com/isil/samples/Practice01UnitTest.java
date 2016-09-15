package com.isil.samples;

import com.isil.practice01.Kata;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by eduardomedina on 15/09/16.
 */
public class Practice01UnitTest {

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getResultShouldReturnNumberOfTwoDigits() {
        Kata kata= new Kata();
        Assert.assertEquals("INVALIDO", kata.getResult(9));
        Assert.assertEquals("INVALIDO", kata.getResult(99));
    }

    @Test
    public void getResultShouldReturnNumberOfThreeDigits() {
        Kata kata= new Kata();
        Assert.assertEquals("INVALIDO", kata.getResult(1000));
        Assert.assertEquals("INVALIDO", kata.getResult(400000));
    }

    @Test
    public void getResultShouldReturnDigitsOfNumber() {
        Kata kata= new Kata();
        Assert.assertEquals("9 9 9", kata.getResult(999));
        Assert.assertEquals("1 2 3", kata.getResult(123));
        Assert.assertEquals("4 5 6", kata.getResult(456));
    }
}
