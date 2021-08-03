package pageObjects.PO_002_FlujoConfEstadosCrearRegistro;

import helpers.BasePage;
import org.junit.Assert;

import java.awt.*;
import java.io.IOException;

public class P002_GuardarRegistro extends BasePage {
    String btn_guardar = "//*[contains(@Title,'Guardar')]";
    String btn_aceptar = "//*[contains(text(),'Aceptar')]";

    public void saveNewRegister() {
        System.out.println("P002");
        try {
            //doClick(btn_guardar);
            //doClick(btn_aceptar);
            //Thread.sleep(3000);
        } catch (AssertionError e) {
            Assert.fail("Error al guardar registro");
        } /*catch (/*IOException | AWTException | InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("Fin P002");
    }
}
