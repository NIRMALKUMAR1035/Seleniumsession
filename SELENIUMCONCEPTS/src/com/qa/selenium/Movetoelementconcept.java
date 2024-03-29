package com.qa.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelementconcept {
	
	public static void main(String[]args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "C:/personal/drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			 
			 driver.get("http://mrbool.com/");
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 Actions actions=new Actions(driver);
			 
			actions.moveToElement(driver.findElement(By.xpath("//a[@href='http://mrbool.com/articles/listcomp.asp']"))).build().perform();
			Thread.sleep(3000);
			
		     driver.findElement(By.xpath("//a[@href='http://mrbool.com/course']")).click();
			 
	}

}
