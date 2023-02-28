package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// https://www.selenium.dev/documentation/webdriver/elements/locators/   (REFER SITE FOR DOCUMENTATION)
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();			// IMPORT LINE NO:4 AND LINE NO:5
		
		//driver.get("https://demoqa.com/automation-practice-form");		
		//driver.quit();								
	
		// WEBELEMENT
		// <h1 id = "one" class = "two" name = "nm">Heading<h1> 
		
		// VISITING PAGE (FAST APPLICATION)
		// driver.get("https://www.saucedemo.com/");
		
		
		// 	*****	Element ******* 
		
		/*  <input class="input_error form_input" placeholder="Username" 		(COPYING ELEMENT FROM SAUCEDEMO PAGE)
		type="text" data-test="username" id="user-name" name="user-name"		
		autocorrect="off" autocapitalize="none" value=""> 
		 */
		
		
		
		// 1.       ****** id ******			(USING id LOCATOR)
		// 			Locates elements whose ID attribute matches search value
		
		// driver.findElement(By.id("user-name")).sendKeys("standard_user"); 	   //	IMPORT LINE NO: 3 (FOR BY)
		
		
		// 2.       ***** name ********		(USING name LOCATOR)
		// 			Locates elements whose NAME attribute matches search value
		
		// driver.findElement(By.name("user-name")).sendKeys("standard_user");
		
		// 3. 		***** className ******		(USING className LOCATOR)
		// 			Locates elements whose class name contains search value
		
		// driver.findElement(By.className("input_error")).sendKeys("standard_user");
		
		// 4. 		***** tagName ******			(USING tagName LOCATOR)
		// 			Locates elements whose tag name matches search value
		
		// driver.findElement(By.tagName("input")).sendKeys("standard_user");
		
		// 5.  		****** Css selector ******	(USING css SELECTOR) (STEPS:INSPECT AND GET ELEMENT/RIGHT CLICK/ COPY SELECTOR)
		//			Locates elements matching a CSS selector
		
		// driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		
		// 6.		****** Xpath ******		(USING Xpath)	(STEPS:INSPECT AND GET ELEMENT/RIGHT CLICK/ COPY Xpath)
		//			Locates elements matching an XPath expression
		// 			2 types (Absolute and relative)
		
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		
		// 7.		****** linkText ******	(USING linkText)
		//			Locates anchor elements whose visible text matches search value
		//			anchor tag --> link (whatever between opening and closing tag is linkText <a>.....</a> )
		
		driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
		// driver.findElement(By.linkText("Overview")).click();
		
		// 8.		***** partialLinkText ******	(USING partialLinkText)   (part of Text)
		//			Locates anchor elements whose visible text contains the search value. 
		//			If multiple elements are matching, only the first one will be selected.
		
		driver.findElement(By.partialLinkText("Getting")).click();		//	for Link "Getting Started"
			
	}

}
