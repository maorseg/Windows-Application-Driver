package winapps;

/**
 * Created by Maor on 5/6/2018.
 * Example for using WinAppDriver with Notepad ++
 * Verify element existence and compare to expected results in the About screen:
 * 1) GNU
 * 2) Author
 * 3) Home Page
 * 4) App version
 */

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import static java.util.concurrent.TimeUnit.SECONDS;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class NotepadPlus {

    private static WindowsDriver driverSession = null;

    @BeforeTest
    public static void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Program Files\\Notepad++\\notepad++.exe");
        driverSession = new WindowsDriver(new URL(" http://127.0.0.1:4723"), capabilities);
        driverSession.manage().window().maximize();
        driverSession.manage().timeouts().implicitlyWait(10, SECONDS);
    }

    // Verify element existence and correctness in the About screen: GNU, Author, Home Page, App version

    @Test
    public void GeneralPublicLicence() throws InterruptedException {
        driverSession.findElementByName("?").click();
        driverSession.findElementByAccessibilityId("47000").click();
        String result = driverSession.findElementByName("GNU General Public Licence").getAttribute("Name");
        System.out.println("Verifying GNU element: " + result);
        Assert.assertEquals(result,"GNU General Public Licence");
        driverSession.findElementByName("OK").click();
        SECONDS.sleep(2);
    }

    @Test
    // Verify element exist in the About - Author
    public void Author() throws InterruptedException {
        driverSession.findElementByName("?").click();
        driverSession.findElementByAccessibilityId("47000").click();
        String result = driverSession.findElementByAccessibilityId("1705").getAttribute("Name");
        System.out.println("Verifying Author element: " + result);
        Assert.assertEquals(result,"Notepad++ team");
        driverSession.findElementByName("OK").click();
        SECONDS.sleep(2);
    }

    @Test
    // Verify element exist in the About - Home Page
    public void HomePage() throws InterruptedException {
        driverSession.findElementByName("?").click();
        driverSession.findElementByAccessibilityId("47000").click();
        String result = driverSession.findElementByAccessibilityId("1702").getAttribute("Name");
        System.out.println("Verifying HomePage element: " + result);
        Assert.assertEquals(result,"https://notepad-plus-plus.org/");
        driverSession.findElementByName("OK").click();
        SECONDS.sleep(2);
    }

    @Test
    // Verify element exist in the About - App version
    public void AppVersion() throws InterruptedException {
        driverSession.findElementByName("?").click();
        driverSession.findElementByAccessibilityId("47000").click();
        String result = driverSession.findElementByName("Notepad++ v7.3.3").getAttribute("Name");
        System.out.println("Verifying App Version element: " + result);
        Assert.assertEquals(result,"Notepad++ v7.3.3");
        driverSession.findElementByName("OK").click();
        SECONDS.sleep(2);
    }

    @AfterTest
    public static void tearDown() {
        if (driverSession != null) {
            driverSession.quit();
        }
    }
}