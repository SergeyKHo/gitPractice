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

        WebElement inputClick = driver.findElement(By.xpath("//div[@aria-hidden='true']"));
        inputClick.click();

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

        WebElement inputClick1 = driver.findElement(By.id("selectOne"));
        inputClick1.click();
        List<WebElement> selectOne = driver.findElements(By.xpath("//div[@class=' css-1uccc91-singleValue']"));
        List<String> selectCase = new ArrayList<>();
        if (!selectOne.isEmpty()) {
            for (WebElement element : selectOne) {
                selectCase.add(element.getText());
                int randomindex1 = random.nextInt(selectOne.size());

                WebElement selectCaseinput = driver.findElement(By.id("react-select-3-input"));
                selectCaseinput.sendKeys(selectCase.get(randomindex1));
                selectCaseinput.sendKeys(Keys.ENTER);
            }
        }
    }
}

