/**
 *   File Name: DogTest.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 21, 2017
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
 * DogTest //ADDD (description of class)
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
public class DogTest {
	
	Dog dog;
	
	@BeforeClass(alwaysRun = true)
	public void beforeClassSetUp() {
		System.out.println("beforeClassSetUp");
		dog = new Dog();
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
	
	@Test(enabled = true, groups = {"constructor", "this", "super"}, priority = 2)
	public void testDogInherit() {
		String expected = "parent: animal | child: dog";
		Assert.assertEquals(dog.typeInfo(), expected, ".this from child class doesn't match to expected");
	}

	
}
