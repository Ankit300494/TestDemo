package Test;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		String key ="webdriver.chrome.driver";
		String value="./exe/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://paytm.com/");
		System.out.println("Login done");
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement Login=driver.findElement(By.xpath("//div[text()='Log In/Sign Up']"));
		System.out.println("Login before..");
		Login.click();
		System.out.println("loginbtn..");
		////span[text()='Login/Signup with mobile number and password']
		
		//Handle Frame
		List<WebElement> allLinks = driver.findElements(By.tagName("iframe"));
		 System.out.println("The total number of iframes are " + allLinks.size());
		
	
		

	}

}
