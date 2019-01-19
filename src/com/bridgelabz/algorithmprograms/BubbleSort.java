package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class BubbleSort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of intergers to be sorted :");
		int n=sc.nextInt();	
		int[] array=new int[50]; // declaring int array with a size	
		System.out.println("Enter the integers :");
		for(int i=0;i<n;i++) 
		{
			array[i]=sc.nextInt();
		}
		AlgorithmUtility.bubbleSort(array,n);
		sc.close();
	}
	}

