package com.capgemini.Labexercisewrk1;
import static org.junit.Assert.assertEquals;
import org.junit.*;
public class Sortintegerstest {
	private Sortintegers sortintegers;
	@Before
	public void setup()
	{
		sortintegers = new Sortintegers();
	}
	@Test
	public void getArrayof_integerElementAs1Array_AndreturnAsInteger() {
		int ar[]= {1};
		int arr[]=sortintegers.getSorted(ar);
		assertEquals(ar,arr);
	}
	@Test
	public void getArrayof_integerElementAsEmptyArray_Andreturn0AsInteger() {
		int ar[]= {};
		int arr[]=sortintegers.getSorted(ar);
		assertEquals(ar,arr);
	}
	@Test
	public void getArrayof_integerElementAs_morethan2Array_AndreturnSecondsmallestAsInteger() {
		int ar[]= {3,4,56};
		int arr[]=sortintegers.getSorted(ar);
		assertEquals(ar,arr);
	}

}
