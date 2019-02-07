package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignmt5 {

	public static void main(String[] args) 
	{
		String key ="webdriver.chrome.driver";
		String value="./exe/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.switchTo().parentFrame();		
		//mouse hover...
		System.out.println("hover...");
		String xp1="//span[text()='Home & Furniture']";
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement Homeicon1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xp1)));
		WebElement Home=wait.until(ExpectedConditions.visibilityOf(Homeicon1));
		WebElement Homeicon=driver.findElement(By.xpath(xp1));
		Actions act= new Actions(driver);
		act.moveToElement(Homeicon).perform();
		String painting = "//a[text()='Paintings']";
		WebElement paintng =driver.findElement(By.xpath(painting));
		act.click(paintng).perform();
		System.out.println("close...");
		
	}

}
