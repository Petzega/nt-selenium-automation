package pageObjects.PO_002_FlujoConfEstadosCrearRegistro;

import helpers.BasePage;
import org.junit.Assert;

public class P003_ValidarRegistro extends BasePage {
    String lbl_id = "//td[contains(text(),'1')]";
    String lbl_estado = "//td[contains(text(),'AUTO_STATE')]";
    String lbl_subOrden = "//td[contains(text(),'Mixto')]";
    String lbl_descripcion = "//td[contains(text(),'AUTO_DESC')]";
    String lbl_referencia = "//td[contains(text(),'AUTO_REF')]";

    public void validateRegister() {
        try {
            if(validateObject(lbl_estado, "DISPLAYED")
            && validateObject(lbl_subOrden, "DISPLAYED") && validateObject(lbl_descripcion, "DISPLAYED")
            && validateObject(lbl_referencia, "DISPLAYED")) {
                System.out.println("Registro creado correctamente");
            } else {
                System.out.println("Registro no creado");
            }
        } catch (AssertionError | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
