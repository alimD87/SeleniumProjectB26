package com.cydeo.test.utilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory  {
    //TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"


    // This is how you're Creating a Method
    public static WebDriver getDriver(String browserType){ //I don't have to creat object if I call static

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
           return new ChromeDriver();

        }else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();

        }else{
            System.out.println("You don't have no drivers to run your application");
            System.out.println("Driver=null");
            return null;
        }

    }
}
