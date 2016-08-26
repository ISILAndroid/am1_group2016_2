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
		
   	String nombre="";
    boolean state= validarTxt(nombre);
    
    System.out.print("	validar "+state);
  }
  
  private static boolean validarTxt(String txt){
    if(txt.isEmpty())
    {
      return false;
    }
    return true;
  }
}

