package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecoverPasswordPage {
    private WebDriver driver;

    private static By loginButton = By.xpath(".//a[text()='Войти']");

    public RecoverPasswordPage(WebDriver driver) {
        this.driver=driver;
    }

    public RecoverPasswordPage clickLoginButtonOnRecoverPasswordPage() {
        driver.findElement(loginButton).click();
        return new RecoverPasswordPage(driver);
    }
}
