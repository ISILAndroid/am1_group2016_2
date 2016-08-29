# am1_group2016_2 Lesson2

Introduction to Android & App Fundamentals (S1-S3)

- Java POO (Object-Oriented Programming Concepts)
    * Objetos y Clases
   ![bicycle class](https://github.com/ISILAndroid/am1_group2016_2/blob/Lesson3/concepts-bicycleObject.gif)

   ```
   public class Bicycle {
      
      //properties
      int cadence = 0;
      int speed = 0;
      int gear = 1;
      
      //methods
      void changeCadence(int newValue) {
           cadence = newValue;
      }

      void changeGear(int newValue) {
           gear = newValue;
      }

      void speedUp(int increment) {
           speed = speed + increment;   
      }

      void applyBrakes(int decrement) {
           speed = speed - decrement;
      }

      void printStates() {
           System.out.println("cadence:" +
               cadence + " speed:" + 
               speed + " gear:" + gear);
      }
   ```
   
    * Herencia
    
    ![bicycle Herencia](https://github.com/ISILAndroid/am1_group2016_2/blob/Lesson3/concepts-bikeHierarchy1.gif)
    
    ```
    public class MountainBike extends Bicycle {

    // new fields and methods defining 
    // a mountain bike would go here

        @Override 
        public void printStates() {
                 System.out.println("MountainBike cadence:" +
                     cadence + " speed:" + 
                     speed + " gear:" + gear);
            }
      
      }
   ```
   
    * Interfaces
   ```
       interface Bicycle {
      
          //  wheel revolutions per minute
          void changeCadence(int newValue);
      
          void changeGear(int newValue);
      
          void speedUp(int increment);
      
          void applyBrakes(int decrement);
      }
   ```
   
    * Excepciones
   ```
      import java.net.MalformedURLException;
      import java.net.URL;
      
      // our main class becomes a file but the main method is still found
      public class HelloWorld
      {
        public static void main(String[] args)
        {
          String url = "ttp://blogteamtreehouse.com";
          String nurl="http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.";
          try {
              URL blogUrl = new URL(url);
      
            System.out.print("blogUrl "+blogUrl);
          }catch (MalformedURLException e) 
              {
              System.out.print("Error creating a URL object with " + url);
          }
      
      
        }
      }
   ```
   
- Ejercicios

    
References

* [https://docs.oracle.com/javase/tutorial/java/concepts/](https://docs.oracle.com/javase/tutorial/java/concepts/)

* [Java Katas](http://codekata.pragprog.com/)

* [Solución Katas](https://github.com/vfarcic/TechnologyConversationsJava)

