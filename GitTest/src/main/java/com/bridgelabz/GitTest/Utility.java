package com.bridgelabz.GitTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Utility<E>
{
BufferedReader bufferedReader,buf;
public Utility()
{
  bufferedReader =new BufferedReader(new InputStreamReader(System.in));
}
//reading input string
	public String inputString()
{
		try {
			   return bufferedReader.readLine();
		     }
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "";
}
//reading Integer Input
	public int inputInteger()
{

			try{
				        try
                {
					             return Integer.parseInt(bufferedReader.readLine());
				          }
				          catch(NumberFormatException e)
                 {
					                System.out.println(e);
				           }
			  }catch(Exception e)
      {
				    System.out.println(e);
			  }
		return 0;
	}
//reading double Input
	public double inputDouble(){

			try{
				try{
					return Double.parseDouble(bufferedReader.readLine());
				}
				catch(NumberFormatException e){
					System.out.println(e);
				}
			}catch(Exception e)
			{
				System.out.println(e);
			}
		return 0.0;
	}
}