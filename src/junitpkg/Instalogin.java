package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instalogin {
ChromeDriver driver;
@Before
public void setup()
{
driver=new ChromeDriver();
driver.get("https://www.instagram.com/accounts/login/");
}
	
@Test
public void instalogin()
{
	driver.findElement(By.name("username")).sendKeys("athi");
}
	
	
	
}
