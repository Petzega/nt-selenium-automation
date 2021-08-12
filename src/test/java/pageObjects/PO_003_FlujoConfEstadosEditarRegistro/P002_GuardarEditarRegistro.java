package pageObjects.PO_003_FlujoConfEstadosEditarRegistro;

import helpers.BasePage;
import org.junit.Assert;

public class P002_GuardarEditarRegistro extends BasePage {
    String btn_guardar = "//td[contains(text(),'1')]/following-sibling::td[(@Class='mat-cell cdk-cell column-actions " +
            "cdk-column-actions mat-column-actions ng-star-inserted')]/child::div[(@Class='ng-star-inserted')]" +
            "/child::*[contains(@Title,'Guardar')]";
    String btn_aceptar = "//*[contains(text(),'Aceptar')]";
    String lbl_error = "//*[contains(text(),'Existe otro estado con el mismo nombre.')]";

    public void saveEditRegister() throws Throwable {
        System.out.println("P002");
        try {
            doClick(btn_guardar);
            doClick(btn_aceptar);
            boolean validate = validateObjectByProperty(lbl_error, "DISPLAYED");
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
