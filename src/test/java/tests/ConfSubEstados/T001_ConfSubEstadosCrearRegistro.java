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
import pageObjects.PO_002_FlujoConfEstadosCrearRegistro.P001_CrearRegistro;
import pageObjects.PO_002_FlujoConfEstadosCrearRegistro.P002_GuardarNuevoRegistro;
import pageObjects.PO_002_FlujoConfEstadosCrearRegistro.P003_ValidarNuevoRegistro;

public class T001_ConfSubEstadosCrearRegistro {
    public WebDriver driver;
    private Hook hook = new Hook();
    BasePage basePage = new BasePage();
    P000_PermisosNavegador p000_permisosNavegador = new P000_PermisosNavegador();
    P001_CrearRegistro p001_crearRegistro = new P001_CrearRegistro();


    @Given("^El usuario ingresa al modulo de Configuracion SubEstados$")
    public void el_usuario_ingresa_al_modulo_de_Configuracion_SubEstados() throws Throwable {
        try {
            driver = hook.browser("CHROME", "https://tottus-msrvqa.tottus.com/schn/trazability/tot-traz-web/PE/status/sub-status");
            p000_permisosNavegador.getPrivacy();
        } catch (AssertionError e) {
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla Given: No se pudo ingresar al modulo");
        }
    }

    @When("^Da click al boton Nuevo y completar el formulario$")
    public void da_click_al_boton_Nuevo_y_completar_el_formulario() throws Throwable {
        try {
            p001_crearRegistro.searchRegister();
        } catch (AssertionError e) {
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla When: Error al ingresar los valores en el formulario");
        }
    }

    @And("^Da click al boton Guardar y confirmar el registro$")
    public void da_click_al_boton_Guardar_y_confirmar_el_registro() throws Throwable {
        try {
        } catch (AssertionError e) {
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla And: Error al guardar nuevo registro");
        }
    }

    @Then("^Se crea correctamente el nuevo registro de subestado$")
    public void se_crea_correctamente_el_nuevo_registro_de_subestado() throws Throwable {
        try {
            Hook.closeBrowser(basePage.handleDriver());
        } catch (AssertionError e) {
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla Then: No se encuentra el registro");
        }
    }
}
