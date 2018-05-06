# Windows-Application-Driver
Windows Application Driver for Automating windows based apps

https://github.com/Microsoft/WinAppDriver

https://www.youtube.com/watch?v=Q_HUkWczd34&list=PLEiBaBxmVLi9-Ioe2lys5xpR4S4fUOq7F

https://www.automatetheplanet.com/automate-windows-desktop-apps-winappdriver

# How to get the Application id
 1.Run the application.
 
2. Go to task manager - Details tab.
 
3. Find the application and click on properties.
 
4. Under General tab - Location.

e.g. for Calc:
C:\Program Files\WindowsApps\Microsoft.WindowsCalculator_10.1804.911.0_x64__8wekyb3d8bbwe
therfore in your script DesiredCapabilities it will show like this:
capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");

# Inspecting UI Elements
inspect.exe tool
Inspect is available on MSDN https://msdn.microsoft.com/library/windows/desktop/dd318521(v=vs.85).aspx.
