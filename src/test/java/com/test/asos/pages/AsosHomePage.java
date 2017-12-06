package com.test.asos.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AsosHomePage extends AbstractPage{
    private static final String URL = "http://www.asos.com/";

    @FindBy(css = "button[data-testid=\"country-selector-btn\"]")
    private WebElement btnCountrySelector;

    @FindBy(css = "select#country option[value=\"AU\"]")
    private WebElement lnkAustralianSite;

    @FindBy(id = "chrome-search")
    private WebElement txtSearchBox;

    @FindBy(css = "button[data-testid=\"save-country-button\"]")
    private WebElement btnUpdatePreferences;

    @FindBy(css = "html[lang=\"en-AU\"]")
    private WebElement auPageSource;

    public AsosHomePage(final WebDriver driver) {
        super(driver);
    }

    public void goTo() throws InterruptedException {
        this.driver.get(URL);
    }

    public void searchFor(String product) {
        wait.until(ExpectedConditions.visibilityOf(this.txtSearchBox));
        txtSearchBox.sendKeys(product);
        txtSearchBox.submit();
    }

    public void goToAustraliaLink() {
        btnCountrySelector.click();
        lnkAustralianSite.click();
        btnUpdatePreferences.click();
        wait.until(ExpectedConditions.visibilityOf(auPageSource));
    }

}
