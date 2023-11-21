package testngpgm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
   ChromeDriver driver;
   @BeforeTest
   public void setup()
   {
	   driver=new ChromeDriver();
	   driver.get("https://www.trivago.com");	
	   driver.manage().window().maximize();
	   
	  
   }
   @Test
   public void datepicker()
   {
       driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div/fieldset/button[1]")).click(); 
       
	
	   datepickermethod("November 2023","10");
	   datepickermethod("December 2023","4");
   }
private void datepickermethod(String expmonth, String expdate) {
	while(true)
	{
		
	
	String month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
	if(month.equals(expmonth))
	{
		System.out.println("month =" +month);
		break;
	}
	else
	{
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]")).click();
	}
	List<WebElement>alldates=driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span"));
	for(WebElement dateelement:alldates)
	{
		String date=dateelement.getText();
		if(date.equals(expdate))
		{
			dateelement.click();
			break;
		}
	}
	
	
	
	
	
}

	
	
}}
