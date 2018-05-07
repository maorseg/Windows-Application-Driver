package winapps2;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by Maor on 5/7/2018.
 */
public class Buttons extends setUp {

    @Test
    // Verify Show Battery Information button element exist
    public void ShowBatteryInformation() throws InterruptedException {
        String result = driverSession.findElementByName("Show Battery Information").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Show Battery Information");
    }

    @Test
    // Verify Show Battery Log button element exist
    public void ShowBatteryLog() throws InterruptedException {
        String result = driverSession.findElementByName("Show Battery Log").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Show Battery Log");
    }

    @Test
    // Verify Advanced Options button element exist
    public void AdvancedOptions() throws InterruptedException {
        String result = driverSession.findElementByName("Advanced Options").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Advanced Options");
    }

    @Test
    // Verify Clear Battery Log button element exist
    public void ClearBatteryLog() throws InterruptedException {
        String result = driverSession.findElementByName("Clear Battery Log").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Clear Battery Log");
    }

    @Test
    // Verify Save Selected Items button element exist
    public void SaveSelectedItems() throws InterruptedException {
        String result = driverSession.findElementByName("Save Selected Items").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Save Selected Items");
    }

    @Test
    // Verify Refresh button element exist
    public void Refresh() throws InterruptedException {
        String result = driverSession.findElementByName("Refresh").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Refresh");
    }

    @Test
    // Verify Copy Selected Items button element exist
    public void CopySelectedItems() throws InterruptedException {
        String result = driverSession.findElementByName("Copy Selected Items").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Copy Selected Items");
    }

    @Test
    // Verify Properties button element exist
    public void Properties() throws InterruptedException {
        String result = driverSession.findElementByName("Properties").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Properties");
    }

    @Test
    // Verify Find button element exist
    public void Find() throws InterruptedException {
        String result = driverSession.findElementByName("Find").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Find");
    }

    @Test
    // Verify Exit button element exist
    public void Exit() throws InterruptedException {
        String result = driverSession.findElementByName("Exit").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Exit");
    }

    @AfterClass
    public static void tearDown() {
        if (driverSession != null) {
            driverSession.quit();
        }
    }
}
