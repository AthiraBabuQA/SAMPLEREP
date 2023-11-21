package testngpgm;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebooklogin {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
	}
	
	@Parameters({"email" ,"password"})
	@Test
    
	public void login(String email,String password)
	{
		driver.findElement(By.name("email")).sendKeys("athira.com");
		driver.findElement(By.name("password")).sendKeys("ery");
		driver.findElement(By.name("login")).click();
	}

}
