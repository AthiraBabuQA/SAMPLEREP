package testngpgm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Prioritytestng {
	@BeforeTest
	public void browserloading()
	{
	System.out.println("browrser loading");	
	}
	@BeforeMethod
	public void urldetails()
	{
		
	}
	@Test(groups= {"smoke"})
	public void test1()
	{
	System.out.println("test1");	
	}
    @Test(groups= {"smoke"})
    public void test2()
    {
    	System.out.println("test2");
    }
    @Test(groups= {"sanity"})
    public void test3()
    {
    	System.out.println("test3");
    }
    @Test(groups= {"sanity"})
    public void test4()
    {
    	System.out.println("test4");
    }
    @AfterMethod
    public void aftermthd()
    {
    	System.out.println("after method");
    }
    @AfterTest
    
    public void browserclose()
    {
    	System.out.println("browser close");
    }
}
