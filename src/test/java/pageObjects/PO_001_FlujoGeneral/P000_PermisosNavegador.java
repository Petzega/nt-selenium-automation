package pageObjects.PO_001_FlujoGeneral;

import helpers.BasePage;
import org.junit.Assert;

import java.awt.*;
import java.io.IOException;

public class P000_PermisosNavegador extends BasePage {
    String btn_configure = "id|details-button";
    String link = "id|proceed-link";
    String lbl_title = "//*[contains(text(),'Configuración Estados')]";

    public void getPrivacy() throws IOException, AWTException {
        System.out.println("P000");
        try {
            doClick(btn_configure);
            doClick(link);
            Assert.assertTrue("Se redirecciona al modulo Configuracion Estados", validateObject(lbl_title, "DISPLAYED"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin P000");
    }
}
