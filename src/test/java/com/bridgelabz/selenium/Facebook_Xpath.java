package com.bridgelabz.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook_Xpath {

	@Test
	public void login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sinkykumariverma@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("sinky");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("// a[text()='Forgotten password?']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"send_email\"]")).sendKeys("sinkykumariverma@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"initiate_interstitial\"]/div[3]/div/div[1]/button")).click();
		Thread.sleep(2000);
	}

	@Test
	public void signup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sinky");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Verma");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sinkykumariverma@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"))
				.sendKeys("sinkykumariverma@gmail.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("sinky123");
		Thread.sleep(2000);
		WebElement dateElement = driver.findElement(By.xpath("//*[@id='day']"));
		Select day_Dropdown = new Select(dateElement);
		day_Dropdown.selectByVisibleText("12");
		Thread.sleep(2000);

		WebElement monthElement = driver.findElement(By.xpath("//*[@id='month']"));
		Select month_Dropdown = new Select(monthElement);
		month_Dropdown.selectByVisibleText("May");
		Thread.sleep(2000);

		WebElement yearElement = driver.findElement(By.xpath("//*[@id='year']"));
		Select year_Dropdown = new Select(yearElement);
		year_Dropdown.selectByVisibleText("2000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
		Thread.sleep(2000);

	}

}