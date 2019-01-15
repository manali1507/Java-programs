package com.bridgelabz.algorithmprograms;
import com.bridgelabz.util.AlgorithmUtility;
public class FindNumber 
{
	
public static void main(String[] args) {
	//try {
      	//{
		//AlgorithmUtility u = new AlgorithmUtility();
      
		String str=args[0];
		int n=Integer.parseInt(str);
		int range=(int)(Math.pow(2,n-1));              
		System.out.println("Take number between 1 to "+range);
	    int	count=0, low=0;
	    String value=null;
        int up=range;
	    int mid=(low+up/2);	
	    AlgorithmUtility.findNumber(value,low,  up,  mid, count, n);
	}
	//}
	//catch (ArrayIndexOutOfBoundsException ae)
	//{
		//ae.printStackTrace();
//}
}
