package org.example.models.pages;
import org.example.models.Student;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy(id = "firstname")
    public WebElement firstNameInput;

    @FindBy(id = "lastname")
    public WebElement lastNameInput;

    @FindBy(id = "userName")
    public WebElement userNameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(css = "iframe[title='reCAPTCHA']")
    public WebElement recaptchaFrame;

    @FindBy(xpath= "//div[@class='recaptcha-checkbox-border']")
    public WebElement recaptchaAnchorClick;


    @FindBy(id = "register")
    public WebElement registerButton;

    public RegistrationPage fillUpFirstName(String txt) {
        elementActions.writeText(firstNameInput, txt);
        return this;
    }

    public RegistrationPage fillUpLastName(String txt) {
        elementActions.writeText(lastNameInput, txt);
        return this;
    }

    public RegistrationPage createUserName(String txt) {
        elementActions.writeText(userNameInput, txt);
        return this;
    }

    public RegistrationPage createPassword(String txt) {
        elementActions.writeText(passwordInput, txt);
        return this;
    }

    public RegistrationPage clickReCaptcha() {
        frameHelper.switchToFrame(recaptchaFrame);
        elementActions.clickElement(recaptchaAnchorClick);
        return this;
    }



    public RegistrationPage clickRegistrationButton() {
        elementActions.clickElement(registerButton);
        return this;
    }

    public RegistrationPage fillUpTheRegistrationForm(Student student) {
        fillUpFirstName(student.getFirstName()).fillUpLastName(student.getLastName())
                .createUserName(student.getUserName())
                .createPassword("07071982Serg#")
                .clickReCaptcha().clickRegistrationButton();
        return this;
    }

}





