package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	ChromeDriver driver;
	@Before
	public void setup()
	{
	driver=new ChromeDriver();	
	driver.get("https://www.facebook.com/");
		
	}
	@Test
	public void facebooklogin()
	{
	driver.findElement(By.name("email")).sendKeys("athi");	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
