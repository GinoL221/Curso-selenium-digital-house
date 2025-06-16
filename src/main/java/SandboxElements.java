import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SandboxElements {
    public static void main(String[] args) {
        String pathChrome = "C:\\Users\\LGino\\OneDrive\\Documentos\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        WebDriver driver = new ChromeDriver();

        driver.get("https://digitalhouse-content.github.io/fake-store-dh/#formularios"); // Abre la página de Fake Store
        driver.findElement(By.xpath("//input[@id='nombre']")); // Encuentra el elemento de entrada por su XPath
        driver.findElement(By.cssSelector("img.img-fluid")); // Encuentra el elemento de imagen por su selector CSS
        driver.findElement(By.xpath("//*[text()='Web Store for Digital House members']")); // Encuentra el elemento de encabezado por su texto

        driver.quit(); // Cierra el navegador y libera los recursos
    }
}
