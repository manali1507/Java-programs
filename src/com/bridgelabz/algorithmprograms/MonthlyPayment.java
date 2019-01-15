package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class MonthlyPayment {

	public static void main(String[] args) 
	{  

		AlgorithmUtility u = new AlgorithmUtility();
		double Pay;	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle amount :");
		double p =AlgorithmUtility.doubValue();
		System.out.println("Enter the no of years :");
		double y=AlgorithmUtility.doubValue();
		System.out.println("Enter the interest :");
		double r=AlgorithmUtility.doubValue();
		Pay=u.monthlyPay(y, p, r);
		
	}

}
