package newproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class accessDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		ChromeOptions options = new ChromeOptions();
		//to disable pop up 
		options.addArguments("disable-popup-blocking");
		WebDriver driver = new ChromeDriver(options);
		String baseURL = "http://demo.guru99.com/test/newtours/register.php";
		driver.get(baseURL);
		driver.manage().window().maximize();
		Select drpcountry = new Select(driver.findElement(By.name("country")));
		drpcountry.selectByVisibleText("ANTARCTICA");
 		driver.get("http://jsbin.com/osebed/2");
         Select fruits = new Select(driver.findElement(By.id("fruits")));
          fruits.selectByVisibleText("Banana");
        fruits.selectByIndex(1);
 		driver.quit();
		
		
	}

}
