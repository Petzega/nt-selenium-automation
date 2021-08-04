package tests;

import cucumber.api.java.en.*;
import helpers.BasePage;
import helpers.Hook;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.PO_001_FlujoGeneral.P000_PermisosNavegador;
import pageObjects.PO_002_FlujoConfEstadosCrearRegistro.P001_CrearRegistro;
import pageObjects.PO_002_FlujoConfEstadosCrearRegistro.P002_GuardarRegistro;
import pageObjects.PO_002_FlujoConfEstadosCrearRegistro.P003_ValidarRegistro;

public class T001_ConfEstadosCrearRegistro {
    public WebDriver driver;
    private Hook hook = new Hook();
    BasePage basePage = new BasePage();
    P000_PermisosNavegador p000_permisosNavegador = new P000_PermisosNavegador();
    P001_CrearRegistro p001_crearRegistro = new P001_CrearRegistro();
    P002_GuardarRegistro p002_guardarRegistro = new P002_GuardarRegistro();
    P003_ValidarRegistro p003_validarRegistro = new P003_ValidarRegistro();

    @Given("^El usuario ingresa al modulo de Configuracion Estados$")
    public void el_usuario_ingresa_al_modulo_de_Configuracion_Estados() throws Throwable {
        try {
            driver = hook.browser("CHROME", "https://tottus-msrvqa.tottus.com/schn/trazability/tot-traz-web/PE/status");
            p000_permisosNavegador.getPrivacy();
        } catch (AssertionError e) {
            e.printStackTrace();
            Assert.fail("Falla Given: No se pudo ingresar al modulo");
            Hook.closeBrowser(basePage.handleDriver());
        }
    }

    @When("^Da click al boton Nuevo y completa los campos obligatorios$")
    public void da_click_al_boton_Nuevo_y_completa_los_campos_obligagores() throws Throwable {
        try {
            p001_crearRegistro.createNewRegister();
        } catch (AssertionError e) {
            e.printStackTrace();
            Assert.fail("Falla When: Error al ingresar los valores en el formulario");
            Hook.closeBrowser(basePage.handleDriver());
        }
    }

    @And("^Da click al boton Guardar confirmando el registro$")
    public void da_click_al_boton_Guardar_confirmando_el_registro() throws Throwable {
        try {
            p002_guardarRegistro.saveNewRegister();
        } catch (AssertionError e) {
            e.printStackTrace();
            Assert.fail("Falla And: Error al guardar registro");
            Hook.closeBrowser(basePage.handleDriver());
        }
    }

    @Then("^Se crea correctamente el nuevo registro$")
    public void se_crea_correctamente_el_nuevo_registro() throws Throwable {
        try {
            p003_validarRegistro.validateRegister();
            Hook.closeBrowser(basePage.handleDriver());
        } catch (AssertionError e) {
            e.printStackTrace();
            Assert.fail("Falla Then: No se encuentra el registro");
            Hook.closeBrowser(basePage.handleDriver());
        }
    }
}
