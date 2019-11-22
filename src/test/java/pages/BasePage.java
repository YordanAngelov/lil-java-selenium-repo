package pages;

import org.openqa.selenium.WebDriver;
import stepdefs.Steps;

public abstract class BasePage extends Steps {

    WebDriver driver;

    BasePage(WebDriver driver){
        this.driver = driver;
    }

}
