package com.capgemini.Labexercisewrk;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class Sortstringtest {
	private Sortstring sortstring;
	@Before
	public void setup()
	{
		sortstring = new Sortstring();
	}
	@Test
	public void getArrayof_integerElementAs1Array_AndreturnAsStringr() {
		String ar[]= {"name"};
		String arr[]=sortstring.sortStrings(ar);
		assertArrayEquals(ar,arr);
	}
	@Test
	public void getArrayof_integerElementAsEmptyArray_Andreturn0AsString() {
		String []ar= {""};
		String arr[]=sortstring.sortStrings(ar);
		assertArrayEquals(ar,arr);
	}
	@Test
	public void getArrayof_integerElementAs_morethan2Array_AndreturnSecondsmallestAsInteger() {
		String []ar= {"na1","na2"};
		String arr[]=sortstring.sortStrings(ar);
		assertArrayEquals(ar,arr);
	}

}
