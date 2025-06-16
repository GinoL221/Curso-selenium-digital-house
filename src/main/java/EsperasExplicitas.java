import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EsperasExplicitas {
    public static void main(String[] args) {
        String pathChrome = "C:\\Users\\LGino\\OneDrive\\Documentos\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        WebDriver driver = new ChromeDriver();

        driver.get("https://digitalhouse-content.github.io/fake-store-dh/#formularios"); // Abre la página de Fake Store
        WebElement name = driver.findElement(By.xpath("//input[@id='nombre']")); // Encuentra el campo de nombre por su XPath
        name.sendKeys("Juan Perez"); // Ingresa un nombre en el campo
        WebElement email = driver.findElement(By.xpath("//input[@id='email']")); // Encuentra el campo de email por su XPath
        email.sendKeys("juanperez10@email.com"); // Ingresa un nombre en el campo
        WebElement phone = driver.findElement(By.xpath("//input[@id='telefono']")); // Encuentra el campo de teléfono por su XPath
        phone.sendKeys("1167583030"); // Ingresa un nombre en el campo
        WebElement age = driver.findElement(By.xpath("//input[@id='edad']")); // Encuentra el campo de edad por su XPath
        age.sendKeys("21"); // Ingresa un nombre en el campo
        WebElement city = driver.findElement(By.xpath("//input[@id='ciudad']")); // Encuentra el campo de ciudad por su XPath
        city.sendKeys("Buenos Aires"); // Ingresa un nombre en el campo
        WebElement comments = driver.findElement(By.xpath("//textarea[@id='comentarios']")); // Encuentra el campo de comentarios por su XPath
        comments.sendKeys("Este es un comentario de prueba."); // Ingresa un comentario en el campo
        comments.clear(); // Limpia el campo de comentarios
        comments.sendKeys("Comentario actualizado."); // Ingresa un nuevo comentario en el campo

        WebElement sendButton = driver.findElement(By.xpath("//button[text()='Send']")); // Encuentra el botón de enviar por su texto
        sendButton.click(); // Hace clic en el botón de enviar

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Crea una espera explícita de 5 segundos
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Thank you for sending your message!']"))); // Espera hasta que el mensaje de éxito sea visible
        driver.navigate().back();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Send']"))); // Espera hasta que el mensaje de éxito sea visible

        driver.quit(); // Cierra el navegador y libera los recursos
    }
}
