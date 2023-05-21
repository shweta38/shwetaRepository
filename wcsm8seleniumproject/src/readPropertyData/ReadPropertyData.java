package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//to read data from the property file
		Properties prop = new Properties();
		
		//make the property file to read
		prop.load(fis);
		String username = prop.getProperty("username");
		
		System.out.println(username);
		
		
		
	}

}
