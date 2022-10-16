package com.stv.factory.factorypages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(id = "accountLink")
    private WebElement accountLink;

    @FindBy(xpath = "//button[contains(text(),'Accept All Cookies')]")
    private WebElement trustButton;

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




    public boolean isAccountLinkDisplayed(){
        return accountLink.isDisplayed();
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


    public boolean isEmailFormDisplayed(){
        return emailAddressField.isDisplayed();
    }

    public void clickOnAccountLink(){
        accountLink.click();
    }

    public void clickOnTrustButton(){
        trustButton.click();
    }

    public void enterNewCustomerEmailAddressField(String s) {

        emailAddressField.sendKeys(s);
        emailAddressField.clear();
    }

    public void clickContinueNewCustomerButton(){
        continueNewCustomerButton.click();

    } //жмет на кнопку после удления и введения данных


    public void enterEmail(String email) {

        continueEmailAddress.sendKeys(email);
        continueEmailAddress.sendKeys(Keys.RETURN);
        continueEmailAddress.clear();
    }
    public void enterPassword(String ps) {

       continuePassword.sendKeys(ps);
       continuePassword.clear();
    }


    public void clickContinueOldCustomerButton(){
        continueCustomerButton.click();
    } //жмет на кнопку сайн ин сикьюрели



}
