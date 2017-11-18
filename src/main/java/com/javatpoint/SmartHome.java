/**
 *   File Name: SmartHome.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 6, 2017
 *   
 */

package com.javatpoint;

/**
 * SmartHome //ADDD (description of class)
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
public class SmartHome {
	
	int projId = 101;
	float version = 10.1F;
	String projName = "Smart Home";
	String description;
	String projType;

	void SmartHome() {
		
	}
	
	SmartHome(int projId, float version, String projName, String description, String projType) {
		this.projId = projId;
		this.version = version;
		this.projName = projName;
		this.description = description;
		this.projType = projType;
	}

	String projInfo() {
		return "This project is about " + this.projName;
	}
	
}
