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
		ThisKeyword tk1 = new ThisKeyword();
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
	
	@Test(enabled = true, groups = {"objects", "this", "bat"}, priority = 0)
	public void testThisKweword() {
		int expected = 101;
		ThisKeyword tk1 = new ThisKeyword(101, "Limi", 10.20F);

		//tk1.displayObj();
		
		Assert.assertEquals(tk1.id, expected, "Id doesn't match to expected");
	}
	
	
}
