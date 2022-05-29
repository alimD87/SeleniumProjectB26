package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T4_RadioButton {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. Open Chrome browser
2. Go to https://practice.cydeo.com/radio_buttons
3. Click to “Hockey” radio button
4. Verify “Hockey” radio button is selected after clicking.
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/radio_buttons ");

        WebElement clickHockey = driver.findElement(By.xpath("//*[@id=\"hockey\"]"));
        Thread.sleep(3000);

        clickHockey.click();
        Thread.sleep(3000);

        System.out.println("clickHockey.isSelected() = " + clickHockey.isSelected());

        WebElement greenButton = driver.findElement(By.xpath("//*[@id=\"green\"]"));
        Thread.sleep(3000);
        greenButton.click();
        Thread.sleep(2000);

        System.out.println("greenButton.isEnabled() = " + greenButton.isEnabled());

        driver.quit();

    }
}
