package com.icaro.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By emailInput = By.id("input-email");
    private By passInput = By.id("input-password");
    private By loginBtn = By.xpath("//input[@value='Login']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String email, String password) {
        sendKeys(emailInput, email);
        sendKeys(this.passInput, password);
        click(this.loginBtn);
    }
}
