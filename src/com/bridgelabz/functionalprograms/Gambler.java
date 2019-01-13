package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Gambler
{

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the stake:");  
	    int stake=sc.nextInt();
	    System.out.println("Enter the Goal:");
	    int goal=sc.nextInt();
	    System.out.println("Enter the no of times:");
	    int time=sc.nextInt();
	    FunctionalUtility utility = new FunctionalUtility();
		utility.gambler(stake,goal,time);
		
	}

	}

