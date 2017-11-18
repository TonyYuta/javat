/**
 *   File Name: SingleInheritanceChild.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 1, 2017
 *   
 */

package com.javatpoint;

/**
 * SingleInheritanceChild //ADDD (description of class)
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
public class SingleInheritanceChild extends SingleInheritanceParent {

	/**
	 * @param id
	 * @param fName
	 * @param lName
	 */
	SingleInheritanceChild(int id, String fName, String lName) {
	super(id, fName, lName);
	}
	
	String identityChild() {
		return "Child";
	}
	
}
