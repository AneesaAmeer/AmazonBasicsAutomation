package com.automationtask.test;
import org.openqa.selenium.WebDriver;

import com.automationtask.context.DriverManager;
import com.automationtask.pageObjects.CartPage;
import com.automationtask.pageObjects.ProductPage;

public class AmazonBasicsAutomation {

    public static void main(String[] args) {
        DriverManager driverSetup = new DriverManager();
        WebDriver driver = driverSetup.initializeDriver();

        try {
            AmazonHomePage homePage = new AmazonHomePage(driver);
            homePage.navigateToHomePage();
            homePage.searchForItem("amazon basics");
            homePage.applyAmazonBrandsFilter();

            SearchResultsPage searchResultsPage = new SearchResultsPage(driver);
            searchResultsPage.selectBestSellerSort();
            searchResultsPage.selectProduct();

            ProductPage productPage = new ProductPage(driver);
            productPage.verifyProductPage();
            productPage.selectSizeAndAddToCart();

            CartPage cartPage = new CartPage(driver);
            cartPage.verifyAddedToCart();
            cartPage.printCheckoutButton();
            cartPage.printCartSubtotal();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}

