package com.bridgeit.CsvRead;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.csvreader.CsvReader;

public class CsvReaderExample {
	public static void main(String[] args) {
		try {
			int i = 0;
			CsvReader products = new CsvReader("/home/bridgeit/Music/allElement.csv", '^');

			if(products.readHeaders())
				i++;
			
			System.out.println(i);

			while (products.readRecord()) {
				String gaid = products.get(2);
				i++;
				if (gaid.equals("2524e372c638275"))
					System.out.println("Search found at row "+i);
				
			}
			System.out.println(i);

			// perform program logic here
			// System.out.println(gaid+":"/*+gadiscription*/);

			products.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("End");
	}
}
