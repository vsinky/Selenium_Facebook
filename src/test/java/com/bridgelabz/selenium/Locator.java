package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Locator {
	@Test
		 public void actitime()throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new FirefoxDriver();
	
		driver.get("file:///C:/Users/Admin/OneDrive/Desktop/Actitime.html");
	
		 WebElement unTB = driver.findElement(By.id("username"));
	
		 unTB.clear();
		
		 unTB.sendKeys("sinkykumariverma@gmail.com");
		 
		 WebElement passTB = driver.findElement(By.name("pass"));

		 passTB.clear();

		 Thread.sleep(2000);
		
		 passTB.sendKeys("sinky123");
		
		 driver.findElement(By.linkText("Click ActiTIME link")).click();
		 Thread.sleep(2000);
		}}
		

