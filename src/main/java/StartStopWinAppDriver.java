package winapps2;

import org.testng.annotations.Test;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Maor on 5/9/2018.
 * Download Windows Application Driver installer from https://github.com/Microsoft/WinAppDriver/releases
 * Start - StartWinAppDriver i.e start listening to requests from application under test
 * Stop - StopWinAppDriver
 */

public class StartStopWinAppDriver {
    public String line = null;
    Runtime rt = Runtime.getRuntime();

    @Test
    public void Start() {

        try {
            Process pr = rt.exec("C:\\Program Files (x86)\\Windows Application Driver\\WinAppDriver.exe");
            BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }

            int exitVal = pr.waitFor();
            System.out.println("Exited with error code " + exitVal);

        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
    @Test
    public void Stop() {

        try {
            Process pr = rt.exec("Taskkill /IM WinAppDriver.exe /F");
            BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }

            int exitVal = pr.waitFor();
            System.out.println("Exited with error code " + exitVal);

        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}

