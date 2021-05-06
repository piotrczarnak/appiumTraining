package PageObjects;

import Utils.Assertions;
import Utils.Methods;
import io.appium.java_client.AppiumDriver;

public class BaseScreen {

    AppiumDriver driver;
    Methods methods;
    Assertions assertion ;

    public BaseScreen(AppiumDriver driver) {
        this.driver = driver;
        methods = new Methods(driver);
        assertion = new Assertions(methods);
    }

    public FirstScreen startFirstScreen() {
      return new FirstScreen(driver);
    }

}
