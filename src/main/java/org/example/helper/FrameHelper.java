package org.example.helper;

import org.example.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FrameHelper {

    private final WebDriver driver = Driver.getDriver();


    public FrameHelper switchToFrame (WebElement element) {
        driver.switchTo().frame(element);
        return this;
    }

    public FrameHelper switchToFrameIndex(int index) {
        driver.switchTo().frame(index);
        return this;
    }

    public FrameHelper switchToFrameParant() {
        driver.switchTo().parentFrame();
        return this;
    }
    public FrameHelper switchToDefaultPage() {
        driver.switchTo().defaultContent();
        return this;
    }

}