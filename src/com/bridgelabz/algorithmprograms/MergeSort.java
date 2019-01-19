package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;

public class MergeSort {

	public static void main(String[] args) 
	{	
        System.out.println("Enter the size of your array for Merge Sort :");
        int n=AlgorithmUtility.intValue(); //returns value of integer as an int
        String arr[]=new String[n];
        System.out.println("Enter the elements :");
        for(int i=0; i<n; i++)
        {   
            arr[i]=AlgorithmUtility.stringValue();
        }
        AlgorithmUtility u=new AlgorithmUtility();
        u.mergeSort(arr,0,n);
        System.out.println("Elements after sorting :");
        for(int i=0; i<n; i++)
        {
            System.out.println(arr[i]+"");
	}

	}
}
