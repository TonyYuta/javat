/**
 *   File Name: Constructors.java<br>
 *
 *   Yutaka<br>
 *   Created: Oct 11, 2017
 *   
 */

package com.javatpoint;

/**
 * Constructors //ADDD (description of class)
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
public class Constructors {
	
	int id;
	String name;
	int age;
	
	Constructors() {
		
	}
	
	Constructors(int i, String n) {
		id = i;
		name = n;
	}
	
	Constructors(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	
	void display() {
		System.out.println(id + " " + name + " " + age);
	}
	public static void main(String[] args) {
		Constructors obj1 = new Constructors();
		Constructors obj2 = new Constructors(10, "Nana");
		Constructors obj3 = new Constructors(11, "Yulia", 28);
		
		obj1.display();
		obj2.display();
		obj3.display();
	}
	
}
