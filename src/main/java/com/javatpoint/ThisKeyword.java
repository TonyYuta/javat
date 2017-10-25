/**
 *   File Name: ThisKeyword.java<br>
 *
 *   Yutaka<br>
 *   Created: Oct 25, 2017
 *   
 */

package com.javatpoint;

/**
 * ThisKeyword //ADDD (description of class)
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
public class ThisKeyword {

	int id;
	String name;
	float distance;
	
	static String projectName = "ThisKW";
	
	ThisKeyword() {	
		System.out.println("this() to constructor chain");
	}
	
	ThisKeyword(int id, String name, float distance) {
		this();
		this.id = id;
		this.name = name;
		this.distance = distance;
	}
	
	void displayObj() {
		System.out.println(projectName + " " + id + " " + name + " " + distance);
	}
	
	String objectDetails() {
		String details;
		return details = projectName + " " + id + " " + name + " " + distance;
	}
	
	
}
