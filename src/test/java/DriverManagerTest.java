import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverManagerTest {

    @Test
    public void practiceTest() {

//        ChromeDriver chromeDriver = new ChromeDriver();
//        chromeDriver.get("https://www.google.com");
//        chromeDriver.quit();
//
//        EdgeDriver edgeDriver = new EdgeDriver();
//        edgeDriver.get("https://www.google.com");
//        edgeDriver.quit();
//
//        FirefoxDriver firefoxDriver = new FirefoxDriver();
//        firefoxDriver.get("https://www.google.com");
//        firefoxDriver.quit();

        WebDriver chromeDriver = initDriver("chrome");
        gotToURL(chromeDriver, "https://www.google.com");
        quitDriver(chromeDriver);

        WebDriver edgeDriver = new EdgeDriver();
        gotToURL(edgeDriver, "https://www.google.com");
        quitDriver(chromeDriver);

        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.google.com");
        quitDriver(firefoxDriver);

        // method to initialize driver based on the provided browser name
        // initDriver("chrome");
        // initDriver("firefox");
        // initDriver("edge");

    }


    public void quitDriver(WebDriver driver) {
        driver.quit();
    }

    // Refactor code
    public void gotToURL(WebDriver driver, String url) {
        driver.get(url);
    }


    /**
     * Initializes a WebDriver instance based on the provided browser name.
     *
     * @param browserName A String representing the name of the browser to be initialized. Supported values are "chrome", "firefox", and "edge".
     * @return A WebDriver instance corresponding to the specified browser.
     * @throws IllegalArgumentException If an unsupported browser name is provided.
     */

    public static WebDriver initDriver(String browserName) {
        // Task 1 write generic method for creating driver object
        // and return specific driver instance

        // Example of Interface variable
        // Declaration of WebDriverType Variable
         WebDriver driver;
        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser");
        }

        return driver;
    }
}
