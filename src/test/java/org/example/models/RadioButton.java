package org.example.models;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

public class RadioButton extends BaseTest{

    @Test
    void RBTest() throws InterruptedException {
        driver.get("https://demoqa.com/radio-button");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement yes= driver.findElement(By.cssSelector("label[for='yesRadio']"));
        js.executeScript("arguments[0].click()",yes);
        Thread.sleep(500);
        WebElement impressive= driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
        js.executeScript("arguments[0].click()",impressive);




    }
}
