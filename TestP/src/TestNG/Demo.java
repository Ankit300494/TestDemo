package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo
{
	
	@BeforeClass
	public void BeforeT()
	{
		System.out.println("Before DemoClass");
	}

	@Test
  public void TestC() 
  {
		System.out.println("Test DemoClass");
	  
  }
	
	@AfterClass
	public void AfterT()
	{
		System.out.println("After DemoClass");
	}

}
