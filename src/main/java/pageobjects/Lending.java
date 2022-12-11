package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Lending {
    private WebDriver driver;

    private static final String LENDING_URL = "https://stellarburgers.nomoreparties.site/";

    private By lendingLoginButton = By.xpath("//button[text()='Войти в аккаунт']");
    private By personalAccountButton = By.xpath("//p[text()='Личный Кабинет']");
    private By constructor = By.xpath(".//h1[text()='Соберите бургер']");
    private By sauce = By.xpath(".//span[text()='Соусы']");
    private By bugs = By.xpath(".//span[text()='Булки']");
    private By fillings = By.xpath(".//span[text()='Начинки']");
    private By bugsHeader = By.xpath(".//h2[text()='Булки']");
    private By sauceHeader = By.xpath(".//h2[text()='Соусы']");
    private By fillingsHeader = By.xpath(".//h2[text()='Начинки']");

    public Lending(WebDriver driver) {
        this.driver=driver;
    }

    public Lending open() {
        driver.get(LENDING_URL);
        return this;
    }

    public Lending clickLendingLoginButton() {
        driver.findElement(lendingLoginButton).click();
        return new Lending(driver);
    }

    public Lending clickPersonalAccountButton() {
        driver.findElement(personalAccountButton).click();
        return new Lending(driver);
    }

    public boolean isConstructorVisible() {
        return driver.findElement(constructor).isDisplayed();
    }
    public Lending clickSauceAnchor() {
        driver.findElement(sauce).click();
        return new Lending(driver);
    }

    public Lending clickBugsAnchor() {
        driver.findElement(bugs).click();
        return new Lending(driver);
    }

    public Lending clickFillingsAnchor() {
        driver.findElement(fillings).click();
        return new Lending(driver);
    }

    public boolean isSauceHeaderVisible() {
        return driver.findElement(sauceHeader).isDisplayed();
    }

    public boolean isBugsHeaderVisible() {
        return driver.findElement(bugsHeader).isDisplayed();
    }

    public boolean isFillingsHeaderVisible() {
        return driver.findElement(fillingsHeader).isDisplayed();
    }

    //методы для скролла до заголовков разделов
    public Lending scrollToSauce() {
        Object sauceSection = driver.findElement(sauceHeader);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", sauceSection);
        return this;
    }

    public Lending scrollToFillings() {
        Object fillingsSection = driver.findElement(fillingsHeader);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", fillingsSection);
        return this;
    }

    public Lending scrollToBugs() {
        Object bugsSection = driver.findElement(bugsHeader);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", bugsSection);
        return this;
    }
}
