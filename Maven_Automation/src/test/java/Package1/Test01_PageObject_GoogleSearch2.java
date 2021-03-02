package Package1;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectPackage.PageClass_GoogleSearchPage;

public class Test01_PageObject_GoogleSearch2 {

	public static void main(String[] args) throws InterruptedException
	{
		googlesearch();
	}
	
	public static void googlesearch() throws InterruptedException
	{
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+".//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		//Google search 
		
		PageClass_GoogleSearchPage.Search_box(driver).sendKeys("vaibhav travels");
		
		
		// Googel Button
		
		PageClass_GoogleSearchPage.Search_Button(driver).sendKeys(Keys.RETURN);
		
		System.out.println("All Test Cases run Successfully....");
		

		
	}

}
