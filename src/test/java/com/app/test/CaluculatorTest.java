package com.app.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.app.Caluculator;
public class CaluculatorTest {

	@Test
	public void addTest() {
			Caluculator calc=new Caluculator();
		int actualResult=calc.add(10, 30);
		int expectedResult=40;
		assertEquals(expectedResult,actualResult);
	}
	
	@BeforeClass
	public static void onetimeBefore(){
	 System.out.println("Before All..");
	}
	@Before
	public void preWork(){
	 System.out.println("before..");
	}
	@Test
	public void testA() {
	 System.out.println("Test-1");
	}
	@Test
	public void testB() {
	 System.out.println("Test-2");
	}
	@Test
	public void testC() {
	 System.out.println("Test-3");
	}
	@After
	public void postWork(){
	 System.out.println("After..");
	}
	@AfterClass
	public static void ontimeAfter(){
	 System.out.println("After All..");

}
}

