package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.BasePage;
import helpers.Hook;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.PO_001_FlujoGeneral.P000_PermisosNavegador;
import pageObjects.PO_003_FlujoConfEstadosEditarRegistro.P001_EditarRegistro;
import pageObjects.PO_003_FlujoConfEstadosEditarRegistro.P002_GuardarEditarRegistro;
import pageObjects.PO_003_FlujoConfEstadosEditarRegistro.P003_ValidarEditarRegistro;

public class T003_ConfEstadosEliminarRegistro {
    public WebDriver driver;
    private Hook hook = new Hook();
    BasePage basePage = new BasePage();
    P000_PermisosNavegador p000_permisosNavegador = new P000_PermisosNavegador();
    P001_EditarRegistro p001_editarRegistro = new P001_EditarRegistro();
    P002_GuardarEditarRegistro p002_guardarEditarRegistro = new P002_GuardarEditarRegistro();
    P003_ValidarEditarRegistro p003_validarEditarRegistro = new P003_ValidarEditarRegistro();

    @Given("^El usuario accede al modulo de Configuracion Estados$")
    public void el_usuario_accede_al_modulo_de_Configuracion_Estados() throws Throwable {
        try {
            driver = hook.browser("CHROME", "https://tottus-msrvqa.tottus.com/schn/trazability/tot-traz-web/PE/status");
            p000_permisosNavegador.getPrivacy();
        } catch (AssertionError e) {
            e.printStackTrace();
            Assert.fail("Falla Given: No se pudo ingresar al modulo");
            Hook.closeBrowser(basePage.handleDriver());
        }
    }

    @When("^Da click al boton de Editar y cambia los campos$")
    public void da_click_al_boton_de_Editar_y_cambia_los_campos() throws Throwable {
        try {
            p001_editarRegistro.editNewRegister();
        } catch (AssertionError e) {
            Assert.fail("Falla When: Error al ingresar los valores en el formulario");
            Hook.closeBrowser(basePage.handleDriver());
        }
    }

    @And("^Da click al boton Guardar confirmando la edicion$")
    public void da_click_al_boton_Guardar_confirmando_la_edicion() throws Throwable {
        try {
            p002_guardarEditarRegistro.saveEditRegister();
        } catch (AssertionError e) {
            Assert.fail("Falla And: Error al guardar edicion de registro");
            Hook.closeBrowser(basePage.handleDriver());
        }
    }

    @Then("^Se edita correctamente el nuevo registro$")
    public void se_edita_correctamente_el_nuevo_registro() throws Throwable {
        try {
            p003_validarEditarRegistro.validateEditRegister();
            Hook.closeBrowser(basePage.handleDriver());
        } catch (AssertionError e) {
            e.printStackTrace();
            Assert.fail("Falla Then: No se encuentra el registro");
            Hook.closeBrowser(basePage.handleDriver());
        }
    }
}