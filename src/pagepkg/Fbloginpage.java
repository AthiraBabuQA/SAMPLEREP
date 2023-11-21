package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbloginpage {
WebDriver driver;
By fbemail=By.id("email");
By fbpasssword=By.id("pass");
By login=By.name("login");




public Fbloginpage(WebDriver driver)
{
	this.driver=driver;
}


public void setvalues(String email, String password)
{
    driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpasssword).sendKeys(password);
}
	
	public void login() 
	{
	driver.findElement(login).click();	
	}
	
	
}
