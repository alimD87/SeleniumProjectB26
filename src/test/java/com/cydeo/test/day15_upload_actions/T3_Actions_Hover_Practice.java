package com.cydeo.test.day15_upload_actions;

import com.cydeo.test.utilites.ConfigurationReader;
import com.cydeo.test.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T3_Actions_Hover_Practice {
    @Test
    public void google_actions_hover_test() throws InterruptedException {

        //    1. Go to https://www.google.com
        Driver.getDriver().get(ConfigurationReader.getProperty("google.url"));

//    2. Hover over on Search button
//        3. Hover over on Feeling Lucky button
        WebElement searchBtn = Driver.getDriver().findElement(By.xpath("//input[@id='gbqfbb']/preceding-sibling::input"));
        WebElement feelingLuckyBtn = Driver.getDriver().findElement(By.id("gbqfbb"));

        Actions actions = new Actions(Driver.getDriver());
        // hover over method is moveToElement()
        Thread.sleep(3000);
        actions.moveToElement(searchBtn).perform();
        Thread.sleep(3000);
        actions.moveToElement(feelingLuckyBtn).perform();


//

    }
}
