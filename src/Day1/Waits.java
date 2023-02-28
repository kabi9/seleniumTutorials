package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		
		driver.get("http://www.webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		
		// Why we required wait?
		// client ---- request --- server and create element from response
		// If response id delayed element are not created
		// so we wait for element to be created via request completion
		
		
		// Thread.sleep is static
		//10 -- 5 seconds
		Thread.sleep(5000);
		
		
		// 1 Implicit wait
		// 2 Explicit wait  are dynamic waits
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// element 1 
		
		// element 2
		
		// element 3
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// element 4
		
		
		// element 5
		
		
		// element 6
		
		
		// Explicit wait 
		
		WebDriverWait waitA = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitA.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));
//		
//		
//		alertIsPresent()
//		elementSelectionStateToBe()
//		elementToBeClickable()
//		elementToBeSelected()
//		frameToBeAvaliableAndSwitchToIt()
//		invisibilityOfTheElementLocated()
//		invisibilityOfElementWithText()
//		presenceOfAllElementsLocatedBy()
//		presenceOfElementLocated()
//		textToBePresentInElement()
//		textToBePresentInElementLocated()
//		textToBePresentInElementValue()
//		titleIs()
//		titleContains()
//		visibilityOf()
//		visibilityOfAllElements()
//		visibilityOfAllElementsLocatedBy()
//		visibilityOfElementLocated()

		
		
	
		
		// Different type of waits 
		// 1 Implicit wait
		// 2 Explicit wait 
		// 3 Fluent   wait
		// 3 Thread sleep 

	}

}
