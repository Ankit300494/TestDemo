package Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignmnt1 {

	public static void main(String[] args) 
	{
		String key ="webdriver.chrome.driver";
		String value="./exe/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		//Window Handling..
		Set<String> session =driver.getWindowHandles();
		System.out.println(session);
		Iterator<String> itr =session.iterator();
		String ParentId=itr.next();
		String ChildId=itr.next();
		driver.switchTo().window(ChildId);	
		//Explicit wait ...
		WebDriverWait wait= new WebDriverWait(driver,22);
		WebElement  Continue_to_NetBank=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='container']//div[@class='pdtb25 text-center']//a[text()='Continue to NetBanking']")));
		WebElement un = wait.until(ExpectedConditions.visibilityOf(Continue_to_NetBank));
		System.out.println(un+""+Continue_to_NetBank.getText());
		
		WebElement  Continue_to_NetBanking=driver.findElement(By.xpath("//div[@class='container']//div[@class='pdtb25 text-center']//a[text()='Continue to NetBanking']"));
		Continue_to_NetBanking.click();
		WebDriverWait waitone= new WebDriverWait(driver,5);
		WebElement  custID1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='pwd_field']")));
		WebElement un1=wait.until(ExpectedConditions.visibilityOf(custID1));
		WebElement   custID=driver.findElement(By.xpath("//span[@class='pwd_field']"));
		System.out.println(""+custID.getText());
		custID.sendKeys("12345");
		driver.findElement(By.xpath("//img[contains(@alt,'continue')]")).click();
	}

}
