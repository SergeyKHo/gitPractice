package org.example.models;

import org.testng.annotations.Test;

public class checkRegistrationPage extends BaseTest {
    @Test
    public void testRegistrationForm(){
        driver.get("https://demoqa.com/register");
        Student student = fakeDataProvider.createFakeStudent();
        registrationPage.fillUpTheRegistrationForm(student);

    }


}
