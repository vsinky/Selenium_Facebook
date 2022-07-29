package com.bridgelabz.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionClass {
	private ChromeDriver driver;
	private WebElement search;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@Test
	public void test() throws InterruptedException, AWTException {
	//enter the url
	driver.get("https://demo.actitime.com/login.do");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
	//find the ActiTIME Inc. link
	WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
	//right click (context click) on actitime link
	Actions actions = new Actions(driver);
	actions.contextClick(link).perform();
	Thread.sleep(3000);
	//press 'w' from the keyboard for opening in a new window
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_W);
	r.keyRelease(KeyEvent.VK_W);
	Thread.sleep(3000);

	//quit() method closes all the browsers opened by Selenium
	driver.quit();
	}
	
	@Test
	public void  moveToElement() throws InterruptedException {
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 WebElement element = driver.findElement(By.id("email"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(element).click().perform();
		 Thread.sleep(2000);
		 WebElement element1 = driver.findElement(By.id("pass"));
          element.click();
		
	}
	
	@Test
	public void dragAndDrop() throws InterruptedException {
		driver.get("https://jqueryui.com/droppable/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		 driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement element1 = driver.findElement(By.xpath("//div[@id='droppable']"));
		  Actions actions = new Actions(driver);
		// drag block 1 element and drop it on block 2 element
		actions.dragAndDrop(element, element1).perform();
		actions.clickAndHold(element1).release().perform();
		actions.moveToElement(element1).release().perform();
		Thread.sleep(2000);
		driver.close();
		}
	
	@Test
public void keys() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement searchElement = driver.findElement(By.xpath("//input[@name='q']"));
		Actions action = new Actions(driver);
		action.keyDown(Keys.SHIFT).perform();
		Thread.sleep(2000);
		action.sendKeys("qspiders").perform();
		Thread.sleep(2000);
		action.keyUp(Keys.SHIFT).perform();
		Thread.sleep(2000);
		action.doubleClick(searchElement).perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("x").perform();
		Thread.sleep(2000);
		action.keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		action.keyDown(Keys.CONTROL).sendKeys("v").perform();
		Thread.sleep(2000);
		action.keyUp(Keys.CONTROL).perform();
	}
	
	}

