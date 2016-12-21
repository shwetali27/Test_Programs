package com.bridgelabz.ReadPropertiesFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties 
{
    public static void main( String[] args )
    {
    	Properties prop = new Properties();
    	InputStream input = null;

    	try {

    		String filename = "constants.properties";
    		input = ReadProperties.class.getClassLoader().getResourceAsStream(filename);
    		if(input==null){
    	            System.out.println("Sorry, unable to find " + filename);
    		    return;
    		}

    		//load a properties file from class path, inside static method
    		prop.load(input);

                //get the property value and print it out
                System.out.println(prop.getProperty("one"));
    	        System.out.println(prop.getProperty("two"));
    	        System.out.println(prop.getProperty("resultsFilepath"));
    	        
    	        String s = prop.getProperty("date");
    	        System.out.println(s);

    	} catch (IOException ex) {
    		ex.printStackTrace();
        } finally{
        	if(input!=null){
        		try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        	}
        }
    }
}
