package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.FormAuthentication;
import pages.TheInternet;

public class TheInternetSteps {

    private WebDriver driver                      = Steps.driver;
    private WebDriverWait wait                    = Steps.wait;
    private TheInternet theInternet               = new TheInternet(driver, wait);
    private FormAuthentication formAuthentication = new FormAuthentication(driver, wait);

    @Given("I navigate to the Internet")
    public void navigateToAuthWizard() {
        theInternet.navigateTo();
    }

    @When("I go to ([a-zA-Z &/]{1,30})")
    public void iGoTo(String section) {
        theInternet.goToSection(section);
    }

    @When("I authenticate myself")
    public void iAuthenticateMyself() {
        formAuthentication.authenticate();
    }

    @When("I fail to authenticate myself due to (invalid password|invalid username)")
    public void failToAuthenticateMyself(String s) {
        formAuthentication.failToAuthenticate(s);
    }

    @Then("I will be logged in")
    public void loggedIn() {
        formAuthentication.checkIfLoggedIn("successfully");
    }

    @Then("I will not be logged in because of (invalid password|invalid username)")
    public void notLoggedIn(String s) {
        formAuthentication.checkIfLoggedIn(s);
    }
}
