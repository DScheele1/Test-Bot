package org.usfirst.frc.team2509.robot.subsystems;

import org.usfirst.frc.team2509.robot.OI;
import org.usfirst.frc.team2509.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	private Talon Driveleft = RobotMap.Driveleft;
	private Talon Driveright = RobotMap.Driveright;
	private static RobotDrive robotdrive = RobotMap.robotdrive;
	public static void Drive(){
		robotdrive.tankDrive(OI.OPstick1.getY(),OI.OPstick2.getY());
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

