package com.bridgelabz.selenium;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FileDownload {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//	    driver = new EdgeDriver();

	}
	
	@Test
	public void FileDownloadInChromeBrowser(){
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", "C:\\Users\\Admin\\Downloads\\");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		 driver = new ChromeDriver(cap);
		driver.get("http://www.seleniumhq.org/download/");
		driver.findElement(By.linkText("4.3.0")).click();
		}

	
	@Test
	public void using_Firefox() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
	     driver = new FirefoxDriver();
		//Create an object of FirefoxProfile class
		FirefoxProfile profile = new FirefoxProfile();
		//Set the Key so that it will not show the file download pop up on the screen
		String key = "browser.helperApps.neverAsk.saveToDisk";
		//Set the type of file which you want to download
		String value = "application/zip";
		//using setPreference() method, change the setting
		profile.setPreference(key, value);
		// 0 - save to desktop, 1 - save to download folder( default), 2 - save to any other //location 
		profile.setPreference("browser.download.folderList", 2);
		//save the file to the given folder location
		profile.setPreference("browser.download.dir", "");
		//Use DesiredCapabilities class to modify the firefox settings as shown below
		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability(FirefoxDriver.PROFILE, profile);
		//Launch the firefox browser with the above modified settings
		@SuppressWarnings("deprecation")
		WebDriver driver = new FirefoxDriver(cap);
		//Enter selenium official website url
		driver.get("http://www.seleniumhq.org/download/");
		//Use following-sibling axes in Xpath to find the download link for selenium java
		//driver.findElement(By.xpath("//div[3]//div[1]//div[2]//p[2]//a[1]")).click();
		driver.findElement(By.linkText("4.3.0")).click();

		Thread.sleep(3000);
	}
	
	
}
