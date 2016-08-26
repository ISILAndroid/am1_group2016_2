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
	int val1 = 3;
    int val2 = 6;
    int rSumar = sumar(val1,val2);
    int rRestar= restar(val1,val2);
    int rMultiplicar= multiplicar(val1,val2);
    int rDividir= dividir(val1,val2);
    
    
    System.out.print("sumar resultado "+rSumar);
    System.out.print("\nrestar resultado "+rRestar);
    System.out.print("\nmultiplicar resultado "+rMultiplicar);
    System.out.print("\ndividir resultado "+rDividir);
    
  }
  
  private static int sumar(int op1, int op2) {
    return op1+op2;
  }
  
  private static int restar(int op1, int op2) {
        return op1-op2;
  }
  
  private static int multiplicar(int op1, int op2) {
        return op1*op2;
   }
  
  private static int dividir(int op1, int op2) {
        //TODO validar si op2!=0
        return op1/op2;
  }

}

```
