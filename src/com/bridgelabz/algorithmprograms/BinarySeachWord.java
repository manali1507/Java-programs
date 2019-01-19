package com.bridgelabz.algorithmprograms;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import com.bridgelabz.util.AlgorithmUtility;
public class BinarySeachWord 
{
 public static void main(String[] args) throws FileNotFoundException 
 {
String csvFile = "/home/admin1/Documents/Softwares/eclipse-installer/Binary.csv";
BufferedReader fileReader = new BufferedReader(new FileReader(csvFile));
final String delimiter = " ";
	try {
	String line = "";
	while ((line = fileReader.readLine()) != null)
	{
	String[] tokens = line.split(delimiter);
	AlgorithmUtility.sort(tokens);
	for (String token : tokens)
	{
	System.out.println(token);
	}
	System.out.println("Enter the keyword to be searched :");
	String key = AlgorithmUtility.stringValue();
	int i = AlgorithmUtility.binarySearch(tokens, key);
	if (i >= 0) 
	{
	System.out.println(tokens[i] + " is present in " + (i + 1) + " position in the array");
	} 
	else
	System.out.println(key + " doesnot exists in the given file");
		}
	} catch (Exception e) 
	{
	e.printStackTrace();
	} finally 
	  {
		 try {
		fileReader.close();
		    }
	  catch (Exception e) 
		 	{
			e.printStackTrace();
		    }
		}
	}
}
