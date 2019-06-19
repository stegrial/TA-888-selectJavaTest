import io.trueautomation.client.driver.TrueAutomationDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static io.trueautomation.client.TrueAutomationHelper.ta;

public class fb {
    private WebDriver driver;
    private By dropedown = By.id(ta("fb:dropedown", "day"));

    @BeforeTest
    public void beforeTest() {
        driver = new TrueAutomationDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test(description = "Using the 'select' method for drop-down lists.")
    public void methodSelectTest() throws InterruptedException {
        driver.get("https://www.facebook.com");

        Select element = new Select(driver.findElement(dropedown));
        element.selectByValue("13");
//        element.selectByVisibleText("Отчет");

        Thread.sleep(2000);
    }

    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
