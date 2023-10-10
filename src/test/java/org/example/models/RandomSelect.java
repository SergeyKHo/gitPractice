package org.example.models;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomSelect extends BaseTest {
    @Test
    void selectRandomOption() throws InterruptedException {
        driver.get("https://demoqa.com/select-menu");

      WebElement selectReact = driver.findElement(By.id("withOptGroup"));
        WebElement inputClick = driver.findElement(By.xpath("//div[@aria-hidden='true']"));
        inputClick.click();
        Thread.sleep(1000);



        List<WebElement> menuItem = driver.findElements(By.xpath("//div[contains(text(),'option')]"));
        List<String> inputCase = new ArrayList<>();
        if (!menuItem.isEmpty()) {
            for (WebElement element : menuItem) {
                inputCase.add(element.getText());
            }
        }
        Random random = new Random();
        int randomIndex = random.nextInt(menuItem.size());

        WebElement input = driver.findElement(By.id("react-select-2-input"));
        input.sendKeys(inputCase.get(randomIndex));
        input.sendKeys(Keys.ENTER);

        WebElement inputClick1 = driver.findElement(By.xpath("//div[@class=' css-1uccc91-singleValue']/../../div[2]/div[@aria-hidden='true']"));
        inputClick1.click();
        List<WebElement> selectone = driver.findElements(By.xpath("//div[@class=' css-1uccc91-singleValue']"));
        List<String> selectCase = new ArrayList<>();
        if (!selectone.isEmpty()) {
            for (WebElement element : selectone) {
                selectCase.add(element.getText());
                int randomindex1 = random.nextInt(selectone.size());

                WebElement selectCaseinput = driver.findElement(By.id("react-select-3-input"));
                selectCaseinput.sendKeys(selectCase.get(randomindex1));
                Thread.sleep(1000);
                selectCaseinput.sendKeys(Keys.ENTER);
            }
        }
    }
}

