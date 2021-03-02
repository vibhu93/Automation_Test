package Dec_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_Test_Class_Practices {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe"); 

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		//Action class to perform mouse action
		
		Actions Act = new Actions(driver);
		
		// Right Click Operation
		Act.contextClick(driver.findElement(By.xpath("//*[.='right click me']"))).perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		// Double click operation
		
		Act.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
		driver.quit();
	}

}
