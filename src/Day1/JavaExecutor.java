package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		WebElement  e =driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(e);
		
		//System.out.println(driver.getTitle());
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String script = "return document.title;";
//		System.out.println(js.executeScript(script));
		
		
		String script = "return document.title;";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = (String)(js.executeScript(script));
		System.out.println(title);
		System.out.println("hello");
		
//		// click button
//		
//		driver.switchTo().frame(e);
////		driver.findElement(By.xpath("/html/body/button")).click();
////		driver.switchTo().alert().accept();
////		
//		
//		// Javascript
//		
////		js.executeScript("myFunction()");
////		Thread.sleep(3000);
////		driver.switchTo().alert().accept();
//		
//		// Highlight element
//		
//		WebElement e1 = driver.findElement(By.xpath("/html/body/button"));
//		js.executeScript("arguments[0].style.border='5px solid green'", e1);
//		
//		driver.navigate().to("https://www.w3schools.com/");
//		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"howto_padding\"]/a"));
//		js.executeScript("arguments[0].scrollIntoView(true);", e2);
//		
//		//JavascriptExecutor js = (JavascriptExecutor) driver; 
////		  WebElement checkbox = driver.findElement(By.id("persistent")); 
////		  checkbox.click(); 
////		  js.executeScript("arguments[0].click()",  checkbox); 
//		 
//		
//		   
//		   
//		 } 
//		
//	
//		
//		
//		
//
//		// Javascript ---
//		// create new , retrive , update , delete 
//		// retrive , update add, delete attribute 
//		// based on user action --- click , dblick , mouseverover
		
		

	}

}
