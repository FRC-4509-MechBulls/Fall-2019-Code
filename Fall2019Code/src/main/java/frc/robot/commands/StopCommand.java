/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.TimedCommand;
import frc.robot.Robot;

public class StopCommand extends TimedCommand {
  public StopCommand() {
      super(1.5); //number of seconds
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.m_subsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
      //causes robot to stop as it is going for 0 speed
    Robot.m_subsystem.drive(0,0);
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
