package org.example.models;

import org.example.driver.Driver;
import org.example.helper.FrameHelper;
import org.example.models.pages.*;
import org.example.helper.FakeDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.awt.*;

public abstract class BaseTest {
    public WebDriver driver;
    public TextBoxPage textBoxPage;
    public PracticeFormPage practiceFormPage;
    public FakeDataProvider fakeDataProvider;
    public RegistrationPage registrationPage;
    public AlertsFormPage alertsFormPage;
    public FrameHelper frameHelper;
    public RadioButtonPage radioButtonPage;
    public BrowserWindowsPage browserWindows;
    public FramePage framePage;
    public NestedFramePage nestedFramePage;
    public WebTablePage webTablePage;

    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() throws AWTException {
        driver = Driver.getDriver();
        framePage =new FramePage();
        webTablePage =new WebTablePage();
        nestedFramePage =new NestedFramePage();
        browserWindows =new BrowserWindowsPage();
        radioButtonPage =new RadioButtonPage();
        practiceFormPage = new PracticeFormPage();
        textBoxPage = new TextBoxPage();
        fakeDataProvider = new FakeDataProvider();
        fakeDataProvider.createFakeStudent();
        registrationPage = new RegistrationPage();
        alertsFormPage =new AlertsFormPage();
        frameHelper =new FrameHelper();
    }

        @AfterClass(alwaysRun = true)
        public void tearDown () {
            Driver.clouseDriver();
        }
    }
