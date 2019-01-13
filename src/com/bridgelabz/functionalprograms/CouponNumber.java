package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class CouponNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of coupons");
		int num=sc.nextInt();
		FunctionalUtility functionalutility = new FunctionalUtility();		
		System.out.println("Total random number required are="+ functionalutility.couponNumber(num));
	}
	
  }
