/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;

/**
 * An example command.  You can replace me with your own command.
 */
public class DriveStraightCommand extends TimedCommand {
  public DriveStraightCommand() {
    super(1); //number of seconds in auto mode
    // Use requires() here to declare subsystem dependencies
    requires(Robot.m_subsystem);
  }
  public DriveStraightCommand(double t){
    super(t);
  }

  public DriveStraightCommand(double t, double d, double s){
    super(t);
    Robot.m_subsystem.drive(s,d);
  }
  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    
  }
 
  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    Robot.m_subsystem.drive(0.75,0);
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
