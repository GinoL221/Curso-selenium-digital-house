package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectBlazeDemo {
    private final WebDriver driver;

    public PageObjectBlazeDemo(WebDriver driver) {
        this.driver = driver;
    }

    // Encuentra el campo de puerto de origen por su nombre y lo devuelve como un WebElement
    public WebElement getFromPort() {
        return driver.findElement(By.name("fromPort"));
    }

    // Encuentra el enlace de destino de la semana por su texto y lo devuelve como un WebElement
    public WebElement getMessage() {
        return driver.findElement(By.linkText("destination of the week! The Beach!"));
    }

    // Encuentra el enlace de destino de la semana por su texto parcial y lo devuelve como un WebElement
    public WebElement getPartialLinkTextMessage() {
        return driver.findElement(By.partialLinkText("destination of the week!"));
    }

    // Encuentra el elemento de formulario en línea por su clase y lo devuelve como un WebElement
    public WebElement getFormInline() {
        return driver.findElement(By.className("form-inline"));
    }
}
