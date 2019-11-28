package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import stepdefs.Steps;

public abstract class BasePage extends Steps {

    WebDriver driver;
    private WebDriverWait wait;

    BasePage(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait   = wait;
    }

    private void clickBy(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).click();
    }

    void clickById(String id) {
        clickBy(By.id(id));
    }

    void clickByCss(String css) {
        clickBy(By.cssSelector(css));
    }

    void clickByXpath(String xpath) {
        clickBy(By.xpath(xpath));
    }

    void clickByLinkText(String link) {
        clickBy(By.linkText(link));
    }

    private void inputBy(By by, String keys) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(keys);
    }

    void inputById(String id, String input) {
        inputBy(By.id(id), input);
    }

    void inputByCss(String css, String input) {
        inputBy(By.cssSelector(css), input);
    }

    void inputByXpath(String xpath, String input) {
        inputBy(By.xpath(xpath), input);
    }

    private String getTextBy(By by) {
        return driver.findElement(by).getText();
    }

    String getTextById(String id) {
        return getTextBy(By.id(id));
    }

    String getTextByCss(String css) {
        return getTextBy(By.cssSelector(css));
    }

    String getTextByXpath(String xpath) {
       return  getTextBy(By.xpath(xpath));
    }

}
