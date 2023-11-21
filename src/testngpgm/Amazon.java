package testngpgm;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		
	
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	}
			
	@Test
	public void login()
	{
		
		
			
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles",Keys.ENTER);
	
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();


String actualTitle =driver.getTitle();
String expectedTitle = "Amazon.in : mobiles";
if(actualTitle.equals(expectedTitle))
{
	System.out.println("passed.Title is verified");
}
else
{
	System.out.println("failed");
}
        
        Set<String> windowHandles=driver.getWindowHandles();
		for (String windowHandle : windowHandles) 
		{
			driver.switchTo().window(windowHandle);
		}
	
		
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		
    	    }
	
}
