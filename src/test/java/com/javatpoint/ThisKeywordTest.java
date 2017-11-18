package com.javatpoint;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThisKeywordTest {
 
	@BeforeClass
	public void beforeClassSetUp() {
		//ThisKeyword tk1 = new ThisKeyword();
	}
	
	@AfterClass
	public void afterClassTearDown() {
		
	}
	
	@BeforeMethod
	public void beforeMethodSetUp() {
		
	}
	
	@AfterMethod
	public void afterMethodTearDown() {
		
	}
	
	@Test(enabled = true, groups = {"objects", "this", "constructors", "bat"}, priority = 0)
	public void testThisKweword() {
		ThisKeyword tk1 = new ThisKeyword(101, "Limi", 10.20F);
		String expected = "ThisKW 101 Limi 10.2";

		Assert.assertEquals(tk1.objectDetails(), expected, "Id doesn't match to expected");
	}
	
	@Test(enabled = true, groups = {"objects", "this", "constructors"}, priority = 1)
	public void testThisConstructors() {
		ThisConstructors tc = new ThisConstructors(103, "Seila", "Accounting");
		String expected = "103 Seila Accounting 0.0";
		Assert.assertEquals(tc.studentInfo(), expected, "Student info doesn't match to expected");
	}
	
	@Test(enabled = true, groups = {"objects", "this", "constructors"}, priority = 1)
	public void testThisConstructorsChaining() {
		ThisConstructors tc = new ThisConstructors(102, "Gilly", "AI", 1410);
		String expected = "102 Gilly AI 1410.0";
		Assert.assertEquals(tc.studentInfo(), expected, "Student info doesn't match to expected");
	}
	
	@Test(enabled = true, groups = {"objects", "this", "constructors"}, priority = 2)
	public void testtestThisConstructorsChainingPassArgFalse() {
		ThisConstructors tc = new ThisConstructors(104, "Menny", "Community", 390);
		boolean expected = false;
		Assert.assertEquals(tc.isCourseCostly(tc), expected, "Student's fee cost doesn't match to expected");
	}

	@Test(enabled = true, groups = {"objects", "this", "constructors"}, priority = 2)
	public void testtestThisConstructorsChainingPassArgTrue() {
		ThisConstructors tc = new ThisConstructors(105, "Colin", "SF Security", 2890);
		boolean expected = true;
		Assert.assertEquals(tc.isCourseCostly(tc), expected, "Student's fee cost doesn't match to expected");
	}
	
}
