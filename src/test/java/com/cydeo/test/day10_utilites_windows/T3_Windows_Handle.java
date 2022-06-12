package com.cydeo.test.day10_utilites_windows;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T3_Windows_Handle extends TestBase {
    @Test
    public void windowHandleTest(){

//        2. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows");

        String mainWindow = driver.getWindowHandle();
        System.out.println("mainWindow = " + mainWindow);

//   mainWindow = CDwindow-C536E9E39AF57A504F13D7D931E2CC62
//   mainWindow = CDwindow-7F7475D366ACC60228B028F59F7793D6


//        3. Assert: Title is “Windows”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle,expectedTitle,"Main window title verification failed!");

//        4. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.linkText("Click Here"));
        clickHereLink.click();

//        5. Switch to new Window.
        Set<String> allWindowHandles = driver.getWindowHandles();
//
        for (String each : allWindowHandles) {
            driver.switchTo().window(each);
            // window handle 1 - main window
            // window handle 2 - 2nd window
            System.out.println("driver.getTitle() = " + driver.getTitle());
        }

//        6. Assert: Title is “New Window”
        String expectTitleAfterClicking = "New Window";
        actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectTitleAfterClicking,"New window title verification failed!");

    }
}
