package Dec_Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		// 1. alert 2.confirm 3. prompt
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("alert('Vaibhav automation')");
		//js.executeScript("confirm('Your are from vaibhav automation')");
		js.executeScript("prompt('Your are from vaibhav automation')");


	}

}
