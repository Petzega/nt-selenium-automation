package tests.ConfEstados;

import cucumber.api.java.en.*;
import helpers.BasePage;
import helpers.Hook;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.PO_001_FlujoGeneral.P000_PermisosNavegador;
import pageObjects.PO_002_FlujoConfEstadosCrearRegistro.P001_CrearRegistro;
import pageObjects.PO_002_FlujoConfEstadosCrearRegistro.P002_GuardarNuevoRegistro;
import pageObjects.PO_002_FlujoConfEstadosCrearRegistro.P003_ValidarNuevoRegistro;

public class T001_ConfEstadosCrearRegistro {
    public WebDriver driver;
    private Hook hook = new Hook();
    BasePage basePage = new BasePage();
    P000_PermisosNavegador p000_permisosNavegador = new P000_PermisosNavegador();
    P001_CrearRegistro p001_crearRegistro = new P001_CrearRegistro();
    P002_GuardarNuevoRegistro p002_guardarNuevoRegistro = new P002_GuardarNuevoRegistro();
    P003_ValidarNuevoRegistro p003_validarNuevoRegistro = new P003_ValidarNuevoRegistro();

    @Given("^El usuario ingresa al modulo de Configuracion Estados$")
    public void el_usuario_ingresa_al_modulo_de_Configuracion_Estados() throws Throwable {
        try {
            driver = hook.browser("CHROME", "https://tottus-msrvqa.tottus.com/schn/trazability/tot-traz-web/PE/status");
            p000_permisosNavegador.getPrivacy();
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla Given: No se pudo ingresar al modulo");
        }
    }

    @When("^Da click al boton Nuevo y completar los campos obligatorios$")
    public void da_click_al_boton_Nuevo_y_completar_los_campos_obligagores() throws Throwable {
        try {
            p001_crearRegistro.createNewRegister();
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla When: Error al ingresar los valores en el formulario");
        }
    }

    @And("^Da click al boton Guardar confirmando el registro$")
    public void da_click_al_boton_Guardar_confirmando_el_registro() throws Throwable {
        try {
            p002_guardarNuevoRegistro.saveNewRegister();
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla And: Error al guardar nuevo registro");
        }
    }

    @Then("^Se crea correctamente el nuevo registro$")
    public void se_crea_correctamente_el_nuevo_registro() throws Throwable {
        try {
            p003_validarNuevoRegistro.validateNewRegister();
            Hook.closeBrowser(basePage.handleDriver());
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla Then: No se encuentra el registro");
        }
    }
}
