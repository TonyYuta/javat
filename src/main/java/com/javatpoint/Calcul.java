/**
 *   File Name: Calcul.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 20, 2017
 *   
 */

package com.javatpoint;

/**
 * Calcul //ADDD (description of class)
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
public class Calcul {
	
	int firstIntOperand;
	int secondIntOperand;
	int thirdIntOperand;
	long longResultForInts;
	float firstFloatOperand;
	float secondFloatOperand;
	float thirdFloatOperand;
	double doubleResultForFloats;
	
/*	
	Calcul(int firstIntOperand, int secondIntOperand, int intResult) {
		this.firstIntOperand = firstIntOperand;
		this.secondIntOperand = secondIntOperand;
		this.thirdIntOperand = thirdIntOperand;
		this.intResult = intResult;
		this.firstFloatOperand = firstFloatOperand;
		this.secondFloatOperand = secondFloatOperand;
		this.thirdFloatOperand = thirdFloatOperand;
		this.floatResult = floatResult;
	}
*/	
	protected long sum(int firstIntOperand, int secondIntOperand) {
		return firstIntOperand + secondIntOperand;
	}
	
	protected long sum(int firstIntOperand, int secondIntOperand, int thirdIntOperand) {
		return firstIntOperand + secondIntOperand + thirdIntOperand;
	}
	
	protected double sum(float firstFloatOperand, float secondFloatOperand) {
		return firstFloatOperand + secondFloatOperand;
	}
	
	protected double sum(float firstFloatOperand, float secondFloatOperand, float thirdFloatOperand) {
		return firstFloatOperand + secondFloatOperand + thirdFloatOperand;
	}
	
	
	
	
}
