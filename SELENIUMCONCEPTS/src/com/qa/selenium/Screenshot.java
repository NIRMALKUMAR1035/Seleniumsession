package com.qa.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:/personal/drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com");
		 takescreenshot("facebook");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
}
	
	public static void takescreenshot(String filename) throws IOException{
		
		 File File = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(File,new File("C://TestLeaf//eclipse-workspace//SELENIUMCONCEPTS/"+filename+".jpg"));
		
		
	}

}
