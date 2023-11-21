package testngpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		
	
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/upload/");
	}
			
	@Test
	public void upload()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\user\\Documents");	
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
		WebElement button=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
		String buttontext=button.getText();
		String expectedbuttontext="Submit";
		if(buttontext.equals(expectedbuttontext)) {
			System.out.println("Button text is correct");
		}
		else
		{
			System.out.println("Incorrect button text");
		}
	}
	
	  

}
