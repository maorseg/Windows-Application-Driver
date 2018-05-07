package winapps2;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by Maor on 5/7/2018.
 * Run test on About screen
 */
public class About extends setUp {

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
        Assert.assertEquals(result2, "http://www.nirsoft.net");
        driverSession.findElementByName("OK").click();
    }

    @AfterClass
    public static void tearDown() {
        if (driverSession != null) {
            driverSession.quit();
        }
    }
}