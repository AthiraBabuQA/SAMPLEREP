package testngpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class booking1 {
	
	WebDriver driver;
	@BeforeTest
	public void setup()throws Exception
	{
		 ChromeOptions options =new ChromeOptions();
		 options.addArguments("--disable-notifications");
		 driver=new ChromeDriver(options);
		
		 driver.manage().window().maximize();
	}

	@Test
	public void test()
	{
		 driver.get("https://www.booking.com/");	
	     driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]")).click();  //*[@id="indexsearch"]/div[2]/div/form/div[1]/div[2]/div
	}
	
	

}
