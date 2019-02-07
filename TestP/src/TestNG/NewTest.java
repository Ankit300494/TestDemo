package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest 
{
 
	@BeforeClass
	public void BeforeT()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void BeforeMethodTest()
	{
		System.out.println("BeforeMethod...  ");
	}
	
	@Test(groups= {"smoke"})
  public void TestC() 
  {
		System.out.println("Test Class");
	  
  }
	@AfterMethod
	public void AfterMT()
	{
		System.out.println("After Method.....");
	}
	
	@AfterClass
	public void AfterT()
	{
		System.out.println("After Class");
	}
	
}
