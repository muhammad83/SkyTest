package PageObjects;

import SharedDriver.SharedDriver;
import org.openqa.selenium.By;


/**
 * Created by muhammadqureshi on 23/05/2014.
 */
public class HomePage {
    private SharedDriver driver;

    public HomePage(final SharedDriver driver) {
        this.driver = driver;
        driver.navigate().to("http://www.sky.com");
    }

    public void BrowserToFindnWatchTv() {
        driver.findElement(By.name("skycom_watch")).click();
    }
}
