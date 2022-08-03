package com.bridgelabz.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class popUps {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver",
//				"C:\\Users\\Admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//	    driver = new EdgeDriver();

	}

	@Test
	public void simpleAlertPopup() throws InterruptedException {

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@Test
	public void confirmationPopUp() throws InterruptedException {
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("confirmalertbox")).click();
		Thread.sleep(2000);
		Alert confirmationAlert = driver.switchTo().alert();
		String alertText = confirmationAlert.getText();
		System.out.println("alert test is: " + alertText);
		confirmationAlert.accept();

	}

	@Test
	public void prompt_PopUp() throws InterruptedException {

		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String xpString = "//button[@id='promtButton']";
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
		driver.findElement(By.xpath("//input[@multiple='']"))
				.sendKeys("C:\\Users\\Admin\\Downloads\\Sinky resume details.pdf");
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
		Runtime.getRuntime().exec("C:\\Users\\Admin\\OneDrive\\Documents\\upload.exe");
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
		//Thread.sleep(2000);
		//String xp = "//td[.='Java']/following-sibling::td/a[.='Download']";
		driver.findElement(By.linkText("4.3.0")).click();
		}


	

	@Test
	public void close_Parent_Window() {
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parentId = driver.getWindowHandle();
		System.out.println("parent id :" + parentId);
		driver.findElement(By.linkText("Register now")).click();
		Set<String> allWindow = driver.getWindowHandles();
		int count = allWindow.size();
		System.out.println("Number of window open by the selenium :" + count);
		for (String windowHandle : allWindow) {
			driver.switchTo().window(windowHandle);
			if (windowHandle.equals(parentId)) {
				driver.close();
			}
		}
	}

	@Test
	public void close_All_Child_Windows() {
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String parentId = driver.getWindowHandle();
		// System.out.println("parent id :" +parentId);
		driver.findElement(By.linkText("Register now")).click();
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println("All window ");
		int count = allWindow.size();
		// System.out.println("Number of window open by the selenium :"+count);
		for (String windowHandle : allWindow) {
			driver.switchTo().window(windowHandle);
			if (windowHandle.equals(parentId)) {
				driver.close();
			}
		}
	}

	@Test
	public void ChildBrowserPopUp() {
		driver.get("https://www.naukri.com/");
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : " + count);
		for (String windowHandle : allWindowHandles) {
			driver.switchTo().window(windowHandle);
			String title = driver.getTitle();
			System.out.println("Window handle id of page -->" + title + " --> is : " + windowHandle);
			driver.close();
		}
	}
	
@Test
	public void CloseMainBrowserOnly() {
		driver.get("https://www.naukri.com/");
		String parentWindowhandleID = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Number of browser windows opened on the system is : " + count);
		for (String windowHandle : allWindowHandles) {
			driver.switchTo().window(windowHandle);
			if (windowHandle.equals(parentWindowhandleID)) {
				driver.close();
				System.out.println("Main Browser window with title -->" + parentWindowhandleID + " --> is closed");
			}
		}
	}

}