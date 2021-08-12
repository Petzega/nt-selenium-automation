package pageObjects.PO_004_FlujoConfEstadosEliminarRegistro;

import helpers.BasePage;
import org.junit.Assert;

import java.awt.*;
import java.io.IOException;

public class P001_BuscarRegistro extends BasePage {
    String cb_sistema = "/html/body/app-root/app-list-status/div/div/mat-card/div[2]/form/div[1]/div[1]/div[1]/div[2]/mat-form-field/div/div[1]";
    String li_sistema = "//span[contains(text(),'SISTEMA DE DESPACHO')]";
    String txt_estado = "name|statusName";
    String btn_buscar = "//*[contains(text(),'Buscar')]";
    String lbl_error = "id|message";

    public void searchRegister() throws Throwable{
        System.out.println("P001");
        try {
            doClick(cb_sistema);
            doClick(li_sistema);
            doTypeText(txt_estado, "AUTO_STATE_1.5");
            doClick(btn_buscar);
            Thread.sleep(5000);
            boolean validate = validateObjectByProperty(lbl_error, "DISPLAYED");
            if (validate) {
                Assert.assertFalse("Registro no existe", validate);
            } else {
                Assert.assertFalse("Registro encontrado", validate);
            }
        } catch (AssertionError e) {
            e.printStackTrace();
            Assert.fail("Error al ingresar los datos de registro");
        }
        System.out.println("Fin P001");
    }
}
