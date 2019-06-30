/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  public static WPI_TalonSRX leftBackMotor;
  public static WPI_TalonSRX rightBackMotor;
  public static WPI_TalonSRX leftFrontMotor;
  public static WPI_TalonSRX rightFrontMotor;
  public static DifferentialDrive driveTrain;
  public static void initDrive(){
    leftBackMotor = new WPI_TalonSRX(7);
    leftFrontMotor = new WPI_TalonSRX(6);
    rightBackMotor = new WPI_TalonSRX(3);
    rightFrontMotor = new WPI_TalonSRX(1);

    leftBackMotor.follow(leftFrontMotor);
    rightBackMotor.follow(rightFrontMotor);
    //follow stuff
    driveTrain = new DifferentialDrive(leftFrontMotor, rightFrontMotor);
    //tell talons what speed to go


  }
  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
