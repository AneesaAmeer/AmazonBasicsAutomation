package com.automationtask.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void verifyAddedToCart() {
        WebElement addedToCartMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//h1[contains(text(),'Added to cart')]")
        ));
        System.out.println("Added to Cart Message: " + addedToCartMessage.getText());
    }

    public void printCheckoutButton() {
        WebElement checkoutButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[@id='sc-buy-box-ptc-button']//div[contains(text(),'Proceed to checkout')]")
        ));
        System.out.println("Proceed to Checkout Message: " + checkoutButton.getText());
    }

    public void printCartSubtotal() {
        WebElement priceSymbol = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//span[@class='a-price-symbol']")
        ));
        WebElement priceWhole = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//span[@class='a-price-whole']")
        ));
        WebElement priceFraction = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//span[@class='a-price-fraction']")
        ));

        String fullPrice = priceSymbol.getText() + priceWhole.getText() + "." + priceFraction.getText();
        System.out.println("Cart Subtotal: " + fullPrice);
    }
}

