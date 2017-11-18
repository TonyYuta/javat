/**
 *   File Name: SingleInheritanceParent.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 1, 2017
 *   
 */

package com.javatpoint;

/**
 * SingleInheritanceParent //ADDD (description of class)
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
public class SingleInheritanceParent {
	int id;
	String fName, lName;
	
	SingleInheritanceParent(int id, String fName, String lName) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
	}

	String personInfo() {
		return id + " " + fName + " " + lName;
	}
	
	String identityParent() {
		return "Parent";
	}
}
