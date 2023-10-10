package org.example.models;

import org.testng.annotations.Test;

public class PracticeFormTest extends BaseTest {
    @Test
    void fillUpTheFormTest() throws InterruptedException {
        driver.get("https://demoqa.com/automation-practice-form");
        Student student = fakeDataProvider.createFakeStudent();
        practiceFormPage.testStudent(student);
    }
}
