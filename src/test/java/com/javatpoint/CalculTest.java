/**
 *   File Name: CalculTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 20, 2017
 *   
 */

package com.javatpoint;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * CalculTest //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      Yutaka
 * @version     1.0.0
 * @since       1.0
 *
 */
public class CalculTest {
	
	Calcul calc;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClassSetUp() {
		System.out.println("beforeClassSetUp");
		calc = new Calcul();
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClassTearDown() {
		System.out.println("afterClassTearDown");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void beforeEveryTest() {
		System.out.println("beforeEveryTest");
	}
	
	@AfterMethod(alwaysRun = true)
	public void afterEveryTest() {
		System.out.println("afterEveryTest");
	}
	
	@Test(enabled = true, groups = {"calc", "overloading", "this"}, priority = 5)
	public void testCalcTwoInt() {
		int first = 114;
		int second = 86;
		long expected = 200L;
		AssertJUnit.assertEquals((calc.sum(first, second)), expected, "long sum 2 args doesn't match to expected");
	}

	@Test(enabled = true, groups = {"calc", "overloading", "this"}, priority = 5)
	public void testCalcThreeInt() {
		int first = 192;
		int second = 18;
		int third = 40;
		long expected = 250L;
		AssertJUnit.assertEquals(calc.sum(first, second, third), expected, "long sum 3 args doesn't match to expected");
	}
	
	@Test(enabled = true, groups = {"calc", "overloading", "this"}, priority = 5)
	public void testCalcTwoFloat() {
		float first = 5.1F;
		float second = 1.3F;
		double expected = 6.4D;
		final double DELTA = 0.00001D;
		Assert.assertEquals(calc.sum(first, second), expected, DELTA, "double result for 2 floats doesn't match to expected");
	}
	
	@Test(enabled = true, groups = {"calc", "overloading", "float", "double", "delta"})
	public void testCalcTreeFloat() {
		float first = 0.01F;
		float second = 0.02F;
		float third = 0.03F;
		double expected = 0.06D;
		final double DELTA = 0.00001D;
		Assert.assertEquals(calc.sum(first, second, third), expected, DELTA, "double sum result doesn't match to expected");
	}
	
}
