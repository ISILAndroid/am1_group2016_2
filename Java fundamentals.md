

## Java Fundamentals

  1. Comments
  
  ```
    a. /** comment */
    
    b. /* comment */
    
    c. /* comment
    
    d. // comment
    
  ```
  2. Hello World!
  
    ```
    /** 
     * The HelloWorldApp class implements an application that
     * simply prints "Hello World!" to standard output.
     */
    class HelloWorldApp {
        public static void main(String[] args) {
            System.out.println("Hello World!"); // Display the string.
        }
    }
    ```
    
  3. Variables
    ```
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    ```
  4. Primitives
      * byte (0)
      * short (0)
      * int (0)
      * long (0)
      * float (0.0f)
      * double (0.0)
      * boolean (false)
      * char ('\u0000')
      * String (null)
      
  5. Samples
    ```
      boolean result = true;
      char capitalC = 'C';
      byte b = 100;
      short s = 10000;
      int i = 100000;

      // The number 26, in decimal
      int decVal = 26;
      //  The number 26, in hexadecimal
      int hexVal = 0x1a;
      // The number 26, in binary
      int binVal = 0b11010;
      
      double d1 = 123.4;
      // same value as d1, but in scientific notation
      double d2 = 1.234e2;
      float f1  = 123.4f;
    ```
  5. Arrays
      ```
        class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
          }
      } 
      ```
      
      ```
        // declares an array of integers
        int[] anArray;
        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans;
        char[] anArrayOfChars;
        String[] anArrayOfStrings;
      ```
      
      ```
        // create an array of integers
        anArray = new int[10];
        anArray[0] = 100; // initialize first element
        anArray[1] = 200; // initialize second element
        anArray[2] = 300; // and so forth
      ```
      
      ```
        int[] anArray = { 
            100, 200, 300,
            400, 500, 600, 
            700, 800, 900, 1000
        };
      ```
  6. 
  
References :
  - [https://google.github.io/styleguide/javaguide.html](https://google.github.io/styleguide/javaguide.html)
