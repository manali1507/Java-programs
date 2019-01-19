package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.AlgorithmUtility;
public class MonthlyPayment
{
	public static void main(String[] args) 
	{  
		AlgorithmUtility u = new AlgorithmUtility();
		System.out.println("Enter the principle amount :");
		double p =AlgorithmUtility.doubValue();
		System.out.println("Enter the no of years :");
		double y=AlgorithmUtility.doubValue();
		System.out.println("Enter the interest :");
		double r=AlgorithmUtility.doubValue();
		u.monthlyPay(y, p, r);
		
	}

}
