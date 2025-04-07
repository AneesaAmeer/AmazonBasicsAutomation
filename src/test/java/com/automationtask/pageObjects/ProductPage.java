package com.automationtask.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Adjust wait time
    }

    public void verifyProductPage() {
        WebElement productTitle = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("productTitle")));
        System.out.println("Product Title: " + productTitle.getText());
        assert productTitle.getText().contains("Freezer Gallon Bags");
    }

    public void selectSizeAndAddToCart() {
        WebElement sizeRadioButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-labelledby='size_name_0-announce']")));
        sizeRadioButton.click(); // Click the radio button for "Gallon (90 Count)"

        WebElement addToCartButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button")));
        addToCartButton.click(); // Add to Cart
    }
}

