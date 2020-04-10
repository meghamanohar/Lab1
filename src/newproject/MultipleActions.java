package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultipleActions {

	public static void main(String[] args) {
		String baseURL = "http://www.facebook.com/"; 
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(baseURL);
		WebElement txtUsername = driver.findElement(By.id("email"));
		
		Actions builder = new Actions(driver);
		Action seriesOfActions = builder.moveToElement(txtUsername)
				                        .click()
				                        .keyDown(txtUsername, Keys.SHIFT)
				                        .sendKeys(txtUsername, "hello")
				                    	.keyUp(txtUsername, Keys.SHIFT)
				                    	.doubleClick(txtUsername)
				                    	.contextClick()
				                    	.build();
	    seriesOfActions.perform();
		driver.close();
		
		
	}

}
