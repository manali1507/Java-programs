package com.bridgelabz.algorithmprograms;
import java.util.Scanner;
import com.bridgelabz.util.AlgorithmUtility;
public class SquareRoot 
{
	public static void main(String[] args)
	{	
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		double num = sc.nextDouble();
		AlgorithmUtility.squareRoot(num);	
		sc.close();
	}
	}
