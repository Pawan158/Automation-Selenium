package DDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class FromProperties {
	@Test
	public void main() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Configuration.properties");
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);

		String url = prop.getProperty("url");
		System.out.println(url);
		
		String username = prop.getProperty("username");
		System.out.println(username);
		
		String password = prop.getProperty("password");
		System.out.println(password);
	}
}
