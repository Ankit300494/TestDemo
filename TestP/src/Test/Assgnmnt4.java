package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assgnmnt4 {

	public static void main(String[] args) 
	{
			String key ="webdriver.chrome.driver";
			String value="./exe/chromedriver.exe";
			System.setProperty(key, value);
			WebDriver driver= new ChromeDriver();
			driver.get("http://istqb.in/");
		
		        //mouseHover Operation
		        String xp1="//div[@class='uk-visible-large uk-navbar-flip']//a[text()='ABOUT US']";
				WebElement foundation=driver.findElement(By.xpath(xp1));
				Actions act= new Actions(driver);
				act.moveToElement(foundation).perform();
				String xp2="//div[@class='uk-dropdown uk-dropdown-navbar uk-dropdown-width-2 uk-dropdown-bottom']//a[text()='AFFILIATED COMPANIES']";
				WebElement examdates=driver.findElement(By.xpath(xp2));
				act.click(examdates).perform();
				String clickOnZ="//a[text()='Z']";
				driver.findElement(By.xpath(clickOnZ)).click();
			
				//Total Links of page Print...  
				List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='tm-main uk-width-medium-1-1 uk-row-first']//div[@class='uk-grid']"));
				int count=allLinks.size();
				 for (int i = 1; i <count; i++)
				 {
					 WebElement links=allLinks.get(i);
					 String LinkText=links.getText();
					 System.out.print("  "+LinkText);
					
				}

	}

}
