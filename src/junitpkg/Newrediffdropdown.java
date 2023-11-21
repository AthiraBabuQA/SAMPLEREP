package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newrediffdropdown {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Athira");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("qwert");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"radio_login\"]")).sendKeys("qwert.636");
		driver.findElement(By.xpath("//*[@id=\"newpasswd\"]")).sendKeys("qwer@123");
		driver.findElement(By.xpath("//*[@id=\"newpasswd1\"]")).sendKeys("qwer@123");
		driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("zser@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("8797898769");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]")).sendKeys("02");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]")).sendKeys("JAN");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]")).sendKeys("2000");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"country\"]")).sendKeys("India");
		driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select")).sendKeys("Cochin");
		driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select")).sendKeys("xys");
		driver.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[6]/td[3]/input")).sendKeys("usha");
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[32]/td[3]/input")).sendKeys("BMMX");
		driver.findElement(By.xpath("//*[@id=\"Register\"]")).click();
		
		}
	@Test
	public void countofdate()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
