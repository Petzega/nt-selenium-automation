package pageObjects.PO_002_FlujoConfEstadosCrearRegistro;

import helpers.BasePage;
import org.junit.Assert;

public class P002_GuardarRegistro extends BasePage {
    String btn_guardar = "//*[contains(@Title,'Guardar')]";
    String btn_aceptar = "//*[contains(text(),'Aceptar')]";
    String lbl_error = "//*[contains(text(),'Existe otro estado con el mismo nombre.')]";

    public void saveNewRegister() throws Throwable {
        System.out.println("P002");
        try {
            doClick(btn_guardar);
            doClick(btn_aceptar);
            Thread.sleep(1500);
            boolean validate = validateObject(lbl_error, "DISPLAYED");
            if (validate) {
                Assert.assertFalse("Registro existente", validate);
            } else {
                Assert.assertFalse("Registro creado correctamente", validate);
            }
        } catch (AssertionError e) {
            Assert.fail("Error al guardar registro");
        }
        System.out.println("Fin P002");
    }
}
