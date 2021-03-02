package Dec_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class important_menthod {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		//get Urls, get text, refresh, back
		
		String url = driver.getCurrentUrl();
		
		System.out.println("My current Url is "+ url);
		
		String tittle = driver.getTitle();
		
		System.out.println("Page tittle is "+ tittle);
		
		driver.navigate().refresh();
		
		driver.navigate();
		
		driver.get("https://www.yahoo.com/");
		
		System.out.println("Open yahoo page successfully.");
		
		driver.navigate().back();
		
		System.out.println("Back to google page successfully.");

	}

}
