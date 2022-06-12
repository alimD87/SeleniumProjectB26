package com.cydeo.test.day10_utilites_windows;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilites.CRM_Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Iframe_CRM_AppreciationTest extends TestBase {

    @Test
    public void sendingAppreciationMsg(){

//        2- Go to: https://login2.nextbasecrm.com/
        driver.get("https://login2.nextbasecrm.com/");
        //CRM_Utilities.crm_login(driver);
        CRM_Utilities.crm_login(driver,"hr1@cydeo.com","UserUser");

//        3- Login Homepage ( Login with valid username:helpdesk1@cybertekschool.com and password:UserUser)
//        WebElement username = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
//        username.sendKeys("helpdesk1@cybertekschool.com");
//
//        WebElement password = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
//        password.sendKeys("UserUser");
//
//        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
//        loginBtn.click();


//        4- Click the MORE tab and select APPRECIATION
        WebElement moreBtn = driver.findElement(By.xpath("//span[contains(@id,'link-text')]"));// cssSelector: span[id*='link-text']
        moreBtn.click();

        WebElement appreciation = driver.findElement(By.xpath("//span[.='Appreciation']"));
        appreciation.click();

//        5- Write an Appreciation message
        driver.switchTo().frame(driver.findElement(By.cssSelector(".bx-editor-iframe")));
        driver.findElement(By.tagName("body")).sendKeys("Hello!");

//        6- Click the SEND button

        // if you have nested frame and if you want to switch 1 frame to direct parent of this frame we are using parentFrame() method
        // driver.switchTo().parentFrame()
        driver.switchTo().defaultContent(); // just use this method if you want to go main HTML
        WebElement sendBtn = driver.findElement(By.id("blog-submit-button-save"));
        sendBtn.click();

//        7- Verify the Appreciation message is displayed on the feed
        WebElement feedText = driver.findElement(By.xpath("//div[starts-with(@id,'blog_post_body')]"));
        String actualText = feedText.getText();
        String expectedText = "Hello!";
        Assert.assertEquals(actualText,expectedText,"Feed message did not appear correctly!");


    }
}
