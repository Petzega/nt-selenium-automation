package pageObjects.PO_002_FlujoConfEstadosCrearRegistro;

import helpers.BasePage;

import java.awt.*;
import java.io.IOException;

public class P001_CrearRegistro extends BasePage {
    String btn_nuevo = "//*[contains(text(),'Nuevo')]";
    String cb_sistema = "cssSelector|#mat-select-1 > div > div.mat-select-value.ng-tns-c73-3";
    String li_sd = "id|mat-option-19";
    String txt_estado = "id|mat-input-1";
    String cb_subOrden = "cssSelector|#mat-select-2 > div > div.mat-select-arrow-wrapper.ng-tns-c73-5";
    String li_so = "id|mat-option-25";
    String txt_descripcion = "id|mat-input-2";
    String txt_referencia = "//*[contains(@placeholder,'Referencia')]";

    public void createNewRegister() {
        try {
            doClick(btn_nuevo);
            doScrollToElement(cb_sistema);
            doClick(cb_sistema);
            doClick(li_sd);
            doTypeText(txt_estado, "AUTO_STATE");
            doClick(cb_subOrden);
            doClick(li_so);
            doTypeText(txt_descripcion, "AUTO_DESC");
            doTypeText(txt_referencia, "AUTO_REF");
        } catch (AssertionError | IOException | AWTException e) {
            e.printStackTrace();
        }
    }
}
