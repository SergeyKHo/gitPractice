package org.example.models;

import org.testng.annotations.Test;

import java.awt.*;

public class SelectMenuTest extends BaseTest{

    @Test
    void testSM() throws AWTException, InterruptedException {
        driver.get("https://demoqa.com/select-menu");
        selectMenuPage.fillUpTheForm();
    }
}
