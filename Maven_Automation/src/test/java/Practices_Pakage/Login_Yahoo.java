package Practices_Pakage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Yahoo extends Test_Login
{

	public static void login() {
	
		WebElement  UN = driver.findElement(By.xpath("//input[@id='login-username']"));
		UN.sendKeys("vaibhavgawande27");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('persistent').click()");
		WebElement Next = driver.findElement(By.xpath("//input[@name='signin']"));
		Next.click();	

	}
	

}
