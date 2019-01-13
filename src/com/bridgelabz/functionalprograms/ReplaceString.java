package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class ReplaceString
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username");
		String str= "Hello <<username>>, How are you?";
		FunctionalUtility functionalutility = new FunctionalUtility();
		functionalutility.replaceString(str);
	}

}
