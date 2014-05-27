package PageObjects;

import SharedDriver.SharedDriver;
import org.openqa.selenium.By;

/**
 * Created by muhammadqureshi on 24/05/2014.
 */
public class SearchResultPage {
    private SharedDriver driver;

    public SearchResultPage(final SharedDriver driver) {
        this.driver = driver;
    }

    public Boolean DoesUrlContain(String keyword) {
        return driver.getCurrentUrl().replaceAll("%20", " ").contains(keyword);
    }

    private int searchResultsSize() {
        return driver.findElements(By.xpath("//ul[contains(@id,'results')]/li[contains(@class,'result')]")).size();
    }

    public Boolean SearchResults() {
        return searchResultsSize() > 0;
    }

    public boolean CheckButton(String buttonName) {
        return driver.findElements(By.xpath(
                "//a[contains(@class,'viewing-option-button go-button')]" +
                        "[contains(text(),'" + buttonName + "')]"
        )).size() == searchResultsSize();
    }
}
