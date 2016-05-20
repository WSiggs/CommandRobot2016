package org.usfirst.frc.team4908.robot.commands;

import org.usfirst.frc.team4908.robot.Robot;
import org.usfirst.frc.team4908.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class GetBall extends Command {

    public GetBall() 
    {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
    	Intake.deployIntake(); // placed in here so it isn't constantly firing
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    	Intake.runIntakeMotor(0.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() 
    {
    	Intake.stopAll();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() 
    {
    	Intake.stopAll();
    }
}
