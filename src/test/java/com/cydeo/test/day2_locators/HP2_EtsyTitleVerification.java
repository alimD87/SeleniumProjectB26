package com.cydeo.test.day2_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HP2_EtsyTitleVerification {
    public static void main(String[] args) throws InterruptedException {


//1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


//2. Go to https://www.etsy.com
    driver.get("https://www.etsy.com");

Thread.sleep(3000);

//3. Search for “wooden spoon”
        WebElement searchFor = driver.findElement(By.name("search_query"));
        searchFor.sendKeys("wooden spoon" + Keys.ENTER);


//4. Verify title:
//Expected: “Wooden spoon | Etsy”
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Failed");
        }
    driver.quit();
}
}