package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	
@Test
	public void check()
	{
		
		
		 
		
			boolean button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).isEnabled();
			if(button )
			{
				System.out.println("Check availabilitu button is enabled");
			}
			else
			{
				System.out.println(" not enabled");
			}
	
	
	
	}
}
