package com.test.asos.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AsosSaveLaterPage extends AbstractPage{

    @FindBy(css = "h3.savedItems-item-name a")
    private WebElement savedItem;

    public AsosSaveLaterPage(WebDriver driver) {
        super(driver);
    }

    public String getSavedItemName() {
        wait.until(ExpectedConditions.visibilityOf(savedItem));
        return savedItem.getText();
    }
}
