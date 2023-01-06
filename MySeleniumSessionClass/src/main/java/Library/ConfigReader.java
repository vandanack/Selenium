package Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {	
	
	Properties p;
	
	public ConfigReader()
	{
		try {
			File f = new File("./ConfigurationProp/PropertiesConfig.property");
			FileInputStream fis = new FileInputStream(f);
			
			this.p = new Properties();
			p.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
	
	public String chroPath()
	{
		return p.getProperty("chromeDiverpath");
	}
	
	public String getUrl()
	{
		return p.getProperty("URL");
	}

}
