package org.example.models.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertsFormPage extends BasePage{


    @FindBy(id = "alertButton")
    public WebElement clickMe;

    @FindBy(id = "timerAlertButton")
    public WebElement timerClickMe;


    @FindBy(id ="confirmButton")
    public WebElement confirmClick;

    @FindBy(id ="promtButton")
    public WebElement sendClick;

    public AlertsFormPage alertClickMe()  {
        clickMe.click();
        alertHelper.acceptAlert();
        return this;
    }
    public AlertsFormPage alertClickMeTimerButton() {
        timerClickMe.click();
        alertHelper.waitAlertToBePresent().acceptAlert();
        return this;
    }

    public AlertsFormPage alertConfirmClick()  {
        confirmClick.click();
        alertHelper.dismissAlert();
        return this;
    }

public AlertsFormPage alertSendClick() {
        sendClick.click();
        alertHelper.sentKeysAlert("Serg");

        return this;
}
}
