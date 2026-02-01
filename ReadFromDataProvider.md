📌 Project Summary: Data-Driven Login Testing Using TestNG DataProvider:

FileName: 1) ReadFromDataProvider.java

This module demonstrates data-driven testing using TestNG’s @DataProvider annotation combined with Excel data reading via Apache POI.
It enables the same test case to run multiple times with different input data, improving test coverage and reusability.

🧩 Components Overview:

🔹 1. DataProvider Method – orangeLogin()

- Reads multiple username and password combinations from an Excel (.xlsx) file
- Stores the data in a two-dimensional Object array
- Supplies test data dynamically to the test method
- Eliminates hard-coded credentials from the test script

🔹 2. Test Method – Login Test Execution

- Accepts username and password as parameters from the DataProvider
- Launches Chrome browser
- Navigates to the OrangeHRM login page
- Enters credentials dynamically for each test iteration
- Closes the browser after execution
- Each row in the Excel sheet triggers a separate test execution.

🔧 Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Apache POI
- Excel (.xlsx)
