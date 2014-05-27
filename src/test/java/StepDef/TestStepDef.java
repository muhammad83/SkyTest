package StepDef;

import PageObjects.FindnWatchPage;
import PageObjects.HomePage;
import PageObjects.SearchResultPage;
import SharedDriver.SharedDriver;
import cucumber.api.java.en.*;
import org.junit.Assert;

/**
 * Created by muhammadqureshi on 24/05/2014.
 */
public class TestStepDef {

    private SharedDriver driver;
    private HomePage homePage;
    private FindnWatchPage findnWatchPage;
    private SearchResultPage searchResultPage;

    public TestStepDef(SharedDriver driver)
    {
        homePage = new HomePage(driver);
        findnWatchPage = new FindnWatchPage(driver);
        searchResultPage = new SearchResultPage(driver);
    }

    @Given("^I am on the 'Find&Watch TV' page$")
    public void I_am_on_the_Find_Watch_TV_page() throws Throwable {
        homePage.BrowserToFindnWatchTv();
        Assert.assertTrue(findnWatchPage.DoesTitleContain("Find & Watch"));
    }

    @When("^I search for \"([^\"]*)\"$")
    public void I_search_for(String searchString) throws Throwable {
        findnWatchPage.SearchFor(searchString);
        Assert.assertTrue(searchResultPage.DoesUrlContain(searchString));
    }

    @Then("^I should get a results page of available episodes$")
    public void I_should_get_a_results_page_of_available_episodes() throws Throwable {
        searchResultPage.SearchResults();
    }

    @Then("^I should see the \"([^\"]*)\" button$")
    @And("^I should also see the \"([^\"]*)\" button$")
    public void I_should_see_the_button(String buttonName) throws Throwable {
        Assert.assertTrue(searchResultPage.CheckButton(buttonName));
    }
}
