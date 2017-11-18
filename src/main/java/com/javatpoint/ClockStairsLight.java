/**
 *   File Name: ClockStairsLight.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 6, 2017
 *   
 */

package com.javatpoint;

/**
 * ClockStairsLight //ADDD (description of class)
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
public class ClockStairsLight {
	int compId = 202;
	String compName = "Clock for Stairs Light";
	String description = "Real time Clock for a component Stairs Light";
	int startSeconds;
	
	ClockStairsLight(int compId, String compName, String description) {
		this.compId = compId;
		this.compName = compName;
		this.description = description;
		this.startSeconds = startSeconds;
	}
	
	String compInfo() {
		return "This component is about " + this.compName;
	}
	
	int startMinutes() {
		return this.startSeconds / 60;
	}
	
}
