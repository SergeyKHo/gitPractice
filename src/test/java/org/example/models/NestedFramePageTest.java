package org.example.models;

import org.testng.annotations.Test;

public class NestedFramePageTest extends BaseTest {

    @Test
    void testNestedFrame() {
      driver.get("https://demoqa.com/nestedframes");
nestedFramePage.toParentFrame().toChildFrame();
    }
}