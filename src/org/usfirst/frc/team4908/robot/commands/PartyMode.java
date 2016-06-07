package org.usfirst.frc.team4908.robot.commands;

import org.usfirst.frc.team4908.robot.OI;
import org.usfirst.frc.team4908.robot.Robot;
import org.usfirst.frc.team4908.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class PartyMode extends Command 
{
	private double x;
	private double rotation;
	private int count;
	
    public PartyMode() 
    {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
    	count = 0;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    	if(count <= 1000)
    	{
    		x = OI.driverStick.getAxis(Joystick.AxisType.kY);
    		rotation = OI.driverStick.getAxis(Joystick.AxisType.kTwist);
    		
    		DriveTrain.drive(x, rotation);
    	}
    	else if(count > 1000 && count <= 2000)
    	{
    		x = OI.driverStick.getAxis(Joystick.AxisType.kY);
    		rotation = OI.driverStick.getAxis(Joystick.AxisType.kTwist);
    		
    		DriveTrain.drive(rotation, x);
    	}
    	else if(count > 2000 && count <= 2500)
    	{
    		x = OI.driverStick.getAxis(Joystick.AxisType.kY);
    		rotation = OI.driverStick.getAxis(Joystick.AxisType.kTwist);
    		
    		DriveTrain.drive(rotation, rotation);
    	}
    	else if(count > 2500 && count <= 3000)
    	{
    		x = OI.driverStick.getAxis(Joystick.AxisType.kY);
    		rotation = OI.driverStick.getAxis(Joystick.AxisType.kTwist);
    		
    		DriveTrain.drive(x, x);
    	}
    	else
    	{
    		count = 0;
    	}
    	count++;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
