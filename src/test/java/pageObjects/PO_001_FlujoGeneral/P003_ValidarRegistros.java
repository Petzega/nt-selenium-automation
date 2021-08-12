package pageObjects.PO_001_FlujoGeneral;

import helpers.BasePage;
import org.junit.Assert;

public class P003_ValidarRegistros extends BasePage {
    String lbl_registro = "//td[contains(text(),'2')]/following-sibling::td[contains(text(),'AUTO_STATE_0.5')]" +
            "/following-sibling::td[contains(text(),'AUTO_REF_0.5')]";

    public void validateNewRegister() throws Throwable{
        System.out.println("P003");
        try {
            Assert.assertTrue("Se creo el registro correctamente", validateObjectByProperty(lbl_registro, "DISPLAYED"));
        } catch (AssertionError e) {
            e.printStackTrace();
            Assert.fail("No se encuentra el registro");
        }
        System.out.println("Fin P003");
    }
}
