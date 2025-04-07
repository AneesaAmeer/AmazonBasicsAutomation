# AmazonBasicsAutomation

This project automates the process of searching for Amazon Basics products, selecting a product, adding it to the cart, and printing the cart subtotal using Selenium WebDriver.

## Prerequisites

- JDK 8 or higher
- Maven or Gradle
- ChromeDriver installed and available in the system PATH
- Internet connection for running the test

## Setting Up the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/AneesaAmeer/AmazonBasicsAutomation.git
   ```

2. Open the project in Eclipse or your preferred IDE.

3. Make sure you have the required dependencies installed for Selenium WebDriver. If you're using Maven, ensure the `pom.xml` file has the necessary dependencies for Selenium. Example:

   ```xml
   <dependency>
       <groupId>org.seleniumhq.selenium</groupId>
       <artifactId>selenium-java</artifactId>
       <version>3.141.59</version>
   </dependency>
   ```

   Or for Gradle:
   
   ```gradle
   implementation 'org.seleniumhq.selenium:selenium-java:3.141.59'
   ```

4. Download the `chromedriver.exe` and place it in the folder `C:\\driver\`. Make sure the path in `DriverManager.java` points to the correct location of `chromedriver.exe`.

## Running the Test

1. Run the `AmazonBasicsAutomation.java` file, which will perform the following steps:

   - Navigate to Amazon home page.
   - Search for "amazon basics".
   - Apply the Amazon Brands filter.
   - Sort the results by "Best Seller".
   - Select a product (Freezer Gallon Bags, 90 Count).
   - Add the product to the cart.
   - Verify that the product has been added to the cart.
   - Print the cart subtotal and proceed to checkout.

2. The output will be printed to the console.

## Notes

- Ensure you have the correct version of Chrome and ChromeDriver for compatibility.
- You can customize the search item and product selection in the code.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
