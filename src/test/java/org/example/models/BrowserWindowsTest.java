package org.example.models;

import org.testng.annotations.Test;

public class BrowserWindowsTest extends BaseTest {
    @Test
     void BWin() throws InterruptedException {
        driver.get("https://demoqa.com/browser-windows");
        browserWindows.switchToWinPage().switchToNewWindow().massageButton();
    }
}
