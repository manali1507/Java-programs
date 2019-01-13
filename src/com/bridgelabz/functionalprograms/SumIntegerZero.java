package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class SumIntegerZero {

	public static void main(String[] args)
	{
		FunctionalUtility functionalutility =new  FunctionalUtility();
	     Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array :");
		int size=sc.nextInt();
		int arr[]=new int [size];

		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter " + (i+1) + " Value :");
			arr[i]=sc.nextInt();
		}

		int sum=functionalutility.triplet(arr,size);
		System.out.println("Number of Tripltes :"+sum);

	}
	}

