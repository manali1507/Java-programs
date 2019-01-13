package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class HarmonicNumber 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Range:");
		int num = sc.nextInt();
		FunctionalUtility functionalutility = new FunctionalUtility();
		double har=functionalutility.harmonicNumber(num);
		System.out.println(" The Harmonic value is"+har);
	}

}

