package com.stv.bdd.steps;

import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorytests.BasicFactoryTest;

import com.stv.framework.core.drivers.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static com.stv.factory.factorytests.BasicFactoryTest.getDriver;
import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public class SignInSteps {
    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();

    @Given("^Main page is loaded$")
    public void navigationPanelIsVisible(){
        WebDriver driver = getDriver();
        driver.get(START_URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        mainFactoryPage.isAccountLinkDisplayed();
        mainFactoryPage.clickOnTrustButton();
    }

    @When("^Click on account link$")
    public void clickOnAccountLink() {
        mainFactoryPage.clickOnAccountLink();
    }

    @Then("^Account page is loaded")
    public void assertLoginPageOpened() {
        Assert.assertEquals(loginPage.isLoginContainerDisplayed(), true, "Login page isn't loaded properly");
    }

    @When("the User inputs email {string}")
    public void theUserInputsEmail(String email) {
        loginPage.enterPassword(email);
    }

    @And("the User inputs password {string}")
    public void theUserInputsPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("^the User clicks Sign in securely button$")
    public void clickContinueOldCustomerButton() {
        loginPage.clickContinueOldCustomerButton();
    }

}