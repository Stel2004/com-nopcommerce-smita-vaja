package com_nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

/**
 * Project-1 - ProjectName : com-nopcommerce
 * BaseUrl = https://demo.nopcommerce.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Navigate to Url.
 * “https://demo.nopcommerce.com/login?returnUrl=%2F”
 * 7. Print the current url.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current url.
 * 11. Refresh the page.
 * 12. Enter the email to email field.
 * 13. Enter the password to password field.
 * 14. Click on Login Button.
 * 15. Close the browser.
 */
public class NopCommerceChrome {

    // Creating main method
    public static void main(String[] args) {
        String baseUrl = "https://demo.nopcommerce.com/";

        // Launch the Chrome browser
        // 1. Setup Chrome browser.
        WebDriver driver = new ChromeDriver();

        // 2. Open the url into browser
        driver.get(baseUrl);
        // maximise the browser windows
        driver.manage().window().maximize();

        // We give implicit wait to driver - give it to beginning level
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

        //3. Print the title of the page.
        driver.getTitle();

        //4. Print the current url.
        System.out.println("The current URL is: " + driver.getCurrentUrl());

        //5. Print the page source.
        System.out.println("The page source is :" + driver.getPageSource());

        //6. Navigate to Url: “https://demo.nopcommerce.com/login?returnUrl=%2F”
        String loginUrl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        driver.navigate().to(loginUrl);

        //7. Print the current url.
        System.out.println("The current URL is: " + driver.getCurrentUrl());

        //8. Navigate back to the home page.
        driver.navigate().to(baseUrl);

        //9. Navigate to the login page.
        driver.navigate().to(loginUrl);

        //10. Print the current url.
        System.out.println("The current URL is: " + driver.getCurrentUrl());

        //Refresh the page.
        driver.navigate().refresh();

        //12. Enter the email to email field.
        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");

        //13. Enter the password to password field.
        driver.findElement(By.id("Password")).sendKeys("Admin@123");

        //14. Click on Login Button.
        driver.findElement(By.className("login-button")).click();

        //15. Close the browser.
        driver.quit();
    }

}
