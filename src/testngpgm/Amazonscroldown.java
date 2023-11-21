package testngpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonscroldown {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		
	
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	}
	@Test
	public void test() {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,350)","");
		driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[2]/a")).click();
	}

}
