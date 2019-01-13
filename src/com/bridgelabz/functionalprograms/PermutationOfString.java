package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class PermutationOfString
{

	public static void main(String[] args)
	{
		FunctionalUtility functionalutility = new FunctionalUtility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str =sc.next();
		functionalutility.permutation(str.toCharArray(),0);
				
	}

}
