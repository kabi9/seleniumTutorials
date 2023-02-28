package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// 1. ***** get() *****

			// driver.get("https://www.saucedemo.com/");

		//	2.	****** manage() *******

			// driver.manage().window().maximize();

		// 	3.	***** getTitle() ******

			// String title = driver.getTitle();
			// System.out.println(title);

		// 	4.	****** getPageSource() *******

			// String pageSource = driver.getPageSource();
			// System.out.println(pageSource);

		//	5.	**** getCurrentUrl() ****

			// String currentUrl = driver.getCurrentUrl();
			// System.out.println(currentUrl);

		//	6.	**** navigate() ****

				// driver.navigate().to("https://www.tutorialspoint.com/how-to-get-page-source-as-it-is-in-browser-using-selenium");

		//	7.	**** close() ****
				
				// driver.close();

		//	8.	**** quit() ****
				
				// driver.quit();

		// findElement() 			// for one webElement
		// WebElement e = driver.findElement(By.cssSelector("#user-name"));
		// WebElement e2 = driver.findElement(By.id("user-name"));

		// findElements()
		// auto shift + ctrl + O

		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		List<WebElement> k = driver.findElements(By.className("inventory_item"));
		System.out.println(k.size());

		// driver.quit();

	}

}
