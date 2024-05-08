import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Task1 {

    @Test
    public void practiceTest() {
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
    public static WebDriver  initDriver(String browserName) {
        // Task 1 write generic method for creating driver object
        // and return specific driver instance

        WebDriver driver;
        if (browserName.equalsIgnoreCase("chrome")){
            driver=new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            driver=new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            driver=new EdgeDriver();
        }
        else {
            throw new IllegalArgumentException("Unsupported browser");
        }
        return driver;


    }

}





