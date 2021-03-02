package Jan;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_dropdown {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//Drivers//chromedriver1.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By industry = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");

		selectdropdown_values(industry, "index", "2");
		selectdropdown_values(country, "value", "India");
		selectdropdown_values(industry, "visibletext", "Education");
		
		Thread.sleep(1000);

		driver.get("https://login.yahoo.com/");

		Thread.sleep(3000);



		JavascriptExecutor Js = (JavascriptExecutor)driver;
		Js.executeScript("document.getElementById('persistent').click()");
		WebElement  email = driver.findElement(By.xpath("//input[@name='username']"));
		Thread.sleep(3000);
		Js.executeScript("arguments[0].value='vaibhav.gawande0'", email);

		Js.executeScript("arguments[0].click()", email);
		

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	//Generic method
	public static void selectdropdown_values(By locator, String type, String value ) {

		Select select = new Select(getElement(locator));
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			select.selectByValue(value);
			break;
		case "visibletext":
			select.selectByVisibleText(value);
			break;
		default:
			System.out.println("Please Enter Correct Selection cretiria");
			break;
		}






	}		



}
