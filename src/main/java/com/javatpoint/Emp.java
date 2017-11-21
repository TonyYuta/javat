/**
 *   File Name: Emp.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 20, 2017
 *   
 */

package com.javatpoint;

/**
 * Emp //ADDD (description of class)
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
public class Emp {
	
	int id;
	String fName;
	String lName;
	Address address;
	
	public Emp(int id, String fName, String lName, Address address) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
	}
	
	String fullInfo() {
		return "id:" + id + " | Full Name: " + fName + " " + lName + " | Address: " + address.state + ", " + address.zip + ", " + address.country;
	}

}
