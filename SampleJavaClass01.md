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
  	Bicycle bicycle= new Bicycle();
    bicycle.changeCadence(20);
    bicycle.changeGear(3);
    bicycle.speedUp(20);
    bicycle.printStates();
    
    Bicycle bicycle1= new Bicycle();
    bicycle1.printStates();
    
    Bicycle bicycle2= new Bicycle(10,20,2);
    bicycle2.printStates();
    
    Bicycle bicycle3= new Bicycle(10);
    bicycle3.printStates();
    
  }
}

//Class Bicycle
public class Bicycle
{
     private int cadence = 0; //cadencia de pedaleo
     private int speed = 0; //velocidad
     private int gear = 1; //cambios
  
  	//Constructor	
  	public void Bicycle(){
  	}
  
    public void Bicycle(int cadence, int speed, int gear){
      this.cadence= cadence;
      this.speed= speed;
      this.gear= gear;
  	}
  
   	public void Bicycle(int cadence){
      this.cadence= cadence;
  	}
  
     public void changeCadence(int newValue) {
           cadence = newValue;}

     public  void changeGear(int newValue) {
           gear = newValue;}

     public void speedUp(int increment) {
           speed = speed + increment;   }

     void applyBrakes(int decrement) {
           speed = speed - decrement;
     }
  
     public void printStates() {
           System.out.println("cadence:" +
               cadence + " speed:" + 
               speed + " gear:" + gear);}

}
