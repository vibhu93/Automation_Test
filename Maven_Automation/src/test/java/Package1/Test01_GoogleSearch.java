package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Test01_GoogleSearch {


	static WebDriver driver=null;
	@BeforeGroups
	public void testsetup(){
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+".//Drivers//chromedriver1.exe");
		driver = new ChromeDriver();

	}
	@Test
	public static void googlesearch() throws InterruptedException
	{
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		//Enter Text in Google search & try to search
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("vaibhav travels");
		//driver.findElement(By.xpath("//input[@name='btnK']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);

	}
	@AfterTest
	public void endsetup(){
		driver.close();
		driver.quit();

		System.out.println("All Test Cases Completed ");

	}

}
