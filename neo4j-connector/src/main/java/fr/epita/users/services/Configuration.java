package fr.epita.users.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration {
	
	Properties properties;
	
	private static Configuration instance; 
	
	private Configuration() {
		this.properties = new Properties();
		try {
			this.properties.load(new FileInputStream(new File(System.getProperty("conf.location"))));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Configuration getInstance() {
		if (instance== null) {
			instance = new Configuration();
		}
		return instance;
	}
	
	
	public String getDatabaseUserName(){
		return this.properties.getProperty("db.user");
	}
	
	public String getDatabasePassword(){
		return this.properties.getProperty("db.pwd");
	}
	
	public String getUrl(){
		return this.properties.getProperty("db.url");
	}

}
