/**
 *   File Name: ThisConstructors.java<br>
 *
 *   Yutaka<br>
 *   Created: Oct 25, 2017
 *   
 */

package com.javatpoint;

/**
 * ThisConstructors //ADDD (description of class)
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
public class ThisConstructors {
	
	int id;
	String name, course; 
	float fee;
	
	ThisConstructors(int i) {
		System.out.println("this - param constructor.");
	}
	
	ThisConstructors() {
		this(5);
	}
	
	ThisConstructors(int id, String name, String course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	ThisConstructors(int id, String name, String course, float fee) {
		this(id, name, course);
		this.fee = fee;
	}
	
	String studentInfo() {
		return id + " " + name + " " + course + " " + fee;
	}
	
	void rangeFee() {
		isCourseCostly(this);
	}
	
	boolean isCourseCostly(ThisConstructors obj) {
		if (obj.fee > 500) {
		return true;
		} else return false;
	}

}
