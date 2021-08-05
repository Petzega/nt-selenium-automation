package pageObjects.PO_004_FlujoConfEstadosEliminarRegistro;

import helpers.BasePage;
import org.junit.Assert;

public class P003_ValidarEliminarRegistro extends BasePage {
    String cmb_habilitado = "//*[contains(text(),'Habilitado')]";
    String btn_buscar = "//*[contains(text(),'Buscar')]";
    String lbl_registro = "//td[contains(text(),'1')]/following-sibling::td[contains(text(),'AUTO_STATE_1.5')]" +
            "/following-sibling::td[contains(text(),'AUTO_REF_1.5')]";

    public void validateDeleteRegister() throws Throwable {
        System.out.println("P003");
        try {
            doClick(cmb_habilitado);
            doClick(btn_buscar);
            Thread.sleep(5000);
            Assert.assertTrue("Se elimino el registro correctamente", validateObject(lbl_registro, "DISPLAYED"));
            Thread.sleep(3000);
        } catch (AssertionError e) {
            Assert.fail("Error al eliminar registro");
        }
        System.out.println("Fin P003");
    }
}
