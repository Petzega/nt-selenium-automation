package pageObjects.PO_001_FlujoGeneral;

import helpers.BasePage;
import org.junit.Assert;

public class P001_ModificarRegistros extends BasePage {
    String btn_nuevo = "//*[contains(text(),'Nuevo')]";
    String ce_cb_sistema = "cssSelector|#mat-select-1 > div > div.mat-select-value.ng-tns-c73-3";
    String li_sd = "id|mat-option-19";
    String txt_estado = "id|mat-input-1";
    String cb_subOrden = "cssSelector|#mat-select-2 > div > div.mat-select-arrow-wrapper.ng-tns-c73-5";
    String li_so = "id|mat-option-25";
    String txt_descripcion = "//*[contains(@placeholder,'Descripción')]";
    String txt_referencia = "//*[contains(@placeholder,'Referencia')]";

    public void createNewRegister() throws Throwable {
        System.out.println("P001");
        try {
            doClick(btn_nuevo);
            doScrollToElement(ce_cb_sistema);
            doClick(ce_cb_sistema);
            doClick(li_sd);
            doTypeText(txt_estado, "AUTO_STATE_0.5");
            doClick(cb_subOrden);
            doClick(li_so);
            doTypeText(txt_descripcion, "AUTO_DESC_0.5");
            doTypeText(txt_referencia, "AUTO_REF_0.5");
        } catch (NullPointerException e) {
            e.printStackTrace();
            Assert.fail("Error al ingresar los datos de registro");
        }
        System.out.println("Fin P001");
    }

    String lbl_registro = "//td[contains(text(),'1')]/following-sibling::td[contains(text(),'AUTO_STATE_0.5')]" +
            "/following-sibling::td[contains(text(),'AUTO_REF_0.5')]";
    String btn_editar = "//td[contains(text(),'1')]/following-sibling::td[contains(@Role,'gridcell')]/child::" +
            "div[contains(@Class,'ng-star-inserted')]/child::*[contains(@Title,'Editar')]";
    String cmb_retroceder = "//td[contains(text(),'1')]/following-sibling::td[(@Class='mat-cell cdk-cell cdk-column-moveBack " +
            "mat-column-moveBack ng-star-inserted')]/child::div[(@Class='edit-input-table ng-star-inserted')]" +
            "/child::*[(@id='mat-checkbox-32')]";
    String cmb_reiniciar = "//td[contains(text(),'1')]/following-sibling::td[(@Class='mat-cell cdk-cell cdk-column-restart " +
            "mat-column-restart ng-star-inserted')]/child::div[(@Class='edit-input-table ng-star-inserted')]" +
            "/child::*[(@id='mat-checkbox-33')]";

    public void editNewRegister() throws Throwable {
        System.out.println("P001");
        try {
            //boolean validate = validateObjectByProperty(lbl_registro, "DISPLAYED");
            //if (validate) {
                Thread.sleep(5000);
                /*doClick(btn_editar);
                doTypeText(txt_estado, "AUTO_STATE_0.75");
                doTypeText(txt_descripcion, "AUTO_DESC_0.75");
                doTypeText(txt_referencia, "AUTO_REF_0.75");
                doClick(cmb_retroceder);
                doClick(cmb_reiniciar);*/
            //}
        } catch (AssertionError e) {
            e.printStackTrace();
            Assert.fail("Error al ingresar los datos de registro");
        }
        System.out.println("Fin P001");
    }

    String cs_cb_sistema = "cssSelector|#mat-select-2 > div > div.mat-select-value.ng-tns-c73-5";
    String cs_li_sistema = "//span[contains(text(),'SISTEMA DE DESPACHOs')]";
    String cs_cb_estado = "cssSelector|#mat-select-3 > div > div.mat-select-value.ng-tns-c73-6";
    String cs_li_estado = "//*[contains(text(),'AUTO_STATE_1')]";

    public void searchRegister() throws Throwable {
        System.out.println("P001");
        try {
            doClick(btn_nuevo);
            doScrollToElement(cs_cb_sistema);
            doClick(cs_cb_sistema);
            doClick(cs_li_sistema);
            doClick(cs_cb_estado);
            doClick(cs_li_estado);
            doTypeText(txt_estado, "AUTO_SUB_1");
            doTypeText(txt_referencia, "AUTO_SUBREF_1");
            doTypeText(txt_descripcion, "AUTO_SUBDESC_1");
            Thread.sleep(6000);
        } catch (NullPointerException e) {
            e.printStackTrace();
            Assert.fail("Error al buscar los datos de registro");
        }
        System.out.println("Fin P001");
    }
}
