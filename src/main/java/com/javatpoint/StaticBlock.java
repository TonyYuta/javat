/**
 *   File Name: StaticBlock.java<br>
 *
 *   Yutaka<br>
 *   Created: Oct 21, 2017
 *   
 */

package com.javatpoint;

/**
 * StaticBlock //ADDD (description of class)
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
public class StaticBlock {
	static {
		System.out.println("This is static block");
		String progectName = "StairsWave";
		System.out.println("Project: " + progectName);
	}
	
	int modeId;
	String modeName;
	static String progectPlatform = "Arduino";
	
	StaticBlock() {	
	}
	
	StaticBlock(int mI, String mN) {	
		modeId = mI;
		modeName = mN;
	}
	
	void displayModeParam() {
		System.out.println("Platform: " + progectPlatform + " | Mode Id: " + modeId + " | Mode Name: " + modeName);
	}
		
	
	public static void main(String[] args) {
		System.out.println("main method");
		StaticBlock obj1 = new StaticBlock(01, "DayWait01");
		obj1.displayModeParam();
	}
	
	
}
