package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class FlipCoin 
{
	public static void main(String[] args) 
	{
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of tosses:");
	int num = sc.nextInt();
	FunctionalUtility functionalutility = new FunctionalUtility();
    functionalutility.flipCoin(num);		
	}
	}


