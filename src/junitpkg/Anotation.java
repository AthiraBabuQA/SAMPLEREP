package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Anotation {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
		
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("athira");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("athira@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"newsletter\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("athira");
		driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("babu");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("luminar");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("villa");
		driver.findElement(By.xpath("//*[@id=\"address2\"]")).sendKeys("villavilla");
		driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"state\"]")).sendKeys("kerala");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Punalur");
		driver.findElement(By.xpath("//*[@id=\"zipcode\"]")).sendKeys("aaa");
		driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("9879876789");
	
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("athi@123");
		WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select daydetails=new Select(day);
		List<WebElement> cl=daydetails.getOptions();
		System.out.println("day count=" +cl.size());
		daydetails.selectByIndex(2);
		//*[@id="months"]//
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select monthdetails=new Select(month);
		List<WebElement> c=monthdetails.getOptions();
		System.out.println("month count=" +c.size());
		monthdetails.selectByVisibleText("January");
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select yeardetails=new Select(year);
		List<WebElement> d=yeardetails.getOptions();
		System.out.println("year count=" +d.size());
        yeardetails.selectByValue("2020");		
		
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();
			
		
}}