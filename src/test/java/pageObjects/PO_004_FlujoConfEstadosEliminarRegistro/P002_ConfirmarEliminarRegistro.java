package pageObjects.PO_004_FlujoConfEstadosEliminarRegistro;

import helpers.BasePage;
import org.junit.Assert;

public class P002_ConfirmarEliminarRegistro extends BasePage {
    String btn_eliminar = "//td[contains(text(),'1')]/following-sibling::td[contains(@Role,'gridcell')]/child::" +
            "div[contains(@Class,'ng-star-inserted')]/child::*[contains(@Title,'Eliminar')]";
    String btn_aceptar = "//*[contains(text(),'Aceptar')]";
    String lbl_error = "//*[contains(text(),'Existe otro estado con el mismo nombre.')]";

    public void saveDeleteRegister() throws Throwable {
        System.out.println("P002");
        try {
            doClick(btn_eliminar);
            doClick(btn_aceptar);
            boolean validate = validateObject(lbl_error, "DISPLAYED");
        } catch (AssertionError e) {
            Assert.fail("Error al guardar registro");
        }
        System.out.println("Fin P002");
    }
}
