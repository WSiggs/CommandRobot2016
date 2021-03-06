package org.usfirst.frc.team4908.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team4908.robot.commands.GetBall;
import org.usfirst.frc.team4908.robot.commands.ShootOverTop;
import org.usfirst.frc.team4908.robot.commands.PartyMode;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI 
{	
	public static Joystick driverStick = new Joystick(RobotMap.DRIVER_PORT);
	public static XBoxController operatorController = new XBoxController(RobotMap.OPERATOR_PORT);
   
	private JoystickButton trigger = new JoystickButton(driverStick, 1);
	
	public OI()
	{
		operatorController.getAButton().whileHeld(new GetBall());
		operatorController.getYButton().whileHeld(new ShootOverTop());
		trigger.whileHeld(new PartyMode());
	}
}

