package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fixtures {
    private static WebDriver driver;

    // Este metodo se llama al inicio de todas las pruebas para inicializar el WebDriver
    public static void setUpClass() {
        String pathChrome = "C:\\Users\\LGino\\OneDrive\\Documentos\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        driver = new ChromeDriver();
    }

    // Este metodo devuelve el WebDriver inicializado
    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalAccessError("WebDriver has not been initialized. Call setUpClass() first.");
        }
        return driver;
    }

    // Este metodo se llama al final de todas las pruebas para cerrar el navegador
    public static void tearDownClass() {
        if (driver != null) {
            driver.quit();
        }
    }
}
