package com.bridgelabz.util;

public class LinkedList
{
	 Node head; 
	    static class Node 
	    {
	       String data;
	       Node next;
	     Node(String token)  // Constructor
	        {
	            data = token;
	            next = null;
	        }
	    }
	    public static LinkedList insert(LinkedList list, String String)
	    { 
	      Node new_node = new Node(String); //Create a new node with given data
	      new_node.next = null;
	      if (list.head == null)
	      {
	            list.head = new_node;
	      }
	        else
	        {
	            Node last = list.head;
	            while (last.next != null)
	            {
	                last = last.next;
	            }
	            last.next = new_node;
	        }
	        return list;
	    }  
	    
	    public int size(LinkedList list) 
	    {
	    	int i=0;
	    	Node last = list.head;
	        while (last.next != null) 
	        {
	            last = last.next;
	            i++;
	        }
	        return i;
	    }
	    
	    public static void printList(LinkedList list)
	    {
	        Node currNode = list.head;
	        System.out.print("LinkedList : ");
	        while (currNode != null) 
	        {
	            if(currNode.data!=null)
	            System.out.println(currNode.data + " ");
	            currNode = currNode.next;
	        }
	    }
	    
	    public static int delete(LinkedList list,String key)
	    {
	        int flag=0;
	        Node currNode = list.head;       
	        while(currNode != null)
	        {
	            if(currNode.data!=null)
	            {
	                if((currNode.data).compareToIgnoreCase(key)==0)
	                {
	                    currNode.data=null;   
	                    flag=1;
	                    break;
	                }
	            }
	            currNode = currNode.next;
	        }
	        return flag;           
	    }  
	    
	    public static int[] toIntConv(LinkedList list)
	    {
	        int z=0;
	        Node currNode = list.head;
	        int i=0;
	        int[] str =new int[100];
	        while (currNode != null) 
	        {
	            if(currNode.data!=null)   
	            {
	                z=Integer.parseInt(currNode.data);
	                str[i]=z;
	                i++;
	                currNode = currNode.next;
	            }
	            }	
			return str;
	    }
	    
	    public static String[] toStrinConv(LinkedList list)
	    {
	        Node currNode = list.head;
	        int i=0;
	        String[] str =new String[1000];
	        while (currNode != null) 
	        {
	            if(currNode.data!=null)
	                str[i]=currNode.data ;
	            i++;
	            currNode = currNode.next;
	        }
	        return str;
	    }
	    
	public static int[] stringSort(int[] myArray)
	{
	    for(int i = 0; i<myArray.length; i++)
	    {
	        for (int j = i+1; j<myArray.length-1; j++) 
	        {
	            if(myArray[i]!=0 && myArray[j]!=0 )
	            {
	                if(myArray[i]>myArray[j])
	                {
	                    int temp = myArray[i];
	                    myArray[i] = myArray[j];
	                    myArray[j] = temp;
	                }
	            }
	        }
	    }
		return myArray;
	}
	}
