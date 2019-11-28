package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TheInternet extends BasePage {

    public TheInternet(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    private String url = "https://the-internet.herokuapp.com/";

    public void navigateTo() {
        driver.get(url);
    }

    public void goToSection(String section) {
        clickByLinkText(section);
    }

}
