package org.example.models;

import org.example.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest{
    WebDriver driver;

    @BeforeClass
        public void setUp(){
       driver = Driver.getDriver();
    }
    @Test
    void testFrame(){
        driver.get("https://demoqa.com/frames");
        framePage.assertrFrame1().assertFrame2();
    }
}



//@Test
//    void test13() {
//            driver.get("https://demoqa.com/nestedframes");
//            //first go to parent frame
//            driver.switchTo().frame("frame1");
//            // then go to child frame
//            driver.switchTo().frame(0);
//            System.out.println(driver.findElement(By.tagName("p")).getText());
//            driver.switchTo().parentFrame();
//            System.out.println(driver.findElement(By.tagName("body")).getText());
//            driver.switchTo().defaultContent();
//            }