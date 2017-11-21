/**
 *   File Name: ControlTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 18, 2017
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
 * ControlTest //ADDD (description of class)
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
public class ControlTest {
	
	Server ser;
	Control con;
	
	
	@BeforeClass(alwaysRun = true)
	public void beforeClassSetUp() {
		System.out.println("beforeClassSetUp");
		con = new Control(
				 11, 
				 5.6F, 
				 "SmartHome", 
				 "Smart Home Proj", 
				 "Home Automation", 
				 9, 
				 "Server", 
				 "description: Server", 
				 "control Type1", 
				 "controlType2", 
				 "description: Control"
				 ); 
		
		ser = new Server(
				8, 
				14.2F, 
				"Smart Home", 
				"Smart Home proj", 
				"Control, adjust, and update home devices", 
				12, 
				"Server", 
				"Server controls devices"
				);
	}
	
	
	@AfterClass(alwaysRun = true)
	public void afterClassTearDown() {
		System.out.println("afterClassTearDown");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethodSetUp() {
		System.out.println("beforeMethodSetUp");
	}
	
	@AfterMethod(alwaysRun = true)
	public void afterMethodTearDown() {
		System.out.println("afterMethodTearDown");
	}
	
	@Test(enabled = true, groups = {"constructor", "this", "super"}, priority = 1)
	public void testControl() {
		String expected = "Control Stairs Light component from Control class | version: 5.6";
		Assert.assertEquals(con.controlStairsLight() + " | version: " + con.version, expected, "testcontrol doesn't match expected");
	}
	
	@Test(enabled = true, groups = {"constructor", "this", "super", "override"}, priority = 1)
	public void testControlInfoOverride() {
		String expected = "This is parent of Smart Home Proj | This class controls control Type1 and controlType2 | Smart Home Proj";
		Assert.assertEquals(con.info(), expected, "overrided method info doesn't match to expected");
	}
	
	@Test(enabled = true, groups = {"constructor", "this", "override"}, priority = 1)
	public void testOriginInfoMethodFromParent() {
		String expected = "This component is about Server";
		Assert.assertEquals(ser.info(), expected, "origin info method returns incorrect data");
	}
	
	@Test(enabled = true, groups = {"constructor", "this", "child", "parent", "override"}, priority = 1)
	public void testOverridedInfoMethodFromChild() {
		String expected = "This is parent of Smart Home Proj | This class controls control Type1 and controlType2 | Smart Home Proj";
		Assert.assertEquals(con.info(), expected, "origin info method returns incorrect data");
	}

}