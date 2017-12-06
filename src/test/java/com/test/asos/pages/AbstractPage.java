package com.test.asos.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public abstract class AbstractPage {

    protected final WebDriver driver;
    protected final WebDriverWait wait;

    @FindBy(css = "div#chrome-sticky-header div[data-testid=\"header\"] ul[data-testid=\"widgets\"] li:nth-child(3) a")
    private WebElement lnkSaveForLater;

    @FindBy(css = "div#chrome-sticky-header div[data-testid=\"header\"] ul[data-testid=\"widgets\"] li:nth-child(4) a")
    private WebElement lnkBagPage;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 10);
    }

    public void goToSaveForLaterPage() {
        lnkSaveForLater.click();
    }

    public void goToBagPage() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        lnkBagPage.click();
    }

    public void quit() {
        this.driver.quit();
    }

}