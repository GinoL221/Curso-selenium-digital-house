package steps;

import PageObjects.PageObjectFakeStore;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FormSubmissionsSteps {
    private WebDriver driver;
    private PageObjectFakeStore fakeStorePage;

    @Given("The user is on the Digital Store website")
    public void userIsOnDigitalWebsite() {
        Fixtures.setUpClass();
        driver = Fixtures.getDriver();
        driver.get(TestData.URL); // Navega a la URL del formulario Fake Store
        fakeStorePage = new PageObjectFakeStore(driver); // Inicializa la página del formulario Fake Store
    }

    @When("The user submits the form with valid data")
    public void userSubmitsFormValidData() {
        fakeStorePage.getNameInput().sendKeys(TestData.NAME); // Ingresa un nombre en el campo
        fakeStorePage.getEmailInput().sendKeys(TestData.EMAIL); // Ingresa un email en el campo
        fakeStorePage.getPhoneInput().sendKeys(TestData.PHONE); // Ingresa un teléfono en el campo
        fakeStorePage.getAgeInput().sendKeys(TestData.AGE); // Ingresa una edad en el campo
        fakeStorePage.getCityInput().sendKeys(TestData.CITY); // Ingresa una ciudad en el campo
        fakeStorePage.getCommentsInput().sendKeys(TestData.COMMENTS); // Ingresa un comentario en el campo

        fakeStorePage.getSendButton().click(); // Hace clic en el botón de enviar
    }

    @Then("The user should see a confirmation message")
    public void userShouldSeeConfirmationMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Espera hasta que el mensaje final sea visible
        WebElement finalMessage = fakeStorePage.getFinalMessage(); // Obtiene el mensaje final después de enviar el formulario

        Assert.assertTrue(finalMessage.getText().contains(TestData.CONFIRMATION)); // Verifica que el mensaje final contenga el texto esperado
        Assert.assertEquals(TestData.CONFIRMATION, finalMessage.getText()); // Verifica que el mensaje final sea exactamente igual al texto esperado
    }
}
