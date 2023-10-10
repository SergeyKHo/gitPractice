package org.example.models.pages;

import org.example.models.Student;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebTablePage extends BasePage{

        @FindBy(id = "addNewRecordButton")
        public WebElement addBtn;
        @FindBy(id = "firstName")
        public WebElement firstNameInput;
        @FindBy(id = "lastName")
        public WebElement lastNameInput;
        @FindBy(id = "userEmail")
        public WebElement emailInput;
        @FindBy(id = "age")
        public WebElement ageInput;

        @FindBy(id = "salary")
        public WebElement salaryInput;
        @FindBy(id = "department")
        public WebElement departmentInput;
        @FindBy(id = "submit")
        public WebElement submitBtn;

        public WebTablePage addButtonClick() {
            elementActions.clickElement(addBtn);
            return this;
        }

        public WebTablePage fillUpFirstName(String txt) {
            elementActions.writeText(firstNameInput, txt);
            return this;
        }

        public WebTablePage fillUpLastName(String txt) {
            elementActions.writeText(lastNameInput, txt);
            return this;
        }

        public WebTablePage fillAUpEmail(String txt) {
            elementActions.writeText(emailInput, txt);
            return this;
        }

        public WebTablePage fillUpAge(String txt) {
            elementActions.writeText(ageInput, txt);
            return this;
        }

        public WebTablePage fillUpSalary(String txt) {
            elementActions.writeText(salaryInput, txt);
            return this;
        }

        public WebTablePage fillUpDepartmen(String txt) {
            elementActions.writeText(departmentInput, txt);
            return this;
        }

        public WebTablePage clickSubmit() {
            elementActions.clickElement(submitBtn);
            return this;
        }

        public WebTablePage fillUpTheForm(Student student) {

            fillUpFirstName(student.getFirstName());
          fillUpLastName(student.getLastName());
           fillAUpEmail(student.getEmail());
            fillUpAge(student.getAge());
            fillUpSalary(student.getSalary());
            fillUpDepartmen(student.getDepartment());
            clickSubmit();
            return this;
        }

    }

