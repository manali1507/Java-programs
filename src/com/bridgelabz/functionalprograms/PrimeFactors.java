package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class PrimeFactors {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		FunctionalUtility functionalutility= new FunctionalUtility();
		functionalutility.primeFactors(num);

	}

}
