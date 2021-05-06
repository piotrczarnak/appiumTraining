package Utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class Methods {

    AppiumDriver driver;

    public Methods(AppiumDriver driver) {
        this.driver = driver;
    }

    public void clickButton(WebElement element) {
        element.click();
    }
}
