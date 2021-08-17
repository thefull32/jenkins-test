import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class SampleTest {

    @Test
    public void oneTest() {
        String baseUrl = "http://google.com";

        FirefoxBinary firefoxBinary = new FirefoxBinary();
        firefoxBinary.addCommandLineOptions("--headless");
        //System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");
        System.setProperty("webdriver.gecko.driver","src/main/resources/linux/geckodriver");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxBinary);
        WebDriver driver = new FirefoxDriver(firefoxOptions);

        System.out.println("Here comes the testing!");

        driver.quit();
    }

}
