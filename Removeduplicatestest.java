package com.capgemini.Labexercisewrk;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

public class Removeduplicatestest {
	private  Removeduplicates  removeduplicates;
	@Before
	public void setup()
	{
		 removeduplicates = new  Removeduplicates();
	}
	@Test
	public void getArrayof_integerElementAs1Array_AndreturnAsInteger() {
		int ar[]= {1};
		int arr[]=removeduplicates.modifyArray(ar);
		assertEquals(ar,arr);
	}
	@Test
	public void getArrayof_integerElementAsEmptyArray_Andreturn0AsInteger() {
		int []ar= {};
		int arr[]=removeduplicates.modifyArray(ar);
		assertEquals(ar,arr);
	}
	@Test
	public void getArrayof_integerElementAs_morethan2Array_AndreturnSecondsmallestAsInteger() {
		int []ar= {1,2};
		int arr[]=removeduplicates.modifyArray(ar);
		assertEquals(ar,arr);
	}

}
