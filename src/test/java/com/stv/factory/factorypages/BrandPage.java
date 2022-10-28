package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrandPage extends FactoryPage {

    @FindBy(id = "quickBuyButton")
    private WebElement addToBasketButton;  //shopping basket

    @FindBy(xpath = "//a[@class='bem-footer__link'][contains(text(),'All Brands')]")
    private WebElement allBrands; //all brands //all brands displayed

    @FindBy (xpath = "//*[contains(@href,'/dhb')][contains(text(),'dhb')]")
    private WebElement dhb; //dhb //dhb displayed

    @FindBy(xpath = "//a[contains(@class,'bem-product-thumb__image-link--grid')][contains(@data-ga-label,'Position 45')]"+
    "[contains(@title,'dhb Merino Short Sleeve Base Layer (M_150)')]")
    private WebElement cap; //item

    @FindBy(xpath ="//div[contains(@class,'bem-sku-selector__option sku-items-parent qa-colour-select')]" +
            "//a[@class='bem-sku-selector__option-prompt'][contains(text(),'Please select')]")
    private WebElement colorField; //open color field

    @FindBy(xpath = "//li[@title='Grey Marl']")
    private WebElement color; //first color

    @FindBy(xpath = "//div[contains(@class,'bem-sku-selector__option')][contains(@data-colour,'Grey Marl')]" +
            "//a[@class='bem-sku-selector__option-prompt']")
    private WebElement selectSize; //size

    @FindBy(xpath = "//li[@title='Extra Small']")
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
