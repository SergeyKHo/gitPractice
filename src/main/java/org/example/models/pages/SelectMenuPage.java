package org.example.models.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;


public class SelectMenuPage extends BasePage {

    @FindBy(id = "withOptGroup")
    public WebElement clicSelectValue;

    @FindBy(xpath = "//div[contains(text(),'option')]")
    public List<WebElement> inputSelectValue;

    @FindBy(id = "selectOne")
    public WebElement clickSelectOne;
    @FindBy(xpath = "//div[contains(text(),'.')]")
    public List<WebElement> inputSelectOne;

    @FindBy(id = "oldSelectMenu")
    public WebElement clickOldStyle;

    @FindBy(id = "oldSelectMenu")
    public WebElement inputColor;

    @FindBy(xpath = "//div[contains(text(),'Select...')]")
    public WebElement inputDropDown;

    @FindBy(id = "cars")
    public WebElement inputCars;


    //    @FindBy(xpath ="")
//    public WebElement inputDropDow;
//
    @FindBy(xpath = "//b[text()='Multiselect drop down']/../../div[@class=' css-2b097c-container']/div")
    public List<WebElement> selectDropDown;

    public SelectMenuPage addSelectValue() {
        elementActions.clickElement(clicSelectValue);
        elementActions.clickToRandomElement(inputSelectValue);
        return this;
    }

    public SelectMenuPage addSelectOne() {
        elementActions.clickElement(clickSelectOne);
        elementActions.clickToRandomElement(inputSelectOne);
            for (WebElement element : inputSelectOne) {
                System.out.println(element.getText());
            }
            return this;
        }

        public SelectMenuPage addColor () {
            elementActions.clickElement(clickOldStyle);
            elementActions.selectRandom(inputColor);
            elementActions.clickElement(inputColor);
            return this;
        }
        public SelectMenuPage addDropDown () {
            elementActions.clickElement(inputDropDown);
            elementActions.clickToRandomElement(selectDropDown);
            return this;
        }
        public SelectMenuPage addNameCars () {
            elementActions.clickElement(inputCars);
            elementActions.selectRandom(inputCars);
            elementActions.clickElement(inputCars);
            return this;
        }
        public SelectMenuPage fillUpTheForm () throws AWTException {
            Robot robot = new Robot();

            for (int i = 0; i < 1; i++) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_ADD);
                robot.keyRelease(KeyEvent.VK_ADD);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            }
            for (int i = 0; i < 6; i++) {
                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_SUBTRACT);
                robot.keyRelease(KeyEvent.VK_SUBTRACT);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            }
            addSelectValue().addSelectOne().addDropDown().addColor().addNameCars();
            return this;
        }

    }
