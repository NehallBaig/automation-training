import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MultipleTest2 {


    @Test(priority =  3)
    public void Home() {

        System.out.println(MultipleTest.driverTemp.getCurrentUrl());

    }
}
