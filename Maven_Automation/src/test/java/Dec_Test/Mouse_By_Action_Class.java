package Dec_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_By_Action_Class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe"); 

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		Actions Act = new Actions(driver);
		
		// Right Click Operation
		Thread.sleep(3000);
		Act.contextClick(driver.findElement(By.xpath("//*[.='right click me']"))).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		
		System.out.println(driver.switchTo().alert().getText());
	
		driver.switchTo().alert().accept();
		
		System.out.println("Right Click Action Perform Successfully");
		
		// Double Click Action.
		Thread.sleep(3000);
		Act.doubleClick(driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
		
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
	
		
		driver.quit();

		
		

	}

}
