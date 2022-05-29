package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T02_findElement {
    public static void main(String[] args) {
        /*
        1- Open a chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the href attribute values of the links
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get(" https://practice.cydeo.com/abtest ");

        //3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() + " + allLinks.size());

        //5- Print out the texts of the links.
        for (WebElement eachLink : allLinks){
            System.out.println("Text of each link = " + eachLink.getText());
            System.out.println("Href values = " + eachLink.getAttribute("href"));
        }
    }
}
