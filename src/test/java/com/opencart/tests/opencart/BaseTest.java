package com.icaro.tests.opencart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeTest
    public void setup() {
        ChromeOptions options = new ChromeOptions();

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

        options.addArguments("start-maximized");
        options.addArguments("incognito");
        options.addArguments("--ignored-certificates-errors");

//        options.addArguments("disable-infobars"); // disabling infobars
//        options.addArguments("--disable-extensions"); // disabling extensions
//        options.addArguments("--disable-gpu"); // applicable to windows os only
//        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
//        options.addArguments("--no-sandbox"); // Bypass OS security model

//        options.addArguments("--headless");
        /*No corre la interfaz grafica*/

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        this.driver = new ChromeDriver(options);

        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));

        this.getDriver().get("https://opencart.abstracta.us/");
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    @AfterTest
    public void tearDown() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}
