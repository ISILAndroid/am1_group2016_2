Fizz Buzz

Return “fizz”, “buzz” or “fizzbuzz”.

For a given natural number greater than zero return:

* “fizz” if the number is dividable by 3
* “buzz” if the number is dividable by 5
* “fizzbuzz” if the number is dividable by 15
* the same number if no other requirement is fulfilled

```

import org.junit.Assert;
import org.junit.Test;

/*
For a given natural number greater than zero return:
* "fizz" if the number is dividable by 3
* "buzz" if the number is dividable by 5
* "fizzbuzz" if the number is dividable by 15
* the same number if no other requirement is fulfilled
 */
public class FizzBuzzTest {

    @Test
    public void getResultShouldReturnFizzIfTheNumberIsDividableBy3() {
        Assert.assertEquals("fizz", FizzBuzz.getResult(3));
    }

    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy5() {
        Assert.assertEquals("buzz", FizzBuzz.getResult(5));
        Assert.assertEquals("buzz", FizzBuzz.getResult(10));
    }

    @Test
    public void getResultShouldReturnBuzzIfTheNumberIsDividableBy15() {
        Assert.assertEquals("fizzbuzz", FizzBuzz.getResult(15));
        Assert.assertEquals("fizzbuzz", FizzBuzz.getResult(30));
    }

    @Test
    public void getResultShouldReturnTheSameNumberIfNoOtherRequirementIsFulfilled() {
        Assert.assertEquals("1", FizzBuzz.getResult(1));
        Assert.assertEquals("2", FizzBuzz.getResult(2));
        Assert.assertEquals("4", FizzBuzz.getResult(4));
    }

}
```

```
public class FizzBuzz {

    public static String getResult(int number) {
        if (number % 15 == 0) return "fizzbuzz";
        else if (number % 3 == 0) return "fizz";
        else if (number % 5 == 0) return "buzz";
        return Integer.toString(number);
    }

}
```

