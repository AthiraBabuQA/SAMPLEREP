package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Fbcreatepage;

public class Fbcreatepagetest {

	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	}
	
@Test
public void createtest()
{
	Fbcreatepage ob=new Fbcreatepage(driver);
	ob.createpageclick();
	ob.getstartbutton();
	
}
	
}
