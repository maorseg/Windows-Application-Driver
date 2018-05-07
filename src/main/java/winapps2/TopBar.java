package winapps2;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by Maor on 5/7/2018.
 */
public class TopBar extends setUp {

    @Test
    // Verify File option element exist
    public void StatusBarFile() throws InterruptedException {
        String result = driverSession.findElementByName("File").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"File");
    }
    @Test
    // Verify Edit option element exist
    public void StatusBarEdit() throws InterruptedException {
        String result = driverSession.findElementByName("Edit").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Edit");
    }

    @Test
    // Verify View option element exist
    public void StatusBarView() throws InterruptedException {
        String result = driverSession.findElementByName("View").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"View");
    }

    @Test
    // Verify Options option element exist
    public void StatusBarOptions() throws InterruptedException {
        String result = driverSession.findElementByName("Options").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Options");
    }

    @Test
    // Verify Help option element exist
    public void StatusBarHelp() throws InterruptedException {
        String result = driverSession.findElementByName("Help").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Help");
    }

    @AfterClass
    public static void tearDown() {
        if (driverSession != null) {
            driverSession.quit();
        }
    }
}
