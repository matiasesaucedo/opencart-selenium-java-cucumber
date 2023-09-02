package clase7.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeTest {
    private WebDriver driver;

    @BeforeTest
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        // ChromeOptions son las propiedades del WebDriver //
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

        // La pagina se abre fullscreen//
        options.addArguments("start-maximized");
        // La pagina se abre en modo incognito//
        options.addArguments("incognito");

        options.setPageLoadTimeout(Duration.ofSeconds(60));
        // Inicializar el driver //
        this.driver = new ChromeDriver(options);
    }
    @Test
    public void ingresarAlInicio(){
        this.driver.get("http://www.automationpractice.pl/index.php");
    }

    @AfterTest
    public void tearDown(){
        this.driver.close();
    }

}
