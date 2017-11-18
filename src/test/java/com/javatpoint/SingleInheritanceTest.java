/**
 *   File Name: SingleInheritanceTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 1, 2017
 *   
 */

package com.javatpoint;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * SingleInheritanceTest //ADDD (description of class)
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
public class SingleInheritanceTest {
	
	@BeforeClass(alwaysRun = true)
	public void beforeClassSetUp() {
		System.out.println("before class");
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClassTearDown() {
		System.out.println("after class");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethodSetUp() {
		System.out.println("before method");
	}
	
	@AfterMethod(alwaysRun = true)
	public void afterMethodTearDown() {
		System.out.println("after method");
	}
	
	@Test(enabled = true, groups = {"inheritance", "constructors"}, priority = 4)
	public void testSingleInheritance() {
		String expected = "Parent + Child";
		//SingleInheritanceParent sip = new SingleInheritanceParent(120, "Lia", "Lorreni");
		SingleInheritanceChild sic = new SingleInheritanceChild(121, "Mola", "Peb");
		Assert.assertEquals(sic.identityParent() + " + " + sic.identityChild(), expected, "inheritance doesn't match to expected");
	}
	

}
