package testngpgm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pgmtestng {
	@BeforeTest
	public void setup()
	{
		System.out.println("browser open");
	}
	@BeforeMethod
	public void urlloading()
	{
	System.out.println("url details");	
	}
	@Test(priority=2,invocationCount = 3)
	public void test1()
	{
		System.out.println("test1");
	}
   @Test(priority=1,enabled=false)
   public void test2()
   {
	  System.out.println("test2"); 
   }
   @AfterMethod
   public void aftrmthd()
   {
	   System.out.println("aftermthd");
   }
   
   @AfterTest 
   public void browsertest()
   {
	   System.out.println("browse close");
   }
   
   
}
