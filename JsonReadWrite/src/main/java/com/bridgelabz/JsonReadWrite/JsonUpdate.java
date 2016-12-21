package com.bridgelabz.JsonReadWrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUpdate {
	public static void main(String[] args){
		Utility u = new Utility();
		File file = new File("test.JSON");
		JSONParser parser = new JSONParser();
		try {
			
			Object object = parser.parse(new FileReader(file));
			
			JSONObject jsonObject = (JSONObject) object;
			System.out.println(jsonObject.toJSONString());
			System.out.println(jsonObject.get("startDate"));
			jsonObject.put("startDate", "2016-10-23");
			jsonObject.put("endDate", "2016-11-10");
			System.out.println(jsonObject.get("startDate"));
			
			System.out.println(jsonObject.toJSONString());
			String s = jsonObject.toJSONString();
			u.clearFile(file);
			u.writeFile(file, s);
			
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
