package org.example.utills;

import org.example.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class main {

    @Test
    void test1() {


        WebDriver driver = Driver.getDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        WebElement searchInp = driver.findElement(By.id("twotabsearchtextbox"));
        searchInp.sendKeys("iphone");

        searchInp.sendKeys(Keys.ENTER);
        List<WebElement> brands = driver.findElements(By.cssSelector("li[id^='p_89']"));
        for (WebElement brand : brands) {
            System.out.println(brand.getText());
            WebElement checkbox = brand.findElement(By.tagName("i"));
            checkbox.click();
        }
        //StaleElementReferenceException: - ссылка на устаревший элемент

    }
}