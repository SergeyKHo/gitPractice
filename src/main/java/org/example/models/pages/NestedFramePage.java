package org.example.models.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NestedFramePage extends BasePage{

@FindBy (id="frame1")
    public WebElement parentFrame;
@FindBy (tagName = "body")
public WebElement parentFrameText;

@FindBy (tagName="p")
    public WebElement childFrame;


public NestedFramePage toParentFrame(){
    frameHelper.switchToFrame(parentFrame);
    Assert.assertTrue(parentFrameText.getText().contains("Parent frame"));

    return this;
}
    public NestedFramePage toChildFrame(){
        frameHelper.switchToFrameIndex(0);
        Assert.assertEquals(childFrame.getText(),"Child Iframe");

        return this;
    }


}
