package org.usfirst.frc.team6861.robot.subsystems;

import org.usfirst.frc.team6861.robot.OI;
import org.usfirst.frc.team6861.robot.commands.ChangeRampDirection;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Ramp extends Subsystem {
	  Spark spark;
	  OI oi;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public Ramp(OI m_oi) {
		super();
		spark=new Spark(0);
		this.oi=m_oi;
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	setDefaultCommand(new ChangeRampDirection(oi,this));
    }
   public void  driveSpark(double s) {
	   spark.set(s);
	
	   
   }
}

