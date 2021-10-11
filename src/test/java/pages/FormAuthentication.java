package pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormAuthentication extends BasePage {

    public FormAuthentication(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    private static final String url = "https://the-internet.herokuapp.com/login";
    private static final String BUTTON_CSS = "i.fa";
    private static final String USERNAME_ID = "username";
    private static final String PASSWORD_ID = "password";

    public void authenticate() {
        inputById(USERNAME_ID, "tomsmith");
        inputById(PASSWORD_ID, "SuperSecretPassword!");
        clickByCss(BUTTON_CSS);
    }

    public void failToAuthenticate(String s) {
        if (s.equals("invalid password")) {
            inputById(USERNAME_ID, "tomsmith");
            inputById(PASSWORD_ID, "wrongPass");
            clickByCss(BUTTON_CSS);
        } else if (s.equals("invalid username")) {
            inputById(USERNAME_ID, "wrongUsername");
            inputById(PASSWORD_ID, "SuperSecretPassword!");
            clickByCss(BUTTON_CSS);
        } else {
            Assertions.fail("There is currently no scenario for '" + s + "'.");
        }
    }

    public void checkIfLoggedIn(String s) {
        switch (s) {
            case "successfully":
                Assertions.assertThat(getTextById("flash")).isEqualTo("You logged into a secure area!\n×");
                break;

            case "invalid password":
                Assertions.assertThat(getTextById("flash")).isEqualTo("Your password is invalid!\n×");
                break;

            case "invalid username":
                Assertions.assertThat(getTextById("flash")).isEqualTo("Your username is invalid!\n×");
                break;
        }
    }


}
