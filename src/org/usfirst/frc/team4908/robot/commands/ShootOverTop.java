package org.usfirst.frc.team4908.robot.commands;

import org.usfirst.frc.team4908.robot.OI;
import org.usfirst.frc.team4908.robot.Robot;
import org.usfirst.frc.team4908.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ShootOverTop extends Command 
{

    public ShootOverTop() 
    {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    	Intake.runIntakeMotor(OI.operatorController.getRightTrigger());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() 
    {
    	Intake.stopMotor();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() 
    {
    	Intake.stopMotor();

    }
}
