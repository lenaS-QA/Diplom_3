package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalAccountPage {
    private WebDriver driver;

    private By profileNameField = By.xpath(".//input[@name='Name']");
    private By constructorButton = By.xpath(".//p[text()='Конструктор']");
    private By logo = By.className("AppHeader_header__logo__2D0X2");
    private By logOutButton = By.xpath(".//button[text()='Выход']");

    public PersonalAccountPage(WebDriver driver) {
        this.driver=driver;
    }

    public boolean isProfileNameFieldDisplayed() {
        return driver.findElement(profileNameField).isDisplayed();
    }

    public PersonalAccountPage clickConstructorButton() {
        driver.findElement(constructorButton).click();
        return new PersonalAccountPage(driver);
    }

    public PersonalAccountPage clickLogoField() {
        driver.findElement(logo).click();
        return new PersonalAccountPage(driver);
    }

    public PersonalAccountPage clickLogoutButton() {
        driver.findElement(logOutButton).click();
        return new PersonalAccountPage(driver);
    }
}

