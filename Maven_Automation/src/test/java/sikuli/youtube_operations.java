package sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.api.Screen;

public class youtube_operations {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe");


		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.youtube.com/watch?v=EnBEUDrY1Fs");

		driver.manage().window().maximize();
		
		// create sikuli object
		
		



	}

}
