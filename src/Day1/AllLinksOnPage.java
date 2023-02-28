package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksOnPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		
		//		visit the webpage 
		driver.get("http://www.webdriveruniversity.com/");
		
		List <WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		//		total number of links
		System.out.println("Total number of links "+ allLinks.size());
		
		for(int i = 0 ; i < allLinks.size(); i++) {
			
			//		links urls 
			System.out.println(allLinks.get(i).getAttribute("href"));
			
			//		linkText
			System.out.println(allLinks.get(i).getText());
		
		}
		
		
		

	}

}
