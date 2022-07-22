package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook_MobileNumber {
@Test
public void phoneNumberTextBox() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(4000);
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement unTB = driver.findElement(By.id("email"));
	int username_width = unTB.getSize().getWidth();
	System.out.println(username_width);
	//Identify the mobile number text box
	WebElement phoneNumTB = driver.findElement(By.id("phone number"));
	int phoneNumWidth = phoneNumTB.getSize().getWidth();
	System.out.println(phoneNumWidth);
	//Compare the width of both username and mobilenumber text box
	if (username_width==phoneNumWidth) {
}
}
}