package tests.ConfSubEstados;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.BasePage;
import helpers.Hook;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.PO_001_FlujoGeneral.P000_PermisosNavegador;

public class T003_ConfSubEstadosEliminarRegistro {
    public WebDriver driver;
    private Hook hook = new Hook();
    BasePage basePage = new BasePage();
    P000_PermisosNavegador p000_permisosNavegador = new P000_PermisosNavegador();

    @Given("^El usuario ingresa al monitor de Configuracion SubEstados$")
    public void el_usuario_ingresa_al_monitor_de_Configuracion_SubEstados() throws Throwable {
        try {
            //driver = hook.browser("CHROME", "https://tottus-msrvqa.tottus.com/schn/trazability/tot-traz-web/PE/status");
            //p000_permisosNavegador.getPrivacy();
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla Given: No se pudo ingresar al modulo");
        }
    }

    @When("^Realiza la busqueda de un registro de subestado$")
    public void realiza_la_busqueda_de_un_registro_de_subestado() throws Throwable {
        try {
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla When: Error al ingresar los valores en el formulario");
        }
    }

    @And("^Da click al boton Eliminar y confirmar la eliminacion$")
    public void da_click_al_boton_Eliminar_y_confirmar_la_eliminacion() throws Throwable {
        try {
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla And: Error al guardar nuevo registro");
        }
    }

    @Then("^Se elimina correctamente el nuevo registro de subestado$")
    public void se_elimina_correctamente_el_nuevo_registro_de_subestado() throws Throwable {
        try {
            //Hook.closeBrowser(basePage.handleDriver());
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla Then: No se encuentra el registro");
        }
    }
}
