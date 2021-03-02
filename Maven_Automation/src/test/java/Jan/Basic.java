package Jan;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.util.concurrent.TimeUnit;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Dec_Test.important_class;

public class Basic {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.google.com");

		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//div[@class='hpuQDe']")).click();
		Thread.sleep(3000);
		driver.navigate();
		driver.get("https://www.google.com");
		Actions act = new Actions(driver);

		System.out.println("I am in action class");	
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		System.out.println("I am out action class");	
		System.out.println(driver.getCurrentUrl());	
		driver.get("https://www.facebook.com");
		
		important_class cl = new important_class();
		
		WebElement UN= driver.findElement(By.xpath("//input[@name='email']"));
		cl.sendkeys(driver, 10, UN, "vaibhav");
	






	}

}
