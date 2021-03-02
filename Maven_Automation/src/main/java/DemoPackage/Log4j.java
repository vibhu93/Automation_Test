package DemoPackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {
	
	static Logger logger = LogManager.getLogger(Log4j.class);

	public static void main(String[] args) {
		
		System.out.println("\n Hello World \n");
		
		logger.trace("This Is an Trace Messages");
		logger.info("This is an Information Messages");
		logger.warn("This is an warn Message");
		logger.error("This is an Error Message");
		logger.fatal("This is an fatal Message");
		
		System.out.println("Logger Test Completed");

	}

}
