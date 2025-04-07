package com.automationtask.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SearchResultsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Adjust wait time
    }

    public void selectBestSellerSort() {
        WebElement sortDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("s-result-sort-select")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", sortDropdown); // Click sort dropdown

        WebElement bestSellerOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Best Seller')]")));
        bestSellerOption.click(); // Select "Best Seller"
    }

    public void selectProduct() {
        WebElement product = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Freezer Gallon Bags, 90 Count')]")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", product); // Click product
    }
}
