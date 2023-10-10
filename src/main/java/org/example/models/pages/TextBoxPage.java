package org.example.models.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class TextBoxPage extends BasePage {


    WebDriver driver;
    public TextBoxPage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy(id = "userName")
    public WebElement fullNameInput;

    @FindBy(id = "userEmail")
    public WebElement userEmailInput;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressInput;

    @FindBy(id = "submit")
    public WebElement submitButtonEnter;

     @FindBy(id="output")
     public WebElement allFields;

    public TextBoxPage fillUpFieldName(String fullName) {
        elementActions.writeText(fullNameInput, fullName);
        return this;

    }
    public TextBoxPage fillUpFieldEmail(String email) {
        elementActions.writeText(userEmailInput, email);
        return this;
    }
    public TextBoxPage fillUpFieldCAddress(String CAddress) {
        elementActions.writeText(currentAddressInput, CAddress);
        return this;
    }
    public TextBoxPage fillUpFieldPAddress(String pAddress) {
        elementActions.writeText(permanentAddressInput, pAddress);
        return this;
    }
    public  TextBoxPage submitBtmClick(){
        elementActions.waitElementToBeClickable (submitButtonEnter);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center'});", submitButtonEnter);
        elementActions.clickElement (submitButtonEnter);
        return this;
    }

    public  TextBoxPage testTexBoxEquals(){
        Assert.assertEquals(allFields.getText(),"Name:Ann\n" +
                "Email:ann@gamil.com\n" +
                "Current Address :Asanbai\n" +
                "Permananet Address :Bishkek");

        return this;

}

}