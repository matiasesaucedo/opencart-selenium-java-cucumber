package com.icaro.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class RegisterPage extends BasePage{

    private By firstName = By.id("input-firstname");
    private By lastName = By.id("input-lastname");
    private By email = By.id("input-email");
    private By phone = By.id("input-telephone");
    private By password = By.id("input-password");
    private By confirmPassword = By.id("input-confirm");
    private By policyCheckbox = By.name("agree");
    private By continueBtn = By.xpath("//input[@value='Continue']");

    public RegisterPage(WebDriver driver) {
       super(driver);
    }

    public void completarFormulario(String firstName,
                                    String lastName,
                                    String email,
                                    String phone,
                                    String password) {

        sendKeys(this.firstName, firstName);
        sendKeys(this.lastName, lastName);
        sendKeys(this.email, email);
        sendKeys(this.phone, phone);
        sendKeys(this.password, password);
        click(policyCheckbox);
        click(continueBtn);

    }

}
