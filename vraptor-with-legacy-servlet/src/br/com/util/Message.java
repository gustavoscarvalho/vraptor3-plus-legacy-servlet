package br.com.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Message {

	public String get(String key) throws IOException{
		Properties prop = new Properties();
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream("message.properties");
		if(inputStream != null){
			prop.load(inputStream);
		}
		String value = prop.getProperty(key);
		inputStream.close();
		return value;
	}
	
}
