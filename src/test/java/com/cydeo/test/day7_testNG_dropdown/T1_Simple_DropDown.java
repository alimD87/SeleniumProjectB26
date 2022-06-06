package com.cydeo.test.day7_testNG_dropdown;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Simple_DropDown {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

//        1. Open Chrome browser
        // set up chrome and create WebDriver instance
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //        2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void simpleDropdownTest(){



//        3. Verify “Simple dropdown” default selected value is correct
//        Expected: “Please select an option”
        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));

        // getFirstSelectedOption() method will return to default selected option. Return type is webElement
        String actualDefaultSimpleDropdown = simpleDropdown.getFirstSelectedOption().getText();
        String expectedDefaultSimpleDropdown = "Please select an option!";

        Assert.assertEquals(actualDefaultSimpleDropdown,expectedDefaultSimpleDropdown);

        // This line will not run because of hard assertion we used fail
        System.out.println("After hard assertion!");

    }

    @Test
    public void stateDropdownTest(){

        //        4. Verify “State selection” default selected value is correct
//        Expected: “Select a State”

        Select stateDropdown =new Select(driver.findElement(By.id("state")));

        String actualStateDefaultText = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateDefaultText = "Select a State";

        Assert.assertEquals(actualStateDefaultText,expectedStateDefaultText);

    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}
