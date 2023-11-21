package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {
	
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	
@Test
	public void check()
	{
		
		
		 
		
			boolean logo=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
			if(logo )
			{
				System.out.println("radio button for male is selected");
			}
			else
			{
				System.out.println("not selected");
			}
			{
				 WebElement button = driver.findElement(By.xpath("//*[@id=\"Register\"]"));	
				   
				   String expectedButtonText = "Create my account >>";
				   String buttonText = button.getText();
				   
				   if (buttonText.equals(expectedButtonText)) {
			            System.out.println("Button text is correct: " +buttonText );
			        } else {
			            System.out.println("Button text is incorrect");
			        } 
				
				
				
	}
	
	
	
	
	
	
	

}}
