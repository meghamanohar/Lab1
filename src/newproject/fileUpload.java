package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://demo.guru99.com/test/upload/";
		driver.get(baseURL);
		driver.findElement(By.id("uploadfile_0"))
	        .sendKeys("/Users/krishnayadappanavar/Downloads/googlechrome.dmg");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.name("send")).click();
		driver.close();
	}

}
