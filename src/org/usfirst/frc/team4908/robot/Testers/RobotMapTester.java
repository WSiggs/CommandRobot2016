package org.usfirst.frc.team4908.robot.Testers;

import org.usfirst.frc.team4908.robot.RobotMap;

/**
 * Created by jamescipolletti on 6/8/16.
 */
public class RobotMapTester
{
    public static void main(String args[])
    {
        RobotMap map = new RobotMap();
        map.updatePorts();

        for (int i = 0; i < map.ports.length; i ++)
        {
            System.out.println(map.ports[i]);
        }
    }
}
