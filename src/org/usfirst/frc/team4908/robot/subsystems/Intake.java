package org.usfirst.frc.team4908.robot.subsystems;

import org.usfirst.frc.team4908.robot.RobotMap;
import org.usfirst.frc.team4908.robot.commands.ShootOverTop;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem 
{\
	private static DoubleSolenoid intakeSolenoid = new DoubleSolenoid(RobotMap.ports[RobotMap.INTAKE_SOLENOID_PORT_ONE],
                                                                      RobotMap.ports[RobotMap.INTAKE_SOLENOID_PORT_TWO]);

	private static SpeedController intakeMotor = new TalonSRX(RobotMap.ports[RobotMap.INTAKE_MOTOR_PORT]);
	
    public void initDefaultCommand() { setDefaultCommand(new ShootOverTop()); }
    
    public static void deployIntake()
    {
    	intakeSolenoid.set(DoubleSolenoid.Value.kForward);
    }
    
    public static void retractIntake()
    {
    	intakeSolenoid.set(DoubleSolenoid.Value.kReverse);
    }
    
    public static void cancel()
    {
    	intakeSolenoid.set(DoubleSolenoid.Value.kOff);
    }
    
    public static void runIntakeMotor(double speed)
    {
    	intakeMotor.set(speed);
    }
    
    public static void stopMotor()
    {
    	intakeMotor.set(0);
    }
    
    public static void stopAll()
    {
    	intakeMotor.set(0);
    	intakeSolenoid.set(DoubleSolenoid.Value.kOff);
    }
}

