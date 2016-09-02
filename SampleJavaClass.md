```
//*******************************************************************
// Java compiler created in PHP to quickly and safely test code.
// NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************

import java.lang.Math; // header stuff MUST go above the first class

// our main class becomes a file but the main method is still found
public class HelloWorld
{
  public static void main(String[] args)
  {
 	 // Create two different 
    // Bicycle objects
    Bicycle bike1 = new Bicycle();
    Bicycle bike2 = new Bicycle();
    
    bike1.changeCadence(50);
    bike1.speedUp(10);
    bike1.changeGear(2);
    
    
    bike2.changeCadence(50);
    bike2.speedUp(10);
    bike2.changeGear(2);
    bike2.changeCadence(40);
    bike2.speedUp(10);
    bike2.changeGear(3);
    
    bike1.printStates();
    bike2.printStates();
  }
}


  public class Bicycle {

      int cadence = 0; //cadencia de pedaleo
      int speed = 0; //velocidad
      int gear = 1; //cambios

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
  }
```

