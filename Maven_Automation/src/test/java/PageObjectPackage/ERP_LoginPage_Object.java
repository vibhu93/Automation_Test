package PageObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class ERP_LoginPage_Object
{
	WebDriver driver =null;
	By LoginPage_Username = By.id("UserName");
	By LoginPage_Password = By.id("Password");
	By LoginPage_Submitbutton = By.id("LoginButton");
	
	public ERP_LoginPage_Object(WebDriver driver){
		this.driver=driver;
		 
	}
	
	public void username(String text){
		
		driver.findElement(LoginPage_Username).sendKeys(text);
		
	}
	
	public void Password(String text){
		driver.findElement(LoginPage_Password).sendKeys(text);
		
	}
	public void Submitbutton(){
		driver.findElement(LoginPage_Submitbutton).sendKeys(Keys.RETURN);
	}

}
