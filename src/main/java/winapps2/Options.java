package winapps2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by Maor on 5/7/2018.
 * Run 1 test on Options screen
 */
public class Options extends setUp {

    @Test
    // Check a radio button as example
    public void RadioButtonExample() throws InterruptedException {
        driverSession.findElementByName("Options").click();
        driverSession.findElementByName("Advanced Options").click();

        //If the checkbox is not selected then checkbox.booleanValue() will return false
        Boolean checkbox = driverSession.findElementByAccessibilityId("1015").isSelected();
        System.out.println("The checkbox is selected true/false - " + checkbox.booleanValue());

        // and NOT of false is true, i.e we can click on checkbox
        if (!checkbox.booleanValue())
            driverSession.findElementByAccessibilityId("1015").click();
        driverSession.findElementByName("OK").click();
    }

    @AfterClass
    public static void tearDown() {
        if (driverSession != null) {
            driverSession.quit();
        }
    }
}
