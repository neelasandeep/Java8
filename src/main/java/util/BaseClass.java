package util;

import org.apache.log4j.PropertyConfigurator;

public class BaseClass {
	static ConfigData config;

	
 private BaseClass() {}
	public static void getBaseClassLogger() {
		config = new ConfigData();
		PropertyConfigurator.configure(config.getLogprop());
	}

}
