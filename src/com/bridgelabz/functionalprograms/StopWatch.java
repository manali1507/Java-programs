package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class StopWatch 
{
	public static void main(String[] args) 
	{
		FunctionalUtility functionalutility =new FunctionalUtility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press '1' to Start Time: ");
	    sc.nextInt();
		long startTimer=FunctionalUtility.startTime();
		System.out.println("Press '2' to Stop Time: ");
		sc.nextInt();
	    long stopTimer=	FunctionalUtility.stopTime();
	    System.out.println("Stop Time is: "+stopTimer);
        long l=FunctionalUtility.elapsedTime(stopTimer,startTimer);
	    System.out.println("Total Time Elapsed is:"+(l/1000)+" sec");	
	}

	}

