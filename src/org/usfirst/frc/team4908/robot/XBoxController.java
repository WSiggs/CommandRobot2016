package org.usfirst.frc.team4908.robot;

import org.usfirst.frc.team4908.robot.triggers.XBoxTrigger;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;

public class XBoxController extends Joystick
{
	private Button buttonA,
				   buttonB,
				   buttonX,
				   buttonY,
				   buttonLeftBumper,
				   buttonRightBumper;
	
	public Trigger leftTrigger;
	public Trigger rightTrigger;
	
	public static final int LEFT_STICK_X = 0;
	public static final int LEFT_STICK_Y = 1;
	public static final int LEFT_TRIGGER = 2;
	public static final int RIGHT_TRIGGER = 3;
	public static final int RIGHT_STICK_X = 4;
	public static final int RIGHT_STICK_Y = 5;

	public static final int BUTTON_A = 1;
	public static final int BUTTON_B = 2;
	public static final int BUTTON_X = 3;
	public static final int BUTTON_Y = 4;
	public static final int BUTTON_LEFT_BUMPER = 5;
	public static final int BUTTON_RIGHT_BUMPER = 6;

	public XBoxController(int port) 
	{
		super(port);
		
		buttonA = new JoystickButton(this, BUTTON_A);
		buttonB = new JoystickButton(this, BUTTON_B);
		buttonX = new JoystickButton(this, BUTTON_X);
		buttonY = new JoystickButton(this, BUTTON_Y);
		buttonLeftBumper = new JoystickButton(this, BUTTON_LEFT_BUMPER);
		buttonRightBumper = new JoystickButton(this, BUTTON_RIGHT_BUMPER);
	}

	// axis values
	public double getRightTrigger() { return getRawAxis(RIGHT_TRIGGER); }
	
	public double getLeftTrigger() { return getRawAxis(LEFT_TRIGGER); }
	
	public double getLeftX() { return getRawAxis(LEFT_STICK_X); }
	
	public double getLeftY() { return getRawAxis(LEFT_STICK_Y); }
	
	public double getRightX() { return getRawAxis(RIGHT_STICK_X); }
	
	public double getRightY() { return getRawAxis(RIGHT_STICK_Y); }
	
	// button values
	public boolean getButtonA() { return getRawButton(BUTTON_A); }
	
	public boolean getButtonB() { return getRawButton(BUTTON_B); }
	
	public boolean getButtonX() { return getRawButton(BUTTON_X); }

	public boolean getButtonY() { return getRawButton(BUTTON_Y); }
	
	public boolean getRightButton() { return getRawButton(BUTTON_RIGHT_BUMPER); } 
	
	public boolean getLeftButton() { return getRawButton(BUTTON_LEFT_BUMPER); } 
	
	// button access
	public Button getAButton() { return buttonA; }

	public Button getBButton() { return buttonB; }

	public Button getXButton() { return buttonX; }

	public Button getYButton() { return buttonY; }

	public Button getButtonLeft() { return buttonLeftBumper; }

	public Button getButtonRight() { return buttonRightBumper; }

}
