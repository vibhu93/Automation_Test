package TEST_Package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportWithTestNG {
	ExtentHtmlReporter HtmlExtentReporter;
	ExtentReports Extent;
	public WebDriver driver = null;
	
	@BeforeSuite
	public void TESTNGSetup(){
		HtmlExtentReporter = new ExtentHtmlReporter("extent.Html");
		// Create Extent Report & Attach Report
		Extent = new ExtentReports();
		Extent.attachReporter(HtmlExtentReporter);

		


	}
	@BeforeTest
	public void beforeTEst(){
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+".//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@Test
	public void RunTest() throws IOException, InterruptedException{

		ExtentTest test = Extent.createTest("MyFirstTest", "Sample description");
		driver.get("https://www.google.com");
		test.pass("Navigate To Google Web Page");

		
		test.log(Status.INFO, "This step shows usage of log(status, details)");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("vaibhav travels");
		test.pass("Enter Text In Search Box");

		// info(details)
		test.info("This step shows usage of info(details)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.ENTER);
		test.pass("Select Enter Text & Search");

		// log with snapshot
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");



	}
	@AfterTest
	public void TearDownTEST(){
		driver.close();
		driver.close();
	
		

	}
	@AfterSuite
	public void TearDown(){
		Extent.flush();
	}

}

