/**
 *   File Name: ObjectConstructors.java<br>
 *
 *   Yutaka<br>
 *   Created: Oct 17, 2017
 *   
 */

package com.javatpoint;

/**
 * ObjectConstructors //ADDD (description of class)
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
public class ObjectConstructors {
	int id;
	String name;
	int age;
	
	ObjectConstructors() {
	}
	
	ObjectConstructors(int i, String n) {
		id = i;
		name = n;
	}
	
	ObjectConstructors(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	
	void display() {
		System.out.println(id + " " + name + " " + age);
	}
	public static void main(String[] args) {
		ObjectConstructors obj1 = new ObjectConstructors();
		ObjectConstructors obj2 = new ObjectConstructors(100, "Pol");
		ObjectConstructors obj3 = new ObjectConstructors(101, "Vi", 30);
		obj1.display();
		obj2.display();
		obj3.display();
	}
}
