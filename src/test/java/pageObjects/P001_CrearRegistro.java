package pageObjects;

import helpers.BasePage;

import java.awt.*;
import java.io.IOException;

public class P001_CrearRegistro extends BasePage {
    String btn_new = "//*[contains(text(),'Nuevo')]";
    String btn_cancel = "//*[contains(@title,'Cancelar')]";

    public void createNewRegister() {
        try {
            doClick(btn_new);
            doScrollToElement(btn_cancel);
            doClick(btn_cancel);
        } catch (AssertionError | IOException | AWTException e) {
            e.printStackTrace();
        }
    }
}
