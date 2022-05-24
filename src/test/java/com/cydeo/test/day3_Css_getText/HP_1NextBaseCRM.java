package com.cydeo.test.day3_Css_getText;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HP_1NextBaseCRM {
    public static void main(String[] args) {

        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");
        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        WebElement rememberOnThisComp = driver.findElement(By.id("USER_REMEMBER"));
        //rememberOnThisComp.click();
        String expected = "Remember me on this computer";
        String actualText = rememberOnThisComp.getText();

        if (expected.equals(actualText)){
            System.out.println("Pass");
        }else{
            System.out.println("Failed");
        }

        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?

        WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedText = "Forgot your password?";
        String actual = forgotPassword.getText();

        if (expectedText.equals(actualText)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }

        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes
        //

        WebElement forgot = driver.findElement(By.className("login-link-forgot-pass"));
        String expected3 = "forgot_password=yes";
        String actual3 = forgot.getAttribute("forgot_password");

        if (expected3.contains("forgot_password=yes")){
            System.out.println("Pass again");
        }else{
            System.out.println("Filed Again");
        }
        driver.quit();
    }
}
