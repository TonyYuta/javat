/**
 *   File Name: Server.java<br>
 *
 *   Yutaka<br>
 *   Created: Nov 6, 2017
 *   
 */

package com.javatpoint;

/**
 * Server //ADDD (description of class)
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
public class Server extends SmartHome {
	
	int compId = 301;
	String compName = "Server";
	
	String descriptionServer = "Control Smart Home";
	
	Server(int projId, float version, String projName, String description, String projType, int compId, String compName, String descriptionServer) {
		//super(projId, version, projName, description, projType);
		super(projId, version, projName, description, projType);
		this.compId = compId;
		this.compName = compName;
		this.descriptionServer = descriptionServer;
	}

	String info() {
		return "This component is about " + this.compName;
	}
	
	String monitorDevices() {
		return "Monitoring all devices from Server class";
	}
	
	String controlStairsLight() {
		return this.compName + " controls components in " + projName;  
	}
	
}
