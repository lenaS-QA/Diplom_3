package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By registrationButton = By.className("Auth_link__1fOlj");
    private By emailField = By.xpath(".//input[@name='name']");
    private By passwordField = By.xpath(".//input[@name='Пароль']");
    private By loginButton = By.xpath("//button[text()='Войти']");
    private By recoverPasswordButton = By.xpath(".//a[text()='Восстановить пароль']");
    private By loginHeaderText = By.xpath(".//h2[text()='Вход']");

    public LoginPage (WebDriver driver) {
        this.driver=driver;
    }

    public LoginPage clickRegistrationButton() {
        driver.findElement(registrationButton).click();
        return new LoginPage(driver);
    }

    public LoginPage fillEmailField(String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public LoginPage fillPasswordField(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }

    public LoginPage clickRecoverPasswordButton() {
        driver.findElement(recoverPasswordButton).click();
        return new LoginPage(driver);
    }

    public boolean isLoginHeaderDisplayed() {
        return driver.findElement(loginHeaderText).isDisplayed();
    }
}
