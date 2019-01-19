package com.bridgelabz.util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class AlgorithmUtility 
{  
	// creating our own scanner class
	static Scanner sc = new Scanner(System.in); 
	
	public static int intValue()
	{
		try {
			return sc.nextInt();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return 0;
	}
	
	public static String stringValue()
	{
		try {
			return sc.next();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}

	public static double doubValue() 
	{
		try {
			return sc.nextDouble();

		} catch (Exception e) {
			e.printStackTrace();

		}
		return 0.0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	// Anagram of 2 strings
	
	public static boolean anagram(String str1,String str2)
	{
		char[] ch1=str1.toLowerCase().toCharArray();
		char[] ch2=str2.toLowerCase().toCharArray();
		if(ch1.length!=ch2.length) {
			return false;
		}
		else
		{
			for (int i = 0; i < (ch1.length - 1); i++) 
			{
				for (int j = i + 1; j > 0; j--) 
				{
					if (ch1[j] < ch1[j - 1]) 
					{
						char temp = ch1[j - 1];
						ch1[j - 1] = ch1[j];
						ch1[j] = temp;
					}
				}
			}
			for (int i = 0; i < (ch2.length - 1); i++)
			{
				for (int j = i + 1; j > 0; j--) 
				{
					if (ch2[j] < ch2[j - 1]) 
					{
						char temp = ch2[j - 1];
						ch2[j - 1] = ch2[j];
						ch2[j] = temp;
					}
			   	}
			 }
			return Arrays.equals(ch1, ch2);
		 }              
     }



// prime numbers in a range

   


    public static int primeNumbers()
       {
       for (int i = 2; i <= 1000; i++)         
       { 		  	  
         for( int j =2; j <= i; j ++)
       {
        	 if(j==i)	 
        	 {
        		 System.out.println(i);
        	 }     
          if(i%j==0)
          {
       	   break;
          }
         }
       }
	return 0;
       }
    
    









// prime numbers that are anagram and palindrome



public static boolean Palindrome(int num) 
{
    int temp = num;
    int sum = 0;
    while (temp != 0)
    {
        int r = temp % 10;
        sum = sum * 10 + r;
        temp = temp / 10;
    }
    if (sum == num) 
    {
        return true;
    }
    return false;
}
public static boolean anagram(int n1, int n2) 
{  

    int[] num1 = count(n1);
    int[] num2 = count(n2);
    for (int i = 0; i < num2.length; i++)
    {
        if (num1[i] != num2[i]) 
        {
            return false;
        }
    }
    return true;
}

public static void primePalindrome() 
{
    for (int j = 2; j <= 1000; j++) 
    {
      boolean  b = true;
        for (int i = 2; i < j / 2; i++)
        {
            if (j % i == 0) 
            {
                b = false;
                break;
            }
        }
        if (b && Palindrome(j))
            System.out.print(j + " ");
    }
}

public static void primeAnagrams() 
{  
    ArrayList<Integer> ar = new ArrayList<Integer>();
    for (int i = 2; i <= 1000; i++) 
    {
        boolean b = true;
        for (int j = 2; j < i / 2; j++)
        {
            if (i % j == 0) 
            {
                b = false;
                break;
            }
        }
           if (b)
          ar.add(i);
    }
      
    for (int i = 0; i < ar.size(); i++) 
    {
        for (int j = i + 1; j < ar.size(); j++) 
        {
            if (anagram(ar.get(i), ar.get(j)))
            {
                System.out.println(ar.get(i)+" "+ar.get(j));
            }
        }
    }
}

public static int[] count(int n) 
{
    int[] count = new int[10];
    int temp = n;
    while (temp != 0) 
    {
        int r = temp % 10;
        count[r]++;
        temp = temp / 10;
    }
    return count;
}











// Search and sort and calculate the elapsed time


public static void bubbleSortGeneric(String[] array) 
{
	String temp;
	for(int i=0; i<array.length; i++) 
	{
		for(int j=0; j<array.length-1; j++)
		{
			if(array[j].compareTo(array[j+1]) > 0) 
			{
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
	}
	System.out.println("The sorted arrays are: ");
	for(int i=0; i<array.length; i++)
	{
		System.out.println(array[i]);
	}
}
public static void insertionSortGeneric(String[] array,int num) 
{
	String temp;
	for(int i=0;i<num;i++)
	{
		for(int j=i+1;j<num;j++)
		{
			if(array[i].compareTo(array[j])>0)
			{
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
	}
	System.out.println("The sorted array are:");
	for(int i=0;i<array.length;i++) 
	{
		System.out.println(array[i]);
	}
}

//binary search of integer
public int binarySearch(int[]arr, int key) 
{
    int start = 0;
    int end = arr.length - 1;
    while (start <= end)
    {
        int mid = (start + end) / 2;
        if (key == arr[mid])
        {
            return mid;
        }
        if (key < arr[mid]) 
        {
           	end = mid - 1;
        } else 
        {
           	start = mid + 1;
        }
    }
    return -1;
	 }

//Binary Search for String
public int binarySearchString(String[] name, String key)
{
	int first = 0;
	int last  = name.length;

	while (first < last) 
	{
    	int mid = (first + last) / 2;
    	if (key.compareTo(name[mid]) < 0)
    	{
       			last = mid;
    	} else if (key.compareTo(name[mid]) > 0) 
    	{
        		first = mid + 1;
    	} else 
    	{
        		return mid;
    	}
	}		
	return -1;
}













// Find your Number

public  static void findNumber(String input,int up, int mid,int count,int low,int n)
	{
   	System.out.println("Is your number:"+mid);
	System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
	input=AlgorithmUtility.stringValue();
   	do
    {
        if (input.equals("high"))
        {
			low= mid;
			count++;
        }
		else if (input.equals("yes"))
        {
			System.out.println("The number you thought was: "+mid);
			int no=count+1;
			System.out.println("It takes "+no+" times to find your exact number");
			break;
        }
		else if(input.equals("low"))
        {
			up=mid;
			count++;
		}
        if(count<n)
        {
			mid=(low+ up+1)/2;
			System.out.println("Is your number "+mid+":");
			input=AlgorithmUtility.stringValue();
		}
	}
	while(low<=up);
		if (count>n)
		{
			System.out.println("Number not found");
		}
		else
		{
			System.exit(0);
		}
	}













// Binary Search of word in a word list

public static String[] sort(String[] str) 
{
	for (int i = 0; i < str.length; i++) 
	{
		for (int j = i + 1; j < str.length; j++)
		{
			if (str[i].compareTo(str[j]) > 0) 
			{
				String temp;
				temp = str[i];
				str[i] = str[j];
				str[j] = temp;
			}
		}
	}
	return str;
}
public static int binarySearch(String[] str, String key) 
{
	int first = 0;
	int last = str.length - 1;
	int middle = (first + last) / 2;
	while (first <= last) 
	{
		if (str[middle].compareTo(key) < 0)
			first = middle + 1;
		else if (str[middle].compareTo(key) == 0)
		{
			return middle;
		}
		else
			last = middle - 1;
	     	middle = (first + last) / 2;
	}
	return -1;
}













// Insertion Sort


public static String[] insertionSort(String array[], int num)
{
    String temp="";
    for(int i=0;i<num;i++)
    {
    for(int j=i+1;j<num;j++)
    {
    if(array[i].compareToIgnoreCase(array[j])>0)
    {
    temp = array[i];
    array[i]=array[j];
    array[j]=temp;
    }
    }
    }
    return array;
    }















// Bubble Sort



public static void bubbleSort(int[] array,int n) 
{
	int temp;
	for(int i=0; i<n; i++)
	{
		for(int j=0; j<n-1 ;j++) 
		{
			if(array[j] > array[j+1])
			{
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
			}
		}
	}
	System.out.println("The sorted array of integers is:");
	      for(int i=0;i<n;i++)
	         {
		System.out.println(array[i]);
	         }
}













// Merge Sort


public void mergeSort(String array[], int low, int high) 
{
	int n = high - low;
	if (n <= 1)
		return;
	int mid = low + n / 2;
	mergeSort(array, low, mid);
	mergeSort(array, mid, high);
	String[] str = new String[n];
	int i = low, j = mid;
	for (int k = 0; k < n; k++) 
	{
		if (i == mid)
			str[k] = array[j++];
		else if (j == high)
			str[k] = array[i++];
		else if (array[j].compareToIgnoreCase(array[i]) < 0)
			str[k] = array[j++];
		else
			str[k] = array[i++];
	}
	for (int k = 0; k < n; k++)
	 {
		array[low + k] = str[k];
	}
}
















// vending machine


public static void vendingMachine(int[] note, int amt) 
{
	int cash= amt;
	int temp= 0;
	for(int i=0;i< note.length;i++)
	{
		int count=0;
		
		if(note[i]<= cash)
		{
		count=cash / note[i];
		cash=cash % note[i];
        temp+=count;
		}
		
		if(count> 0)
		{  
			System.out.println(note[i]+"x"+count);		
		}
	}
	System.out.println("The minimum notes required is:"+temp);
}







// day of week


public static int dayOfWeek(int month, int day, int year)
{
	int y0 = year-(14-month)/12;
	int x0 = y0 + (y0 /4)-(y0 /100)+(y0/400);
	int m0 = month +12* ((14-month)/12)-2;
	int d0 = (day+ x0 +(31* m0)/12)%7;
	return d0;
}








// temperature conversion

	public static void temperature(int choice,double temp) 
    {
		double f_temp,c_temp;
		switch(choice)
		{
			case 1: f_temp=(temp*(9/5))+32;
			 		System.out.println("The temperature in fahrenheit is: "+f_temp);
			 		break;
			 		
			case 2: c_temp=(temp-32)*(5/9);
	 			System.out.println("The temperature in celsius is: "+c_temp);
	 			break;
	 				
	 		default: System.out.println("Invalid choice");
	 			 break;
}
}


	
	
	
	


// Square root


public static void squareRoot(double num) 
{
	double t = num;
	double epsilon=1e-15;
	if(num>0) 
	{
		while(Math.abs(t-(num/t))> epsilon*t) 
		{
		t = (num / t + t)/ 2;
		}
	}
	System.out.println("The square root is: "+ t);
}







// monthly payment


public double monthlyPay(double y,double p, double r) 
{
	double n=12*p;
	double rate= r/(12*100);
	double pay= (y* rate)/(1-Math.pow((1+rate), (-n)));
	System.out.println("The calculated monthly payment is:" + pay);
	return pay;
}







// Decimal to binary



public static String toBinary(int num)
{
	String bin=" ";
	int rem;
	do{
		rem = num%2;
		bin = rem+bin;
		num = num/2;
	  }
	while(num!=0);
	return bin;
}













// swap binary nibbles

public void swapNibbles() 
{
	System.out.println("Enter the number :");
	int num = AlgorithmUtility.intValue();
	toBinary(num);
	num = swap(num);
	System.out.println("After Swapping the nibbles:" + Integer.toBinaryString(num));
	int flag = 0;
	for (int i = 0; i < num; i++) 
	{
		if (Math.pow(2, i) == num)
		{
			flag = 1;
		}
	}
	if (flag == 1)
	{
		System.out.println(num + " is power of 2");
	} else {
		System.out.println(num + " is not power of 2");
	}
}
public static int swap(int n) 
{
	return ((n & 0x0F) << 4 | (n & 0xF0) >> 4);
}
}



