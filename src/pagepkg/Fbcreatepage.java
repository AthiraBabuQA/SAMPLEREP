package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbcreatepage {
		WebDriver driver;
		By createpage=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
        By getstarted=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button");
        
        public Fbcreatepage(WebDriver driver)
        {
        	this.driver=driver;
        }
        
        
        public void createpageclick()
        {
        	driver.findElement(createpage).click();
        }
        public void getstartbutton()
        {
        	driver.findElement(getstarted).click();
        	driver.findElement(getstarted).getText();
        }
}