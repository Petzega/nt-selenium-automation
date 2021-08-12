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
import pageObjects.PO_003_FlujoConfEstadosEditarRegistro.P001_EditarRegistro;
import pageObjects.PO_003_FlujoConfEstadosEditarRegistro.P002_GuardarEditarRegistro;
import pageObjects.PO_003_FlujoConfEstadosEditarRegistro.P003_ValidarEditarRegistro;

public class T002_ConfEstadosEditarRegistro {
    public WebDriver driver;
    private Hook hook = new Hook();
    BasePage basePage = new BasePage();
    P000_PermisosNavegador p000_permisosNavegador = new P000_PermisosNavegador();
    /*P001_EditarRegistro p001_editarRegistro = new P001_EditarRegistro();
    P002_GuardarEditarRegistro p002_guardarEditarRegistro = new P002_GuardarEditarRegistro();
    P003_ValidarEditarRegistro p003_validarEditarRegistro = new P003_ValidarEditarRegistro();*/
    P001_ModificarRegistros p001_modificarRegistros = new P001_ModificarRegistros();
    P002_GuardarRegistros p002_guardarRegistros = new P002_GuardarRegistros();
    P003_ValidarRegistros p003_validarRegistros = new P003_ValidarRegistros();

    @Given("^El usuario accede al modulo de Configuracion Estados$")
    public void el_usuario_accede_al_modulo_de_Configuracion_Estados() throws Throwable {
        try {
            driver = hook.browser("CHROME", "https://tottus-msrvqa.tottus.com/schn/trazability/tot-traz-web/PE/status");
            p000_permisosNavegador.getPrivacy();
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla Given: No se pudo ingresar al modulo");
        }
    }

    @When("^Da click al boton de Editar y cambia los campos$")
    public void da_click_al_boton_de_Editar_y_cambia_los_campos() throws Throwable {
        try {
            p001_modificarRegistros.editNewRegister();
        } catch (AssertionError e) {
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla When: Error al ingresar los valores en el formulario");
        }
    }

    @And("^Da click al boton Guardar confirmando la edicion$")
    public void da_click_al_boton_Guardar_confirmando_la_edicion() throws Throwable {
        try {
            //p002_guardarEditarRegistro.saveEditRegister();
        } catch (AssertionError e) {
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla And: Error al guardar edicion de registro");
        }
    }

    @Then("^Se edita correctamente el nuevo registro$")
    public void se_edita_correctamente_el_nuevo_registro() throws Throwable {
        try {
            //p003_validarEditarRegistro.validateEditRegister();
            Hook.closeBrowser(basePage.handleDriver());
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla Then: No se encuentra el registro");
        }
    }
}