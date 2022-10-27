package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrandPage extends FactoryPage {

    @FindBy(id = "quickBuyButton")
    private WebElement addToBasketButton;  //shopping basket

    @FindBy(xpath = "//*[contains(@href,'https://www.wiggle.co.uk/all-brands')]")
    private WebElement allBrands; //all brands //all brands displayed

    @FindBy (xpath = "//*[contains(@href,'/dhb')][2]")
    private WebElement dhb; //dhb //dhb displayed

    @FindBy(xpath = "//*[contains(@href,'https://www.wiggle.co.uk/dhb-merino-short-sleeve-base-layer-m-150')][1]")
    private WebElement cap; //item

    @FindBy(xpath ="//*[contains(@class,'bem-sku-selector__option-prompt')][1]")
    private WebElement colorField; //open color field

    @FindBy(xpath = "//*[contains(@class,'bem-sku-selector__option-group-item')][1]")
    private WebElement color; //first color

    @FindBy(xpath = "//*[@id=\"quickBuyBox\"]/form/div[1]/div[5]/a")
    private WebElement selectSize; //size

    @FindBy(xpath = "//*[@id=\"quickBuyBox\"]/form/div[1]/div[5]/div/ul/li[1]")
    private WebElement smallSize; //small size

    @FindBy(id = "view-basket")
    private WebElement viewBasketLink; //open basket

    @FindBy(id = "continue-shopping")
    private WebElement continueShoppingButton;  //continue shopping

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

    public void continueShoppingButton(){
        continueShoppingButton.click();
    }

    public boolean isAllBrandsDisplayed() {
        return allBrands.isDisplayed();
    }

    public boolean isDhbDisplayed() {
        return dhb.isDisplayed();
    }

}
