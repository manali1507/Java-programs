package com.bridgelabz.datastructureprograms;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.LinkedList;
public class UnorderedLinkedList 
{
  public static void main(String[] args) throws IOException 
  {
	FileReader file = new FileReader("/home/admin1/Documents/Softwares/eclipse-installer/listdata.txt");
	BufferedReader read = new BufferedReader(file);
	final String delimiter =" ";
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
		int n = 0;
		do {	
		  System.out.println("Enter the word to be searched :");
		  String str = DataStructureUtility.stringValue();
		  int flag1 = LinkedList.delete(list,str);
		  System.out.println("Word is found and deleted from list");
		  if(flag1 == 0)
		  {
		   System.out.println("Word not found and added to list");
		   LinkedList.insert(list,str);
	   	}	
	}
		while(n <= 3);
			}
		}
		catch (IOException io)
		{
			io.printStackTrace();
		}
		String  fileName="/home/admin1/Documents/Softwares/eclipse-installer/listdata.txt";
		String str[]=LinkedList.toStrinConv(list);
		DataStructureUtility.writeFile(fileName, str);
	}
}
