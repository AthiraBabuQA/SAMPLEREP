package pkgsel;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");
    String actualtitle=driver.getTitle();
    String expected="Google";
    if(actualtitle.equals(expected))
    {
    	System.out.println("pass");
    }
    else
    {
    	System.out.println("fail"); 
    }
    
    
    
	}

}




