package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectPackage.ERP_Login;

public class Test_ERP_Login
{
	public static void main(String[] args) {
		
		ERPLogin();
		
	}
	public static void ERPLogin(){
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+".//Drivers//chromedriver1.exe");
		WebDriver driver = new ChromeDriver();
		
		// Open ERP Application
		
		driver.get("http://192.168.1.73:8080/stagingaccounting/a/erptest123/");
		driver.manage().window().maximize();
		
		//Enter User Name
		
		ERP_Login.Username(driver).sendKeys("admin");
		
		//Enter Password
		
		ERP_Login.Password(driver).sendKeys("1234");
		
		// Login
		
		ERP_Login.submit(driver).click();
		
		
		System.out.println("Succesfully Login Into ERP");
		

		
	
		
	
		
		
		
		
	}

}
