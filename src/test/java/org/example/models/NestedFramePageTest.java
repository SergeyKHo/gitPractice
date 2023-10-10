package org.example.models;

import org.example.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NestedFramePageTest extends BaseTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
    }

    @Test
    void testNestedFrame() {
      driver.get("https://demoqa.com/nestedframes");
nestedFramePage.toParentFrame().toChildFrame();
    }
}