package com.bridgelabz.algorithmprograms; 
import com.bridgelabz.util.AlgorithmUtility;
import java.util.Scanner;
public class Anagram 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st string :");
		String str1=sc.nextLine();
		System.out.println("Enter the 2nd string :");
		String str2=sc.nextLine();
		
		boolean flag =AlgorithmUtility.anagram(str1,str2); // method calling
		if(flag) 
		{
			System.out.println("The strings are anagram");
		}
		else
			System.out.println("The strings are not anagram");
		sc.close();
	}

}
