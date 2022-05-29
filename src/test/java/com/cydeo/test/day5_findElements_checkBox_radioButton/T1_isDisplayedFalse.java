package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_isDisplayedFalse {
    public static void main(String[] args) throws InterruptedException {

        //1- Open a Chrome browser
        //2- Go to: https://www.tesla.com/
        //3- Locate Solar Panels header
        //4- Verify if it is dispayed on the page
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.tesla.com/");
        Thread.sleep(3000);

        WebElement solarHeader = driver.findElement(By.xpath("//*[@id=\"block-tesla-frontend-content\"]/div/section/div/h1"));

        System.out.println("solarHeader.isDisplayed" + solarHeader);

        driver.quit();
    }
}
