📌 Project Summary: Excel Data-Driven Testing Utility (Apache POI + TestNG):
FileNames: 
1) ReadFromExcel.java
2) ReadExcel.java

This project demonstrates data-driven testing (DDT) in Selenium/TestNG by reading test data from an Excel (.xlsx) file using Apache POI.
It separates test data handling from test execution logic, following real-world automation framework practices.

🧩 Components Overview:

🔹 1. ReadFromExcel (File Utility Class):
- This class acts as a reusable Excel utility, responsible for fetching test data from an Excel file.

Features:
1) Reads single cell data using sheet name, row, and column
2) Reads multiple rows and columns and stores them in a 2D String array
3) Supports scalable data-driven automation
4) Centralizes Excel handling logic

Key Methods:
1) single(String sheet, int row, int column) → Used to fetch individual values like usernames, passwords, URLs
2) multiple(String sheet) → Used to fetch bulk test data for multiple test executions

🔹 2. ReadExcel (Test Class):
- This class demonstrates how to consume Excel data using the utility methods.

Test Scenarios Covered:
1) Reads individual username/password combinations using single()
2) Reads multiple test data values using multiple() method
3) Prints retrieved data to verify Excel integration

🔧 Technologies Used:
- Java
- Apache POI
- TestNG
- Excel (.xlsx)
