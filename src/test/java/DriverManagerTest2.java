import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverManagerTest2 {


    @Test
    public void practiceTest() {

        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.google.com");
        chromeDriver.quit();

        EdgeDriver edgeDriver = new EdgeDriver();
        edgeDriver.get("https://www.google.com");
        edgeDriver.quit();

        FirefoxDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.google.com");
        firefoxDriver.quit();

        // method to initialize driver based on the provided browser name
        initDriver("chrome");
        initDriver("firefox");
        initDriver("edge");

    }


    /**
     * Initializes a WebDriver instance based on the provided browser name.
     *
     * @param browserName A String representing the name of the browser to be initialized. Supported values are "chrome", "firefox", and "edge".
     * @throws IllegalArgumentException If an unsupported browser name is provided.
     */
    public static void initDriver(String browserName) {
        // Task 1 write generic method for creating driver object
        // and return specific driver instance
    }

}