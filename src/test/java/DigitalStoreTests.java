import PageObjects.PageObjectFakeStore;
import io.qameta.allure.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.Fixtures;

import java.time.Duration;

public class DigitalStoreTests {
    private WebDriver driver;
    private PageObjectFakeStore fakeStorePage;

    @Before
    public void setUp() {
        Fixtures.setUpClass();
        driver = Fixtures.getDriver();
        driver.get(TestData.URL); // Navega a la URL del formulario Fake Store
        fakeStorePage = new PageObjectFakeStore(driver); // Inicializa la página del formulario Fake Store
    }

    @Test
    @Description("Test de llenado del formulario en la tienda Fake Store")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("AUTH-123")
    @TmsLink("TMS-456")
    public void TestFormFakeStore() {
        fakeStorePage.getNameInput().sendKeys(TestData.NAME); // Ingresa un nombre en el campo
        fakeStorePage.getEmailInput().sendKeys(TestData.EMAIL); // Ingresa un email en el campo
        fakeStorePage.getPhoneInput().sendKeys(TestData.PHONE); // Ingresa un teléfono en el campo
        fakeStorePage.getAgeInput().sendKeys(TestData.AGE); // Ingresa una edad en el campo
        fakeStorePage.getCityInput().sendKeys(TestData.CITY); // Ingresa una ciudad en el campo
        fakeStorePage.getCommentsInput().sendKeys(TestData.COMMENTS); // Ingresa un comentario en el campo

        fakeStorePage.getSendButton().click(); // Hace clic en el botón de enviar

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Espera hasta que el mensaje final sea visible
        WebElement finalMessage = fakeStorePage.getFinalMessage(); // Obtiene el mensaje final después de enviar el formulario

        Assert.assertTrue(finalMessage.getText().contains(TestData.CONFIRMATION)); // Verifica que el mensaje final contenga el texto esperado
        Assert.assertEquals(TestData.CONFIRMATION, finalMessage.getText()); // Verifica que el mensaje final sea exactamente igual al texto esperado
    }

    @After
    public void tearDown() {
        Fixtures.tearDownClass();
    }
}
