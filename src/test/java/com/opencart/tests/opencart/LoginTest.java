package com.icaro.tests.opencart;

import com.icaro.opencart.HomePage;
import com.icaro.opencart.LoginPage;
import com.icaro.opencart.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginCorrecto() {
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        MyAccountPage myAccountPage = new MyAccountPage(getDriver());

        homePage.accederAlLogin();
        loginPage.login("pepe@pepe.com.ar", "12345678");

        Assert.assertTrue(myAccountPage.tituloEsVisible());
    }
}
