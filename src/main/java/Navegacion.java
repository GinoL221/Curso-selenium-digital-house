import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navegacion {
    public static void main(String[] args) {
        String pathChrome = "C:\\Users\\LGino\\OneDrive\\Documentos\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        WebDriver driver = new ChromeDriver();

        driver.get("https://digitalhouse-content.github.io/fake-store-dh/#formularios");
        driver.navigate().to("https://blazedemo.com/"); // Navega a otra página
        driver.navigate().back(); // Regresa a la página anterior
        driver.navigate().forward(); // Avanza a la página siguiente
        driver.quit(); // Cierra el navegador y libera los recursos
    }
}
