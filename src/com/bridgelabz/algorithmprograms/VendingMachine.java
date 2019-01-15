package com.bridgelabz.algorithmprograms;
import java.util.Scanner;
import com.bridgelabz.util.AlgorithmUtility;
public class VendingMachine 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[] note={2000,500,100,50,20,10,5,2,1};
		System.out.println("Enter the amount :");		
		int amt=sc.nextInt();
		AlgorithmUtility.vendingMachine(note,amt);
		sc.close();		
	}
}
