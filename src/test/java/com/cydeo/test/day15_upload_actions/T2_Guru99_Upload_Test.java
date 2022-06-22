package com.cydeo.test.day15_upload_actions;

import com.cydeo.test.utilites.ConfigurationReader;
import com.cydeo.test.utilites.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Guru99_Upload_Test {

    @Test
    public void upload_file_test() throws InterruptedException {

        //    1. Go to “https://demo.guru99.com/test/upload”
        Driver.getDriver().get(ConfigurationReader.getProperty("guru99.upload.url"));

//    2. Upload file into Choose File
        WebElement chooseFileElem = Driver.getDriver().findElement(By.id("uploadfile_0"));
        // We do not click on Choose File element because it will open out of browser
        // window which is coming from machine and selenium can not handle it
        // that is why after we locate choose file element we just use sendkeys method to send path
        //String path = "/Users/cybertek/Downloads/some-file.txt";
        chooseFileElem.sendKeys("/Users/ad/Downloads/some-file.txt");

//    3. Click terms of service checkbox
        WebElement termsOfService = Driver.getDriver().findElement(By.id("terms"));
        termsOfService.click();

//    4. Click Submit File button
        WebElement submitBtn = Driver.getDriver().findElement(By.id("submitbutton"));
        submitBtn.click();


//    5. Verify expected message appeared.
//    Expected: “1 file
//    has been successfully uploaded.”
        WebElement resultMsg = Driver.getDriver().findElement(By.id("res"));
        Thread.sleep(3000);
        String actualResultMsg = resultMsg.getText();
        Thread.sleep(3000);
        String expectedResultMsg = "1 file\nhas been successfully uploaded.";
        Thread.sleep(3000);
        Assert.assertEquals(actualResultMsg,expectedResultMsg,"Result message verification failed!");

        Driver.closeDriver();

    }
}
