package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Expected_Page_Displayed {
	@Test
	public void expectedPage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String expectedTitle = "facebook";
		String actualTitle = driver.getTitle();
		System.out.println("Actual Title is: " + actualTitle);
		Thread.sleep(2000);
		if (actualTitle.contains(expectedTitle)) {
			System.out.println("page is displayed");
		} else {
			System.out.println("expected page not displayed");
		}

	}
	
	@Test
	public void expectedurl() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String expectedUrl = "facebook";
		 String actualUrl = driver.getCurrentUrl();
		 if (actualUrl.contains(expectedUrl)) {
		 System.out.println("page is displayed");
		} else{
		System.out.println("expected page is NOT displayed");
		}

	}
	
	@Test
	public void expected() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement logoutBtn = driver.findElement(By.xpath("//button[contains(text(),'Log')]"));
		if (logoutBtn.isDisplayed()) {
		System.out.println("Home page is displayed");
		} else{
		System.out.println("Home page is NOT displayed");
		}
	}
	
	
	
}