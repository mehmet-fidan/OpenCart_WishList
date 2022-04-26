package stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.WishListPage;
import utils.Driver;
import utils.ParentClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WishListStepdefs extends ParentClass {

    WishListPage wishLP = new WishListPage();
    String productN;

    @Given("user is at the homepage")
    public void userIsAtTheHomepage() {
        gotoHomePage(wishLP.url);
    }

    @When("user enters product name in the search field")
    public void userEntersProductNameInTheSearchField() {
        sendKeysTo(wishLP.eSearchField, "macbook air");
    }

    @Then("user clicks on search icon")
    public void userClicksOnSearchIcon() {
        clickTo(wishLP.eSearchButton);
    }

    @And("user clicks displayed product in search results")
    public void userClicksDisplayedProductInSearchResults() {
        clickTo(wishLP.eProduct);
        driver.navigate().back();
    }

    @And("user clicks on Add to Wish List in the Related Products section")
    public void userClicksOnAddToWishListInTheRelatedProductsSection() {
        clickTo(wishLP.eWishListButton);
        productN = wishLP.eProduct.getText();
    }

    @And("user clicks on the wish list link in the displayed success message")
    public void userClicksOnTheWishListLinkInTheDisplayedSuccessMessage() {
        System.out.println(productN);
        sleep(2000);
        clickTo(wishLP.eTextCheck);
    }

    @And("user enters {string} and {string} to login")
    public void userEntersAndToLogin(String email, String password) {
        sendKeysTo(wishLP.eEmil, email);
        sendKeysTo(wishLP.ePassword, password);
        clickTo(wishLP.eLoginButton);
    }


    @And("user checks product availability in wishlist")
    public void userChecksProductAvailabilityInWishlist() {
        Assert.assertEquals(wishLP.eProductName.getText(), productN, "not same");

    }

    @And("user clicks logout at rightside")
    public void userClicksLogoutAtRightside() {
        clickTo(wishLP.eLogout);
    }

    @Given("user is at the login page")
    public void userIsAtTheLoginPage() {
    }

    @When("user clicks store logo")
    public void userClicksStoreLogo() {
        clickTo(wishLP.eYourStore);
    }

    @Then("user scroll into featured section")
    public void userScrollIntoFeaturedSection() {
        scroll(wishLP.eFeaturedText);
    }

    @And("user clicks button for adding product to wishlist")
    public void userClicksButtonForAddingProductToWishlist() {
        clickTo(wishLP.eWishListButton2);
    }


    @When("user hover at desktop at menubar and clicks all desktops")
    public void userHoverAtDesktopAtMenubarAndClicksAllDesktops() {
        // clickTo(wishLP.eBarMenuDesktop);
        Actions builder = new Actions(driver);
        Action action;

        for (int i = 0; i < wishLP.eHoverBarMenu.size(); i++) {

            action = builder.moveToElement(wishLP.eHoverBarMenu.get(i)).build();
            action.perform();
            if (wishLP.eHoverBarMenu.get(i).getText().equals(wishLP.eAllDesktops.getText())) {
                clickTo(wishLP.eAllDesktops);
            }
        }
    }


    @Then("user clicks to mac at leftside menu")
    public void userClicksToMacAtLeftsideMenu() {
        clickTo(wishLP.eMacButton);
    }

    @And("user clicks button for adding product to wishlist three")
    public void userClicksButtonForAddingProductToWishlistThree() {
        clickTo(wishLP.eWishListButton3);
    }

    @And("user scroll into mac text")
    public void userScrollIntoMacText() {
        scroll(wishLP.eScrollToMac);
    }

    @And("user enters username and password to login")
    public void userEntersUsernameAndPasswordToLogin(DataTable table) {
        List<String> list = table.asList(String.class);

        sleep(2000);
        sendKeysTo(wishLP.eEmil, list.get(0));
        sleep(2000);
        sendKeysTo(wishLP.ePassword, list.get(1));
        wishLP.eLoginButton.click();

    }

    @Then("close browser")
    public void closeBrowser() {
        Driver.quitDriver();
    }

    @And("user clicks on Add to Wish List in the Search Results Page")
    public void userClicksOnAddToWishListInTheSearchResultsPage() {
        clickTo(wishLP.eWishListButton);
        productN = wishLP.eProduct.getText();
    }
}