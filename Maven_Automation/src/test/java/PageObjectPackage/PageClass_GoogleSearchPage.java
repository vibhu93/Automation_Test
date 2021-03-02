package PageObjectPackage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageClass_GoogleSearchPage {
	
	private static WebElement element = null;
	
	public static WebElement Search_box(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//input[@name='q']"));
		return element;
	}
	
	public static WebElement Search_Button(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		element =driver.findElement(By.xpath("//input[@name='btnK']"));
		return element;
		
	}
	
}


