package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi");
		String key="webdriver.chrome.driver";
		String value="./exe/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("run successfully...");
	}

}
