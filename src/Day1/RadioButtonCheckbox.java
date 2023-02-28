package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();		
		
		//		Arrangement
		//--------------------------------------------------------
		
		driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		//		Action
		//-------------------------------------------------------------
		
//		WebElement checkBoxOne = driver.findElement(By.cssSelector("input[value=\"option-1\"]"));
//		checkBoxOne.click();
//		checkBoxOne.click();
//		
//		//		Assertion
//		//----------------------------------------------------------------
//		
//		if(checkBoxOne.isSelected()) {
//			System.out.println("Check box is selected");
//		}
//		else {
//			System.out.println("Check box is not selected");
//		}
//		
		
		
		// ***** selecting all the check box *****
		
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
		
		for(int i = 0 ; i < checkboxes.size() ; i++ ) {
			System.out.println(i);
			if(!checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
			
		}
		
//		//		**** Radio buttons *****
//		//--------------------------------------------------------------------------
//		
//		driver.findElement(By.cssSelector("input[value=\"green\"]")).click();
//		
//		if(driver.findElement(By.cssSelector("input[value=\"green\"]")).isSelected()){
//			System.out.println("Radio button selected");
//		}
//		else {
//			System.out.println("Radio button not selected");
//		}
		
		//		**** CLICK ON EVERY RADIO BUTTONS *****
//		
//		List<WebElement>button = driver.findElements(By.cssSelector("input[name=\"color\"]"));
//		for(int i = 0; i < button.size(); i++) {
//			Thread.sleep(2000);
//			button.get(i).click();
//		}
		
//		WebElement c =  driver.findElement(By.cssSelector("input[value = \"yellow\"]"));	
//		// c.click();
//		if(c.isSelected()) {
//			System.out.println("yellow color is selected");
//		}
//		else {
//			System.out.println("not selected");
//		}
			
		

	}

}
