package winapps2;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by Maor on 5/6/2018.
 * Run tests on main app window
 * Verify all 22 items are available with correct names in the app main window
 */

public class BatteryInfoView extends setUp {

    @Test (priority=0)
    // Pre-condition for all below tests: Verify Show Battery Information button is clicked
    public void ShowBatteryInformation() {
        driverSession.findElementByName("Show Battery Information").click();
    }

    @Test
    // Verify StatusBar element exist that describes the following default text: 22 item(s), 1 Selected
    public void StatusBar() throws InterruptedException {
        String result = driverSession.findElementByName("22 item(s), 1 Selected").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"22 item(s), 1 Selected");
    }

    @Test
    // Verify Battery Name element exist
    public void BatteryName() throws InterruptedException {
        String result = driverSession.findElementByName("Battery Name").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Battery Name");
    }

    @Test
    // Verify Manufacture Name element exist
    public void ManufactureName() throws InterruptedException {
        String result = driverSession.findElementByName("Manufacture Name").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Manufacture Name");
    }

    @Test
    // Verify Serial Number element exist
    public void SerialNumber() throws InterruptedException {
        String result = driverSession.findElementByName("Serial Number").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Serial Number");
    }

    @Test
    // Verify Manufacture Date element exist
    public void ManufactureDate() throws InterruptedException {
        String result = driverSession.findElementByName("Manufacture Date").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Manufacture Date");
    }

    @Test
    // Verify Power State element exist
    public void PowerState() throws InterruptedException {
        String result = driverSession.findElementByName("Power State").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Power State");
    }

    @Test
    // Verify Current Capacity (in %) element exist
    public void CurrentCapacity() throws InterruptedException {
        String result = driverSession.findElementByName("Current Capacity (in %)").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Current Capacity (in %)");
    }

    @Test
    // Verify Current Capacity Value element exist
    public void CurrentCapacityValue() throws InterruptedException {
        String result = driverSession.findElementByName("Current Capacity Value").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Current Capacity Value");
    }

    @Test
    // Verify Full Charged Capacity Value element exist
    public void FullChargedCapacity() throws InterruptedException {
        String result = driverSession.findElementByName("Full Charged Capacity").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Full Charged Capacity");
    }

    @Test
    // Verify Designed CapacityValue element exist
    public void DesignedCapacity() throws InterruptedException {
        String result = driverSession.findElementByName("Designed Capacity").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Designed Capacity");
    }

    @Test
    // Verify BatteryHealth element exist
    public void BatteryHealth() throws InterruptedException {
        String result = driverSession.findElementByName("Battery Health").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Battery Health");
    }

    @Test
    // Verify Voltage element exist
    public void Voltage() throws InterruptedException {
        String result = driverSession.findElementByName("Voltage").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Voltage");
    }

   @Test
    // Verify Charge/Discharge Rate element exist
    public void ChargeDischargeRate() throws InterruptedException {
        String result = driverSession.findElementByName("Charge/Discharge Rate ").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Charge/Discharge Rate ");
    }

    @Test
    // Verify Chemistry element exist
    public void Chemistry() throws InterruptedException {
        String result = driverSession.findElementByName("Chemistry ").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Chemistry ");
    }

    @Test
    // Verify Low Battery Capacity (1) element exist
    public void LowBatteryCapacity1() throws InterruptedException {
        String result = driverSession.findElementByName("Low Battery Capacity (1)").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Low Battery Capacity (1)");
    }

    @Test
    // Verify Low Battery Capacity (2) element exist
    public void LowBatteryCapacity2() throws InterruptedException {
        String result = driverSession.findElementByName("Low Battery Capacity (2)").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Low Battery Capacity (2)");
    }

    @Test
    // Verify Critical Bias element exist
    public void CriticalBias() throws InterruptedException {
        String result = driverSession.findElementByName("Critical Bias").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Critical Bias");
    }

    @Test
    // Verify Number of charge/discharge cycles element exist
    public void NumberOfChargeDischargeCycles() throws InterruptedException {
        String result = driverSession.findElementByName("Number of charge/discharge cycles").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Number of charge/discharge cycles");
    }

    @Test
    // Verify Battery Temperature element exist
    public void BatteryTemperature() throws InterruptedException {
        String result = driverSession.findElementByName("Battery Temperature").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Battery Temperature");
    }

    @Test
    // Verify Remaining battery time for the current activity (Estimated) element exist
    public void RemainingBatteryTime() throws InterruptedException {
        String result = driverSession.findElementByName("Remaining battery time for the current activity (Estimated)").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Remaining battery time for the current activity (Estimated)");
    }

    @Test
    // Verify Full battery time for the current activity (Estimated) element exist
    public void FullBatteryTime() throws InterruptedException {
        String result = driverSession.findElementByName("Full battery time for the current activity (Estimated)").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Full battery time for the current activity (Estimated)");
    }

    @Test
    // Verify Remaining time for charging the battery (Estimated) element exist
    public void RemainingTimeForChargingBattery() throws InterruptedException {
        String result = driverSession.findElementByName("Remaining time for charging the battery (Estimated)").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Remaining time for charging the battery (Estimated)");
    }

    @Test
    // Verify Total time for charging the battery (Estimated) element exist
    public void TotalTimeForChargingBattery() throws InterruptedException {
        String result = driverSession.findElementByName("Total  time for charging the battery (Estimated)").getAttribute("Name");
        System.out.println("Element name value: " + result);
        Assert.assertEquals(result,"Total  time for charging the battery (Estimated)");
    }

    @AfterClass
    public static void tearDown() {
        if (driverSession != null) {
            driverSession.quit();
        }
    }
}