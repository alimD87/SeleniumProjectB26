package com.cydeo.test.utilites;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    //    TC : Create utility method
    //   1. Create a new class called BrowserUtils
    //   2. Create a method to make Multiple Windows logic re-usable 3. When method is called, it should switch window and verify
    //    title.

//    Method info:
//   • Name: switchWindowAndVerify
//   • Return type: void
//   • Arg1: WebDriver
//   • Arg2: String expectedInUrl
//   • Arg3: String expectedTitle

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle){

        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String eachWindow : allWindowHandles) {
            // driver.switchTo().window(eachWindow); syntax will switch each windows and driver will be able to see each window
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains("expectedInUrl")){
                break;
            }
        }

//        5. Assert:Title contains “Etsy”
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle),"Title verification failed!");

    }

    public static void verifyTitle(WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(),expectedTitle);


    }




    }

