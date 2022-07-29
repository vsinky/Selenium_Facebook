package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frame_Test {
@Test
public void Frame() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Admin/OneDrive/Desktop/frame2.html");
	  Thread.sleep(4000);
	  driver.manage().window().maximize();
	    Thread.sleep(2000);
	  //using index of the frame - [ int value] [ index of frames starts with zero]
	    driver.findElement(By.id("t1")).sendKeys("sinky");
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("t2")).sendKeys("sinky");
	    Thread.sleep(2000);
	    driver.switchTo().defaultContent();
	    Thread.sleep(2000);

	    //using id attribute of the frame -string
	    driver.findElement(By.id("t1")).sendKeys("verma");
	    driver.switchTo().frame("f1");
        driver.findElement(By.id("t2")).sendKeys("verma");
	    Thread.sleep(2000);
	    driver.switchTo().defaultContent();
	    Thread.sleep(2000);


	    //using name attribute of the frame -string
	    driver.switchTo().frame("n1");
	    driver.findElement(By.id("t1")).sendKeys("c");
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("t2")).sendKeys("c");
	    //using address of the frame -webelement
	    WebElement f = driver.findElement(By.className("c1"));
	    driver.switchTo().frame(f);
	    driver.findElement(By.id("t1")).sendKeys("d");
	    driver.switchTo().defaultContent();
	    driver.findElement(By.id("t2")).sendKeys("d");
	    driver.close();
	    }
	    
}

