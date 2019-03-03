package file.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) {
	

	
	}
	public static void fun1() throws IOException {

	        Properties or=new Properties();
			FileInputStream file= new FileInputStream("C:\\Users\\gajju\\eclipse-workspace\\java\\src\\file\\properties\\ObjectRepositry.properties");
			
			or.load(file);
			System.out.println(or.getProperty("username1"));

		}
		
	}


