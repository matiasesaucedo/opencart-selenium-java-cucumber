package com.icaro.tests.opencart;

import com.github.javafaker.Faker;
import com.icaro.opencart.AccountPage;
import com.icaro.opencart.HomePage;
import com.icaro.opencart.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void crearCuenta() {
        HomePage homePage = new HomePage(getDriver());
        RegisterPage registerPage = new RegisterPage(getDriver());
        AccountPage accountPage = new AccountPage(getDriver());

        Faker faker = new Faker();

        homePage.accederARegistro();
        registerPage.completarFormulario(faker.name().firstName(), faker.name().lastName(),
                faker.internet().emailAddress(), faker.phoneNumber().phoneNumber(),faker.internet().password()
                );

        Assert.assertTrue(accountPage.successLinkEsVisible());
        Assert.assertTrue(accountPage.tituloEsVisible());
    }
}
