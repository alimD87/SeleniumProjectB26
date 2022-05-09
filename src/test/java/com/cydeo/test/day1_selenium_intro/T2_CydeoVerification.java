package com.cydeo.test.day1_selenium_intro;
/*
TC #1: Cydeo practice tool verifications
1. Open Chrome browser
2. Go to https://practice.cydeo.com/
3. Verify URL contains
Expected: cydeo
4. Verify title:
       Expected: Practice
 */
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_CydeoVerification {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/");

        String expectedURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedURL)){
            System.out.println("URL verification is passed ");

        }else{
            System.out.println("URL verification is failed");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is passed!");
        }else{
            System.out.println("Title verification is failed ");
        }

        Thread.sleep(2000);


        driver.quit();
    }
}
