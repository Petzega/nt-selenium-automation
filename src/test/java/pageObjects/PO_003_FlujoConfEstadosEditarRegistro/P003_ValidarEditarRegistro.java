package pageObjects.PO_003_FlujoConfEstadosEditarRegistro;

import helpers.BasePage;
import org.junit.Assert;

public class P003_ValidarEditarRegistro extends BasePage {
    String lbl_registro = "//td[contains(text(),'1')]/following-sibling::td[contains(text(),'AUTO_STATE_1.5')]" +
            "/following-sibling::td[contains(text(),'AUTO_REF_1.5')]";

    public void validateEditRegister() {
        System.out.println("P003");
        try {
            Assert.assertTrue("Se edito el registro correctamente", validateObject(lbl_registro, "DISPLAYED"));
        } catch ( InterruptedException e) {
            e.printStackTrace();
            Assert.fail("Error al editar registro");
        }
        System.out.println("Fin P003");
    }
}
