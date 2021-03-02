package Jan;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class Generic_Click {



	public void click_element(WebElement element, WebDriver driver) {

		try {
			element.click();
		} 
		catch (WebDriverException e) {
			JavascriptExecutor JE = (JavascriptExecutor)driver;
			JE.executeScript("arguments[0].click()", element);
			
		}
	}
	
	public void ClearAndSendKey(WebElement element,String value) {
		
		element.clear();
		element.sendKeys(value);
		
	}
	
	public String getelementtext(WebElement element) {
		
		return element.getText();
			
	}
	

}
