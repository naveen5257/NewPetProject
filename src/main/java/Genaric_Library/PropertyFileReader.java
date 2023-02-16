package Genaric_Library;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class PropertyFileReader implements FrameWork_Constant{
	
		public static String getProperty(String Key) throws IOException {
			FileInputStream fis=new FileInputStream(PROPERTYFILE_PATH);
			Properties p=new Properties();
			p.load(fis);
			String Value=p.getProperty(Key);
			return Value;			
}
}
