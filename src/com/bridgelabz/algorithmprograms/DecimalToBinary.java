package com.bridgelabz.algorithmprograms;
import java.util.Scanner;
import com.bridgelabz.util.AlgorithmUtility;

public class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the decimal number to be converted :");
		int num = sc.nextInt();
		String str = AlgorithmUtility.toBinary(num);
		System.out.println("The binary form of the number is: "+str);
		sc.close();
	}

}
