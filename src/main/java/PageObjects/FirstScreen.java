package PageObjects;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstScreen extends BaseScreen {

    AppiumDriver driver;

    @FindBy(id = "button_first")
    WebElement button;

    public FirstScreen(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFirstButton() {
        methods.clickButton(button);
        assertion.assertSmth();
    }
}
