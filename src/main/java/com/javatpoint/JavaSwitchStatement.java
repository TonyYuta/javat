/**
 *   File Name: JavaSwitchStatement.java<br>
 *
 *   Yutaka<br>
 *   Created: Oct 10, 2017
 *   
 */

package com.javatpoint;

import java.util.Scanner;

/**
 * JavaSwitchStatement //ADDD (description of class)
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
public class JavaSwitchStatement {
	
	static int power;
	
	public static void main(String[] args) {

		int result = javaSwitchStatement(initInput());
		System.out.println("2^"  + power + " = " + result);
	}
	
	/**
	 * @return
	 */
	private static int initInput() {
		 Scanner scanner = new Scanner(System.in);

		    String myString;
		    boolean validInput;
		    int number;

		    do {
		        System.out.println("Enter power integer from 0 to 9");
		        myString = scanner.nextLine();
		        try {
		            number = Integer.parseInt(myString);
		            validInput = true;
		        } catch(NumberFormatException e) {
		            validInput = false;
		            number = -1;
		        }
		    } while (validInput == false || number < 0 || number > 9 );
		    scanner.close();
		    power = number;
		    return number;
	}

	static int javaSwitchStatement(int num) {
		
		int result;
		
		switch(num) {
		
		case 0:
			result = (int) Math.pow(2, 0);
			break;
		case 1:
			result = (int) Math.pow(2,  1);
			break;
		case 2:
			result = (int) Math.pow(2, 2);
			break;
		case 3:
			result = (int) Math.pow(2, 3);
			break;
		case 4:
			result = (int) Math.pow(2, 4);
			break;
		case 5:
			result = (int) Math.pow(2, 5);
			break;
		case 6:
			result = (int) Math.pow(2, 6);
			break;
		case 7:
			result = (int) Math.pow(2,  7);
			break;
		case 8:
			result = (int) Math.pow(2, 8);
			break;
		case 9:
			result = (int) Math.pow(2,  9);
			break;
			
		default: 
			result = (int) Math.pow(2,  0);			
		}
		return result;
	}

}
