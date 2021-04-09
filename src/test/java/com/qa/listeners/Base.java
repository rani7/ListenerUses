package com.qa.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public static void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse-selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();  
		driver.get("https://www.google.co.in");	
		
	}
	
	public void failed(String testMethodName) {
	File scrfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(scrfile,new File("F:\\Eclipse-selenium\\workspace\\ListenerUses\\screenshots\\"+testMethodName+".jpg"));
	} catch (IOException e) {
		e.printStackTrace();
	}
		
	}

}
