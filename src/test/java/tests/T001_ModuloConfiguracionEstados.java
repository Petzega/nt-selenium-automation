package tests;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import helpers.BasePage;
import helpers.Hook;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.P000_PermisosNavegador;
import pageObjects.P001_CrearRegistro;

public class T001_ModuloConfiguracionEstados {
    public WebDriver driver;
    private Hook hook = new Hook();
    BasePage basePage = new BasePage();
    P000_PermisosNavegador p000_permisosNavegador = new P000_PermisosNavegador();
    P001_CrearRegistro p001_crearRegistro = new P001_CrearRegistro();

    @Given("^El usuario ingresa al modulo de Configuracion Estados$")
    public void el_usuario_ingresa_al_modulo_de_Configuracion_Estados() throws Throwable {
        try {
            driver = hook.browser("CHROME", "https://tottus-msrvqa.tottus.com/schn/trazability/tot-traz-web/PE/status");
            p000_permisosNavegador.getPrivacy();
        } catch (AssertionError e) {
            e.printStackTrace();
            Assert.fail("Falla Given: No se pudo ingresar al modulo");
        }
    }

    @When("^Da click al boton Nuevo y completa los campos obligagores$")
    public void da_click_al_boton_Nuevo_y_completa_los_campos_obligagores() throws Throwable {
        try {
            p001_crearRegistro.createNewRegister();
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    @When("^Da click al boton Guardar confirmando el registro$")
    public void da_click_al_boton_Guardar_confirmando_el_registro() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Se crea correctamente el nuevo registro$")
    public void se_crea_correctamente_el_nuevo_registro() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }
}
