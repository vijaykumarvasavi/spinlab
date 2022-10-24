package Library;

import java.io.FileInputStream;
import java.util.Properties;

public class Notepad {
	
	
public String getdatafilepath(String key) throws Exception {
		
		FileInputStream fel = new FileInputStream(pathdata.notepadn);
		Properties per = new Properties();
		per.load(fel);
		String value = per.getProperty(key);
		return value;
		
		
	}

}
