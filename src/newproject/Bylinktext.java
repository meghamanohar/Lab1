package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bylinktext {

	public static void main(String[] args) {
		  String baseUrl = "http://demo.guru99.com/test/link.html";
		  System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		  WebDriver driver = new ChromeDriver();
		  driver.get(baseUrl);
		  driver.findElement(By.linkText("click here")).click();
		  System.out.println("Title of the page is "+ driver.getTitle());
		  driver.get("http://demo.guru99.com/test/accessing-link.html");
		  driver.findElement(By.partialLinkText("here")).click();
		  System.out.println("Title of page is: " + driver.getTitle());
		  driver.get("http://demo.guru99.com/test/block.html");
		  driver.findElement(By.partialLinkText("Inside")).click();
		  System.out.println(driver.getTitle());					
		  driver.navigate().back();	
		  driver.findElement(By.partialLinkText("Outside")).click();					
		  System.out.println(driver.getTitle());
		  driver.quit();

	}

}
