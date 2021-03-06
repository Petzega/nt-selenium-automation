package pageObjects.PO_002_FlujoConfEstadosCrearRegistro;

import helpers.BasePage;
import org.junit.Assert;

import java.awt.*;
import java.io.IOException;

public class P003_ValidarNuevoRegistro extends BasePage {
    String lbl_registro = "//td[contains(text(),'1')]/following-sibling::td[contains(text(),'AUTO_STATE_1')]" +
            "/following-sibling::td[contains(text(),'AUTO_REF_1')]";

    public void validateNewRegister() {
        System.out.println("P003");
        try {
            Assert.assertTrue("Se creo el registro correctamente", validateObject(lbl_registro, "DISPLAYED"));
        } catch ( InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin P003");
    }
}
