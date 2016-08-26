//*******************************************************************
// Java compiler created in PHP to quickly and safely test code.
// NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************

import java.lang.Math; // header stuff MUST go above the first class
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// our main class becomes a file but the main method is still found
public class HelloWorld
{
  public static void main(String[] args)
  {
		
   	String nombre="Eduardo";
    String email ="abc@abc.com";
    String password1= "123";
    String password2= "123";
    
    boolean state= validarTxt(nombre);
    boolean stateEmail= isEmailValid(email);
    boolean statePassword= compararCampos(password1,password2);

    
    System.out.print("	validar nombre "+state);
    System.out.print("	validar email "+stateEmail);
    System.out.print("	validar password "+statePassword);
  }
  
  private static boolean compararCampos(String txt1, String txt2){
    if(!txt1.equals(txt2)){
      return false;
    }
    return true;
  }
  private static boolean validarTxt(String txt){
    if(txt.isEmpty())
    {
      return false;
    }
    return true;
  }
  
   private static boolean isEmailValid(String email) {
        String regExpn =
                "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                        +"((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                        +"([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                        +"[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                        +"([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$";

        CharSequence inputStr = email;

        Pattern pattern = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputStr);

        if(matcher.matches())
            return true;
        else
            return false;
    }
  
  
}

