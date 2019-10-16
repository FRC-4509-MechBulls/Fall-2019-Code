/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.NeutralMode;

import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;
import frc.robot.RobotMap;
//import frc.robot.subsystems.DrivingSubsystem;
/**
 * An example command.  You can replace me with your own command.
 */
public class DriveAutonomousCommand extends TimedCommand {
  public double time = 0;
  public double rotation = 0;
  public double speed = 0;
  public DriveAutonomousCommand() {
    super(1.1); //number of seconds in auto mode
    // Use requires() here to declare subsystem dependencies
    requires(Robot.drivingSubsystem);
  }
  public DriveAutonomousCommand(double t, double s, double r) {
    super(t); //number of seconds in auto mode
    // Use requires() here to declare subsystem dependencies
    rotation =r;
    speed = s;
    requires(Robot.drivingSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
        
RobotMap.leftFrontDriveTalon.setNeutralMode(NeutralMode.Brake);
RobotMap.leftBackDriveTalon.setNeutralMode(NeutralMode.Brake);
RobotMap.rightFrontDriveTalon.setNeutralMode(NeutralMode.Brake);
RobotMap.rightBackDriveTalon.setNeutralMode(NeutralMode.Brake);
    Robot.drivingSubsystem.autoDrive(speed,rotation);
//robot moves forward for 0.75 speed
  }

  // Make this return true when this Command no longer needs to run execute()

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.drivingSubsystem.autoDrive(0,0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
