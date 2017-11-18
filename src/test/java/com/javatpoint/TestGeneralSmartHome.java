/**
 *   File Name: TestGeneralSmartHome.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 9, 2017
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
 * TestGeneralSmartHome //ADDD (description of class)
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
public class TestGeneralSmartHome {
	
	SmartHome sh;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClassSetUp() {
		System.out.println("BeforeClass");
		sh = new SmartHome(100, 110.0F, "Smart Home", "This proj about Smart Home", "Home Automation");		
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClassTearDown() {
		System.out.println("AfterClass");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethodSetUp() {
		System.out.println("BeforeMethod");
	}
	
	@AfterMethod(alwaysRun = true)
	public void afterMethodTearDown() {
		System.out.println("AfterMethod");
	}
	
	@Test(enabled = true, groups = {"constructors", "this", "super", "parent", "child"}, priority = 3)
	public void testSmartHome() {
		String expected = "Smart Home";
		Assert.assertEquals(sh.projName, expected, "");
	}

}
