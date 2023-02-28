package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://www.webdriveruniversity.com/Popup-Alerts/index.html");
		
		driver.findElement(By.id("button1")).click();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("button4")).click();
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();

	}

}
