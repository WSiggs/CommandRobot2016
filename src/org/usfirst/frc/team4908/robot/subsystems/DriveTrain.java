package org.usfirst.frc.team4908.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import org.usfirst.frc.team4908.robot.RobotMap;
import org.usfirst.frc.team4908.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * @author James Cip
 */
public class DriveTrain extends Subsystem 
{
    RobotDrive drive;

    public DriveTrain()
    {
        drive = new RobotDrive(new CANTalon(RobotMap.ports[RobotMap.MOTOR_FRONT_LEFT]),
                new CANTalon(RobotMap.ports[RobotMap.MOTOR_BACK_LEFT]),
                new CANTalon(RobotMap.ports[RobotMap.MOTOR_FRONT_RIGHT]),
                new CANTalon(RobotMap.ports[RobotMap.MOTOR_BACK_RIGHT]));
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
    	if (x < 0) // calculating exponential values
        {
            x = -Math.pow(x, 2);
        }
        else if (x > 0)
        {
            x = Math.pow(x, 2);
        }

        drive.arcadeDrive(x, rotation, false);
    }
}

