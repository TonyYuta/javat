/**
 *   File Name: ReturnCurrentClassInstanceTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Oct 31, 2017
 *   
 */

package com.javatpoint;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * ReturnCurrentClassInstanceTest //ADDD (description of class)
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
public class ReturnCurrentClassInstanceTest {
	
	@BeforeClass(alwaysRun = true)
	public void beforeClassSetUp() {
		
	}
	
	@AfterClass()
	public void afterClassTearDown() {
		
	}
	
	@Test(enabled = true, groups = {"object", "this", "constructors"}, priority = 2)
	public void testReturnCurrentClassInstance() {
		ReturnCurrentClassInstance rc = new ReturnCurrentClassInstance(115, "vDonna", "pLia");
		String expected = "115 vDonna pLia";
		System.out.println("rc.id : " + rc.id);
		System.out.println("rc : " + rc);
		System.out.println("String.valueOf(rc) : " + String.valueOf(rc));
		System.out.println("rc : " + rc);
		Assert.assertEquals(rc.displayObject(), expected, "ReturnCurrentClassInstance obj doesn't match to expected");
	}

}
