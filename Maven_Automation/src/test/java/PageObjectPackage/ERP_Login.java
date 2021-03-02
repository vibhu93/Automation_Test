package PageObjectPackage;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ERP_Login 
{
	
	static WebElement element= null;
	
	public static WebElement Username(WebDriver driver){
		
	 element =driver.findElement(By.xpath("//input[@name='UserName']"));
	 return element;
		
	}
	
	public static WebElement Password(WebDriver driver){
		
		element =driver.findElement(By.xpath("//input[@name='Password']"));
		return element;
		
	}
	
	public static  WebElement submit(WebDriver driver){
		element =driver.findElement(By.xpath("//input[@id='LoginButton']"));
		return element;
		

		
	}	

}
