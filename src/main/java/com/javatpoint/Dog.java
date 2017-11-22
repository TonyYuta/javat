/**
 *   File Name: Dog.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 21, 2017
 *   
 */

package com.javatpoint;

/**
 * Dog //ADDD (description of class)
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
public class Dog extends Anim {
	String type = "dog";
	
	Dog() {
		super();
		System.out.println("dog is created");
	}
	
	String typeInfo() {
		return "parent: " + super.type + " | child: " + this.type;
	}

}
