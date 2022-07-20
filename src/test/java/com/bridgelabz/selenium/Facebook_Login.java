package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_Login {

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		  Thread.sleep(4000);
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.name("email")).sendKeys("sinkykumariverma@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("pass")).sendKeys("sinky123");
	    Thread.sleep(2000);
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(2000);
	    
	    
	    
//		  driver.get("file:///C:/Users/Admin/OneDrive/Desktop/Actitime.html");
//	      Thread.sleep(2000);
//		 driver.manage().window().maximize();
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("username")).clear();
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("username")).sendKeys("sinky");
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("pass")).clear();
//		 Thread.sleep(2000);
//		 driver.findElement(By.id("pass")).sendKeys("verma");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		 
//	    driver.navigate().to("https://www.facebook.com/");
//		 Thread.sleep(2000);
//		 String fbtitle = driver.getTitle();
//		 System.out.println("The title of the page is :"+fbtitle);
//		 Thread.sleep(2000);
//		 driver.navigate().back();
//		 Thread.sleep(2000);
//		 driver.navigate().forward();
//		 Thread.sleep(2000);
//		 driver.navigate().refresh();
//		 Thread.sleep(2000);
//		 
		 
	//	 	driver.close();
	    
	    
	}
}
