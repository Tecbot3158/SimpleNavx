package org.usfirst.frc.team3158.robot;

import org.usfirst.frc.team3158.robot.commands.gyro.PrintValuesCommandGyro;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
	
	Joystick pilot;
	JoystickButton a;
	public OI() {
		pilot = new Joystick(0);
		a = new JoystickButton(pilot,1);
		
		a.whenPressed(new PrintValuesCommandGyro());
	}
	
}
