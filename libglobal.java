package org.hexa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class libglobal {
	public static WebDriver driver;
	 
	public void launchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();

	}
	public void launchFirefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
	    driver = new ChromeDriver();

	}
	public void launchIeBrowser() {
		WebDriverManager.iedriver().setup();
	    driver = new InternetExplorerDriver();

	}
	public void maximize() {
		driver.manage().window().maximize();
		 
	 }
	
	public void loadUrl(String url) {
		driver.get(url);
	}
	public void insertText(WebElement element, String data) {
		element.sendKeys(data);
	}
	public void btnClick(WebElement e) {
     e.click();
	}
	public void closeBrowser() {
		driver.quit();
	}
	

}
