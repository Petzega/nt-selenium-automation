package tests.ConfEstados;

import cucumber.api.java.en.*;
import helpers.BasePage;
import helpers.Hook;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.PO_001_FlujoGeneral.P000_PermisosNavegador;
import pageObjects.PO_001_FlujoGeneral.P001_ModificarRegistros;
import pageObjects.PO_001_FlujoGeneral.P002_GuardarRegistros;
import pageObjects.PO_001_FlujoGeneral.P003_ValidarRegistros;

public class T001_ConfEstadosCrearRegistro {
    public WebDriver driver;
    private Hook hook = new Hook();
    BasePage basePage = new BasePage();
    P000_PermisosNavegador p000_permisosNavegador = new P000_PermisosNavegador();
    P001_ModificarRegistros p001_modificarRegistros = new P001_ModificarRegistros();
    P002_GuardarRegistros p002_guardarRegistros = new P002_GuardarRegistros();
    P003_ValidarRegistros p003_validarRegistros = new P003_ValidarRegistros();

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
            p001_modificarRegistros.createNewRegister();
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla When: Error al ingresar los valores en el formulario");
        }
    }

    @And("^Da click al boton Guardar confirmando el registro$")
    public void da_click_al_boton_Guardar_confirmando_el_registro() throws Throwable {
        try {
            p002_guardarRegistros.saveNewRegister();
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla And: Error al guardar nuevo registro");
        }
    }

    @Then("^Se crea correctamente el nuevo registro$")
    public void se_crea_correctamente_el_nuevo_registro() throws Throwable {
        try {
            p003_validarRegistros.validateNewRegister();
            Hook.closeBrowser(basePage.handleDriver());
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla Then: No se encuentra el registro");
        }
    }
}
