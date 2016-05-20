package org.usfirst.frc.team4908.robot.subsystems;

import org.usfirst.frc.team4908.robot.RobotMap;
import org.usfirst.frc.team4908.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem 
{
	private static Talon frontLeft = new Talon(RobotMap.MOTOR_FRONT_LEFT);
	private static Talon frontRight = new Talon(RobotMap.MOTOR_FRONT_RIGHT);
	private static Talon backLeft = new Talon(RobotMap.MOTOR_BACK_LEFT);
	private static Talon backRight = new Talon(RobotMap.MOTOR_BACK_RIGHT);
    public static RobotDrive drive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoystick());
    }
    
    public static void drive(double x, double rotation)
    {	
    	drive.arcadeDrive(x, rotation);
    }
}

