package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ActionsWindows {
    private final WebDriver driver;

    // Constructor que recibe el WebDriver
    public ActionsWindows(WebDriver driver) {
        this.driver = driver;
    }

    // Metodo para abrir una nueva ventana del navegador
    public void openNewWindow() {
        ((JavascriptExecutor) driver).executeScript("window.open()");
    }

    // Metodo para cerrar la ventana actual del navegador
    public void switchToWindow(int index) {
        driver.switchTo().window(driver.getWindowHandles().toArray()[index].toString());
    }
}
