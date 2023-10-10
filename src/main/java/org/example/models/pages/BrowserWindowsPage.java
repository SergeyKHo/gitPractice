package org.example.models.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class BrowserWindowsPage extends BasePage {

    @FindBy(id = "tabButton")
    public WebElement clickTabButton;

    @FindBy(id = "sampleHeading")
    public WebElement tabPageText;


    @FindBy(id = "windowButton")
    public WebElement clickWindowButton;


    @FindBy(id = "messageWindowButton")
    public WebElement clickMessageButton;


    public BrowserWindowsPage switchToWinPage() throws InterruptedException {
        elementActions.clickElement(clickTabButton);
        windowsHelper.switchNewWindow();

        windowsHelper.closeCurrentWindow();
        windowsHelper.switchNewWindowDFGHJK();

        return this;
    }


    public BrowserWindowsPage switchToNewWindow() throws InterruptedException {

        elementActions.clickElement(clickWindowButton);
        windowsHelper.switchNewWindow();
        Assert.assertTrue(tabPageText.getText().contains("This is a sample page"));
        windowsHelper.closeCurrentWindow();
        windowsHelper.switchNewWindowDFGHJK();

        return this;
    }


    public BrowserWindowsPage massageButton() {
        elementActions.clickElement(clickMessageButton);
        windowsHelper.switchToAboutBlank();
        windowsHelper.closeCurrentWindow();
        windowsHelper.switchNewWindowDFGHJK();


        return this;
    }
}

