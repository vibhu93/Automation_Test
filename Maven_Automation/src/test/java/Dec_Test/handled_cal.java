package Dec_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handled_cal {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement cra = driver.findElement(By.xpath("//a[.='Create New Account']"));
		
		click_element(driver, cra, 10);
		
		
		Select s1 = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		
		s1.selectByIndex(3);
		
		Thread.sleep(2000);
		
		s1.selectByVisibleText("Dec");
		
		//System.out.println(driver.findElement(By.xpath("//select[@id='month']")).getText());
		
		driver.findElement(By.xpath("//label[.='Male']")).click();
		
		System.out.println(driver.findElement(By.xpath("//label[.='Male']")).getText());
		
		//password field
		
		WebElement cl = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		
		cl.sendKeys("vaibhav@1234");
		
		Thread.sleep(2000);
		
		cl.clear();
		
		// email name field
		
		WebElement un = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		
		un.sendKeys("vaibhav");
		     

	}
	
	public static void click_element(WebDriver driver, WebElement element, int timeout) {
		
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.click();
		
		
	}



}
