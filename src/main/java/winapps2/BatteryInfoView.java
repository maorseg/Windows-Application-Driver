package winapps2;

/**
 * Created by Maor on 5/6/2018.
 * test application example: BatteryInfoView from http://www.nirsoft.net/
 */

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import static java.util.concurrent.TimeUnit.SECONDS;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class BatteryInfoView {

    private static WindowsDriver driverSession = null;

    @BeforeTest
    public static void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Users\\Maor\\Desktop\\BatteryInfoView.exe");
        driverSession = new WindowsDriver(new URL(" http://127.0.0.1:4723"), capabilities);
        driverSession.manage().window().maximize();
        driverSession.manage().timeouts().implicitlyWait(10, SECONDS);
    }

    @Test
    // Verify Battery Name element exist
    public void BatteryName() throws InterruptedException {
        String result = driverSession.findElementByName("Battery Name").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Battery Name");
        SECONDS.sleep(2);
    }

    @Test
    // Verify Manufacture Name element exist
    public void ManufactureName() throws InterruptedException {
        String result = driverSession.findElementByName("Manufacture Name").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Manufacture Name");
        SECONDS.sleep(2);
    }

    @Test
    // Verify Serial Number element exist
    public void SerialNumber() throws InterruptedException {
        String result = driverSession.findElementByName("Serial Number").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Serial Number");
        SECONDS.sleep(2);
    }

    @Test
    // Verify Manufacture Date element exist
    public void ManufactureDate() throws InterruptedException {
        String result = driverSession.findElementByName("Manufacture Date").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Manufacture Date");
        SECONDS.sleep(2);
    }

    @Test
    // Verify Power State element exist
    public void PowerState() throws InterruptedException {
        String result = driverSession.findElementByName("Power State").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Power State");
        SECONDS.sleep(2);
    }

    @Test
    // Verify Current Capacity (in %) element exist
    public void CurrentCapacity() throws InterruptedException {
        String result = driverSession.findElementByName("Current Capacity (in %)").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Current Capacity (in %)");
        SECONDS.sleep(2);
    }


    @Test
    // Verify Current Capacity Value element exist
    public void CurrentCapacityValue() throws InterruptedException {
        String result = driverSession.findElementByName("Current Capacity Value").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Current Capacity Value");
        SECONDS.sleep(2);
    }

    @Test
    // Verify Full Charged Capacity Value element exist
    public void FullChargedCapacity() throws InterruptedException {
        String result = driverSession.findElementByName("Full Charged Capacity").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Full Charged Capacity");
        SECONDS.sleep(2);
    }

    @Test
    // Verify Designed CapacityValue element exist
    public void DesignedCapacity() throws InterruptedException {
        String result = driverSession.findElementByName("Designed Capacity").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Designed Capacity");
        SECONDS.sleep(2);
    }

    // ...

    @Test
    // Verify Manufacture Date element exist
    public void About() throws InterruptedException {
        driverSession.findElementByName("Help").click();
        driverSession.findElementByName("About").click();
        String result = driverSession.findElementByAccessibilityId("1002").getAttribute("Name");
        System.out.println("Element value1: " + result);
        Assert.assertNotNull(result);
        
        String result2 = driverSession.findElementByAccessibilityId("1004").getAttribute("Name");
        System.out.println("Element value2: " + result2);
        Assert.assertEquals(result2,"http://www.nirsoft.net");

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
