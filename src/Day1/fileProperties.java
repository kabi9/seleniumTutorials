package Day1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties pro = new Properties();	
		FileInputStream input = new FileInputStream("C:\\Users\\innoc\\eclipse-workspace\\selenium\\src\\Day1\\testdata.properties");
		pro.load(input);
		System.out.println(pro.getProperty("browser"));
		System.out.println(pro.getProperty("baseurl"));
			
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();		 
//		driver.get(pro.getProperty("baseurl"));
		
		
		FileOutputStream output = new FileOutputStream("C:\\Users\\innoc\\eclipse-workspace\\selenium\\src\\Day1\\testdata.properties");
		pro.setProperty("city", "pune");
		pro.store(output, "storing the city");
		

	}

}
