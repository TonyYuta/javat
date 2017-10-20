/**
 *   File Name: AddingLowerType.java<br>
 *
 *   Yutaka<br>
 *   Created: Oct 10, 2017
 *   
 */

package com.javatpoint;

/**
 * AddingLowerType //ADDD (description of class)
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
public class AddingLowerType {
	
	public static void main (int[] args) {
		byte a = 10;
		byte b = 20;
		addingLowerType(a, b);
	}
	
	public static void addingLowerType(byte first, byte second) {
		//byte sum = first + second; //Compile Time Error: because first + second = 30 will be int  
		byte sum = (byte)(first + second);
	}

}
