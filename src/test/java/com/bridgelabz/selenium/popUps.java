package com.bridgelabz.selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class popUps {
	public static WebDriver driver;
	@BeforeTest
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
          driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		driver = new FirefoxDriver();
	}
	@Test
	public void simpleAlertPopup() throws InterruptedException{
	
		    driver.get("https://demoqa.com/alerts");
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.findElement(By.id("alertButton")).click();
		    Thread.sleep(2000);
		    Alert alert=driver.switchTo().alert();
		    alert.accept();
	}
	
	@Test
	public void confirmationPopUp() throws InterruptedException{
		 driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		    driver.findElement(By.name("confirmalertbox")).click();
		    Thread.sleep(2000);
		    Alert confirmationAlert=driver.switchTo().alert();
		    String alertText= confirmationAlert.getText();
		    System.out.println("alert test is: "+alertText);
		    confirmationAlert.accept();
		    
	}

	@Test
	public void prompt_PopUp() throws InterruptedException {
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String xpString ="//button[@id='promtButton']";
		driver.findElement(By.xpath(xpString)).click();
		Thread.sleep(2000);
		Alert promptAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		promptAlert.sendKeys("Sinky");
		Thread.sleep(2000);
		promptAlert.accept();
		
	}
	
	@Test
	public void File_Upload() throws InterruptedException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("C:\\Users\\Admin\\Downloads\\Sinky resume details.pdf");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click=\"item.upload()\"]")).click();
		Thread.sleep(2000);
	}
	
	@Test
	public void autoIt_UploadFile() throws InterruptedException, IOException {
		driver.get("https://www.freepdfconvert.com/pdf-to-word");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Choose PDF file")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("");
	}
}
