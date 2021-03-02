import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capture_Scrrenshots {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

	}
	//Take Screenshots
	public static void Screenshots() {
		 File SC= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 
	//pending program
		 
		 
		
		 //File source = SC.getScreenshotAs(OutputType.FILE);
		 
		 //FileUtils.copy


	}


}
