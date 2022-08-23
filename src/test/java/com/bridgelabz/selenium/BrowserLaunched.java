package com.bridgelabz.selenium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserLaunched {
@Test
public void launchingMultipleBrowser() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the browser name");
	String Browser = sc.nextLine();
	System.out.println("user has enter browser name_ _"+Browser);
	WebDriver driver = null;
	if (Browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	else {
		
	}
}
}
