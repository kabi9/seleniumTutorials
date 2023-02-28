package Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		
		driver.get("https://qatest.commentsoldrt.com/webstore-register?destination=/account");
		driver.manage().window().maximize();
		
		
		//	SIGNUP DETAINS
		driver.findElement(By.cssSelector("#customer-first-name")).sendKeys("Kabindra");
		driver.findElement(By.cssSelector("#customer-last-name")).sendKeys("Adhikari");
		driver.findElement(By.cssSelector("#customer-email")).sendKeys("kabindra888@gmail.com");
		driver.findElement(By.cssSelector("#customer-password")).sendKeys("Kabindra123*");
		driver.findElement(By.cssSelector("#login-section > form > button")).click();
		driver.findElement(By.cssSelector("#pink-button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		// CLICK ON SHOP
		driver.findElement(By.cssSelector("#vue-app-account > div:nth-child(1) > header > div > div > div._container-item.tw-space-x-4.tw-text-center > a:nth-child(3)")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("svg[aria-label=\"close\"]")).click();
		
		//	CLICK ON NEW ARRIVALSS
		driver.findElement(By.linkText("New Arrivals")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[alt=\"Product: Velvet Duvet Cover\"]")).click();
		driver.findElement(By.xpath("(//label[@class=\"absolute inset-0 z-20 opacity-0 cursor-pointer\"])[1]")).click();
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
		driver.findElement(By.xpath("(//a[@tabindex=\"0\"])[3]")).click();
		driver.findElement(By.cssSelector("[value=\"delivery\"]")).click();
		
		//	FILL OUT DELIVERY FORM
		
		driver.findElement(By.cssSelector("[autocomplete=\"address-line1\"]")).sendKeys("4001 N Beltline Road");
		driver.findElement(By.id("locality")).sendKeys("Irving");
		driver.findElement(By.cssSelector("[name=\"state\"]")).sendKeys("Texas");
		driver.findElement(By.cssSelector("[autocomplete=\"postal-code\"]")).sendKeys("75038");
		driver.findElement(By.id("save-button")).click();		
		
		//	PAYMENT METHODS
		Thread.sleep(2000);
		driver.findElement(By.id("credit-card")).click();
		WebElement a = driver.findElement(By.cssSelector("[title=\"Secure card payment input frame\"]"));
		driver.switchTo().frame(a);
		driver.findElement(By.cssSelector("[aria-label=\"Credit or debit card number\"]")).sendKeys("4242 4242 4242 4242");
		driver.findElement(By.cssSelector("[autocomplete=\"cc-exp\"]")).sendKeys("11/27");
		driver.findElement(By.xpath("(//input[@class=\"InputElement is-empty Input Input--empty\"])[1]")).sendKeys("111");
		driver.findElement(By.cssSelector("[name=\"postal\"]")).sendKeys("12345");
		driver.switchTo().parentFrame();
		Thread.sleep(5000);
		driver.findElement(By.id("stripe-button")).click();
		driver.findElement(By.xpath("(//button[@class=\"_pill-button\"])[4]")).click();
		driver.findElement(By.cssSelector("[class=\"default-input coupon-input\"]")).sendKeys("5OFF20");
		driver.findElement(By.id("save-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[class=\"_cta-button\"]")).click();
		Thread.sleep(20000);
		
		driver.findElement(By.cssSelector("[class=\"webstore-checkout-btn\"]")).click();
		
		driver.findElement(By.cssSelector("[class=\"icon-account w-6\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vue-app-account\"]/div/div[2]/section/div/div[2]/div[2]/div[6]/span")).click();
		
		

	}

}
