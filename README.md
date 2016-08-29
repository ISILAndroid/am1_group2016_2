# am1_group2016_2 Lesson2

Introduction to Android & App Fundamentals (S1-S3)

- Java POO (Object-Oriented Programming Concepts)
    * Objetos y Clases
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
    * Interfaces
    * Excepciones

- Ejercicios

    
References

* [https://docs.oracle.com/javase/tutorial/java/concepts/](https://docs.oracle.com/javase/tutorial/java/concepts/)

* [Java Katas](http://codekata.pragprog.com/)

* [Solución Katas](https://github.com/vfarcic/TechnologyConversationsJava)

