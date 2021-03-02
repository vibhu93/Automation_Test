package com.deskera.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class Utilities 
{
	static WebDriver driver;
	public static Properties fetchProValue(String repositoryName) throws IOException
	{
		String dir = System.getProperty("user.dir");
		String directorypath= dir+"\\src\\main\\jav\\Objectrepo\\"+repositoryName;
		File file = new File(directorypath);
		FileInputStream fis = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fis);
		return pro;
		
		
	}

}
