package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrandPage extends FactoryPage {

    @FindBy(id = "quickBuyButton")
    private WebElement addToBasketButton;  //корзина

    @FindBy(xpath = "//*[@id=\"quickBuyBox\"]/form/div[1]/div[5]/a")
    private WebElement selectSize; //size

    @FindBy(xpath = "//*[@id=\"quickBuyBox\"]/form/div[1]/div[5]/div/ul/li[1]")
    private WebElement smallSize; //small size

    @FindBy(xpath = "//*[contains(@href,'https://www.wiggle.co.uk/all-brands')]")
    private WebElement allBrands; //all brands

    @FindBy(xpath = "//*[@id=\"wiggle\"]/div/div/div/div[1]/div/div[1]/a[1]")
    private WebElement dhb; //dhb

    @FindBy(xpath = "//*[@id=\"search-results\"]/div[46]/div")
    private WebElement cap; //cap

    @FindBy(xpath = "//*[@id=\"quickBuyBox\"]/form/div[1]/div[2]/a")
    private WebElement colorField; //open color field

    @FindBy(xpath = "//*[@id=\"quickBuyBox\"]/form/div[1]/div[2]/div/ul/li[1]")
    private WebElement color; //color green

    @FindBy(id = "view-basket")
    private WebElement viewBasketLink; //open basket

    @FindBy(xpath = "//*[@id=\"continue-shopping\"]")
    private WebElement continueShoppingButton;  //continue shopping

    @FindBy(xpath = "//*[@id=\"wiggle\"]/div/div/div/div[1]/div")
    private WebElement getAllBrands;  //brands displayed

    @FindBy(xpath = "//*[@id=\"wiggle\"]/div/div[1]/div[2]/div/div[1]/div/img")
    private WebElement getDhb;  //dhb displayed

    @FindBy(xpath = "/html/body/div[17]/div/div/div/div[2]/div[1]/div/div/div[2]/a/img")
    private WebElement getBasket;  //basket displayed

    public void clickAllBrands(){
        allBrands.click();
    }

    public void clickDHB(){
        dhb.click();
    }

    public void clickCap(){
        cap.click();
    }

    public void clickColorField(){
        colorField.click();
    }

    public void chooseColor(){
        color.click();
    }

    public void clickSize(){
        selectSize.click();
        smallSize.click();
    }
    public void addBasketButton(){
        addToBasketButton.click();
    }

    public void viewBasketLink(){
        viewBasketLink.click();
    }

    public void continueShoppingButton(){
        continueShoppingButton.click();
    }

    public boolean isAllBrandsDisplayed() {
        return getAllBrands.isDisplayed();
    }

    public boolean isDhbDisplayed() {
        return getDhb.isDisplayed();
    }

    public boolean isBasketDisplayed() {
        return getBasket.isDisplayed();
    }
}
