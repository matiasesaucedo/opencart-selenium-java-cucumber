package com.icaro.opencart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    private By myAccountDropdown = By.xpath("//a[@title='My Account']");
    private By loginBtn = By.xpath("//a[text()='Login']");
    private By registerBtn = By.xpath("//a[text()='Register']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void accederAlLogin() {
       click(this.myAccountDropdown);
       click(this.loginBtn);
    }

    public void accederARegistro() {
        click(this.myAccountDropdown);
        click(this.registerBtn);
    }

    public void abrirPagina(String url){
        this.driver.get(url);
    }
}
