import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteraccionVentanas {
    public static void main(String[] args) {
        String pathChrome = "C:\\Users\\LGino\\OneDrive\\Documentos\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        WebDriver driver = new ChromeDriver();

        driver.get("https://digitalhouse-content.github.io/fake-store-dh/#formularios"); // Abre la página de Fake Store
        ((ChromeDriver) driver).executeScript("window.open()"); // Abre una nueva ventana en blanco
        ((ChromeDriver) driver).switchTo().window(driver.getWindowHandles().toArray()[1].toString()); // Cambia a la nueva ventana recién abierta
        driver.get("https://blazedemo.com/"); // Abre la página de BlazeDemo en una nueva ventana
        ((ChromeDriver) driver).switchTo().window(driver.getWindowHandles().toArray()[0].toString()); // Cambia de vuelta a la ventana original

        driver.quit(); // Cierra el navegador y libera los recursos
    }
}
