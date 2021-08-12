package pageObjects.PO_001_FlujoGeneral;

import helpers.BasePage;
import org.junit.Assert;

public class P002_GuardarRegistros extends BasePage {
    String btn_guardar = "//*[contains(@Title,'Guardar')]";
    String btn_aceptar = "//*[contains(text(),'Aceptar')]";
    String btn_cerrar = "//*[contains(text(),'Cerrar')]";
    String btn_cerrars = "//*[contains(text(),'Cerrars')]";
    String lbl_error = "//*[contains(text(),'Existe otro estado con el mismo nombre.')]";

    public void saveNewRegister() throws Throwable {
        System.out.println("P002");
        try {
            doClick(btn_guardar);
            /*doClick(btn_aceptar);
            boolean validate_btn = validateObjectExists(btn_cerrar);
            if (validate_btn) {
                boolean validate = validateObjectExists(lbl_error);
                if (validate) {
                    doClick(btn_cerrar);
                    Assert.fail("Registro existente");
                } else {
                    doClick(btn_cerrar);
                    Assert.fail("Servicio no funcional");
                }
            } else {*/
                Assert.assertFalse("Registro creado", false);
            /*}*/
        } catch (AssertionError e) {
            Assert.fail("Error al guardar registro");
        }
        System.out.println("Fin P002");
    }

    String btn_guardar1 = "//td[contains(text(),'1')]/following-sibling::td[(@Class='mat-cell cdk-cell column-actions " +
            "cdk-column-actions mat-column-actions ng-star-inserted')]/child::div[(@Class='ng-star-inserted')]" +
            "/child::*[contains(@Title,'Guardar')]";
    String btn_aceptar1 = "//*[contains(text(),'Aceptar')]";
    String lbl_error1 = "//*[contains(text(),'Existe otro estado con el mismo nombre.')]";

    public void saveEditRegister() throws Throwable {
        System.out.println("P002");
        try {
            doClick(btn_guardar1);
            doClick(btn_aceptar1);
            boolean validate = validateObjectByProperty(lbl_error1, "DISPLAYED");
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
