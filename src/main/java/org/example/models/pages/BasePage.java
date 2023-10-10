package org.example.models.pages;

import org.example.driver.Driver;
import org.example.helper.AlertHelper;
import org.example.helper.ElementActions;
import org.example.helper.FrameHelper;
import org.example.helper.WindowsHelper;
import org.example.helper.FakeDataProvider;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import static org.example.driver.Driver.driver;
import static org.example.driver.Driver.getDriver;

public abstract class BasePage {
    public ElementActions elementActions = new ElementActions();
    public FakeDataProvider fakeDataProvider= new FakeDataProvider();
    public JavascriptExecutor js;
    Actions actions =new Actions(getDriver());
    public AlertHelper alertHelper = new AlertHelper();
   public FrameHelper frameHelper =new FrameHelper();
   public WindowsHelper windowsHelper =new WindowsHelper();


    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}