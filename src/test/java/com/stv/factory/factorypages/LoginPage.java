package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends FactoryPage {
    @FindBy(className = "bem-checkout__login-container")
    private WebElement loginContainer;

    @FindBy(id = "DualRegisterEmailModel_Email")
    private WebElement emailAddressField;

    @FindBy(id = "qa-dual-register")
    private WebElement continueNewCustomerButton;

    @FindBy(id = "LogOnModel_UserName")
    private WebElement continueEmailAddress;//поле имейл

    @FindBy(id = "LogOnModel_Password")
    private WebElement continuePassword;// пароль

    @FindBy(id = "qa-login")
    private WebElement continueCustomerButton;// кнопка

    @FindBy(id = "LogOnModel_UserName-error")
    private WebElement emailValidationMessage;

    @FindBy(id="passwordToggle")
    private WebElement passwordCheckBox;  //поле пароля

    public boolean isLoginContainerDisplayed(){ //поле пароля
        return loginContainer.isDisplayed();
    }

    public String getEmailValidationMessage() {
        try {
            return emailValidationMessage.getText();
        } catch (Exception e) {
            return "";
        }
    }

    public boolean isPasswordFormDisplayed() {
        return continuePassword.isDisplayed();
    }

    public boolean isPasswordCheckBoxDisplayed() {
        return passwordCheckBox.isDisplayed();
    }

    public boolean isEmailFormDisplayed(){
        return emailAddressField.isDisplayed();
    }

    public void enterNewCustomerEmailAddressField(String s) {

        emailAddressField.sendKeys(s);
        emailAddressField.clear();
    }

    public void clickContinueNewCustomerButton(){
        continueNewCustomerButton.click();

    } //жмет на кнопку после удления и введения данных

    public void enterEmail(String email) { //вырезать
        continueEmailAddress.sendKeys(email);
        continueEmailAddress.clear();
    }

    public void enterPassword(String password) {
        continuePassword.sendKeys(password);
        continuePassword.clear();
    }

    public void clickContinueOldCustomerButton(){
        continueCustomerButton.click();
    }

}
