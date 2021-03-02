package Dec_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class important_class {

	static WebDriver driver;
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe");
		
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		
		sendkeys(driver, 10, firstname, "vaibhav");
		
		sendkeys(driver, 5, lastname, "Gawande");
		
		WebElement CRA = driver.findElement(By.xpath("//button[@id='u_2_s']"));
		
		click_element(driver, 10, CRA);

	}
	
	//Send Key method for all web element 
	
	public static void sendkeys(WebDriver driver, int timeout, WebElement element, String value) {
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		
		element.sendKeys(value);
	}
	
	//Click menthod for all web element
	public static void click_element(WebDriver driver, int timeout, WebElement element)
	{
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		
		element.click();
	}

}
