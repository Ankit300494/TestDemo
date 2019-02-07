package Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignmnt2 {

	public static void main(String[] args) throws InterruptedException 
	{
		String key ="webdriver.chrome.driver";
		String value="./exe/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("http://istqb.in/");
		//mouseHover Operation
		String xp1="//div[@class='uk-visible-large uk-navbar-flip']//a[text()='FOUNDATION']";
		WebElement foundation=driver.findElement(By.xpath(xp1));
		Actions act= new Actions(driver);
		act.moveToElement(foundation).perform();
		String xp2="//a[text()='EXAM DATES']";
		WebElement examdates=driver.findElement(By.xpath(xp2));
		act.click(examdates).perform();
		String clickhere="//a[text()='Click Here']";
		driver.findElement(By.xpath(clickhere)).click();
		//handle windows...
		Set<String> session =driver.getWindowHandles();
		System.out.println(session);
		Iterator<String> itr =session.iterator();
		String ParentId=itr.next();
		String ChildId=itr.next();
		driver.switchTo().window(ChildId);
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Before signin..");
		WebElement txtbox=driver.findElement(By.xpath("//div[@id='wrapper']//div[@class='signin-box']//input[@name='signin[username]']"));
		txtbox.sendKeys("nankit787@gmail.com");
		System.out.println("after signin..");
		driver.findElement(By.id("signin_nxt")).click();

	}

}
