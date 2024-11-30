package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperties {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./testData/data.properties");
		Properties property = new Properties();
		property.load(fis);
		property.put("user", "siri");
		FileOutputStream fos = new FileOutputStream("./testData/data.properties");
		property.store(fos, "Updated successfully");
		
	}

}
