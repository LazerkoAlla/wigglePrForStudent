package com.stv.factory.factorytests;

import com.stv.factory.factorypages.LoginPage;
import com.stv.factory.factorypages.MainFactoryPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class MainFactoryTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginPage loginPage = new LoginPage();

    @DataProvider()
    public Object[][] testDataEmail() {
        return new Object[][]{
                new Object[]{"123@mail.ru"}
        };
    }

    @DataProvider()
    public Object[][] testDataEmailAndPassword() {
        return new Object[][]{
                new Object[]{"123@mail.ru", "123"}
        };
    }

    @Test (description = "Assert the main page is loaded and account icon is visible")
    public void assertAccountIconIsDisplayed() {
        boolean actualResult = mainFactoryPage .isAccountLinkDisplayed();
        Assert.assertEquals(actualResult, true, "Account link isn't visible");
    }

    @Test (description = "Assert the login page is loaded", dependsOnMethods = "assertAccountIconIsDisplayed")
    public void assertLoginPageOpened() {
        mainFactoryPage.clickOnTrustButton();
        mainFactoryPage.clickOnAccountLink();
        Assert.assertEquals(loginPage.isLoginContainerDisplayed(), true, "Login page isn't loaded properly");
    }

    @Test (description = "Assert that email form is displayed", dependsOnMethods = "assertLoginPageOpened")
    public void assertEmailFormIsDispayed() {
        boolean actualResult = loginPage.isEmailFormDisplayed();
        Assert.assertTrue(actualResult, "Email form isn't visible");
    }//отображает форму ввода имейла

    @Test(description = "Assert email entering validation",dependsOnMethods = "assertEmailFormIsDispayed", dataProvider = "testDataEmailAndPassword")
    public void addOldCustomer(String email, String password) throws InterruptedException {
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        Assert.assertEquals(loginPage.isEmailFormDisplayed(), true, "Email isn't entered");
    } //вводит и удаляет данные в полях

    @Test(description = "Assert that password form is displayed", dependsOnMethods = "assertLoginPageOpened")
    public void assertPasswordFormIsDispayed() {
        boolean actualResult = loginPage.isPasswordFormDisplayed();
        Assert.assertTrue(actualResult, "Password form isn't visible");
    }//отображает форму ввода пароля

    @Test(description = "Assert that password checkbox is displayed", dependsOnMethods = "assertLoginPageOpened")
    public void assertPasswordCheckboxIsDispayed() {
        boolean actualResult = loginPage.isPasswordCheckBoxDisplayed();
        Assert.assertTrue(actualResult, "Password checkbox isn't visible");
    }//отображает форму ввода пароля

    @Test (description = "Assert email entering validation",dependsOnMethods = {"assertPasswordFormIsDispayed", "assertPasswordCheckboxIsDispayed"}, dataProvider = "testDataEmail")
    public void addNewCustomer(String email) throws InterruptedException {
        loginPage.enterNewCustomerEmailAddressField(email);
        loginPage.clickContinueNewCustomerButton();
        Assert.assertEquals(loginPage.isEmailFormDisplayed(), true, "Email isn't entered");
    } //вводит и удаляет данные в полях, затем нажимает кнопку
}
