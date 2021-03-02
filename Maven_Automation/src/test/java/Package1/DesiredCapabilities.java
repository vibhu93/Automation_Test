package Package1;

public class DesiredCapabilities {

	public static void main(String[] args) {
		
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectpath+".//Drivers//chromedriver.exe");
	

	}

}
