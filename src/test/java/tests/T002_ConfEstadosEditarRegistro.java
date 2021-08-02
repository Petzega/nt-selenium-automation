package tests;

import cucumber.api.java.en.*;
import helpers.BasePage;
import helpers.Hook;
import org.openqa.selenium.WebDriver;

public class T002_ConfEstadosEditarRegistro {
    public WebDriver driver;
    private Hook hook = new Hook();
    BasePage basePage = new BasePage();
    @Given("^El usuario accede al modulo de Configuracion Estados$")
    public void el_usuario_accede_al_modulo_de_Configuracion_Estados() throws Throwable {
        try {
            driver = hook.browser("CHROME", "https://tottus-msrvqa.tottus.com/schn/trazability/tot-traz-web/PE/status");
        } catch (AssertionError e) {
            System.out.printf("Paso Guiven");
        }
    }

    @When("^Da click al boton de Editar y cambia los campos$")
    public void da_click_al_boton_de_Editar_y_cambia_los_campos() throws Throwable {
        System.out.printf("Paso When");
    }

    @And("^Da click al boton Guardar confirmando la edicion$")
    public void da_click_al_boton_Guardar_confirmando_la_edicion() throws Throwable {
        System.out.printf("Paso And");
    }

    @Then("^Se edita correctamente el nuevo registro$")
    public void se_edita_correctamente_el_nuevo_registro() throws Throwable {
        System.out.printf("Paso Then");
        Hook.closeBrowser(basePage.handleDriver());
    }
}