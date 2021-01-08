/**
 * Exercise 3: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
 *@author Arun cibi
 *
 */
package com.capgemini.Labexercisewrk1;

import java.util.*;
public class Sortintegers {
	Scanner scanner = new Scanner(System.in);
	public void main(String[] args) {
	    int n=scanner.nextInt();
	    int arr[] = new int[n];
	    for(int index=0;index<n;index++)
	    arr[index]=scanner.nextInt();
	    int a[]=getSorted(arr);
	    Arrays.sort(a);
	    for(int index=0;index<n;index++)
	    	System.out.print(a[index]+" ");
		}
		public int[] getSorted(int arr[])
		{
			int len=arr.length;
			if(len==0)
				return arr;
			else if(len==1)
				return arr;
			else
			{
			int ar[]=new int[len];
			for(int index=0;index<len;index++)
			{
				int n1=arr[index];
				int r=0;
				int rm;
				while(n1!=0)
				{
				rm=n1%10;
				r=r*10+rm;
				n1=n1/10;
				}
				ar[index]=r;
			}
			for(int index=0;index<len;index++)
				arr[index]=ar[index];
			return arr;
			}
		}
}
