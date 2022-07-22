package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_Height_width {
@Test
public void username_pass() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(4000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//find the username field
	WebElement unTB = driver.findElement(By.id("email"));
	//store the height of username
	int email_height = unTB.getSize().getHeight();
	//store the width of username
	int email_width = unTB.getSize().getWidth();
	System.out.println(email_height);
	System.out.println(email_width);
	//find the password field
	WebElement passTB = driver.findElement(By.name("pass"));
	//store the height of password
	int password_height = passTB.getSize().getHeight();
	//store the width of password
	int password_width = passTB.getSize().getWidth();
	System.out.println(password_height);
	System.out.println(password_width);
	//check the height and width of username and password fields are same
	if (email_height==password_height && email_width==password_width) {
	System.out.println("Username and password fields are aligned");
	}else{
	System.out.println("Username and password fields are NOT aligned");
	}
	}
	}

