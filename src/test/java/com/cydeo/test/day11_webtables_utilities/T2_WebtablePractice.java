package com.cydeo.test.day11_webtables_utilities;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_WebtablePractice extends TestBase {

    @Test
    public void order_name_verify_test(){

//        1. Go to : https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");

//        2. Verify Bob’s name is listed as expected.
//        Expected: “Bob Martin”
        WebElement bobMartinCell =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']"));

        String actualBobName = bobMartinCell.getText();
        String expectedBobName = "Bob Martin";
        Assert.assertEquals(actualBobName,expectedBobName,"Bob name did not appear correctly!");


//        3. Verify Bob Martin’s order date is as expected
//        Expected: 12/31/2021
        WebElement bobMartinDateCell =
                driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']//following-sibling::td[3]"));

        String actualBobMartinDateCell = bobMartinDateCell.getText();
        String expectedBobMartinDateCell = "12/31/2021";

        Assert.assertEquals(actualBobMartinDateCell,expectedBobMartinDateCell);
    }
}
