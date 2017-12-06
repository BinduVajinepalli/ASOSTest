package com.test.asos.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AsosBasketPage extends AbstractPage {

    @FindBy(css = "div.bag-item-descriptions")
    private WebElement productInTheBag;

    public AsosBasketPage(WebDriver driver) {
        super(driver);
    }

    public Boolean isItemAddedToBag() {
        return productInTheBag.isEnabled();
    }
}