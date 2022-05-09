package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC #1: Yahoo Title Verification
1. Open Chrome browser
2. Go to https://www.yahoo.com/
3. Verify title:
Expected: Yahoo
 */
public class Task1_YahooTitleVerification {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com/");

        String actualTitle = driver.getTitle();

        System.out.println("Actual Title of Yahoo: " +actualTitle);

       String expectedTitle = "Yahoo";

       if (actualTitle.contains(expectedTitle)) {

           System.out.println("The title verification is passed!");
       }else{
           System.out.println("Title verification is failed");
       }


        driver.quit();

    }

}
