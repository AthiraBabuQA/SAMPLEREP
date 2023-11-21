package testngpgm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bookingdate {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.redbus.in/online-booking/ksrtc-kerala");
	}
	@Test
	public void test()
	{
		
		driver.findElement(By.xpath("//*[@id=\"txtOnwardCalendar\"]")).click();
		datepickermethod("December 2023" , "15");
		
	}
	private void datepickermethod(String expmonth, String expdate) {
		String month=driver.findElement(By.xpath("//*[@id=\"rb-month\"]")).getText();
		while(true) {
		if(month.equals(expmonth))
		{
			System.out.println("month =" +month);
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"rb-next-middle\"]")).click();
		}
		List<WebElement>alldates=driver.findElements(By.xpath("//*[@id=\"rb-calmiddle\"]/ul[2]"));
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
	
	
		
		
		
		
		
		
		
		
		
}	}















//*[@id="calendar-searchboxdatepicker"]/div/div[1]/div/div[1]/table/tbody/tr/td/span/span
//*[@id="calendar-searchboxdatepicker"]/div/div[1]/div/div[2]/table/tbody/tr/td/span