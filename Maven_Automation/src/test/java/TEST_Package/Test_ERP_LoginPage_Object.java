package TEST_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectPackage.ERP_LoginPage_Object;

public class Test_ERP_LoginPage_Object
{
	WebDriver driver = null;
	public static void main(String[] args) {
	TestERPLogin();
	}
	
	public static void TestERPLogin(){
		String ProjectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ProjectPath+".//Drivers//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		ERP_LoginPage_Object Object=new ERP_LoginPage_Object(driver);
		driver.get("http://192.168.1.73:8080/stagingaccounting/a/erptest123/");
		
		driver.manage().window().maximize();
		
		Object.username("admin");
		Object.Password("1234");
		Object.Submitbutton();
	
	}

}
