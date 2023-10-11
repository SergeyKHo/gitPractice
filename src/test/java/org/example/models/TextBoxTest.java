package org.example.models;

import org.example.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    WebDriver driver;
    @BeforeClass
    public void setUp()  {
        driver = Driver.getDriver();
    }
    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }



    @Test
    void fillUpTheFormTest(){
        driver.get("https://demoqa.com/text-box");
        Student student =new Student();
        textBoxPage.fillUpTheForm(student);
    }

}
