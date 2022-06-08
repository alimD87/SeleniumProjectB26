package com.cydeo.test.day8_dropDown_alert_iframe;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SelectDate_Dropdown {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
//        1. Open Chrome browser
//        2. Go to http://practice.cybertekschool.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //        2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void dateDropdownTest(){

//        3. Select “December 1st, 1923” and verify it is selected.
        Select yearDropdown = new Select(driver.findElement(By.id("year")));
        Select monthDropdown = new Select(driver.findElement(By.id("month")));
        Select dayDropdown = new Select(driver.findElement(By.id("day")));

        for (WebElement eachYearOption : yearDropdown.getOptions()) {
            System.out.println(eachYearOption.getText());
        }


//                Select year using   : visible text
        yearDropdown.selectByVisibleText("1923");

//        Select month using    : value attribute Select
        monthDropdown.selectByValue("11");

//        day using : index number
        dayDropdown.selectByIndex(0);

        // Verify(Assertion) each year, month and day selected correctly
        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        String expectedYear = "1923";
        String expectedMonth = "December";
        String expectedDay = "1";

        Assert.assertTrue(actualYear.equals(expectedYear),"Year selection did not pass!");
        Assert.assertTrue(actualMonth.equals(expectedMonth),"Month selection did not pass!");
        Assert.assertTrue(actualDay.equals(expectedDay),"Day selection did not pass!");

//        Assert.assertEquals(actualYear,expectedYear,"Year selection did not pass!");
//        Assert.assertEquals(actualMonth,expectedMonth,"Month selection did not pass!");
//        Assert.assertEquals(actualDay,expectedDay,"Day selection did not pass!");


    }

    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

}
