
´´´
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
    MountainBike mountainBike = new MountainBike();
    
    bike1.printStates();
    
    mountainBike.printStates();
    
  }
}

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


  public class Bicycle {

      int cadence = 0;
      int speed = 0;
      int gear = 1;

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

      public void printStates() {
           System.out.println("cadence:" +
               cadence + " speed:" + 
               speed + " gear:" + gear);
      }
  }
  
´´´
