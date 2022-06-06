package com.cydeo.test.day7_testNG_dropdown;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is running");
        // set up chrome and create WebDriver instance
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("After method is running");
        driver.close();
    }


    @Test
    public void googleTitle(){


        // Get "https://google.com"
        driver.get("https://google.com");

        // Assert: title is  "Google"
        String actualTitle =  driver.getTitle();
        String expectedTitle = "Google";

        // 3rd argumant is optional for failed message. It will only appear when verification is failed
        Assert.assertEquals(actualTitle,expectedTitle,"Title verification is failed!");


    }

    @Test
    public void yahooTitle(){
        driver.get("https://yahoo.com");

    }


    @Test
    public void etsyTitle(){
        driver.get("https://etsy.com");

    }


}
