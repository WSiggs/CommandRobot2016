package org.usfirst.frc.team4908.robot;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author James
 */

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap 
{
	// NUMBERS REPRESENT LOCATIONS IN THE ARRAY
	// IE MOTOR_BACK_RIGHT = 3, MEANING THE FOURTH ELEMENT OF THE ARRAY NOT PORT 3
	public static final int MOTOR_FRONT_LEFT = 0;
	public static final int MOTOR_FRONT_RIGHT = 1;
	public static final int MOTOR_BACK_LEFT = 2;
	public static final int MOTOR_BACK_RIGHT = 3;
	public static final int DRIVER_PORT = 4;
	public static final int OPERATOR_PORT = 5;
	public static final int INTAKE_SOLENOID_PORT_ONE = 6;
	public static final int INTAKE_SOLENOID_PORT_TWO = 7;
	public static final int INTAKE_MOTOR_PORT = 8;
	public static final int LIMIT_SWITCH_PORT = 9;

	public static int[] ports = new int[10];

	File file;

	/**
	 * Updates the ports array with the correct values from the file
	 */
	public void updatePorts()
	{
		try
		{
			file = new File("Ports.txt");
			Scanner readFile = new Scanner(file);
			int count = 0;

			while (readFile.hasNext())
			{
				ports[count] = Integer.parseInt(readFile.next().substring(0, 1));
				count ++;
			}
		}
		catch (FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "Ports file not found.");
			System.exit(0);
		}
	}
}
