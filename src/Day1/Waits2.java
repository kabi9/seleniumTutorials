package Day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Waits2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://www.ebay.com/");
		
		// Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	    
		WebElement e = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	    Actions action = new Actions(driver);
	    action.moveToElement(e).perform();
	    //Thread.sleep(5000);
	    
	    // Explicit wait
	    //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5000));
	    
	    // Fluent Wait
	    
	    Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    		  .withTimeout(Duration.ofSeconds(30))
	    		  .pollingEvery(Duration.ofSeconds(5))
	    		  .withMessage("trying to get the element")
	    		  .ignoring(NoSuchElementException.class);
	    
	    
	    // 30 
	    // 5 sec ----- 5sec ---- 5sec 
	    		 
	    
	    
	    
	    wait.until(ExpectedConditions.elementToBeClickable(e));
	    driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[2]/ul/li[1]/a")).click();
	    
	   
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		//driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
		// Thread.sleep()
		
		//common points
		
		// Both implicit and explicit waits are dynamic wait 
		

		// Implicit Wait 
		
		// Implicit wait is global and applicable to all elements in the script
		// Global so we do not wait for condition to match
		// Throws errors the condition is not meet
		

		// Explicit Wait 
		// Explicit wait is to specific element specified by user
		// Explicit wait we wait for condition to match
		// Throws errors the condition is not meet
		
		// 5 elements 
		// element 1 - 5sec
		// element 2 - 5 sec
		// element 3 - 6 sec
		
		
		// Fluent wait 
		
		// dynamic in nature 
		// element --- 20 seconds
		// 5 sec --- 5 sec ---- 5 sec-- 5sec
		// exception
		// message
	    
	    // explicit wait is implied on single element with certain conditions 
	    
	    
	    // A  - 5
	    // B  - 5
	    // c  - 6
	    
	    // bad option - implicit wait 6 sec
	    // explicit apply wait on element 'C'
	    
	    // Fluent wait 
		
		

	}

}
