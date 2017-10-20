/**
 *   File Name: Casting.java<br>
 *
 *   Yutaka<br>
 *   Created: Oct 10, 2017
 *   
 */

package com.javatpoint;

/**
 * Casting //ADDD (description of class)
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
public class Casting {
	
	public static void main(String[] args) {
		int a = 10;
		float b = 10.5F;
		widering(a);
		narowing(b);
	}
	
	public static void widering(int num) {
		float b = num;
		System.out.println(b);
	}
	
	public static void narowing(float num) {
		
		//int a = num; //Compile time error  

		int a = (int)num;
		System.out.println(a);
	}

}
