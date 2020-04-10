package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		String alertMessage = "";
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("body:nth-child(2) > input:nth-child(2)")).click();
		alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alertMessage);
        driver.quit();
				
	}

}
