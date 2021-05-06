import PageObjects.BaseScreen;
import PageObjects.Driver;
import org.aspectj.lang.annotation.Before;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public BaseScreen startTest;

    @BeforeTest
    public void setUpDriver() {
        startTest = new BaseScreen(new Driver().getDriver("Android"));
    }
}
