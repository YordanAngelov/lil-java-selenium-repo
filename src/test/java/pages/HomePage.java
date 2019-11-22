package pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver){
        super(driver);
    }

    String url = "www.dir.bg";

    public void navigateTo() {
        driver.get(url);
    }

}
