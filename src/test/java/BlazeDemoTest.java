import Actions.ActionsWindows;
import PageObjects.PageObjectBlazeDemo;
import io.qameta.allure.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import steps.Fixtures;

public class BlazeDemoTest {
    private WebDriver driver;
    private PageObjectBlazeDemo blazeDemoPage;
    private ActionsWindows actionsWindow;

    @Before
    public void setUp() {
        Fixtures.setUpClass();
        driver = Fixtures.getDriver();
        driver.get("https://blazedemo.com/"); // Navega a la URL de BlazeDemo
        blazeDemoPage = new PageObjectBlazeDemo(driver); // Inicializa la página del formulario Fake Store
    }

    @Test
    @Description("Test de cambio de pestañas en BlazeDemo")
    @Severity(SeverityLevel.CRITICAL)
    @Issue("AUTH-123")
    @TmsLink("TMS-456")
    public void TestElementsOnPage() {
        blazeDemoPage.getFromPort(); // Encuentra el campo de puerto de origen
        WebElement message = blazeDemoPage.getMessage(); // Encuentra el mensaje de destino de la semana
        blazeDemoPage.getPartialLinkTextMessage();
        blazeDemoPage.getFormInline(); // Encuentra el elemento de formulario en línea

        Assert.assertTrue(message.getText().contains(blazeDemoPage.getMessage().getText())); // Verifica que el mensaje contenga el texto esperado
    }

    @After
    public void tearDown() {
        Fixtures.tearDownClass();
    }
}
