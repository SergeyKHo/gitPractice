package org.example.models;

import org.example.models.pages.TextBoxPage;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest{

//    WebDriver driver;
//    @BeforeClass
//    public void setUp()  {
//        driver = Driver.getDriver();
//    }
//    @AfterClass
//    public void tearDown() {
//        driver.close();
//        driver.quit();
//    }

    @Test
    void test () {
        driver.get("https://demoqa.com/text-box/");
        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage.fillUpFieldName("Ann")
                .fillUpFieldEmail("ann@gamil.com")
                .fillUpFieldCAddress("Asanbai")
                .fillUpFieldPAddress("Bishkek")
                .submitBtmClick().testTexBoxEquals();



    }
}
