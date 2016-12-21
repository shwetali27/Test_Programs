package com.bridgelabz.JsonReadWrite;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
@SuppressWarnings("unchecked")
public class JSONReadWrite {
	JSONParser parser = new JSONParser();
	int id;
	@SuppressWarnings("rawtypes")
	Utility u = new Utility();
	File file = new File("PatientsList.json");
	
	
	///JsonReadWrite/src/main/java/PatientsList.json
	JSONObject patients = new JSONObject();
	JSONArray patientsArray = new JSONArray();
	

	public void writeIntoFile(String name,String number,int age){
		JSONObject patient = new JSONObject();
		patientsArray.add(patient);
		patient.put("Name",name);
		patient.put("ID",new Integer(id));
		patient.put("MobileNo",number);
		patient.put("Age",new Integer(age));
		id++;
		patients.put("Patients",patientsArray);
		
		try {
			FileWriter writeFile = new FileWriter(file);
			writeFile.write(patients.toJSONString());
			writeFile.flush();
			writeFile.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	//reading file using parsing method
	public void readFile(){
		try{
			Object object = parser.parse(new FileReader(file));
			JSONObject Patients = (JSONObject) object;//json object created
			
			JSONArray patientsArray = (JSONArray) Patients.get("Patients");
			for (int y = 0; y < patientsArray.size(); y++) {
				JSONObject patient = (JSONObject) patientsArray.get(y);
				Object obj = patient.get("Name");
				String name = (String)obj;
				obj = patient.get("ID");
				int idInfo = Integer.parseInt(String.valueOf(obj));
				this.id = idInfo;
				obj = patient.get("MobileNo");
				String number = (String)obj;
				
				obj = patient.get("Age");
				int age = Integer.parseInt(String.valueOf(obj));
				this.writeIntoFile(name,number,age);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	public void readInfoFile(){
		try{
			Object object = parser.parse(new FileReader(file));
			JSONObject Patients = (JSONObject) object;//json object created
			
			JSONArray patientsArray = (JSONArray) Patients.get("Patients");
			for (int y = 0; y < patientsArray.size(); y++) {
				JSONObject patient = (JSONObject)patientsArray.get(y) ;
				System.out.println("Name is: "+patient.get("Name"));
				System.out.println("ID is: "+patient.get("ID"));
				System.out.println("Number is: "+patient.get("MobileNo"));
				System.out.println("Age is: "+patient.get("Age"));
				System.out.println();
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}