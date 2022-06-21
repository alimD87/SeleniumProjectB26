package com.cydeo.test.home_practice;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T01 extends TestBase {

    //     - Open "https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=5f126"
//            - Click Confirm button
//            - Click YES from pop up
//            - Verify message equals "You have accepted"
//
    @Test
    public void Test1(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=5f126");

        WebElement confirm = driver.findElement(By.xpath("//*[@id=\"j_idt311:j_idt312\"]/span[2]"));
        confirm.click();

        WebElement clickYes = driver.findElement(By.xpath("//*[@id=\"j_idt311:j_idt316\"]/span"));
        clickYes.click();

        WebElement actualText = driver.findElement(By.xpath("//*[@id=\"j_idt311:message_container\"]/div/div/div[2]/p"));

        Assert.assertTrue(actualText.isDisplayed() && actualText.getText().equals("You have accepted"));



    }
}
