📌TestNG Parameterization Using XML (Selenium WebDriver): 

FileNames:
1) ReadFromXml.java
2) ReadData.xml

This project demonstrates how to use TestNG XML parameterization to run Selenium tests across different browsers and URLs without changing the test code.

Overview:
- The test reads browser type and application URL from the testng.xml file.
- Based on the browser parameter, the corresponding WebDriver (Chrome, Edge, or Firefox) is initialized.
- The application URL is launched dynamically during runtime.

⭐Key Features:
1) Supports Chrome, Edge, and Firefox browsers
2) Uses TestNG @Parameters annotation
3) Centralized configuration via testng.xml
4) Easy to extend for cross-browser testing

🔧Technologies Used:
- Java
- Selenium WebDriver
- TestNG
- Maven

🧩This setup is useful for:
- Cross-browser testing
- Environment-based execution
- Reducing hard-coded values in test scripts
