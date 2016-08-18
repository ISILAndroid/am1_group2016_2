

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
  6. Operators
  
     ![operators](https://github.com/ISILAndroid/am1_group2016_2/blob/Lesson1/java_operators.png)

  7. Expressions, Statements, and Blocks
  8. Control Flow Statements
      ```
        class IfElseDemo {
    public static void main(String[] args) {

        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
          }
      }
      ```
  9. The switch Statement
    ```
      public class SwitchDemo {
        public static void main(String[] args) {
     
            int month = 8;
            String monthString;
            switch (month) {
                case 1:  monthString = "January";
                         break;
                case 2:  monthString = "February";
                         break;
                case 3:  monthString = "March";
                         break;
                case 4:  monthString = "April";
                         break;
                case 5:  monthString = "May";
                         break;
                case 6:  monthString = "June";
                         break;
                case 7:  monthString = "July";
                         break;
                case 8:  monthString = "August";
                         break;
                case 9:  monthString = "September";
                         break;
                case 10: monthString = "October";
                         break;
                case 11: monthString = "November";
                         break;
                case 12: monthString = "December";
                         break;
                default: monthString = "Invalid month";
                         break;
            }
            System.out.println(monthString);
        }
    }
    ```
    
  10. The while and do-while Statements
    ```
      class DoWhileDemo {
          public static void main(String[] args){
              int count = 1;
              do {
                  System.out.println("Count is: " + count);
                  count++;
              } while (count < 11);
          }
      }
    ```
  11. The for Statement
  
    ```
      class ForDemo {
          public static void main(String[] args){
               for(int i=1; i<11; i++){
                    System.out.println("Count is: " + i);
               }
          }
      }
    ```
  
References :
  - [https://google.github.io/styleguide/javaguide.html](https://google.github.io/styleguide/javaguide.html)
  - [https://docs.oracle.com/javase/tutorial/index.html](https://docs.oracle.com/javase/tutorial/index.html)
