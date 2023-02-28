package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");		
			
			
			// 1.		****** Above ********
			
			//	By username  = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
			//	driver.findElement(username).sendKeys("standard_user");
			
			// 2.		****** Below ********
			
			//	By password  = RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
			//	driver.findElement(password).sendKeys("secret_sauce");
			
			
			// 		****** Above EXAMPLE 2 ********
			
			//	driver.get("https://webdriveruniversity.com/Data-Table/index.html");
			//	By teaElement = RelativeLocator.with(By.id("tea")).above(By.id("milk"));
			//	String q = driver.findElement(teaElement).getText();
			//	System.out.println(q);
				
			// driver.get("https://webdriveruniversity.com/Data-Table/index.html");
			// By q = RelativeLocator.with(By.tagName("div")).above(By.className("active"));
			
			//	below not correct
			//	driver.get("https://webdriveruniversity.com/Data-Table/index.html");
			//	By q1 = RelativeLocator.with(By.tagName("li")).below(By.id("espresso"));
			//	System.out.println(driver.findElement(q1).getText());
			
			
			// 3.		***** left-of *******
			
			//	By q2 = RelativeLocator.with(By.tagName("button")).toLeftOf(By.cssSelector("input[value=\"Submit\"]"));
			//	System.out.println(driver.findElement(q2).getText());
			
			// 4.		****** right-of ******
			
			//	By q3 = RelativeLocator.with(By.tagName("button")).toRightOf(By.cssSelector("input[value=\"Submit\"]"));
			//	System.out.println(driver.findElement(q2).getText());
			
		
			// 5.		******* near ********

			//	`By q4 = RelativeLocator.with(By.tagName("button")).near(By.cssSelector("a[role=\"button\"]"));
		
			
	}

}
