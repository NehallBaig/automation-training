import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MultipleTest {

    @Test
    public void test1() {
        // 2
        WebDriver driver = DriverManagerTest.initDriver("edge");

        //
        try {
            driver.get("https://www.google.com");
        } catch (Exception e) {
            WebDriver driver1 = new EdgeDriver();
            driver1.get("https://www.google.com");
            System.out.println(e);
        }

        System.out.println("test 1 next line executed after exception is thrown");


    }

    @Test
    public void test2() {
        //2
        WebDriver driver = DriverManagerTest.initDriver("edge");
        driver.get("https://www.google.com");
    }

    @Test
    public void test3() {
        //2
        WebDriver driver = DriverManagerTest.initDriver("edge");
        driver.get("https://www.google.com");
    }

    @Test
    public void test4() {
        //2 - > 8
        WebDriver driver = DriverManagerTest.initDriver("edge");
        driver.get("https://www.google.com");
    }
}
