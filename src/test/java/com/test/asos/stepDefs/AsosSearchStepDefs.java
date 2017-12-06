package com.test.asos.stepDefs;

import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.test.asos.pages.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class AsosSearchStepDefs implements En{
    private WebDriver driver = new ChromeDriver();

    private AsosHomePage homePage = new AsosHomePage(driver);
    private AsosSearchResultPage resultPage = new AsosSearchResultPage(driver);
    private AsosSaveLaterPage savePage = new AsosSaveLaterPage(driver);
    private AsosProductPage productPage = new AsosProductPage(driver);
    private AsosBasketPage basketPage = new AsosBasketPage(driver);

    private String itemName;

    public AsosSearchStepDefs() {

        Given("^I want to order a shirt$", () -> {
            homePage.goTo();
        });

        When("^I search for \"([^\"]*)\"$", (String criteria) -> {
            homePage.searchFor(criteria);
        });

        When("^I search for \"([^\"]*)\" in the Australian store$", (String criteria) -> {
            homePage.goToAustraliaLink();
            homePage.searchFor(criteria);
        });

        When("^I save a t shirt for later$", () -> {
            resultPage.saveAnItem();
            itemName = resultPage.getSavedItemName();
            resultPage.goToSaveForLaterPage();
        });

        When("^I add a t shirt to bag$", () -> {
            resultPage.selectTheItem();
            itemName = productPage.getProductName();
            productPage.selectSize("M");
            productPage.addToBag();
            productPage.goToBagPage();
        });

        Then("^I should see some \"([^\"]*)\"$", (String criteria) -> {
            assertThat(resultPage.getResultText(),containsString(criteria));
            homePage.quit();
        });

        Then ("^I should see purple t shirt saved for later$", () -> {
            assertThat(savePage.getSavedItemName(), containsString(itemName));
            savePage.quit();
        });

        Then("^I should see purple t shirt added to the bag$", () -> {
            assertThat(basketPage.isItemAddedToBag(), equalTo(true));
            basketPage.quit();
        });

    }

}
