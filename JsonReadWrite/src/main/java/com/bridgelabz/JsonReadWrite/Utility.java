package com.bridgelabz.JsonReadWrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Utility<T>{
	BufferedReader br,rf = null;

	//Utility constructor for creating object for BufferedReader
	public Utility(){
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	//input string
	public String inputString(){
		try{
			return br.readLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "";
	}
	
	//input Integer
	public int inputInteger(){
		try{
			return Integer.parseInt(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
		return 0;
	}

	//input double
	public double inputDouble(){
		try{
			return Double.parseDouble(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}new BufferedReader(new InputStreamReader(System.in));
		return 0.0;
	}


	//input boolean
	public boolean inputBoolean(){
		try{
			return Boolean.parseBoolean(br.readLine());
		}
		catch(Exception e){
			System.out.println(e);
		}
		return false;
	}

	//reading file
	public String readFile(File file){
		
		try{
			rf = new BufferedReader(new FileReader(file));
			return rf.readLine();
		}
		catch(Exception e){
			System.out.println(e);
		}
		return "";
	}

	//Writing into file int Data
	public void writeFile(File file,int data){
		try{
			String str = this.readFile(file);
			str = str.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(str+data+" ");
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	//writing into file String data
	public void writeFile(File file,String data){
		try{
			String string = this.readFile(file);
			string = string.trim();
			BufferedWriter wr = new BufferedWriter(new FileWriter(file));
			wr.write(string+" "+data);
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}

	//Clear the Data inside the file
	public void clearFile(File f){
		try{
			BufferedWriter wr = new BufferedWriter(new FileWriter(f));
			wr.write(" ");
			wr.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

