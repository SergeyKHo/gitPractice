package org.example.helper;

import lombok.Data;
import org.example.driver.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@Data
public class AlertHelper {
    Alert alert;

    public AlertHelper acceptAlert() {
        waitAlertToBePresent();
        switchTotAlert();
        alert.accept();
        return this;
    }

    public AlertHelper dismissAlert() {
//        waitAlertToBePresent();
        switchTotAlert();
        alert.dismiss();
        return this;
    }

    public AlertHelper sentKeysAlert(String txt) {
        switchTotAlert();
        alert.sendKeys(txt);
        alert.accept();
        return this;
    }

    public AlertHelper switchTotAlert() {
        alert = Driver.getDriver().switchTo().alert();
        return this;
    }

    public AlertHelper waitAlertToBePresent() {
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.alertIsPresent());
        return this;
    }

    WebDriver driver;

//    public AlertHelper(WebDriver driver) {
//        this.driver = driver;
//    }
//    public Alert getAlert() {
//        return driver.switchTo().alert();
//    }
//
//    public void AcceptAlert() {
//        getAlert().accept();
//    }
//
//    public void DismissAlert() {
//        getAlert().dismiss();
//    }
//
//    public String getAlertText() {
//        String text = getAlert().getText();
//        return text;
//    }
//
//    public  boolean isAlertPresent() {
//        try {
//            driver.switchTo().alert().accept();
//
//            return true;
//        } catch (NoAlertPresentException e) {
//            // Ignore
//            return false;
//        }
//    }
//
//    public void AcceptAlertIfPresent() {
//        if (!isAlertPresent())
//            return;
//        AcceptAlert();
//    }
//
//    public void DismissAlertIfPresent() {
//        if (!isAlertPresent())
//            return;
//        DismissAlert();
//    }
//
//    public void AcceptPrompt(String text) {
//        if (!isAlertPresent())
//            return;
//        Alert alert = getAlert();
//        alert.sendKeys(text);
//        alert.accept();
//    }
    }

