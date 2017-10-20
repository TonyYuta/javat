/**
 *   File Name: IfElseIfLadderStatement.java<br>
 *
 *   Yutaka<br>
 *   Created: Oct 10, 2017
 *   
 */

package com.javatpoint;

import java.util.Scanner;

/**
 * IfElseIfLadderStatement //ADDD (description of class)
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
public class IfElseIfLadderStatement {
	
	public static void main(String[] a) {
		
		initInput();
		
	    
	}
	
	static int initInput() {
		
		 Scanner scanner = new Scanner(System.in);

		    String myString;
		    boolean validInput;
		    int number;

		    do {
		        System.out.println("Enter a single integer from 1 to 100");
		        myString = scanner.nextLine();
		        try {
		            number = Integer.parseInt(myString);
		            validInput = true;
		        } catch(NumberFormatException e) {
		            validInput = false;
		            number = -1;
		        }
		    } while (validInput == false || number < 1 || number > 100 );
		    scanner.close();
		    return number;
	}

}
