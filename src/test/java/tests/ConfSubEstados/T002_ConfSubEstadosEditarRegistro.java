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

public class T002_ConfSubEstadosEditarRegistro {
    public WebDriver driver;
    private Hook hook = new Hook();
    BasePage basePage = new BasePage();
    P000_PermisosNavegador p000_permisosNavegador = new P000_PermisosNavegador();

    @Given("^El usuario accede al modulo de Configuracion SubEstados$")
    public void el_usuario_accede_al_modulo_de_Configuracion_SubEstados() throws Throwable {
        try {
            //driver = hook.browser("CHROME", "https://tottus-msrvqa.tottus.com/schn/trazability/tot-traz-web/PE/status");
            //p000_permisosNavegador.getPrivacy();
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla Given: No se pudo ingresar al modulo");
        }
    }

    @When("^Da click al boton de Editar y editar los campos$")
    public void da_click_al_boton_de_Editar_y_editar_los_campos() throws Throwable {
        try {
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla When: Error al ingresar los valores en el formulario");
        }
    }

    @And("^Da click al boton Guardar y confirmar la edicion$")
    public void da_click_al_boton_Guardar_y_confirmar_la_edicion() throws Throwable {
        try {
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla And: Error al guardar nuevo registro");
        }
    }

    @Then("^Se edita correctamente el nuevo registro de subestado$")
    public void se_edita_correctamente_el_nuevo_registro_de_subestado() throws Throwable {
        try {
            //Hook.closeBrowser(basePage.handleDriver());
        } catch (AssertionError e) {
            e.printStackTrace();
            Hook.closeBrowser(basePage.handleDriver());
            Assert.fail("Falla Then: No se encuentra el registro");
        }
    }
}
