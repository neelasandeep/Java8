package util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;



public class ConfigData {
	Properties properties;
	Properties indexReader;
	Logger logger = Logger.getLogger(ConfigData.class);

	

	Properties createProperty(String filePath)
	{
		Properties prop  = new Properties();
		File src = new File(filePath);
		try (FileInputStream fis = new FileInputStream(src);) {
			prop.load(fis);
		} catch (Exception e) {
			logger.warn("Unable to load config File", e);
		}
		return prop;
	}
	
	public String getLogprop() {
		properties = createProperty("./src/main/resources/configurations/Config.properties");
		return properties.getProperty("log4j");
	}

}
