import PageObjects.Driver;
import org.testng.annotations.Test;

public class Tests extends BaseTest{

    @Test
    public void firstTest() {
        startTest
                .startFirstScreen()
                .clickFirstButton();
    }
}
