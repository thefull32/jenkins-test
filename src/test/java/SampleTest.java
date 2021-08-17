import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void oneTest() {
        String baseUrl = "http://google.com";

        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
        WebDriver driver = new FirefoxDriver();

        System.out.println("Here comes the testing!");

        driver.quit();
    }

}
