package week3.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateUsingSet {

	public static void main(String[] args) {
			
		//declaring input
		String text = "we learn java basics as part of java sessions in java week1";

		//Split the words and sorting in array
		String[] strArray = text.split(" ");
		
		List<String> repeatwords= new ArrayList<String>();
	
		LinkedHashSet<String> unique = new LinkedHashSet<String>();
	
		//finding the repeated words
		for(String str:strArray)
		{
			if(!unique.add(str))
			{
				repeatwords.add(str);
			}
		}
		
		//Printing the repeated words
		//System.out.println(repeatwords);
		
		//Printing the unique set without deuplicates
		System.out.println(unique);
	}
}
