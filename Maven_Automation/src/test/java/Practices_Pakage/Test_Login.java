package Practices_Pakage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Login {

	public static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		
		Login_Yahoo LY = new Login_Yahoo();
		
		Login_Yahoo.login();
		
		Login_Yahoo.driver.quit();  

	}

}
