package org.usfirst.frc.team4908.robot.triggers;

import org.usfirst.frc.team4908.robot.OI;

import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 *
 */
public class XBoxTrigger extends Trigger 
{

	public boolean get() 
	{
		return false;
	}
	
	public double getValue()
	{
		return OI.operatorController.getRightTrigger();
	}

}
