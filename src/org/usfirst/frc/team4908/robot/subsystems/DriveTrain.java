package org.usfirst.frc.team4908.robot.subsystems;

import org.usfirst.frc.team4908.robot.RobotMap;
import org.usfirst.frc.team4908.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem 
{

	CANTalon frontLeft;
	CANTalon frontRight;
	CANTalon backLeft;
	CANTalon backRight;
	
	RobotDrive drive;

    public DriveTrain()
    {
    	frontLeft = new CANTalon(RobotMap.MOTOR_FRONT_LEFT);
    	frontRight = new CANTalon(RobotMap.MOTOR_FRONT_RIGHT);
    	backLeft = new CANTalon(RobotMap.MOTOR_BACK_LEFT);
    	backRight = new CANTalon(RobotMap.MOTOR_BACK_RIGHT);
    
    	drive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
    }
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() 
    {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoystick());
    }
    
    public void drive(double x, double rotation)
    {	
    	drive.arcadeDrive(x, rotation);
    }
}

