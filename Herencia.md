//*******************************************************************
// NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************

import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
		MontainBike montainBike= new MontainBike();
    montainBike.printStates();    	
  }
}
public class MontainBike extends Bicycle
{
  public MontainBike(){
  	this.cadence= 10;
    this.speed= 20;
     System.out.println("MontainBike cadence "+this.cadence);
  }
  
  @Override 
  public void printStates() {
    //super.printStates();
    System.out.println("printStates MontainBike");
  }
}

public class Bicycle {

  //properties
  protected int cadence = 0;
  protected int speed = 0;
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

  protected void printStates() {
       System.out.println("cadence:" +
           cadence + " speed:" + 
           speed + " gear:" + gear);
  }
}
