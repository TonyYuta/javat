/**
 *   File Name: Control.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 6, 2017
 *   
 */

package com.javatpoint;

/**
 * Control //ADDD (description of class)
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
public class Control extends Server {
	
	String controlType1 = "Monotor devices";
	String controlType2 = "Control Stairs Light";
	String descriptionControl = "Control components";
	
	Control(int projId, 
			float version, 
			String projName, 
			String description, 
			String projType, 
			int compId, 
			String compName, 
			String descriptionServer, 
			String controlType1, 
			String controlType2, 
			String descriptionControl) {
		super(projId, version, projName, description, projType, compId, compName, descriptionServer);
		this.controlType1 = controlType1;
		this.controlType2 = controlType2;
		this.descriptionControl = descriptionControl;
	}
	
	boolean isDevicesPresent() {
		return true;
	}
	
	@Override
	String info() {
		return "This is parent of " + super.description + " | This class controls " + this.controlType1 + 
				" and " + this.controlType2 + " | " + this.description;
	}
	
	@Override
	String monitorDevices() {
		return "Monitoring all devices from Control class";
	}
	
	@Override
	String controlStairsLight() {
		return "Control Stairs Light component from Control class";
	}
	

}
