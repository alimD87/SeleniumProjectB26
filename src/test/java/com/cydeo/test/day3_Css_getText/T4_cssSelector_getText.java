package com.cydeo.test.day3_Css_getText;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {

        //TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes

        driver.get(" https://login1.nextbasecrm.com/?forgot_password=yes");

        // 3- Verify “Reset password” button text is as expected:
        //Expected: Reset password

        WebElement resetPassword = driver.findElement(By.cssSelector("button.login-btn"));
        //resetPassword.sendKeys("Reset password");

        String expected = "Reset password";
        String actualTet = resetPassword.getText();
        if (expected.equals(actualTet)){
            System.out.println("Pass");
        }else{
            System.out.println("Failed");
        }
        driver.quit();
    }
}
