import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class EsperasImplicitas {
    public static void main(String[] args) {
        String pathChrome = "C:\\Users\\LGino\\OneDrive\\Documentos\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        WebDriver driver = new ChromeDriver();

        driver.get("https://blazedemo.com/"); // Abre la página de BlazeDemo
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Configura una espera implícita de 15 segundos
        driver.findElement(By.name("fromPort"));

        driver.quit(); // Cierra el navegador y libera los recursos
    }
}
