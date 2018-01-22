package org.usfirst.frc.team6861.robot.subsystems;

import org.usfirst.frc.team6861.robot.commands.DriveWithJoystick;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
	
	
	public WPI_TalonSRX leftFront;
    public WPI_TalonSRX rightFront;
    public WPI_TalonSRX leftRear;
    public WPI_TalonSRX rightRear;
    RobotDrive roboDrive;
    
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public DriveTrain() {
    	leftFront = new WPI_TalonSRX(1);
    	rightFront = new WPI_TalonSRX(2);
    	leftRear = new WPI_TalonSRX(3);
    	rightRear = new WPI_TalonSRX(4);
    	roboDrive = new RobotDrive(leftFront,leftRear,rightFront,rightRear);
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new DriveWithJoystick());
    }
}

