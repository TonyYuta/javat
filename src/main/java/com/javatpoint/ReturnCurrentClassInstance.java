/**
 *   File Name: ReturnCurrentClassInstance.java<br>
 *
 *   Yutaka<br>
 *   Created: Oct 31, 2017
 *   
 */

package com.javatpoint;

/**
 * ReturnCurrentClassInstance //ADDD (description of class)
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
public class ReturnCurrentClassInstance {
	
	int id;
	String fName, lName;
	static float fee;
	
	ReturnCurrentClassInstance(int id, String fName, String lName) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
	}

	String displayInfo() {
		return id + " " + fName + " " + lName + " " + fee;
	}
	
	ReturnCurrentClassInstance displayObject() {
		return this;
	}
	
	@Override
	public String toString() {
		return id + " " + fName + " " + lName; 
	}
	
}
