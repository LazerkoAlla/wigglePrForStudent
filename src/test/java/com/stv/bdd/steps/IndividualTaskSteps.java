package com.stv.bdd.steps;

import com.stv.factory.factorypages.BrandPage;
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

import static com.stv.framework.core.lib.WigglePageURLs.START_URL;

public class IndividualTaskSteps extends BasicFactoryTest {

    BrandPage brandPage = new BrandPage();

    @When("the User clicks on all brands link")
    public void clickOnBrandLink() {
        brandPage.clickAllBrands();
    }

    @Then("all brands page is visible")
    public void allBrandsIsVisible() {
        brandPage.isAllBrandsDisplayed();
    }

    @When("the User clicks on the first brand")
    public void clickOnFirstBrand() {
        brandPage.clickDHB();
    }

    @Then("first brand page is visible")
    public void dhbIsVisible() {
        brandPage.isDhbDisplayed();
    }

    @When("the User clicks on the last product")
    public void clickOnTheLastProduct() {
        brandPage.clickCap();
    }

    @And("the User selects a color")
    public void selectColor() {
        brandPage.clickColorField();
        brandPage.chooseColor();
    }

    @And("the User selects a size")
    public void selectSize() {
        brandPage.clickSize();
    }

    @And("the User clicks on add to Basket button")
    public void clickAddToBasketButton() {
        brandPage.addBasketButton();
//        brandPage.isBasketDisplayed();
    }

    @And("the User clicks on continue Shopping button")
    public void clickContinueShoppingButton() {
        brandPage.continueShoppingButton();
    }
}