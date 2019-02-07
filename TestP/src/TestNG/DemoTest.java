package TestNG;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoTest {
  @BeforeTest
  @Parameters({"browser","url"})
  public void Paramtr(String browser, String url)
  {
	  System.out.println("Browser is : ="+browser);
	  System.out.println("url is : ="+url);
	  Reporter.log(" Demo Report...", true);
  }
  @Test
  public void TestDemo()
  {
	  System.out.println("TestDemo...");
  }
}
