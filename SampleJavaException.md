```
//*******************************************************************
// Java compiler created in PHP to quickly and safely test code.
// NOTE: please read the 'More Info' tab to the right for shortcuts.
//*******************************************************************


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
