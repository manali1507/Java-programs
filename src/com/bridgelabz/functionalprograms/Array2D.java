package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Array2D 
{
	public static void main(String[] args) 
	{
		FunctionalUtility functionalutility=new FunctionalUtility(); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Integer array");
		System.out.println("Enter 2 for double array");
		System.out.println("Enter 3 for boolean array");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice)
			{
		case 1:
		{
		  System.out.println("Enter the number of rows: ");
	      int m = sc.nextInt();
		  System.out.println("Enter the number of columns : ");
		  int n = sc.nextInt(); 
		  System.out.println("Enter values for rows and columns: ");
		  Integer [][] a = FunctionalUtility.arrayInt(m,n);
		  FunctionalUtility.display(a, m, n);
		}
		break;
		case 2:
		{
			System.out.println("Enter the number of rows: ");
			int m = sc.nextInt();
			System.out.println("Enter the number of columns: ");
			int n = sc.nextInt(); 
			System.out.println("Enter values for rows and columns : ");
			Double [][] b = FunctionalUtility.arrayDouble(m,n);
			FunctionalUtility.display(b, m, n);
		}break;
		case 3:
		{
			System.out.println("Enter the number of rows: ");
			int m = sc.nextInt();
			System.out.println("Enter the number of columns: ");
			int n = sc.nextInt(); 
			System.out.println("Enter values for rows and columns : ");
		    String [][] c = FunctionalUtility.arrayBoolean(m,n);
		    FunctionalUtility.display(c, m, n);
		}break;     
		case 4:
		{
	    	System.out.println("Invalid input");
			System.exit(0);
		}
	 }
  }
}
