package com.cydeo.test.utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTableUtils {

    //Method #1 info:
    //• Name: returnOrderDate ()
    //• Return type: String
    //• Arg1: WebDriver driver
    //• Arg2: String costumerName
    //This method should accept a costumerName and return the costumer order date
    //as a String.

    public static String returnOrderDate(WebDriver driver,String customerName){
        String locator ="//td[.='" + customerName + "']//following-sibling::td[.='12/31/2021']";
        WebElement customerDateCell = driver.findElement(By.xpath(locator));
        return customerDateCell.getText();

    }

}
