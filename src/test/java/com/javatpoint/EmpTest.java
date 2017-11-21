/**
 *   File Name: EmpTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 20, 2017
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
 * EmpTest //ADDD (description of class)
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
public class EmpTest {
	
	Address address01;
	Address address02;
	Emp emp01;
	Emp emp02;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClassSetUp() {
		System.out.println("beforeClassSetUp");
		address01 = new Address("USA", "California", 94133);
		address02 = new Address("USA", "California", 94061);
		emp01 = new Emp(10, "Mila", "Feed", address01);
		emp02 = new Emp(11, "Tom", "Ben", address02);
	}

	@AfterClass(alwaysRun = true)
	public void afterClassTearDown() {
		System.out.println("afterClassTearDown");
	}
	
	@BeforeMethod(alwaysRun = true)
	public void beforeTestSetUp() {
		System.out.println("beforeTestSetUp");
	}
	
	@AfterMethod(alwaysRun = true)
	public void afterTestTearDown() {
		System.out.println("afterTestTearDown");
	}
	
	@Test(enabled = true, groups = {"agregation", "address", "this"}, priority = 3)
	public void testEmp01FullInfo() {
		String expected = "id:10 | Full Name: Mila Feed | Address: California, 94133, USA";
		Assert.assertEquals(emp01.fullInfo(), expected, "full emp01 info doesn't match to expected");
	}
	
	@Test(enabled = true, groups = {"agregation", "address", "this"}, priority = 3)
	public void testEmp02FullInfo() {
		String expected = "id:11 | Full Name: Tom Ben | Address: California, 94061, USA";
		Assert.assertEquals(emp02.fullInfo(), expected, "full emp02 info doesn't match to expected");
	}
	
	@Test(enabled = true, groups = {"agregation", "address", "this"}, priority = 4)
	public void testEmployeesFromCal() {
		Assert.assertTrue((emp01.address.state == "California") || (emp02.address.state == "California"), "some emp not from CA");
	}
	
}
