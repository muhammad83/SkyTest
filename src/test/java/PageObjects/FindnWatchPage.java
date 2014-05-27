package PageObjects;

import SharedDriver.SharedDriver;
import org.openqa.selenium.By;

/**
 * Created by muhammadqureshi on 24/05/2014.
 */
public class FindnWatchPage {
    private SharedDriver driver;

    public FindnWatchPage(final SharedDriver driver) {
        this.driver = driver;
    }

    public Boolean DoesTitleContain(String keyword) {
        return driver.getTitle().contains(keyword);
    }

    public void SearchFor(String keyword) {
        driver.findElement(By.name("query")).sendKeys(keyword);
        driver.findElement(By.name("skycom-search")).click();
    }
}
