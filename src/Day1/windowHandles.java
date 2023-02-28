package Day1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://webdriveruniversity.com/");
		driver.findElement(By.cssSelector("#contact-us")).click();
		
		Set<String> whanldes = driver.getWindowHandles();
		System.out.println(whanldes);
		
		Iterator<String> it = whanldes.iterator();
		String parentTab = it.next();
		String secondTab = it.next();
		driver.switchTo().window(secondTab);
		
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(1)")).sendKeys("chinmay");
		driver.findElement(By.cssSelector("#contact_form > input:nth-child(2)")).sendKeys("deshpande");
	
		driver.switchTo().window(parentTab);
		System.out.println(driver.getTitle());
		
		
		

	}

}
