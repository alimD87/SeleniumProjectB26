package com.cydeo.test.day16_actions_jsexecutor;

import com.cydeo.test.utilites.ConfigurationReader;
import com.cydeo.test.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T2_Actions_Scroll {
    @Test
    public void actions_scroll_test(){

        //    1- Open a chrome browser
//    2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get(ConfigurationReader.getProperty("practice.page.url"));

//    3- Scroll down to “Powered by CYDEO”
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));

//    4- Scroll using Actions class “moveTo(element)” method
        // There are 2 ways to do scroolling in Actions class
        //1. moveToElement(target element)
        //2. Keys.PAGE_UP and Keys.PAGE_DOWN
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(cydeoLink).perform();


//    1- Continue from where previous task left in the same test.
//    2- Scroll back up to “Home” link using PageUP button
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        //actions.moveToElement(homeLink).perform();

        // how many time of using Keys.PAGE_UP depends on how long is your web page
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();



    }
}
