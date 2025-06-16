import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeElements {
    public static void main(String[] args) {
        String pathChrome = "C:\\Users\\LGino\\OneDrive\\Documentos\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        WebDriver driver = new ChromeDriver();

        driver.get("https://blazedemo.com/"); // Abre la página de BlazeDemo
        driver.findElement(By.name("fromPort")); // Encuentra el elemento por su nombre
        driver.findElement(By.linkText("destination of the week! The Beach!")); // Encuentra el elemento por su texto completo
        driver.findElement(By.partialLinkText("destination of the week!")); // Encuentra el elemento por su texto parcial
        driver.findElement(By.className("form-inline")); // Encuentra el elemento por su clase
        driver.quit(); // Cierra el navegador y libera los recursos
    }
}
