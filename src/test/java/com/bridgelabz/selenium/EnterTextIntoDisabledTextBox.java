package com.bridgelabz.selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnterTextIntoDisabledTextBox {
@Test
public void javaScriptExecutor() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	Thread.sleep(4000);
	driver.get("file:///C:/Users/Admin/OneDrive/Desktop/Actitime.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//Typecast the driver object to JavascriptExecutor interface type
	JavascriptExecutor js = (JavascriptExecutor) driver;
	Thread.sleep(2000);
	//enter "admin" in first textbox using javascript
	js.executeScript("document.getElementById('t1').value='admin'");
	Thread.sleep(2000);
	//clear the value in second textbox using javascript
	js.executeScript("document.getElementById('t2').value=''");
	Thread.sleep(2000);
    //enter "manager" in second textbox using javascript
	js.executeScript("document.getElementById('t2').value='manager'");
	Thread.sleep(2000);
	//change the second text box to button type using Javascript
	js.executeScript("document.getElementById('t2').type='button'");
	Thread.sleep(2000);

	}
}

