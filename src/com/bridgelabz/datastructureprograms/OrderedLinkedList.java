package com.bridgelabz.datastructureprograms;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.LinkedList;
public class OrderedLinkedList
{
	public static void main(String[] args) throws FileNotFoundException
	{
		FileReader file = new FileReader("/home/admin1/Documents/Softwares/eclipse-installer/numbers.txt");
		BufferedReader read = new BufferedReader(file);
		final String delimiter = " ";
		LinkedList list = new LinkedList();  
		 try  
		 {			 
		String word;
		while ((word = read.readLine()) != null)
		{
			String[] tokens = word.split(delimiter);
			for(String token:tokens)
			{
				LinkedList.insert(list,token);
			}
			  LinkedList.printList(list);
			int[] arr1 = LinkedList.toIntConv(list);		 		
			int[] arr2 = LinkedList.stringSort(arr1);
			 System.out.println("Sorted array is :");
			 
			for(int i = 0; i<arr2.length; i++)
				if(arr2[i]!= 0)	    
			System.out.println(arr2[i]);
			
		    System.out.println("Enter the value :");
			String str = DataStructureUtility.stringValue();
			int flag = 0;
			for(int i = 0; i<list.size(list); i++)
			{
		    	if(str.equals(tokens[i]))
			     {				
		    		LinkedList.delete(list,str);
			       System.out.println("Value is found and deleted from the list");
	               flag = 1;
			       LinkedList.printList(list);
			       break;
			     }
			}
		     	if(flag == 0)
				{
				LinkedList.insert(list,str);
				System.out.println("Value is not found and added to the list");
				LinkedList.printList(list);
			}
				break;			
		   }
		 }catch (IOException e)
		 {
			 e.printStackTrace();
        }
	}
}
