package com.test.asos.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class AsosProductPage extends AbstractPage {

    @FindBy(css = "#product-size section div div.size-section div.colour-size-select select")
    private WebElement lstSelectSize;

    @FindBy(css = "a.add-button")
    private WebElement btnAddToBag;

    @FindBy(css = "#chrome-sticky-header ul[data-testid=\"widgets\"] li:nth-child(4) a[icon=\"bagFilled\"]")
    private WebElement btnAddedToBag;

    @FindBy(css = "div.layout-aside div h1")
    private WebElement productName;

    public AsosProductPage(WebDriver driver) {
        super(driver);
    }

    public void selectSize(String size) {
        wait.until(ExpectedConditions.visibilityOf(lstSelectSize));
        Select dropdown = new Select(lstSelectSize);
        dropdown.selectByVisibleText(size);
    }

    public void addToBag() throws InterruptedException {
        btnAddToBag.click();
        wait.until(ExpectedConditions.visibilityOf(btnAddedToBag));
    }

    public String getProductName() {
        return productName.getText();
    }
}
