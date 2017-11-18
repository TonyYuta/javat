/**
 *   File Name: StairsLight.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 6, 2017
 *   
 */

package com.javatpoint;

/**
 * StairsLight //ADDD (description of class)
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
public class StairsLight extends SmartHome {

	String descriptionSL = "This is a component Stairs Light";
	int compId = 201;
	String compName = "Light Stairs";
	
	StairsLight(
			int projId, 
			float version, 
			String projName, 
			String description, 
			String projType, 
			int compId, 
			String compName, 
			String descriptionSL
			) {
	super(projId, version, projName, description, projType);
	this.compId = compId;
	this.compName = compName;
	this.descriptionSL = descriptionSL;
	}
	
	String compInfo() {
		return "This component is about " + this.compName;
		}
	
	
	
}
