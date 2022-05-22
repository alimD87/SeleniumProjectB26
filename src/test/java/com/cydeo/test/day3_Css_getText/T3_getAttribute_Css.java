package com.cydeo.test.day3_Css_getText;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_Css {
    public static void main(String[] args) {

        //TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        // 1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get(" https://login1.nextbasecrm.com/");
        //3- Verify “Log in” button text is as expected:
        //Expected: Log In

        WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));// This is how we verify input in log in button by calling cssSelector

        String expectedBtnText = "Log In"; // verifies if Log in text on the actual LOG IN button.
        String actualBtnText = loginButton.getAttribute("value");

        if (actualBtnText.equals(actualBtnText)){
            System.out.println("Log In button verification passed");
        }else{
            System.out.println("Log In button verification failed");
        }

        driver.quit();

    }
}
