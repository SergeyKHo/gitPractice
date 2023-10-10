package org.example.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.config.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeWebDriver {
    public static WebDriver loadhCromeDriver(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options =new ChromeOptions();
        options.addArguments("--disable-extensions");
        if(Boolean.parseBoolean(ConfigReader.getProperty(("headless")))){
            options.setHeadless(true);
        }

        WebDriver driver =new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
       return driver;
    }




}
