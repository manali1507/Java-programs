package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class LeapYear
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		boolean flag;
		
		int year = sc.nextInt();
		FunctionalUtility functionalutility = new FunctionalUtility();
		flag = functionalutility.leapYear(year);
		
		if(flag)
		{
			System.out.println(" "+year+" is a leap year");	
		}
		
		else
		{
			System.out.println(""+year+" is not a leap year");	
		}
	}

}
