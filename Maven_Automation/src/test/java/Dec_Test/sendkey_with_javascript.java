package Dec_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkey_with_javascript {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement  email = driver.findElement(By.xpath("//input[@name='username']"));
		
		js.executeScript("arguments[0].value='vaibhavgawande27'", email);
		
		System.out.println("enter username successfully by java script");
		
		

	}

}
