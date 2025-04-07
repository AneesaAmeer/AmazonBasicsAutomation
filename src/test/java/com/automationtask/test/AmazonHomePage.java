package com.automationtask.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage {
	
	private WebDriver driver;
    private WebDriverWait wait;

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
    }

    public void navigateToHomePage() {
        driver.get("https://www.amazon.com/");
    }

    public void searchForItem(String item) {
        WebElement searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
        searchBox.sendKeys(item);
        searchBox.submit(); // Press Enter
    }

    public void applyAmazonBrandsFilter() {
        WebElement amazonBrandsFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Amazon Brands')]")));
        amazonBrandsFilter.click();
    }

}
