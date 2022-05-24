package com.cydeo.test.day3_Css_getText;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://amazon.com/");
        Thread.sleep(3000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 pro");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(3000);

        driver.findElement(By.className("a-price-whole")).click();
       // driver.findElement(By.className("a-size-medium")).click();

        Thread.sleep(2000);
        driver.findElement(By.id("a-autoid-29-announce")).click();

        driver.findElement(By.id("ap_email")).sendKeys("adjem1@hotmail.com");
        driver.findElement(By.id("ap_password")).sendKeys("Philadelphia00@");
        Thread.sleep(3000);

        driver.findElement(By.id("signInSubmit")).click();

        driver.findElement(By.className("autocomplete")).click();

        driver.findElement(By.id("a-autoid-30-announce")).click();


    }
}
