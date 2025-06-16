import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alertas {
    public static void main(String[] args) {
        String pathChrome = "C:\\Users\\LGino\\OneDrive\\Documentos\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathChrome);
        WebDriver driver = new ChromeDriver();

        driver.get("https://digitalhouse-content.github.io/fake-store-dh/#formularios");
        WebElement clickOnAlert = driver.findElement(By.xpath("//button[text()='View Detalles']"));
        clickOnAlert.click();
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String text = alert.getText();
        alert.accept();
        System.out.println(text);

        driver.quit(); // Cierra el navegador y libera los recursos
    }
}
