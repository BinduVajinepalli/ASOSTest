package com.test.asos.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AsosSearchResultPage extends AbstractPage{

    @FindBy(css = "div#chrome-breadcrumb li:nth-child(2)")
    private WebElement searchText;

    @FindBy(css = "div[data-auto-id=\"productList\"] section button span")
    private WebElement btnSaveForLater;

    @FindBy(css = "div[data-auto-id=\"productTileDescription\"] div p")
    private WebElement itemName;

    public AsosSearchResultPage(WebDriver driver) {
        super(driver);
    }

    public String getResultText() {
        return searchText.getText();
    }

    public void saveAnItem() {
        btnSaveForLater.click();
    }

    public String getSavedItemName() {
        return itemName.getText();
    }

    public void selectTheItem() {
        itemName.click();
    }
}