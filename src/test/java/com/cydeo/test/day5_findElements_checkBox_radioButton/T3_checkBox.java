package com.cydeo.test.day5_findElements_checkBox_radioButton;

import com.cydeo.test.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T3_checkBox {
    public static void main(String[] args) throws InterruptedException {

        /*
        1. Go to http://practice.cydeo.com/checkboxes
2. Confirm checkbox #1 is NOT selected by default
3. Confirm checkbox #2 is SELECTED by default.
4. Click checkbox #1 to select it.
5. Click checkbox #2 to deselect it.
6. Confirm checkbox #1 is SELECTED.
7. Confirm checkbox #2 is NOT selected.
         */


//        1. Go to http://practice.cydeo.com/checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cydeo.com/checkboxes");

//        2. Confirm checkbox #1 is NOT selected by default
        WebElement checkBox1= driver.findElement(By.xpath("//input[@id='box1']"));
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());

//        if(!checkBox1.isSelected()){
//            System.out.println("checkBox 1 verification is " + checkBox1.isSelected());
//        }else{
//            System.out.println("checkBox 1 verification is " + checkBox1.isSelected());
//        }


//        3. Confirm checkbox #2 is SELECTED by default.
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

        Thread.sleep(3000);

//        4. Click checkbox #1 to select it.
        checkBox1.click();

        Thread.sleep(3000);
//        5. Click checkbox #2 to deselect it.
        checkbox2.click();

//        6. Confirm checkbox #1 is SELECTED.
        System.out.println("checkBox1.isSelected() = " + checkBox1.isSelected());

//        7. Confirm checkbox #2 is NOT selected.
        System.out.println("checkbox2.isSelected() = " + checkbox2.isSelected());

    }
}
