package org.example.models.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FramePage extends BasePage {

    @FindBy (xpath = "//iframe[@id='frame1']")
    public WebElement frame1;
    @FindBy (tagName="h1")
    public WebElement textF1;

    @FindBy(xpath = "//iframe[@id='frame2']")
    public WebElement frame2;

    @FindBy (tagName="h1")
    public WebElement textF2;

    public FramePage assertrFrame1(){
        frameHelper.switchToFrame(frame1);
        Assert.assertTrue(textF1.getText().contains("This is a sample page"));
        frameHelper.switchToDefaultPage();
        return this;
    }
public FramePage assertFrame2(){
        frameHelper.switchToFrame(frame2);
        Assert.assertTrue(textF2.getText().contains("This is a sample page"));
        frameHelper.switchToFrameParant();

        return this;
}

}
