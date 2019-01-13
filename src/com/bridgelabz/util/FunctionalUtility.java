package com.bridgelabz.util;

import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class FunctionalUtility 


//Replace String to display the name
{
	public void replaceString(String str) 
	{
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		if (s1.length() >= 3)
		{
			String s2 = str.replace("<<username>>", s1);
			System.out.println(s2);
		}
		else 
		{
			System.out.println("Invalid name");
		}
	}







// flip coin to find % of heads and tails

public void flipCoin(int num)
{
	double head = 0, tail = 0;
	double count = num;
	Random random = new Random();
	while (num != 0) 
	{
		double rnd = random.nextDouble();
		if (rnd > 0.50) 
		{
			++head;
		} else 
		{
			++tail;
		}
		num--;
	}
	double h = head * 100 / count;
	double t = tail * 100 / count;
	System.out.println("Percentage of Head=" +h);
	System.out.println("Percentage of Tail=" +t);

}













// Leap Year or not

public boolean leapYear(int year)
{
	boolean flag = false;
	if (year % 400 == 0 && year % 4 == 0 || year % 100 != 0)
	{
	flag = true;	
	} 
	else 	
	{
	flag = false;
	}
	return flag;
}











//power of 2

public void power(double num) 
{
	double temp = 0.0;
	int count = 0;
	System.out.println("The series is: ");

	if (num >= 0 && num < 31) 
	{
	   for (int i = 0; i <= num; i++)
		{
			temp = Math.pow(2, count);
			
			System.out.println(temp);
			count++;			
			}
		System.out.println("The power is : "+temp);
	}
	}













// to find the Harmonic Value

public double harmonicNumber(int num)
{
	double sum = 0.0;
	if (num == 1)
		return 1;
	else {
		for (double i = 1; i <= num; i++) 
		{
			sum = sum + (1 / i);
		}
		return sum;
	}
}












// to find prime factors of a number

public void primeFactors(int num)

{
	for (int i = 2; i < num; i++)
	{
		while (num % i == 0)
		{
		 System.out.println(" The factor is : " +i );
		 num = num / i;
		}
	}
	
}












// Gambler

public void gambler(int stake, int goal, int time) 
{
	int bet=0, win=0, loss=0;
	for(int i=0; i<time; i++)
	{
		int money= stake;
		while(money > 0 && money <goal)
		{
			bet++;
			if(Math.random() < 0.5)
			{
				money--;
			}
			else 
			{
				money++;
			}
		}
		if(money== goal)
			win++;
		else
			loss++;
	}
	System.out.println("Number of wins=" + win);
	System.out.println("Number of losses=" + loss);
	System.out.println("Percentage of wins=" + win * 100 / bet);
	System.out.println("Percentage of losses=" + loss * 100 / bet);
	System.out.println("Bet is : "+ bet);
}










//Coupon number

public int couponNumber(int num) 
{
	boolean[] collect = new boolean[num];
	int count = 0;
	int distinct = 0;
	while (distinct < num) 
	{
		Random random = new Random();
		int value = random.nextInt(num);
		count++;
		if (collect[value] == false) {
		distinct++;
		System.out.println(distinct);
		} else 
		{
		collect[value] = true;
		}
	}
return count;
}









// 2D Array


//method to print the 2D array for int

public static Integer[][] arrayInt(int m, int n) 
{
	Integer a[][] = new Integer[m][n];
	Scanner sc = new Scanner(System.in);
	System.out.println();
	System.out.println("Integer Array is :");
    for (int i = 0; i < m; i++) 
    {
		for (int j = 0; j < n; j++) {
		a[i][j] = sc.nextInt();
		}
	}
	return a;
}

//method to print the 2D array for double 

public static Double[][] arrayDouble(int m, int n) {
	Double b[][] = new Double[m][n];
	Scanner sc = new Scanner(System.in);
	System.out.println();
	System.out.println("Double Array is :");
	for (int i = 0; i < m; i++) {
	for (int j = 0; j < n; j++) {
		b[i][j] = sc.nextDouble();
		}
	}
	return b;
}

//method to print the 2D array for boolean 

public static String[][] arrayBoolean(int m, int n)
{
	String c[][] = new String[m][n];
	Scanner sc = new Scanner(System.in);
	System.out.println();
	System.out.println("Boolean Array is :");
	for (int i = 0; i < m; i++) {
		for (int j = 0; j < n; j++) {
			c[i][j] = sc.next();
		}
	}
	return c;
}
public static <E> void display(E[][] genericArray, int row, int column) {
	PrintWriter pw = new PrintWriter(System.out, true);

	for (int i = 0; i < row; i++) {
		for (int j = 0; j < column; j++) {
			pw.print("\t" + genericArray[i][j] + " ");
		}
		pw.println("\t");
	}
}















//Sum of 3 Integers add to zero

public int triplet(int ar[], int length) 
{
	System.out.println();
	int count = 0;
	for (int i = 0; i < length-2; i++) 
	{
		for (int j = i + 1; j < length-1; j++) 
		{
			for (int k = j + 1; k < length; k++) 
			{
				if (ar[i] + ar[j] + ar[k] == 0) 
				{
					System.out.println(ar[i] + " " + ar[j] + " " + ar[k]);
					count++;
				}
			}
		}
	}
				
		return count;	
		}
			
		




		
	

	// Distance between 2 points
		
	public void distanceOfPoints()
	{
		int x1, x2, y1, y2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter point x1 :");
	
		x1 = sc.nextInt();
		System.out.println("Enter point y1 :");

		y1 = sc.nextInt();
		System.out.println("Enter point x2 :");

		x2 = sc.nextInt();
		System.out.println("Enter point y2 :");

		y2 = sc.nextInt();
		double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

	System.out.println("Distance between " + "[" + x1 + "," + y1 + "]&" + "[" + x2 + "," + y2 + "]=" + distance);
		}
	



	
	
	
	
	


//Permutation of 2 Strings

public static void swap(char[]ch, int i, int j) 
{
	char temp = ch[i];
	ch[i] = ch[j];
	ch[j] = temp;
}

public void permutation(char[]ch, int currentIndex) 
{
	if (currentIndex == ch.length - 1)
	{
		System.out.println(String.valueOf(ch));
	}

	for (int i = currentIndex; i < ch.length; i++) 
	{
		swap(ch, currentIndex, i);
		permutation(ch, currentIndex + 1);
		swap(ch, currentIndex, i);
	}
}









// Stop watch

//to find the start time
	    public static long startTime() 
	    {
		long startTimer = System.currentTimeMillis();
		System.out.println("Start Time is: " + startTimer);
		return startTimer;
	   }
	    
//to find the stop time
	    public static long stopTime()
	    {
		long stopTimer = System.currentTimeMillis();
        return stopTimer;
	    }

//to find the elapsed time
	public static long elapsedTime(long stopTimer, long startTimer) {
		long elapsed = stopTimer - startTimer;
		return elapsed;
	}




	
	
	
	
	
// Tic Tac Toe
	 static int player = 0;
	    static int[][] BOARD = new int[3][3];
	    static boolean isEmpty = true;

	    public static void initBoard() {
	        System.out.println("TIC TAC TOE GAME\nComputer is o\nPlayer  is x ");
	        for (int i = 0; i < BOARD.length; i++) {
	            for (int j = 0; j < BOARD[i].length; j++) {
	                BOARD[i][j] = -10;
	            }
	        }
	        System.out.println("Board is this :");
	        dispBoard();
	    }
	    public static void dispBoard() {
	        int count = 0;
	        for (int i = 0; i < BOARD.length; i++) {
	            System.out.println("---------------");
	            System.out.print("||");
	            for (int j = 0; j < BOARD[i].length; j++) {
	                if (BOARD[i][j] == 0) {
	                    count++;
	                    System.out.print(" o |");
	                } else if (BOARD[i][j] == 1) {
	                    count++;
	                    System.out.print(" x |");
	                } else
	                    System.out.print("   |");
	            }
	            System.out.println("|");
	        }
	        if (count == 9) {
	            isEmpty = false;
	        }
	        System.out.println("---------------");
	    }
	    /*
	     * static void putVal(int i, int j, int player) { if if (player % 2 == 0) {
	     * BOARD[i][j] = 0; } else BOARD[i][j] = 1; }
	     */
	    public static void putVal() 
	    {
	        int i;
	        int j;
	        if (player % 2 == 1)
	        {
	            i = (int) (Math.random() * 10) % 3;
	            j = (int) (Math.random() * 10) % 3;
	        } else
	        {
	            Scanner s = new Scanner(System.in);
	            System.out.println("enter value of x and y by space");
	            i = s.nextInt();
	            j = s.nextInt();
	        }
	        if (BOARD[i][j] == -10)
	        {
	            if (player % 2 == 0)
	            {
	                BOARD[i][j] = 0;
	            } else {
	                BOARD[i][j] = 1;
	                System.out.println("Coumputer Choosing " + i + " " + j);
	            }
	        } 
	        else
	            putVal();
	    }
	   public static boolean win() {
	   return ((BOARD[0][0] + BOARD[0][1] + BOARD[0][2] == player * 3)
	        || (BOARD[1][0] + BOARD[1][1] + BOARD[1][2] == player * 3)
	        || (BOARD[2][0] + BOARD[2][1] + BOARD[2][2] == player * 3)
	        || (BOARD[0][0] + BOARD[1][0] + BOARD[2][0] == player * 3)
	        || (BOARD[0][1] + BOARD[1][1] + BOARD[2][1] == player * 3)
	        || (BOARD[0][2] + BOARD[1][2] + BOARD[2][2] == player * 3)
	        || (BOARD[0][0] + BOARD[1][1] + BOARD[2][2] == player * 3)
	        || (BOARD[2][0] + BOARD[1][1] + BOARD[0][2] == player * 3));
	    }
	    public static void play() 
	    {
	        initBoard();
	        while (isEmpty)
	        {
	            System.out.println("Players turn");
	            putVal();
	            dispBoard();
	            if (win())
	            {
	                System.out.println("Player won");
	                return;
	            }
	        }
	    }


	
	
	
	
	
	




// to find roots of Quadratic equation


public void quadratic() {
	
	Scanner s = new Scanner(System.in);
	System.out.println("Given quadratic equation:ax*x + bx + c");
	System.out.print("Enter value of a:");
	int a = s.nextInt();
	System.out.print("Enter value of b:");
	int b = s.nextInt();
	System.out.print("Enter value of c:");
	int c = s.nextInt();
	System.out.println("The quadratic equation:" + a + "x*x + " + b + "x + " + c);
	double Q = b * b - 4 * a * c;
	if (Q > 0) 
	{
		System.out.println("Roots are real & unequal");

		double root1 = (-b + Math.sqrt(Q)) / (2 * a);

		double root2 = (-b - Math.sqrt(Q)) / (2 * a);

		System.out.println("First root is:" + root1);
		System.out.println("Second root is:" + root2);
	}
     	else if (Q == 0) {
		System.out.println("Roots are real & equal");

		double root1 = (-b + Math.sqrt(Q)) / (2 * a);

		System.out.println("Root:" + root1);
	}   else if (Q < 0) {
		System.out.println("Roots are imaginary");
	}
}









// Wind Chill

public void windChill()
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the temperature in Fahrenheit :");
	double t = sc.nextDouble();
	System.out.print("Enter the wind speed : ");
	double v = sc.nextDouble();
	double wc = 35.74 + 0.6215 * t - 35.75 * Math.pow(v, 0.16) + 0.4275 * t * Math.pow(v, 0.16);
	System.out.println("The wind chill index is : " + wc);
}
}
