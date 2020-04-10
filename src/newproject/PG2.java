package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://www.facebook.com";
		String tagName = "";
		String titleName = "";
		String pageSource = "";
		driver.get(baseURL);
		tagName = driver.findElement(By.id("email")).getTagName();
		titleName = driver.getTitle();
		pageSource = driver.getPageSource();
		System.out.println("TitleName is " + titleName);
		System.out.println("TagName is "+ tagName);
		System.out.println("Page source is " + pageSource);
		driver.close();
		System.exit(0);
		
		
	}
}
