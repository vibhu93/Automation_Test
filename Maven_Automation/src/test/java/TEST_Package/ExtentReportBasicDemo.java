package TEST_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportBasicDemo {

	private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {

		//Start Reporter
		ExtentHtmlReporter HtmlExtentReporter = new ExtentHtmlReporter("extent.Html");


		// Create Extent Report & Attach Report

		ExtentReports Extent = new ExtentReports();
		Extent.attachReporter(HtmlExtentReporter);

		ExtentTest Test = Extent.createTest("Google Search", "This is the test to validate google search");

		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		
		Test.log(Status.INFO, "First Test Cases");
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		Test.pass("Open Google Web Page");
		
		//Enter Text in Google search & try to search
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("vaibhav travels");
		Test.pass("Enter Text In Search Box");
		
		//driver.findElement(By.xpath("//input[@name='btnK']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.ENTER);
		Test.pass("Select Enter Text & Search");
		
		driver.close();
		driver.quit();
		Test.pass("All Test Cases Completed");
		
		Extent.flush();
	







	}

}
