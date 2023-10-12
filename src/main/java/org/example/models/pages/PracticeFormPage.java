package org.example.models.pages;

import org.example.models.Student;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.*;



public class PracticeFormPage extends BasePage {

Student student =new Student();


    @FindBy(id = "firstName")
    public WebElement firstNameInput;

    @FindBy(id = "lastName")
    public WebElement lastNameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;

    @FindBy(xpath = "//div[contains(@class, 'custom-radio')]//label[@class='custom-control-label']")
    public List<WebElement> radioGenderButtons;

    @FindBy(id = "userNumber")
    public WebElement userNumberInput;

    @FindBy(id = "dateOfBirthInput")
    public WebElement fieldDateOfBirthDay;

    @FindBy(className = "react-datepicker__month-select")
    public WebElement fieldMonthOfBirthDay;

    @FindBy(className = "react-datepicker__year-select")
    public WebElement fieldYearOfBirthDay;

    @FindBy(xpath = ".//*[text()='18']")
    public WebElement fieldDyaOfBirthDay;

   @FindBy(id="subjectsInput")
   public WebElement fieldSubject;


    @FindBy(xpath = "//div[@id='hobbiesWrapper']//label[@class='custom-control-label']")
    public List<WebElement> hobbiesCheckboxList;



    @FindBy(id = "uploadPicture")
    public WebElement uploadPictureInput;


    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

//    @FindBy(xpath = "//div[@id='state']//div[@aria-hidden='true']")
    @FindBy(id="state")
    public WebElement inputOpenState;

    @FindBy(id = "react-select-3-input")
    public WebElement inputForStatText;

    @FindBy(id ="city")
    public WebElement inputOpenCity;

    @FindBy(id = "react-select-4-input")
    public WebElement inputForCityText;

    @FindBy(xpath = "//div[@id='state']//div[2]")

    public List<WebElement> containerForStateTexts;

    @FindBy(id="submit")
    public WebElement submit;

    public PracticeFormPage() throws AWTException {
    }


    public PracticeFormPage fillUpTheFirstName(String txt) {
        elementActions.writeText(firstNameInput,txt);
        return this;
    }


    public PracticeFormPage fillUpTheLastName(String txt) {
        elementActions.writeText(lastNameInput,txt);
        return this;
    }

    public PracticeFormPage fillUpTheEmail(String txt) {
        elementActions.writeText(userEmailInput, txt);
        return this;
    }

    public PracticeFormPage clickGender() {
        elementActions.clickToRandomElement(radioGenderButtons);
        return this;
    }

    public PracticeFormPage fillUpThePhoneNumber(String txt) {
        elementActions.writeText(userNumberInput,txt);

        return this;
    }
        public PracticeFormPage selectFieldBDay () {
            elementActions.clickElement(fieldDateOfBirthDay);
            return this;
        }

        public PracticeFormPage selectMonth () {
            elementActions.clickElement(fieldMonthOfBirthDay);
            elementActions.selectRandom(fieldMonthOfBirthDay);
            return this;
        }

        public PracticeFormPage selectYear () {
            elementActions.selectRandom((fieldYearOfBirthDay));
            return this;
        }

        public PracticeFormPage selectDay () {
            elementActions.clickElement(fieldDyaOfBirthDay);
            return this;
        }
     public PracticeFormPage sendToSubject(){
        elementActions.writeText(fieldSubject,"Math");
       fieldSubject.sendKeys(Keys.ENTER);
        return this;
}

        public PracticeFormPage fillUpTheCarrentAddres (String txt){
            elementActions.writeText(currentAddressInput, txt);
            return this;

        }


        public PracticeFormPage clickHobbies () throws InterruptedException {
            elementActions.clickToRandomElement(hobbiesCheckboxList);

            return this;
        }


        public PracticeFormPage setUploadPictureInput (WebElement uploadPictureInput){
            elementActions.writeText(uploadPictureInput, "java.jpg");
            return this;
        }

        public PracticeFormPage selectState () {
            elementActions.scrollToTheElement(inputOpenState);
            elementActions.clickElement(inputOpenState);

            Map<String, String[]> stateAndCityList = new HashMap<>();
            stateAndCityList.put("NCR", new String[]{"Delhi", "Gurgaon", "Noida"});
            stateAndCityList.put("Uttar Pradesh", new String[]{"Agra", "Lucknow", "Merrut"});
            stateAndCityList.put("Haryana", new String[]{"Karnal", "Panipat"});
            stateAndCityList.put("Rajasthan", new String[]{"Jaipur", "Jaiselmer"});

            Random random = new Random();
            String randomKey = new ArrayList<>(stateAndCityList.keySet()).get(random.nextInt(stateAndCityList.size()));
            String randomCity = stateAndCityList.get(randomKey)[random.nextInt(stateAndCityList.get(randomKey).length)];
            elementActions.setTextAndEnterElement(randomKey, inputForStatText);
            elementActions.setTextAndEnterElement(randomCity, inputForCityText);
            return this;


        }
             public PracticeFormPage clickSubmit() {
                 elementActions.clickElement(submit);
                 return this;
             }
                 @FindBy(xpath = "//td[text()='Student Name']/../td[2]")
                 public WebElement expectedName;
                 @FindBy(xpath = "//td[text()='Student Email']/../td[2]")
                 public WebElement expectedEmail;
                 @FindBy(xpath = "//td[text()='Gender']/../td[2]")
                 public WebElement expectedGender;
                 @FindBy(xpath = "//td[text()='Mobile']/../td[2]")
                 public WebElement expectedMobilePhone;
                 @FindBy(xpath = "//td[text()='Date of Birth']/../td[2]")
                 public WebElement expectedDate;
                 @FindBy(xpath = "//td[text()='Subjects']/../td[2]")
                 public WebElement expectedSubjects;
                 @FindBy(xpath = "//td[text()='Hobbies']/../td[2]")
                 public WebElement expectedHobbies;
                 @FindBy(xpath = "//td[text()='Picture']/../td[2]")
                 public WebElement expectedPicture;
                 @FindBy(xpath = "//td[text()='Address']/../td[2]")
                 public WebElement expectedAddress;
                 @FindBy(xpath = "//td[text()='State and City']/../td[2]")
                 public WebElement expectedStateAndCity;



    public PracticeFormPage fillUpTheForm (Student student) throws InterruptedException, AWTException {
        Robot robot = new Robot();
        System.out.println("About to zoom in");
        for (int i = 0; i < 1; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ADD);
            robot.keyRelease(KeyEvent.VK_ADD);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }

        System.out.println("About to zoom out");
        for (int i = 0; i < 6; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_SUBTRACT);
            robot.keyRelease(KeyEvent.VK_CONTROL);
        }

        fillUpTheFirstName(student.getFirstName())
                .fillUpTheLastName(student.getLastName())
                .fillUpTheEmail(student.getEmail())
                .fillUpThePhoneNumber ("1234567890")
                .selectFieldBDay()
                .selectMonth()
                .selectYear()
                .selectDay()
                .fillUpTheCarrentAddres(student.getCurrentAddress())
                .clickHobbies()
                .clickGender()
                .sendToSubject()
                .selectState()
                .clickSubmit();

        return this;

    }

    public PracticeFormPage testStudent(Student student) throws InterruptedException {

        Thread.sleep(2000);

        Assert.assertTrue(expectedName.getText().contains(student.getFirstName()));
        Assert.assertTrue(expectedName.getText().contains(student.getLastName()));
        Assert.assertTrue(expectedEmail.getText().contains(student.getEmail()));
        Assert.assertTrue(expectedAddress.getText().contains(student.getCurrentAddress()));
//        Assert.assertTrue(expectedMobilePhone.getText().contains(student.getPhoneNumber()));
        return this;
    }
}


