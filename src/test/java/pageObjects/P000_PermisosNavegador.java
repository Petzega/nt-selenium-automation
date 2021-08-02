package pageObjects;

import helpers.BasePage;
import org.junit.Assert;

public class P000_PermisosNavegador extends BasePage {
    String btn_configure = "id|details-button";
    String link = "id|proceed-link";
    String lbl_title = "//*[contains(text(),'Configuración Estados')]";

    public void getPrivacy() {
        try {
            doClick(btn_configure);
            doClick(link);
            Assert.assertTrue("Se redirecciona al modulo Configuracion Estados", validateObject(lbl_title, "DISPLAYED"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
