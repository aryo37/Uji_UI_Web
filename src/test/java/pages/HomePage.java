package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {

    WebDriver driver;

    By bikeLightItem = By.xpath("//*[@id=\"item_0_title_link\"]/div");

    public HomePage (WebDriver driver) {
        this.driver = driver;
    }

    public void validatedBikeLightDisplated() {

        assertTrue(driver.findElement(bikeLightItem).isDisplayed());
    }
}
