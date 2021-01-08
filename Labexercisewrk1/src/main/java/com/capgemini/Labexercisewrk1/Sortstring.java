/**
 * Exercise 2: Create a method that can accept an array of String objects and sort in alphabetical order. 
 *@author Arun cibi
 *
 */
package com.capgemini.Labexercisewrk1;
import java.util.*;

public class Sortstring {
    Scanner scanner = new Scanner(System.in);
	public void main(String[] args) {
	    int n=scanner.nextInt();
	    String []str=new String[n];
	    for(int index=0;index<n;index++)
	        str[index]=scanner.next();
	    String []st=sortStrings(str);
	    int limit1=0;
	    if(n%2==0)
	    limit1=n/2;
	    else if(n%2==1)
	    limit1=(n/2)+1;
	    for(int index=0;index<limit1;index++)
	        System.out.print(st[index].toUpperCase()+" ");
	    for(int index=limit1;index<n;index++)
	    	System.out.print(st[index].toLowerCase()+" ");
		}
		public String[] sortStrings(String []str)
		{
			if(str.length==0)
				return null;
			else if(str.length==1)
				return str;
			else
			{
			Arrays.sort(str);
			return str;
			}
		}
			
}
