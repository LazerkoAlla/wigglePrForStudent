package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainFactoryTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();

    @Test (description = "Assert the main page is loaded and account icon is visible")
    public void assertAccountIconIsDisplayed() {
        boolean actualResult = mainFactoryPage .isAccountLinkDisplayed();
        Assert.assertEquals(actualResult, true, "Account link isn't visible");
    }

    @Test (description = "Assert the login page is loaded", dependsOnMethods = "assertAccountIconIsDisplayed")
    public void assertLoginPageOpened() {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        Assert.assertEquals(new LoginPage().isLoginContainerDisplayed(), true, "Login page isn't loaded properly");
    }


    @Test(description = "Assert email entering validation")
    public void addOldCustomer() throws InterruptedException {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        mainFactoryPage.enterEmail("1111@gmail.com");
        mainFactoryPage.enterPassword("1111110");
        Assert.assertEquals(new MainFactoryPage().isEmailFormDisplayed(), true, "Email isn't entered");
    } //вводит и удаляет данные в полях

    @Test (description = "Assert email entering validation")
    public void addNewCustomer() throws InterruptedException {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        mainFactoryPage.enterNewCustomerEmailAddressField("1111@gmail.com");
        mainFactoryPage.clickContinueNewCustomerButton();
        Assert.assertEquals(new MainFactoryPage().isEmailFormDisplayed(), true, "Email isn't entered");
    } //вводит и удаляет данные в полях, затем нажимает кнопку


}
