package org.usfirst.frc.team4908.robot;

import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap 
{		
	public static final int MOTOR_FRONT_LEFT = -1;
	public static final int MOTOR_FRONT_RIGHT = -1;
	public static final int MOTOR_BACK_LEFT = -1;
	public static final int MOTOR_BACK_RIGHT = -1;
	
	public static final int DRIVER_PORT = 1;
	public static final int OPERATOR_PORT = 2;
	
	public static final int INTAKE_SOLENOID_PORT_ONE = 5;
	public static final int INTAKE_SOLENOID_PORT_TWO = 4;
	
	public static final int INTAKE_MOTOR_PORT = 0;
	
	public static final int LIMIT_SWITCH_PORT = -1;

	
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
