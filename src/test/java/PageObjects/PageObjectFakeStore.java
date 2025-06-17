package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectFakeStore {
    private final WebDriver driver;

    public PageObjectFakeStore(WebDriver driver) {
        this.driver = driver;
    }

    // Encuentra el campo de nombre por su XPath y lo devuelve como un WebElement
    public WebElement getNameInput() {
        return driver.findElement(By.xpath("//input[@id='nombre']"));
    }

    // Encuentra el campo de email por su XPath y lo devuelve como un WebElement
    public WebElement getEmailInput() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    // Encuentra el campo de teléfono por su XPath y lo devuelve como un WebElement
    public WebElement getPhoneInput() {
        return driver.findElement(By.xpath("//input[@id='telefono']"));
    }

    // Encuentra el campo de edad por su XPath y lo devuelve como un WebElement
    public WebElement getAgeInput() {
        return driver.findElement(By.xpath("//input[@id='edad']"));
    }

    // Encuentra el campo de ciudad por su XPath y lo devuelve como un WebElement
    public WebElement getCityInput() {
        return driver.findElement(By.xpath("//input[@id='ciudad']"));
    }

    // Encuentra el campo de comentarios por su XPath y lo devuelve como un WebElement
    public WebElement getCommentsInput() {
        return driver.findElement(By.xpath("//textarea[@id='comentarios']"));
    }

    // Encuentra el botón de enviar por su XPath y lo devuelve como un WebElement
    public WebElement getSendButton() {
        return driver.findElement(By.xpath("//button[text()='Send']"));
    }

    // Encuentra el mensaje final por su XPath y lo devuelve como un WebElement
    public WebElement getFinalMessage() {
        return driver.findElement(By.xpath("//h4[text()='Thank you for sending your message!']"));
    }
}
