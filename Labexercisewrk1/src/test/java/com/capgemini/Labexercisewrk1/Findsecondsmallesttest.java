package com.capgemini.Labexercisewrk1;
import static org.junit.Assert.assertEquals;
import org.junit.*;
public class Findsecondsmallesttest {
	private Findsecondsmallest findsecondsmallest;
	@Before
	public void setup()
	{
		findsecondsmallest = new Findsecondsmallest();
	}
	@Test
	public void getArrayof_integerElementAs1Array_AndreturnAsInteger() {
		int ar[]= {1};
		int arr=findsecondsmallest.getSecondsmallest(ar);
		assertEquals(ar[0],arr);
	}
	@Test
	public void getArrayof_integerElementAsEmptyArray_Andreturn0AsInteger() {
		int ar[]= {};
		int arr=findsecondsmallest.getSecondsmallest(ar);
		assertEquals(0,arr);
	}
	@Test
	public void getArrayof_integerElementAs_morethan2Array_AndreturnSecondsmallestAsInteger() {
		int ar[]= {3,4};
		int arr=findsecondsmallest.getSecondsmallest(ar);
		assertEquals(ar[1],arr);
	}
	
	
}
