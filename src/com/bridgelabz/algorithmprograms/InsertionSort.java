package com.bridgelabz.algorithmprograms;
import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;
public class InsertionSort {

	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);		
		System.out.println("Enter the number of strings to be inserted");
		int num = sc.nextInt();
		String[] str = new String[num];
		for(int i=0; i<num; i++) 
		{
			str[i]=sc.next();
		}
		String[] res_str=AlgorithmUtility.insertionSort(str,num);
		for(int i=0;i<num;i++) {
			System.out.println(res_str[i]);
		}
		sc.close();
	}
	}


