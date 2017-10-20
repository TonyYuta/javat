/**
 *   File Name: StaticVariable.java<br>
 *
 *   Yutaka<br>
 *   Created: Oct 17, 2017
 *   
 */

package com.javatpoint;

/**
 * StaticVariable //ADDD (description of class)
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
public class StaticVariable {
	int id;
	String name;
	static String company = "Voleemit";
	
	StaticVariable() {};
	
	StaticVariable(int i, String n) {
		id = i;
		name = n;
	};
	
	static void changeCompany() {
		company = "Reedem";
	}
	
	void displayPerson() {
		System.out.println(id + " " + name + " " + company);
	}
	
	public static void main(String[] args) {
		
		StaticVariable obj1 = new StaticVariable(101, "Lida");
		changeCompany();
		obj1.displayPerson();
		System.out.println(StaticVariable.company);
		System.out.println(obj1.id);
		System.out.println(obj1.name);

	}
		
	
}
