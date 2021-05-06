package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    AppiumDriver driver;

    public AppiumDriver getDriver(String type) {
        if (driver == null) {
            driver = createDriver(type);
        }
        return driver;
    }

    private AppiumDriver createDriver(String type) {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        if (type.equalsIgnoreCase("Android")) {
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "10");
            capabilities.setCapability("deviceName", "emulator-5554");
            capabilities.setCapability("appPackage", "dev.test.myapplication_sda"); //pamiętajcie zmienić tą wartość na nazwę Waszej aplikacji testowej
            capabilities.setCapability("appActivity", ".MainActivity");
            return new AndroidDriver(url, capabilities);
        } else {
            return new IOSDriver(url, capabilities);
        }
    }

}
