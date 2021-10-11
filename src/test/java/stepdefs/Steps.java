package stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Steps {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void startBrowser() {
        if (driver == null) {
//            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            wait = new WebDriverWait(driver, 5);
        }
    }

    @AfterClass
    public void closeBrowser() {
//        driver.quit();
    }

}
