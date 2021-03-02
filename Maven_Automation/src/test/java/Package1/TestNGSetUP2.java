package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.PropertiesFile;

import TEST_Package.Properties_Class;

public class TestNGSetUP2 {
	WebDriver driver=null;
	public static String browserName=null;
	

	@BeforeTest
	public void RunTestNG(){
		String projectpath = System.getProperty("user.dir");
		Properties_Class.getproperties();
	
	
		

		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projectpath+".//Drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", projectpath+".//Drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
			
	}


	@Test
	public void googlesearch() throws InterruptedException
	{

		driver.get("http://www.google.com");

		//Enter Text in Google search & try to search
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("vaibhav travels");
		//driver.findElement(By.xpath("//input[@name='btnK']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);


	}
	@AfterTest
	public void StopTestNG(){
		System.out.println("All Test Cases Completed ");

	}



}
