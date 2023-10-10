package org.example.helper;

import org.example.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class WindowsHelper {

    private final WebDriver driver = Driver.getDriver();
    public WindowsHelper switchNewWindow() {
        Set<String> windowHandles = driver.getWindowHandles();
        // Переключаемся на новое окно
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }
        return this;
    }

    public WindowsHelper switchNewWindowDFGHJK() {
        Set<String> windowHandles = driver.getWindowHandles();
        // Переключаемся на новое окно
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }
        driver.switchTo().window((String) windowHandles.toArray()[0]);
        return this;
    }

    public WindowsHelper switchToAboutBlank() {
      driver.navigate().to("about:blank");
        return this;
    }

    public WindowsHelper closeCurrentWindow() {
        // Закрываем текущее окно
        driver.close();
        return this;
   }
}
