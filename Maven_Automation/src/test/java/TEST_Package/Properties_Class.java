package TEST_Package;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Package1.TestNGSetUP2;

public  class Properties_Class {
	 
	public static Properties PRO= new Properties();
	static String Projectpath =System.getProperty("user.dir");
	public static void main(String[] args){
		getproperties();
		getproperties1();
		getproperties();
		
		
	}
	public static void getproperties() { 

		try{
			
			InputStream input =new FileInputStream(Projectpath+"/src/main/java/DemoPackage/Config");
			PRO.load(input);

			String browser = PRO.getProperty("browser");
			System.out.println(browser);
			TestNGSetUP2.browserName=browser;
		}
		catch(Exception exc){

			System.out.println(exc.getMessage());
			System.out.println(exc.getCause());
			exc.printStackTrace();
		}

	}
	
	public static void getproperties1(){
		try{
		OutputStream output = new FileOutputStream(Projectpath+"/src/main/java/DemoPackage/Config");
		PRO.setProperty("browser","Chrome");
		PRO.store(output, null);
		}
		catch(Exception exc){

			System.out.println(exc.getMessage());
			System.out.println(exc.getCause());
			exc.printStackTrace();
		}
		
	}

}
