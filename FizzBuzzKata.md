Fizz Buzz

Return “fizz”, “buzz” or “fizzbuzz”.

For a given natural number greater than zero return:

    “fizz” if the number is dividable by 3
    “buzz” if the number is dividable by 5
    “fizzbuzz” if the number is dividable by 15
    the same number if no other requirement is fulfilled

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

