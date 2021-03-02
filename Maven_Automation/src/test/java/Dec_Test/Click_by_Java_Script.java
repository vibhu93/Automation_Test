package Dec_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_by_Java_Script {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe"); 

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com");
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("vaibhavgawande27@yahoo.com");

		//Click On Stay signed in Check Box by Java Script
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('persistent').click()");

		//Second Way to Un check check box
		//WebElement checkbooks = driver.findElement(By.xpath("//input[@id='persistent']"));
		//js.executeScript("arguments[0].click()", checkbooks);
		
		




	}

}
