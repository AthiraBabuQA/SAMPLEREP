package testngpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class guru {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize()	;			
	}
	@Test
	public void test()
	{
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement drag2=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));	
		WebElement drop2=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		WebElement drag3=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement drop3=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement drag4=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement drop4=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		a.dragAndDrop(drag2, drop2).perform();
		a.dragAndDrop(drag3, drop3).perform();
		a.dragAndDrop(drag4, drop4).perform();
		
		
		
	
		
	}

}
 