package org.example.models;

import org.example.DateOfBD;
import org.example.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CheckDB {
    WebDriver driver;
    @BeforeClass
    public void setUp()  {
        driver = Driver.getDriver();
    }

    @Test
    void Test(){
        driver.get("https://demoqa.com/automation-practice-form");
        DateOfBD dateOfBD =new DateOfBD();
        dateOfBD.selectField().selectMonth().selectYear().selectDay();
    }
}
