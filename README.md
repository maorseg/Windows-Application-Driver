# Windows-Application-Driver
Windows Application Driver for Automating windows based apps

https://github.com/Microsoft/WinAppDriver

https://www.youtube.com/watch?v=Q_HUkWczd34&list=PLEiBaBxmVLi9-Ioe2lys5xpR4S4fUOq7F

https://www.automatetheplanet.com/automate-windows-desktop-apps-winappdriver

 # Enable Windows 10 Developer Mode
 Open Windows 10 Settings. Then navigate to Update & Settings. Click For Developers tab. Choose the Developer mode option.


# How to get the Application id
1) Run the application.
 
2) Go to task manager - Details tab.
 
3) Find the application and click on properties.
 
4) Under General tab - Location.

E.G. for Calculator:
C:\Program Files\WindowsApps\Microsoft.WindowsCalculator_10.1804.911.0_x64__8wekyb3d8bbwe
therefore in your script DesiredCapabilities the line will look like this:

capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");

# Inspecting UI Elements
inspect.exe tool
Inspect is available on MSDN https://msdn.microsoft.com/library/windows/desktop/dd318521(v=vs.85).aspx.
