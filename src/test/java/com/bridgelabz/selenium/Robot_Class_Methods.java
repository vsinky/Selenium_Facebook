package com.bridgelabz.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Robot_Class_Methods {
	@Test
	public void mouseAnsKeyBoardOperator() throws InterruptedException, AWTException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
		  Thread.sleep(4000);
		  
		  driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.findElement(By.name("email")).sendKeys("sinkykumariverma@gmail.com");
		    Thread.sleep(2000);
		    Robot r = new Robot();
		    r.mouseMove(300, 400);
		    Thread.sleep(2000);
		    r.keyPress(KeyEvent.VK_ALT);
		    r.keyPress(KeyEvent.VK_F);
		    
		    r.keyPress(KeyEvent.VK_F);
		    r.keyRelease(KeyEvent.VK_ALT);
		    Thread.sleep(3000);
		    r.keyRelease(KeyEvent.VK_W);
		    Thread.sleep(3000);
		    driver.close();
		   
	}
}
