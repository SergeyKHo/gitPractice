package org.example.driver;

import org.example.config.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver() {
        //Singlton Pattern
    }
    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    driver = ChromeWebDriver.loadhCromeDriver();
                    System.out.println("Chrome driver initialized");
                    break;
                case "fireFox":
                    driver = FireFoxWebDriver.loadFireFoxDriver();
                    System.out.println("Firefox driver initialized");
                    break;
                case "opera":
                    driver = FireFoxWebDriver.loadFireFoxDriver();
                    System.out.println("Opera driver initialized");
                    break;
                default:
                    throw new IllegalArgumentException();

            }
        }
        return driver;
    }

        public static void clouseDriver () {
            try {
                if (driver != null) {
                    driver.close();
                    driver.quit();
                    driver = null;
                }

            } catch (Exception e) {
                System.err.println("Error driver");
            }
        }
    }
