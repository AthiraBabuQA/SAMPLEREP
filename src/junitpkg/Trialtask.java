package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trialtask {
	ChromeDriver driver;
	@Before
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get("https://www.name.com/account/login");
	}
	@Test
	public void accountcreatiom()
	{
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div/a")).click();      
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Athira");
		driver.findElement(By.xpath("/*[@id=\"password\"]"));
		
		
		
		
		
		//By.xpath//*[@id="new-contact-first_name"]
	    //By.xpath//*[@id="new-contact-last_name"]
	    //*[@id="new-contact-organization"]
		//*[@id="new-contact-address1"]
		//*[@id="new-contact-address2"]
		//*[@id="new-contact-city"]
		//*[@id="new-contact-state"]
		//*[@id="new-contact-zip"]
		//*[@id="new-contact-country"]
		//*[@id="new-account"]/div[2]/div/div[1]/div/div/div/label/span
		//*[@id="new-account"]/div[2]/div/div[2]/div/div[2]/div[1]/label/span
		//*[@id="create-account"]
		
		
	}}

