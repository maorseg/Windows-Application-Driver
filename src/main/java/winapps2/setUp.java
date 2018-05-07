package winapps2;

/**
 * Created by Maor on 5/6/2018.
 * Test application example: BatteryInfoView from http://www.nirsoft.net/
 * it's freeware so just download it to see how the code works
 */

import io.appium.java_client.windows.WindowsDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import static java.util.concurrent.TimeUnit.SECONDS;
import org.testng.annotations.*;

public class setUp {

    public static WindowsDriver driverSession = null;

    @BeforeClass
    public static void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Users\\Maor\\Desktop\\BatteryInfoView.exe");
        driverSession = new WindowsDriver(new URL(" http://127.0.0.1:4723"), capabilities);
        driverSession.manage().window().maximize();
        driverSession.manage().timeouts().implicitlyWait(10, SECONDS);
    }
}
