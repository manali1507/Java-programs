package com.bridgelabz.algorithmprograms;
import java.util.Scanner;
import com.bridgelabz.util.AlgorithmUtility;

public class SearchSortStopwatch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be sorted or searched :");
		int num = sc.nextInt();
		String array[] = new String[num];
		System.out.println("Enter the data");
		for(int i= 0; i<num ; i++)
			array[i] = sc.next();
		
		System.out.println("Choose an algorithm: ");
		System.out.println("1:Integer Bubble Sort  2:String Bubble Sort " 
					+ "3:Integer Insertion Sort 4:String Insertion Sort "
					+ "5:Integer Binary Search	6:String Binary Search");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:	long start_time=System.currentTimeMillis();
				AlgorithmUtility.bubbleSortGeneric(array);	
				long stop_time=System.currentTimeMillis();
				double elapsed_time = stop_time-start_time;
				System.out.println("Elapsed time: "+elapsed_time);
				break;
				
		case 2: long start_time1=System.currentTimeMillis();
				AlgorithmUtility.bubbleSortGeneric(array);				
				long stop_time1=System.currentTimeMillis();
				double elapsed_time1= stop_time1-start_time1;
				System.out.println("Elapsed time: "+elapsed_time1);
				break;
				
		case 3: long start_time2=System.currentTimeMillis();
				AlgorithmUtility.insertionSortGeneric(array,num);				
				long stop_time2=System.currentTimeMillis();
				double elapsed_time2= stop_time2-start_time2;
				System.out.println("Elapsed time: "+elapsed_time2);
				break;
				
		case 4: long start_time3=System.currentTimeMillis();
				AlgorithmUtility.insertionSortGeneric(array,num);				
				long stop_time3=System.currentTimeMillis();
				double elapsed_time3= stop_time3-start_time3;
				System.out.println("Elapsed time: "+elapsed_time3);
							
	 //   case 5: long start_time4=System.currentTimeMillis();
		//			AlgorithmUtility.binarySearch(array,num);				
		//			long stop_time4=System.currentTimeMillis();
		//			double elapsed_time4= stop_time4-start_time4;
		//			System.out.println("Elapsed time: "+elapsed_time4);						
					
	 //   case 6: long start_time5=System.currentTimeMillis();
		//				AlgorithmUtility.binarySearchString(array,num);				
			//			long stop_time5=System.currentTimeMillis();
			//			double elapsed_time5 = stop_time5 -start_time5;
			//			System.out.println("Elapsed time: "+elapsed_time5);		
	
				break;
				
		default: System.out.println("Invalid choice");
				 break;
		}
		sc.close();		
	}
	}
