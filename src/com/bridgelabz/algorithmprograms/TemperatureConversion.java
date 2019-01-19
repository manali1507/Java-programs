package com.bridgelabz.algorithmprograms;
import java.util.Scanner;
import com.bridgelabz.util.AlgorithmUtility;
public class TemperatureConversion 
{
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the choice to convert to the following:");
		System.out.println("1-Fahrenheit 2-Celcius");
		int choice=sc.nextInt();
	   System.out.println("Enter the temperature :");	   
	   int temp=sc.nextInt();
	   AlgorithmUtility.temperature(choice, temp);
	}

}
