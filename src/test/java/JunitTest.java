import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        String pathChrome = "C:\\Users\\LGino\\OneDrive\\Documentos\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        driver = new ChromeDriver();
    }

    @Test
    public void TestFormFakeStore() {
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

        WebElement finalMessage = driver.findElement(By.xpath("//h4[text()='Thank you for sending your message!']")); // Encuentra el mensaje final por su XPath
        Assert.assertEquals("Thank you for sending your message!", finalMessage.getText());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
