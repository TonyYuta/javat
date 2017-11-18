/**
 *   File Name: ServerTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 15, 2017
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
 * ServerTest //ADDD (description of class)
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
public class ServerTest {
	
	Server ser;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClassSetUp() {
		System.out.println("before class set up");
		ser = new Server(15, 2.01F,  "Smart Home",  "Smart Home for Automation", "Home Automation", 6, "Server",  "Server for Smart Home based on Raspbery PI");
	}
	
	@AfterClass(alwaysRun = true)
	public void afterClassTearDown() {
		System.out.println("after class tear down");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethodSetUp() {
		System.out.println("before method set up");
	}
	
	@AfterMethod(alwaysRun = true)
	public void afterMethodTearDown() {
		System.out.println("after method tear down");
	}
	
	@Test(enabled = true, groups = {"constructor", "this", "super"}, priority = 0)
	public void testServerInfo() {
		String expected = "Server controls components in Smart Home";
		Assert.assertEquals(ser.controlStairsLight(), expected, "controlStairsLight doesn't match to expected");
	}
	
	
	

}
