package newproject;

import javax.swing.text.html.parser.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fbimage {

	public static void main(String[] args) {
	  String baseUrl = "https://www.facebook.com";					
	        System.setProperty("webdriver.chrome.driver","/Applications/chromedriver");					
	        WebDriver driver = new ChromeDriver();		
	        WebElement element;
	        String elementxt;
	        driver.get(baseUrl);
	 //        WebDriverWait wait = new WebDriverWait(driver,30);
	//         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='lfloat _ohe']//h1//a")));
	         elementxt = driver.findElement(By.xpath("//div[@class='lfloat _ohe']//h1//a")).getTagName();
	         System.out.println("Waited so long " + elementxt);
	//         element = driver.findElement(By.xpath("'//*[@id="blueBarDOMInspector"]/div/div/div/div[1]/h1/a'"));
	 //       driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();
	//        element = driver.findElement(By.className("fb_logo img sp_Vgu5hh_52BR_2x sx_dc3a6f")).click();					
    //         driver.close();   
	          
			//verify that we are now back on Facebook's homepage		
	// 		if (driver.getTitle().equals("Facebook - log in or sign up")) {							
    //        System.out.println("We are back at Facebook's homepage");					
    //          } else {			
    //        System.out.println("We are NOT in Facebook's homepage");					
    //          }		
	//			driver.close();		

	}

}
