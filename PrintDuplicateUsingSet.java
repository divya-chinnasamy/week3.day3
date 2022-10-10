package week3.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateUsingSet {

	public static void main(String[] args) {
		//Declaring Input
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
			
		//declare set
		Set<Integer> num = new HashSet<Integer>();
		Set<Integer> num1= new LinkedHashSet<Integer>();
		
//		adding elements into Set
		for (int i = 0; i < arr.length; i++) {
			if(!num.add(arr[i]))
				num1.add(arr[i]);			
		}
		
		//Printing set num
		System.out.println(num1);
		
	}

}