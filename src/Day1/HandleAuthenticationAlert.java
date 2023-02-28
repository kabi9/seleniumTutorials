package Day1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationAlert {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		Properties pro = new Properties();
		FileInputStream input = new FileInputStream(
				"C:\\Users\\innoc\\eclipse-workspace\\selenium\\src\\Day1\\testdata.properties");
		pro.load(input);

		String username = pro.getProperty("username");
		String password = pro.getProperty("password");
		System.out.println(username);
		System.out.println(password);
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\innoc\\Desktop\\java selenium\\selenium chromedriver install\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		

	}

}
