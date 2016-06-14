package org.usfirst.frc.team4908.robot.Testers;

import org.usfirst.frc.team4908.robot.Robot;

/**
 * Created by jamescipolletti on 6/10/16.
 */
public class RobotTester
{
    public static void main(String args[])
    {
        Robot r = new Robot();

        r.robotInit();
        r.disabledInit();
        r.disabledPeriodic();
        r.autonomousInit();
        r.autonomousPeriodic();
        r.teleopInit();
        r.teleopInit();
        r.teleopPeriodic();
        r.testPeriodic();
        System.out.println("Test success!");
    }
}
