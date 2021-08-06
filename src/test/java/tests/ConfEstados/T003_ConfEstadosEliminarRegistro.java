package tests.ConfEstados;

import cucumber.api.java.en.*;
import helpers.BasePage;
import helpers.Hook;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.PO_001_FlujoGeneral.P000_PermisosNavegador;
import pageObjects.PO_004_FlujoConfEstadosEliminarRegistro.P001_BuscarRegistro;
import pageObjects.PO_004_FlujoConfEstadosEliminarRegistro.P002_ConfirmarEliminarRegistro;
import pageObjects.PO_004_FlujoConfEstadosEliminarRegistro.P003_ValidarEliminarRegistro;

public class T003_ConfEstadosEliminarRegistro {
    public WebDriver driver;
    private Hook hook = new Hook();
    BasePage basePage = new BasePage();
    P000_PermisosNavegador p000_permisosNavegador = new P000_PermisosNavegador();
    P001_BuscarRegistro p001_buscarRegistro = new P001_BuscarRegistro();
    P002_ConfirmarEliminarRegistro p002_confirmarEliminarRegistro = new P002_ConfirmarEliminarRegistro();
    P003_ValidarEliminarRegistro p003_validarEliminarRegistro = new P003_ValidarEliminarRegistro();

    @Given("^El usuario ingresa al monitor de Configuracion Estados$")
    public void el_usuario_ingresa_al_monitor_de_Configuracion_Estados() throws Throwable {
        try {
            driver = hook.browser("CHROME", "https://tottus-msrvqa.tottus.com/schn/trazability/tot-traz-web/PE/status");
            p000_permisosNavegador.getPrivacy();
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla Given: No se pudo ingresar al modulo");
        }

    }

    @When("^Realiza la busqueda de un registro$")
    public void realiza_la_busqueda_de_un_registro() throws Throwable {
        try {
            p001_buscarRegistro.searchRegister();
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla When: No se encuentra el registro");
        }
    }

    @And("^Da click al boton Eliminar confirmando la eliminacion$")
    public void da_click_al_boton_Eliminar_confirmando_la_eliminacion() throws Throwable {
        try {
            p002_confirmarEliminarRegistro.saveDeleteRegister();
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla And: No se encuentra el registro");
        }
    }

    @Then("^Se elimina correctamente el nuevo registro$")
    public void se_elimina_correctamente_el_nuevo_registro() throws Throwable {
        try {
            p003_validarEliminarRegistro.validateDeleteRegister();
            Hook.closeBrowser(basePage.handleDriver());
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla Then: No se encuentra el registro");
        }
    }
}
