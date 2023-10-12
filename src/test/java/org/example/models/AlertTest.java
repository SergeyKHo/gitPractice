package org.example.models;

import org.example.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AlertTest extends BaseTest {


    @Test
    void Test() {
        driver.get("https://demoqa.com/alerts");
        alertsFormPage.alertClickMe().alertClickMeTimerButton()
        .alertConfirmClick().alertSendClick();


    }

}