package com.bridgelabz.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("hello");
		ClassLoader classLoader = new Main().getClass().getClassLoader();
		String url = classLoader.getResource("data.txt").toString();
		File file =new File(url.split(":")[1]);

		//check if file exists, and reads current content:
		System.out.println("File exists: " + file.exists());
		//System.out.println(IOUtils.toString());

		//Now write some more data to this file:
		FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), true);
		/*BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write("some more text");
		bufferedWriter.close();*/
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);

		String sCurrentLine;

		br = new BufferedReader(new FileReader(file));

		while ((sCurrentLine = br.readLine()) != null) {
			System.out.println(sCurrentLine);
		}

		System.out.println("-----------------");
		PrintWriter writer = new PrintWriter(file);
		writer.print("");
		writer.close();
		
		BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter);
		bufferedWriter2.write("uhfurefhg");
		bufferedWriter2.close();
		
		br = new BufferedReader(new FileReader(file));

		while ((sCurrentLine = br.readLine()) != null) {
			System.out.println(sCurrentLine);
		}
		
		System.out.println("data");

	}
}
