package helpers;

import java.awt.*;
import java.io.IOException;
import java.security.Key;
import java.util.*;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.interactions.Action;
import utilities.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class BasePage {
    public static WebDriver driver;
    public int waitingTime = 5;
    public int waitingLongTime = 120;
    public String parentHandle = "";

    public void setWebDriver(WebDriver driver) {BasePage.driver = driver;}
    public static WebDriver handleDriver(){return driver;}
    public enum properties {DISPLAYED, VISIBLE, SELECTED;}

    public WebElement wait(String objName) {
        WebDriverWait waiting = new WebDriverWait(driver, waitingTime);
        WebElement element = null;
        try {
            System.out.println(objName);
            element = waiting.until(ExpectedConditions.visibilityOfElementLocated(ObjectMap.getLocator(objName)));
        } catch (Exception e) {
            System.out.println("Error en wait " + e);
        }
        return element;
    }

    public void doClick(String objName) throws IOException, AWTException {
        try {
            WebElement element = wait(objName);
            element.click();
            Thread.sleep(1000);
        } catch (AssertionError | InterruptedException e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
        }
    }

    public void doScrollToElement(String objName) {
        try {
            WebElement element = wait(objName);
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", element);
        } catch (AssertionError e) {
            e.getMessage();
            Assert.fail("Fallo el scrooll", e);
        }
    }

    public void doTypeText(String objName, String text) {
        try {
            WebElement element = wait(objName);
            element.clear();
            element.sendKeys(text);
        } catch (AssertionError e) {
            e.getMessage();
            e.getStackTrace();
            e.printStackTrace();
            Assert.fail("Fallo en agregar texto", e);
        }
    }

    public boolean validateObject(String objName, String PropertyToBeVerified) throws InterruptedException {
        boolean ActualPropertyValue = false;
        String prop = PropertyToBeVerified.toUpperCase();
        Thread.sleep(3000);
        try {
            WebElement element = wait(objName);
            switch (properties.valueOf(prop)) {
                case DISPLAYED:
                    ActualPropertyValue = element.isDisplayed();
                    break;
                case VISIBLE:
                    ActualPropertyValue = element.isEnabled();
                    break;
                case SELECTED:
                    ActualPropertyValue = element.isSelected();
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (ActualPropertyValue) {
            return true;
        }
        return false;
    }
}
