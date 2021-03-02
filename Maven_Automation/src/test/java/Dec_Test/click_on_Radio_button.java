package Dec_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_on_Radio_button {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe"); 

		WebDriver driver = new ChromeDriver();

		// Automation for radio button

		driver.get("https://www.demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		//By java Script.
		Thread.sleep(3000);
		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Js.executeScript("document.getElementById('gender-radio-1').click()");
		
		System.out.println("Select radio1 successfully");
		
		Thread.sleep(3000);
		
		// By Is Select isSelect Method.
		
		WebElement radio2 = driver.findElement(By.cssSelector("label[for='gender-radio-2']"));
		
		boolean isSelected =radio2.isSelected();
		
		if(isSelected == false)
		{
			radio2.click();
		}
		
		System.out.println("Select radio2 successfully");
		
		Thread.sleep(3000);
		
		// By isDisplayed method
		
		WebElement radio3 = driver.findElement(By.cssSelector("label[for='gender-radio-3']"));
		
		boolean isDisplayed = radio3.isDisplayed();
		
		if (isDisplayed == true)
		{
			radio3.click();
		}
		
		System.out.println("Select radio3 successfully");
		
		Thread.sleep(3000);
		
		//By isEnable method
		
		WebElement radio1 = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
		
		boolean isEnabled = radio1.isEnabled();
		
		if (isEnabled == true)
		{
			radio1.click();
		}
		
		System.out.println("Select Again radio1 successfully");
	}

}
