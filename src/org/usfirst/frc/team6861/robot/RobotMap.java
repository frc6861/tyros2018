/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6861.robot;

import com.ctre.CANTalon;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap{
	public static WPI_TalonSRX leftFront;
    public static WPI_TalonSRX rightFront;
    public static WPI_TalonSRX leftRear;
    public static WPI_TalonSRX rightRear;
    public static RobotDrive robotDrive;
    public static MecanumDrive mecanumDrive;


    public static void init() {
    	leftFront = new WPI_TalonSRX(1);
    	rightFront = new WPI_TalonSRX(3);
    	leftRear = new WPI_TalonSRX(2);
    	rightRear = new WPI_TalonSRX(4);
    	mecanumDrive = new MecanumDrive(leftFront,leftRear,rightFront,rightRear);
    	
  
    }
}


	
