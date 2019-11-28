package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormAuthentication extends BasePage {

    public FormAuthentication(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    private String url = "https://the-internet.herokuapp.com/login";

    public void authenticate() {
        inputById("username", "tomsmith");
        inputById("password", "SuperSecretPassword!");
        clickByCss("i.fa");
    }

    public void checkIfLoggedIn(String s) {
        switch (s) {
            case "successfully":
                assert getTextById("flash").equals("You logged into a secure area!");

            case "invalid password":
                assert getTextById("flash").equals("Your password is invalid!");

            case "invalid username":
                assert getTextById("flash").equals("Your username is invalid!");

        }
    }


}
