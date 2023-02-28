package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		
//		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
//
//		// 		1.		sendKeys()
//		driver.findElement(By.cssSelector("input[name = \"first_name\"]")).sendKeys("kabindra");
//		Thread.sleep(2000);					//	TAKE A BREAK FOR 2 SECONDS
//		
//		//	    2.		clear()
//		driver.findElement(By.cssSelector("input[name = \"first_name\"]")).clear();
//
//		//		3.		click()
//		driver.findElement(By.cssSelector("input[name=\"first_name\"]")).sendKeys("Kabindra");
//		driver.findElement(By.cssSelector("input[name=\"last_name\"]")).sendKeys("Adhikari");
//		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("kabindra123@gmail.com");
//		driver.findElement(By.cssSelector("textarea[name=\"message\"]")).sendKeys("I am learning selenium");
//		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
//		
//		
//		// 		4.		getAttribute()
//		String val = driver.findElement(By.cssSelector("input[name=\"first_name\"]")).getAttribute("class");
//		System.out.println(val);
//	
//		//		5.		getText()
//		String val2 = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(val2);
//		
//		//		6.		getTagName()
//		String val3  = driver.findElement(By.cssSelector("[name=\"contactme\"]")).getTagName();
//		System.out.println(val3);
		
		

		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		//		7.		isDisplayed()
		boolean val4 = driver.findElement(By.cssSelector("input[value=\"cabbage\"]")).isDisplayed();
		System.out.println(val4);
		
		//		8.		isEnabled()
		boolean val5 = driver.findElement(By.cssSelector("input[value=\"cabbage\"]")).isEnabled();
		System.out.println(val5);
		
		boolean val6 = driver.findElement(By.cssSelector("input[value=\"pumpkin\"]")).isEnabled();
		System.out.println(val6);
		
		
		//		9.		isSelected()
		driver.findElement(By.cssSelector("input[value=\"pumpkin\"]")).click();
		boolean val7 = driver.findElement(By.cssSelector("input[value=\"pumpkin\"]")).isSelected();
		System.out.println(val7);
		
		boolean val8 = driver.findElement(By.cssSelector("input[value=\"lettuce\"]")).isSelected();
		System.out.println(val8);
		
		//		10.		getSize()
		
		System.out.println(driver.findElement(By.cssSelector(".thumbnail")).getSize());
		//getLocation()
		
		System.out.println(driver.findElement(By.cssSelector(".thumbnail")).getLocation());
		
		//		11.		getCssValue()
		
		String val9 = driver.findElement(By.tagName("h1")).getCssValue("color");
		System.out.println(val9);
		
		
		
		
		//	driver.quit();
		
	
		//	ARRANGE PROPER ORDER (CTRL + SHIFT + F)
		//	FIND ALL WINDOWS AT ONCE (ALT + TAB)
	}

}
