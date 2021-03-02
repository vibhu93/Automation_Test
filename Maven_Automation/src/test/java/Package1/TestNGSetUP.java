package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGSetUP {

	WebDriver driver=null;

	@BeforeTest
	public void RunTestNG(){
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+".//Drivers//chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
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
