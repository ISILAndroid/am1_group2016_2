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
	MyBicycle myBicycle= new MyBicycle();
  }
}

  public class MyBicycle implements Bicycle{
    
    @Override
    public void changeCadence(int newValue){}
    
    @Override
    public void changeGear(int newValue){ }
    
    @Override
    public void speedUp(int increment){}
    
    @Override
    public void applyBrakes(int decrement){}
  }

   interface Bicycle {

      //  wheel revolutions per minute
      public void changeCadence(int newValue);

      public void changeGear(int newValue);

      public void speedUp(int increment);

      public void applyBrakes(int decrement);
  }
