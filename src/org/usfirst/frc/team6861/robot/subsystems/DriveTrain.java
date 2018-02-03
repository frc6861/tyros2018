package org.usfirst.frc.team6861.robot.subsystems;


import org.usfirst.frc.team6861.robot.OI;
import org.usfirst.frc.team6861.robot.commands.DriveWithJoyStick;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//test
/**
 *
 */
public class DriveTrain extends Subsystem {
	
	private  WPI_TalonSRX leftFront;
    private  WPI_TalonSRX rightFront;
    private  WPI_TalonSRX leftRear;
    private  WPI_TalonSRX rightRear;
    private  MecanumDrive mecanumDrive;
    private Spark spark;
	private Joystick joystick;
    // Put  methods for controlling this subsystem
    // here. Call these from Commands.
    public DriveTrain(OI m_oi) {
    	leftFront = new WPI_TalonSRX(1);
    	rightFront = new WPI_TalonSRX(3);
    	leftRear = new WPI_TalonSRX(2);
    	rightRear = new WPI_TalonSRX(4);
    	spark = new Spark(0);
    	mecanumDrive = new MecanumDrive(leftFront,leftRear,rightFront,rightRear);
    	joystick=m_oi.getStick();
    	motorSetup();
    	
    }
    public void motorSetup() {
    	leftFront.setExpiration(0.5);
    	rightFront.setExpiration(0.5);
    	leftRear.setExpiration(0.5);
    	rightRear.setExpiration(0.5);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoyStick(this,joystick));
           }
    public void driveSpark() {
    	spark.set(1.0);
    }
    public void setMecanumDriveCommand(double ySpeed, double xSpeed, double zRotation, double gyroAngle){
    	mecanumDrive.driveCartesian(ySpeed, xSpeed, zRotation);
    	SmartDashboard.putNumber("Joystick X value", joystick.getX());
    	SmartDashboard.putNumber("Joystick Y value", joystick.getY());
    	SmartDashboard.putNumber("Joystick Z value", joystick.getZ());
    }
}