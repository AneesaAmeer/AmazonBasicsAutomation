package com.automationtask.context;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
	
	 public WebDriver initializeDriver() {
	        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe"); // Update path
	        System.setProperty("webdriver.chrome.logfile", "chromedriver.log");
	        System.setProperty("webdriver.chrome.verboseLogging", "true");

	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--disable-gpu");
	        options.addArguments("--window-size=1920x1080");
	        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) Chrome/95.0.4638.69");

	        WebDriver driver = new ChromeDriver(options);
	        driver.manage().window().maximize();
	        return driver;
	    }

}
