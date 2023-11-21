package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathebaymob {
ChromeDriver driver;
@Before
public void setup()
{
	driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	
}
@Test
public void searchmob()
{
	driver.findElement(By.xpath("//*[@name='_nkw']")).sendKeys("Mobiles",Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"s0-53-17-6-3-4[0]-3-2-1-list\"]/li[2]/div/a/div")).click();
	driver.findElement(By.xpath("//*[@id=\"x-refine__group__0\"]/ul/li/ul/li[1]/a/span")).click();
	
}
@Test
public void title()
{
	String actualtitle=driver.getTitle();
	
	
		System.out.println(actualtitle);
		boolean logo=driver.findElement(By.xpath("//*[@id=\"gh-logo\"]")).isDisplayed();
		if(logo )
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
		{
			List<WebElement>li=driver.findElements(By.tagName("a"));
			System.out.println("total no of links = " +li.size());
			 for(WebElement element:li)
			 {
				 String link=element.getAttribute("href");
				 String text=element.getText();
				 System.out.println(link+"------" +text);
						 
			 }
			

		        
		        for (WebElement link : li) {
		            String href = link.getAttribute("href");
		            if (href != null && !href.isEmpty()) {
		                System.out.println("Link: " + href + " is clickable");
		            } else {
		                System.out.println("Link with text: " + link.getText() + " is not clickable");
		            }
		        }

		        
		        driver.quit();
	
}

}}