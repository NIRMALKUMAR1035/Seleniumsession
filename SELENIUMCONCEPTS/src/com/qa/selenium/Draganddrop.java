package com.qa.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/personal/drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://jqueryui.com/droppable/");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 driver.switchTo().frame(0);
		 
		 WebElement sourcelement=driver.findElement(By.id("draggable"));
		 
		 WebElement targetelement=driver.findElement(By.id("droppable"));
		 
		 Actions action=new Actions(driver);
		 
		 action.clickAndHold(sourcelement).moveToElement(targetelement).release().build().perform();
		 
		 
		 
	}
}
