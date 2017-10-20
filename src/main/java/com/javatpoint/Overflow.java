/**
 *   File Name: Overflow.java<br>
 *
 *   Yutaka<br>
 *   Created: Oct 10, 2017
 *   
 */

package com.javatpoint;

/**
 * Overflow //ADDD (description of class)
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
public class Overflow {
	
	
	public static void main(String[] args) {
		int a = 130;
		int b = 127;
		int c = 128;
		int d = 129;
		int e = 255;
		int f = 256;
		
		overflow(a);
		overflow(b);
		overflow(c);
		overflow(d);
		overflow(e);
		overflow(f);

	}
	
	public static void overflow(int num) {
		byte b = (byte)num;
		System.out.println(b);
	}

}
