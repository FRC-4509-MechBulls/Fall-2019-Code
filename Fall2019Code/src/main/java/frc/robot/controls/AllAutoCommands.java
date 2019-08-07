/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.controls;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.*;
/**
 * An example command.  You can replace me with your own command.
 */
public class AllAutoCommands extends TimedCommand {
  public AllAutoCommands() {
  super(1.1); //number of seconds in auto mode
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_subsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    
  }

  public static void driveRotation(double rotationSpeed, double rotationDirection){
    Robot.m_subsystem.drive(rotationSpeed, rotationDirection);
    
  }
  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  
   Timer.delay(1);
   driveRotation(0,0.75);
  
//robot moves forward for 0.75 speed
  }

  // Make this return true when this Command no longer needs to run execute()

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.m_subsystem.drive(0,0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
