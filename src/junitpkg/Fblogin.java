package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {
ChromeDriver driver;
@Before
public void setup()
{
driver=new ChromeDriver();
driver.get("https://www.google.com");
}
@Test
public void fblogin()
{
	driver.findElement(By.name("q")).sendKeys("cricket",Keys.ENTER);
}
	
}
	

  