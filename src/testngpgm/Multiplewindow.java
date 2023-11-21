package testngpgm;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Multiplewindow {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
				
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/p/a")).click();
		 
        Set<String> windowHandles=driver.getWindowHandles();
		for (String windowHandle : windowHandles) 
		{
			driver.switchTo().window(windowHandle);
		}
	    driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abcd@gmail.com",Keys.ENTER);
	    
	}

}
