package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class TestSteps {

    WebDriver driver = Steps.driver;
    HomePage homePage = new HomePage(driver);

    @Given("I go to dir bg")
    public void goToGoogle() {
        System.out.println("Before navigation");
//        homePage.navigateTo();
        System.out.println("After navigation");
    }

    @When("^I click on dnes dir bg$")
    public void iClickOnDnesDirBg() {
        driver.findElement(By.cssSelector("li > a[href='https://dnes.dir.bg/']"));
    }

    @Then("^I will go to dnes dir bg$")
    public void iWillGoToDnes() {
        driver.getCurrentUrl().contains("dnes.dir.bg");
    }

}
