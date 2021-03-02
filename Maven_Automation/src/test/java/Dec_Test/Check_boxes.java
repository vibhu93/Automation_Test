package Dec_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_boxes {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe"); 

		WebDriver driver = new ChromeDriver();

		// Open ERP Application

		driver.get("https://www.demoqa.com/automation-practice-form");
		driver.manage().window().maximize();


		// Check boxes selection from java scripts
		//JavascriptExecutor Js = (JavascriptExecutor)driver;
		//Js.executeScript("document.getElementById('hobbies-checkbox-1').click()");
		/*WebElement chk =driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		Thread.sleep(3000);
		Js.executeScript("arguments[0].click()", chk);
		 */

		// click operation by isSelected method*****
		WebElement chk =driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		boolean isSelected = chk.isSelected();
		
		//Click operation if element is not selected.
		
		if (isSelected == false)
		{
			chk.click();
		}
		
		System.out.println("click 1 operation perform successfully");
		
		//Click operation by isDisplayed method*****
		WebElement chk1 =driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
		boolean isDisplayed = chk1.isDisplayed();
		
		if (isDisplayed == true)
		{
			chk1.click();
		}
		
		System.out.println("click 2 operation perform successfully");
		
		//Click operation by isDisplayed method******
		
		WebElement chk2 =driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
		
		boolean isEnabled = chk2.isEnabled();
		
		if(isEnabled == true)
		{
			chk2.click();
			
		}
		
		System.out.println("click 3 operation perform successfully");

		
		









	}

}
