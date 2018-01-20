package org.usfirst.frc.team6861.robot.subsystems;


import org.usfirst.frc.team6861.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	public static final SpeedController leftFront = RobotMap.leftFront;
	public static final SpeedController rightFront = RobotMap.rightFront;
	public static final SpeedController leftRear = RobotMap.leftRear;
	public static final SpeedController rightRear = RobotMap.rightRear;
	// public static final RobotDrive robotDrive = RobotMap.driveTrainRobotDrive41;
	
	

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

