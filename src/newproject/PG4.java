package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("Deprecated")).click();
		driver.close();
		
	}

}
