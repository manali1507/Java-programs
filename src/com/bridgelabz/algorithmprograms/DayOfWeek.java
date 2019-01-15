package com.bridgelabz.algorithmprograms;
import java.util.Scanner;
import com.bridgelabz.util.AlgorithmUtility;
public class DayOfWeek 
{
	public static void main(String[] args)
	{
       Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month :");
		int month=sc.nextInt();
		System.out.println("Enter the day :");
		int day=sc.nextInt();
		System.out.println("Enter the year :");
		int year=sc.nextInt();
		int res=AlgorithmUtility.dayOfWeek(month,day,year);
		
	System.out.println("The integer representation for the days starts from Sunday being 0 and ending with Saturday being 6");
	System.out.println("The integer representation of the day is: "+res);	
    sc.close();
	}
	}