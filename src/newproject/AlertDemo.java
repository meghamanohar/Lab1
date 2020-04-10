package newproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        Alert alert = driver.switchTo().alert();
        String alertMessage= driver.switchTo().alert().getText();		
        System.out.println(alertMessage);
  
        alert.accept();

        driver.close();		
		

	}

}
