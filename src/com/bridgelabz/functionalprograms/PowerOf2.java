package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class PowerOf2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		double num=sc.nextInt();
		FunctionalUtility functionalutility = new FunctionalUtility();
		functionalutility.power(num);
	}

}

