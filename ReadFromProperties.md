📌 Project Summary: Configuration Management Using Properties File:

FileNames: 
1) ReadFromProperties.java)
2) Configuration (.properties file)

This module provides a configuration utility to read application-level settings from an external Properties file using Java’s Properties class.
It is designed to support automation frameworks by separating environment and configuration data from test scripts.

🧩 Components Overview:
🔹 1. ReadFromProperties (Configuration Utility Class):
This utility class is responsible for reading key-value pairs from a .properties file.

Features:
1) Reads configuration values using a key-based approach
2) Supports dynamic access to browser, URL, and credentials
3) Prevents hard-coding of environment-specific data
4) Easily reusable across test classes

Key Method:
- readProperty(String key) → Fetches the corresponding value for the provided key from the configuration file

🔹 2. Configuration.properties (Config File):
Stores application and environment details in key-value format.

Sample Configuration:
1) browser → Browser name to execute tests
2) url → Application URL
3) username → Login username
4) password → Login password

This allows quick switching between environments without modifying the code.

🔧 Technologies Used:
- Java
- Properties File (.properties)
