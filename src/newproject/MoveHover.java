package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class MoveHover {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://demo.guru99.com/test/newtours/";
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		driver.get(baseURL);
		WebElement link_Home = driver.findElement(By.linkText("Home"));
        WebElement td_Home = driver
                .findElement(By
                .xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));    
         
        Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();
         
        String bgColor = td_Home.getCssValue("background-color");
        System.out.println("Before hover2 : " + bgColor);     
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        mouseOverHome.perform();     
        
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        bgColor = td_Home.getCssValue("background-color");
        System.out.println("After hover: " + bgColor);
        
        driver.close();
        
 
		
	}

}
