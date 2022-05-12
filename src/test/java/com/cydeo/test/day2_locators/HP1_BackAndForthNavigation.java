package com.cydeo.test.day2_locators;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HP1_BackAndForthNavigation {
    public static void main(String[] args) throws InterruptedException {

       // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://google.com
        driver.get("https://google.com ");

        Thread.sleep(3000);

        // 3- Click to Gmail from top right
        WebElement clickGmail = driver.findElement(By.linkText("Gmail"));
        clickGmail.click();
        // 4- Verify title contains:
        // Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Failed");
        }

        //5- Go back to Google by using the .back();
        driver.navigate().back();
        Thread.sleep(3000);


        //6- Verify title equals:
        //  Expected: Google
        expectedTitle = "Google";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification pass");
        }else{
            System.out.println("Title verification failed");
        }

        driver.quit();


    }
}
