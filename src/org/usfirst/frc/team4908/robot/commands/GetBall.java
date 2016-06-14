package org.usfirst.frc.team4908.robot.commands;

import edu.wpi.first.wpilibj.DigitalInput;
import org.usfirst.frc.team4908.robot.Robot;
import org.usfirst.frc.team4908.robot.RobotMap;
import org.usfirst.frc.team4908.robot.subsystems.Intake;

import edu.wpi.first.wpilibj.command.Command;

/**
 * @author Billy
 */
public class GetBall extends Command {

    public static DigitalInput limitSwitch = new DigitalInput(RobotMap.ports[RobotMap.LIMIT_SWITCH_PORT]);

    boolean stop;

    public GetBall() 
    {
        // Use requires() here to declare subsystem dependencies
    	requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
    	Intake.deployIntake(); // placed in here so it isn't constantly firing

        stop = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
        if (!stop)
        {
            Intake.runIntakeMotor(0.5);
            if(!limitSwitch.get())
            {
                Intake.stopMotor();
                Intake.retractIntake();
                stop = true;
            }
        }

    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() 
    {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() 
    {
        Intake.retractIntake();
    	Intake.stopAll();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() 
    {
    	Intake.stopAll();
    }
}
