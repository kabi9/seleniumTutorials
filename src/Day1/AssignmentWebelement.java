package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://automationpractice.com/index.php");
		
//		driver.findElement(By.cssSelector("input[name=\"search_query\"]")).sendKeys("t-shirts");
//		
//		driver.findElement(By.name("submit_search")).click();
//		
//		String attribute = driver.findElement(By.cssSelector("input[name=\"search_query\"]")).getAttribute("class");	
//		System.out.println(attribute);
//		
//		String text = driver.findElement(By.tagName("b")).getText();
//		System.out.println(text);
		
//		String tag = driver.findElement(By.cssSelector("[title=\"Contact Us\"]")).getTagName();
//	    System.out.println(tag);
		
		System.out.println(driver.findElement(By.id("homepage-slider")).getSize());
		
		System.out.println(driver.findElement(By.id("homepage-slider")).getLocation());
		
		String color = driver.findElement(By.className("shopping_cart")).getCssValue("color");
		System.out.println(color);
		
		

	}

}
