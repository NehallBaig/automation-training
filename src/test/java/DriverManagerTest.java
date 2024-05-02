import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DriverManagerTest {


//    @Test
//    public void practiceTest() {
//
////        ChromeDriver chromeDriver = new ChromeDriver();
////        chromeDriver.get("https://www.google.com");
////        chromeDriver.quit();
////
////        EdgeDriver edgeDriver = new EdgeDriver();
////        edgeDriver.get("https://www.google.com");
////        edgeDriver.quit();
////
////        FirefoxDriver firefoxDriver = new FirefoxDriver();
////        firefoxDriver.get("https://www.google.com");
////        firefoxDriver.quit();
////
////        // method to initialize driver based on the provided browser name
////        initDriver("chrome");
////        initDriver("firefox");
//
//
//        WebDriver driver = initDriver("edge");
//
//        driver.get("https://www.google.com");
//
//    }


    /**
     * Initializes a WebDriver instance based on the provided browser name.
     *
     * @param browserName A String representing the name of the browser to be initialized. Supported values are "chrome", "firefox", and "edge".
     * @throws IllegalArgumentException If an unsupported browser name is provided.
     */
    public static WebDriver initDriver(String browserName) {
        //WebDriver driver = null;
        WebDriver driver;

        if (browserName.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("browser not matched");
            throw new IllegalArgumentException("Un supported browser");
        }
        return driver;
    }

}
