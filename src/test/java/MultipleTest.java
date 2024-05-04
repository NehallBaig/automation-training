import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MultipleTest {

    // global variable
    // class variable
    // instance variable
    static WebDriver driverTemp;

    @Test(priority =  1)
    public void loginSauce() {

        WebDriver driver = DriverManagerTest.getDriver();

            //    DriverManagerTest.initDriver("chrome");

        driverTemp = driver;
        // driver please navigate to this url
        driver.get("https://www.saucedemo.com/");

        WebElement userTextBoxElement = driver.findElement(By.id("user-name"));
        WebElement passwordTextFieldElement = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        userTextBoxElement.sendKeys("standard_user");
        passwordTextFieldElement.sendKeys("secret_sauce");
        loginButton.click();
    }

    @Test(priority = 2)
    public void homeTest() {

        WebDriver driver = DriverManagerTest.getDriver();


        System.out.println(driver.findElement(By.className("app_logo")).getText());;
        System.out.println(driver.getCurrentUrl());


//        new ChromeDriver();
//        new ChromeDriver();
//        new ChromeDriver();
//        new ChromeDriver();
//        new ChromeDriver();

    }


}
