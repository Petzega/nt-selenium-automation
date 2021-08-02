package helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.GlobalVariables;

import java.util.concurrent.TimeUnit;

public class Hook {
    public WebDriver driver;
    public BasePage basePage;

    public WebDriver browser(String browser, String url) throws Exception {
        try {
            boolean browserFound = true;
            if (browser.toUpperCase().equals("CHROME")) {
                System.setProperty("webdriver.chrome.driver", GlobalVariables.AUT_BROWSER_SERVER_PATH_CHROME);
                driver = new ChromeDriver();
            } else {
                browserFound = false;
            }
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            if (browserFound) {
                driver.manage().window().maximize();
                driver.get(url);
                basePage = new BasePage();
                basePage.setWebDriver(driver);
                System.out.println("Se levanta browser " + driver.getTitle());
            } else {
                System.out.println("No se levanta el browser");
            }
        } catch (AssertionError e) {
            System.out.println(e);
        }
        return driver;
    }

    public static void closeBrowser(WebDriver iDriver) {
        System.out.println("en cerrar browser");
        iDriver.quit();
    }
}
