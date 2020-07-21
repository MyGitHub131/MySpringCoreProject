package com.fs.helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AppFactory {
	public static Object createObject(String l_className) throws FileNotFoundException, IOException, InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		Properties props=null;
		String actualClassName=null;
		Object obj=null;
		props=new Properties();
		props.load(new FileInputStream("G:\\SpringWorkSpace\\Proj-5(Practice)\\src\\com\\fs\\common\\app-classes.properties"));
		actualClassName=props.getProperty(l_className);
		obj=Class.forName(actualClassName).newInstance();
		return obj;
		
	}

}
