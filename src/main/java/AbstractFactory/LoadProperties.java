package AbstractFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {

	public static String getProperties(String property) {
		Properties properties = null;
		try {
			FileReader reader = new FileReader("./src/main/resources/App.properties");
			properties = new Properties();
			properties.load(reader);
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return properties.getProperty(property);
	}
}
