package testngpgm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bookingpgm {
	ChromeDriver driver;
	   @BeforeTest
	   public void setup()
	   {
		   driver=new ChromeDriver();
		   driver.get("https://www.booking.com/");	
		   driver.manage().window().maximize();
		   driver.navigate().refresh();
	
	
	   }
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div/button[1]")).click();
		datepickermethod("November 2023","11");
	}
	private void datepickermethod(String expmonth, String expdate) {
		String month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
		while(true)
		{
		if(month.equals(expmonth))
		{
			System.out.println("month =" +month);
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button[2]")).click();
		}
		List<WebElement>alldates=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
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
