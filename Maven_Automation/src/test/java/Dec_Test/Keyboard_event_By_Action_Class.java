package Dec_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_event_By_Action_Class {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe"); 

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		// Using Tab operations
		act.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys("vaibhav2")
		.sendKeys(Keys.TAB)
		.sendKeys("gawande2")
		.sendKeys(Keys.TAB)
		.sendKeys("admin2@deskera.org")
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.SPACE)
		.sendKeys(Keys.TAB)
		.sendKeys("1234567892")
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.ENTER)
		.sendKeys(Keys.TAB)
		.sendKeys("Automation")
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.SPACE)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys("Pune")
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.PAUSE)
		.sendKeys(Keys.ENTER)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.ENTER)
		.build().perform();
		System.out.println("Key Borad Tab action perform successfully");

	}

}
