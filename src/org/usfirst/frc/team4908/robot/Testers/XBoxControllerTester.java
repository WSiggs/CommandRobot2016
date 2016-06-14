package org.usfirst.frc.team4908.robot.Testers;

import org.usfirst.frc.team4908.robot.RobotMap;
import org.usfirst.frc.team4908.robot.XBoxController;

/**
 * Created by jamescipolletti on 6/9/16.
 */
public class XBoxControllerTester
{
    public static void main(String args[])
    {
        XBoxController xbox = new XBoxController(RobotMap.ports[RobotMap.OPERATOR_PORT]);

        try
        {
            // only methods we are actually using to control the bot
            System.out.println(xbox.getButtonX());
            System.out.println(xbox.getRightTrigger());
            System.out.println(xbox.getAButton());
            System.out.println(xbox.getYButton());
        }
        catch (Exception e)
        {
            System.out.println("Plug in the Xbox controller to the correct port!");
            System.exit(0);
        }
    }
}
