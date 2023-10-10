package org.example;

import org.example.models.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DateOfBD extends BasePage {

    @FindBy(id ="dateOfBirthInput")
    public WebElement fieldDateOfBirthDay;

    @FindBy(className = "react-datepicker__month-select")
    public WebElement fieldMonthOfBirthDay;

    @FindBy(className = "react-datepicker__year-select")
    public WebElement fieldYearOfBirthDay;

    @FindBy(xpath = ".//*[text()='18']")
    public WebElement fieldDyaOfBirthDay;

    public DateOfBD selectField(){
        elementActions.clickElement(fieldDateOfBirthDay);
        return this;
    }

    public DateOfBD selectMonth() {
        elementActions.clickElement(fieldMonthOfBirthDay);
        elementActions.selectRandom(fieldMonthOfBirthDay);
        return this;
    }


    public DateOfBD selectYear(){
   //     elementActions.clickElement(fieldYearOfBirthDay);
       elementActions.selectRandom((fieldYearOfBirthDay));
//       fieldYearOfBirthDay.sendKeys(Keys.ENTER);
        return this;
    }

    public DateOfBD selectDay(){
        elementActions.clickElement(fieldDyaOfBirthDay);

//        List<String> inputDate = new ArrayList<>();
//        if (!fieldDyaOfBirthDay.isEmpty()) {
//            for (WebElement element : fieldDyaOfBirthDay) {
//                inputDate.add(element.getText());
//                System.out.println(element.getText());
//                elementActions.clickToRandomElement(inputDate,fieldDyaOfBirthDay),
//            }
//        }


        return this;
    }






}
