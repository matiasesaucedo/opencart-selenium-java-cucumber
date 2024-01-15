package com.icaro.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends BasePage {

    private By title = By.xpath("//h1[text()='Account']");
    private By succesLink = By.xpath("//a[text()='Success']");

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean tituloEsVisible() {
        return IsDisplayed(title);
    }

    public boolean successLinkEsVisible() {
        return IsDisplayed(succesLink);
    }
}
