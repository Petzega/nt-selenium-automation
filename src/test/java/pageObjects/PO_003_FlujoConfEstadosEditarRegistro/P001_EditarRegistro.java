package pageObjects.PO_003_FlujoConfEstadosEditarRegistro;

import helpers.BasePage;
import org.junit.Assert;

import java.awt.*;
import java.io.IOException;

public class P001_EditarRegistro extends BasePage {
    String lbl_registro = "//td[contains(text(),'1')]/following-sibling::td[contains(text(),'AUTO_STATE_1')]" +
            "/following-sibling::td[contains(text(),'AUTO_REF_1')]";
    String btn_editar = "//td[contains(text(),'1')]/following-sibling::td[contains(@Role,'gridcell')]/child::" +
            "div[contains(@Class,'ng-star-inserted')]/child::*[contains(@Title,'Editar')]";
    String txt_estado = "id|mat-input-1";
    String txt_descripcion = "//*[contains(@Placeholder,'Descripción')]";
    String txt_referencia = "//*[contains(@Placeholder,'Referencia')]";
    String cmb_retroceder = "//td[contains(text(),'1')]/following-sibling::td[(@Class='mat-cell cdk-cell cdk-column-moveBack " +
            "mat-column-moveBack ng-star-inserted')]/child::div[(@Class='edit-input-table ng-star-inserted')]" +
            "/child::*[(@id='mat-checkbox-32')]";
    String cmb_reiniciar = "//td[contains(text(),'1')]/following-sibling::td[(@Class='mat-cell cdk-cell cdk-column-restart " +
            "mat-column-restart ng-star-inserted')]/child::div[(@Class='edit-input-table ng-star-inserted')]" +
            "/child::*[(@id='mat-checkbox-33')]";

    public void editNewRegister() throws Throwable {
        System.out.println("P001");
        try {
            boolean validate = validateObject(lbl_registro, "DISPLAYED");
            if (validate) {
                doClick(btn_editar);
                doTypeText(txt_estado, "AUTO_STATE_1.5");
                doTypeText(txt_descripcion, "AUTO_DESC_1.5");
                doTypeText(txt_referencia, "AUTO_REF_1.5");
                doClick(cmb_retroceder);
                doClick(cmb_reiniciar);
            }
        } catch (AssertionError e) {
            e.printStackTrace();
            Assert.fail("Error al ingresar los datos de registro");
        }
        System.out.println("Fin P001");
    }
}
