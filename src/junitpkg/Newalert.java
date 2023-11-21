package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newalert {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/user/Documents/file.html");
	}
	@Test
	public void action()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		org.openqa.selenium.Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println(alerttext);
		a.accept();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("acd");
		driver.findElement(By.xpath("//input[@name='Lastname']")).sendKeys("uio");
        
}
	
	}
