/**
 * Exercise 1: Create a method which accepts an array of integer elements and return the second smallest element in the array
 * @author Arun cibi
 *
 */
package com.capgemini.Labexercisewrk1;
import java.util.*;
public class Findsecondsmallest {
	Scanner scanner = new Scanner(System.in);
	public void main(String args[]) {
		int n=scanner.nextInt();
		int arr[]=new int[n];
		for(int index=0;index<n;index++)
			arr[index]=scanner.nextInt();
		System.out.print(getSecondsmallest(arr));
	}
		public int getSecondsmallest(int []arr)
		{
			if(arr.length==0)
				return 0;
			else if(arr.length==1)
				return arr[0];
			else
			{
		    Arrays.sort(arr);
		    return arr[1];
			}
	}

}

