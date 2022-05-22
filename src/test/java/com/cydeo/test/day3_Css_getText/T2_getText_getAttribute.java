package com.cydeo.test.day3_Css_getText;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {


//        TC #2: getText() and getAttribute() method practice
//        1- Open a chrome browser
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//        2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

//        3- Verify header text is as expected:
//        Expected: Registration form

        // locate headerText to get text between opening and closing tag
        WebElement headerText = driver.findElement(By.tagName("h2"));

        String expectedHeader = "Registration form";

        // getText() method; it will get the content(text) form in between the opening and closing tag
        String actualheader = headerText.getText();

        if(actualheader.equals(expectedHeader)){
            System.out.println("header text verification passed!");
        }else{
            System.out.println("header text verification failed!");
        }

//        4- Locate “First name” input box
//        5- Verify placeholder attribute’s value is as expected:
//        Expected: first name

        WebElement firstNameInput = driver.findElement(By.className("form-control"));

        String expectedPlaceHolder = "first name";

        //getAttribute(attribute argument) method is helping us to get value of attributes
        String actualPlaceHolder = firstNameInput.getAttribute("placeholder");

        if(actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("Placeholder text verification passed!");
        }else{
            System.out.println("Placeholder text verification failed!");
        }

        driver.quit();

    }
}